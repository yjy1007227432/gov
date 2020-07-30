/*     */
package org.competition.service;
/*     */
/*     */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
/*     */ import java.util.*;
/*     */
/*     */
/*     */
import java.util.stream.Collectors;
/*     */
import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.competition.dao.OrderCustomer;
/*     */ import org.competition.dao.OrderPojo;
/*     */ import org.competition.dao.OrderReport;
import org.competition.dao.QuantityWeek;
import org.competition.domain.*;
/*     */
/*     */
import org.competition.mapper.OrderMapper;
/*     */
import org.competition.utils.BeforeWeek;
import org.competition.utils.Stringstr;
import org.competition.utils.TimeParse;
import org.springframework.beans.BeanUtils;
/*     */ import org.springframework.beans.BeansException;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Component;
/*     */ import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import org.springframework.web.bind.annotation.RequestParam;
/*     */ import org.springframework.web.bind.annotation.RestController;

/*     */
/*     */
@Component
/*     */
@RestController
/*     */
@RequestMapping({"/gov/order"})
/*     */
@CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ResourcevpsService resourcevpsService;
    @Autowired
    private ResourceossService resourceossService;
    @Autowired
    private ResourcerdsService resourcerdsService;
    @Autowired
    private ResourceslbService resourceslbService;
    @Autowired
    private DictvalueService dictvalueService;


    public static final Logger LOGGER = LogManager.getLogger(OrderService.class);

    /*     */
    /*     */
    @RequestMapping({"/insert"})
    /*     */ public int insertOrder(OrderPojo orderPojo) {
        /*  38 */
        Order order = new Order();
        /*     */
        try {
            /*  40 */
            BeanUtils.copyProperties(orderPojo, order);
            /*  41 */
        } catch (BeansException e) {
            /*  42 */
            LOGGER.error("BeanUtil property copy  failed :BeansException", (Throwable) e);
            /*  43 */
        } catch (Exception e) {
            /*  44 */
            LOGGER.error("BeanUtil property copy failed:Exception", e);
            /*     */
        }
        /*  46 */
        order.setCreateTime(Date.from(Instant.now()));
        /*  47 */
        int result = 0;
        /*     */
        try {
            /*  49 */
            result = this.orderMapper.insert(order);
            /*     */
        }
        /*  51 */ catch (Exception e) {
            /*  52 */
            LOGGER.error("orderMapper.insert插入数据失败", e);
            /*     */
        }
        /*  54 */
        return result;
        /*     */
    }
    /*     */
    /*     */

    /*     */
    @RequestMapping({"/add"})
    /*     */ public int addOrder(@RequestParam(required = false) Integer customerId,
                                  @RequestParam(required = false) String contact,
                                  @RequestParam(required = false) String contactPhone,
                                  @RequestParam(required = false) String contactMail,
                                  @RequestParam(required = false) String feedback,
                                  @RequestParam(required = false) String content,
                                  @RequestParam(required = false) Integer queueId,
                                  @RequestParam(required = false) String backup1,
                                  @RequestParam(required = false) String kcontact,
                                  @RequestParam(required = false) String kcontactPhone,
                                  @RequestParam(required = false) String kcontactEmail,
                                  @RequestParam(required = false) String orderNumber,
                                  @RequestParam(required = false) String name,
                                  @RequestParam(required = false) String startDate,
                                  @RequestParam(required = false) String finishDate


    ) {
        Date startDate1 = null;
        Date finishDate1 = null;
        try {
            startDate = TimeParse.Parse(startDate);
            finishDate = TimeParse.Parse(finishDate);
            startDate1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(startDate);
            finishDate1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(finishDate);
        } catch (Exception e) {
            LOGGER.error("日期转化错误");
        }
        Order order = (new Order()).setCustomerId(customerId).
                setContact(contact).setContactPhone(contactPhone).
                setContactEmail(contactMail).setFeedback(feedback).
                setContent(content).setCreateTime(Date.from(Instant.now())).
                setQueueId(queueId).setBackup1(backup1).setKcontact(kcontact).
                setKcontactPhone(kcontactPhone).setKcontactEmail(kcontactEmail)
                .setOrderNumber(orderNumber).setName(name).setStartDate(startDate1)
                .setFinishDate(finishDate1);
        /*  78 */
        int result = 0;
        /*     */
        try {
            /*  80 */
            result = this.orderMapper.insert(order);
        }
        /*  82 */ catch (Exception e) {
            LOGGER.error("orderMapper.insert插入数据失败", e);
        }
        /*  85 */
        return result;
        /*     */
    }

    /*     */
    /*     */
    @RequestMapping({"/update"})
    /*     */ public int updateOrder(@RequestParam(required = false) Integer customerId,
                                     @RequestParam(required = false) String contact,
                                     @RequestParam(required = false) String contactPhone,
                                     @RequestParam(required = false) String contactMail,
                                     @RequestParam(required = false) String feedback,
                                     @RequestParam(required = false) String content,
                                     @RequestParam(required = false) String updateUser,
                                     Integer id,
                                     @RequestParam(required = false) Integer queueId,
                                     @RequestParam(required = false) String kcontact,
                                     @RequestParam(required = false) String kcontactPhone,
                                     @RequestParam(required = false) String kcontactEmail,
                                     @RequestParam(required = false) String orderNumber,
                                     @RequestParam(required = false) String name,
                                     @RequestParam(required = false) String startDate,
                                     @RequestParam(required = false) String finishDate


    ) {


        Date startDate1 = null;
        Date finishDate1 = null;
        try {
            startDate = TimeParse.Parse(startDate);
            finishDate = TimeParse.Parse(finishDate);
            startDate1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(startDate);
            finishDate1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(finishDate);
        } catch (Exception e) {
            LOGGER.error("日期转化错误");
        }
        /* 113 */
        Order order = (new Order()).setId(id).setCustomerId(customerId).
                setContact(contact).setContactPhone(contactPhone).
                setContactEmail(contactMail).setFeedback(feedback).
                setContent(content).setId(id).setUpdateUser(updateUser).
                setUpdateTime(Date.from(Instant.now())).setQueueId(queueId)
                .setKcontact(kcontact).setKcontactPhone(kcontactPhone)
                .setKcontactEmail(kcontactEmail).setOrderNumber(orderNumber).setName(name)
                .setStartDate(startDate1).setFinishDate(finishDate1);
        /* 114 */
        int result = 0;
        /*     */
        try {
            /* 116 */
            result = this.orderMapper.updateByPrimaryKeySelective(order);
            /*     */
        }
        /* 118 */ catch (Exception e) {
            /* 119 */
            LOGGER.error("orderMapper.updateByPrimaryKey更新数据失败", e);
            /*     */
        }
        /* 121 */
        if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
            /* 122 */
            LOGGER.error("无法查询到需要更新的数据");
            /*     */
        }
        /* 124 */
        return result;
        /*     */
    }


    @Transactional
    @RequestMapping({"/delete"})
    public int deleteOrderById(int id) {
        int result = 0;
        try {
            result = this.orderMapper.deleteByPrimaryKey(Integer.valueOf(id));
            resourcevpsService.delete(Integer.valueOf(id));
            resourceossService.delete(Integer.valueOf(id));
            resourcerdsService.delete(Integer.valueOf(id));
            resourceslbService.delete(Integer.valueOf(id));
        } catch (Exception e) {
            LOGGER.error("orderMapper.deleteByPrimaryKey删除数据失败", e);

        }
        /* 136 */
        if (Objects.equals(Integer.valueOf(result), 1)) {
            /* 137 */
            LOGGER.info("删除数据成功");
            /*     */
        }
        /* 139 */
        return result;
        /*     */
    }

    /*     */
    @RequestMapping({"/list"})
    /*     */ public List<OrderCustomer> ListOrder() {
        /* 144 */
        List<Order> orderList = null;
        /*     */
        try {
            /* 146 */
            orderList = this.orderMapper.selectByExample(null);
            /* 147 */
        } catch (Exception e) {
            /* 148 */
            LOGGER.error("orderMapper.selectByExample查询数据失败", e);
            /*     */
        }
        List<OrderCustomer> orderCustomers = new ArrayList<>();
        if (orderList != null) {
            for (Order order : orderList) {
                Customer customer = this.customerService.findCustomerById(order.getCustomerId().intValue());
                /* 154 */
                if (customer != null) {
                    OrderCustomer orderCustomer = new OrderCustomer();
                    BeanUtils.copyProperties(order, orderCustomer);
                    orderCustomer.setCustomerName(customer.getName());
                    orderCustomers.add(orderCustomer);
                }
            }
        }
        return orderCustomers;
    }


    @RequestMapping({"/listcustomer"})
    public List<OrderCustomer> ListCustomer(Integer customerId) {
        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();
        criteria.andCustomerIdEqualTo(customerId);

        List<Order> orderList = orderMapper.selectByExample2(example);

        List<OrderCustomer> orderCustomers = new ArrayList<>();

        if (orderList != null) {
            for (Order order : orderList) {
                Customer customer = this.customerService.findCustomerById(order.getCustomerId().intValue());
                /* 154 */
                if (customer != null) {
                    OrderCustomer orderCustomer = new OrderCustomer();
                    BeanUtils.copyProperties(order, orderCustomer);
                    orderCustomer.setCustomerName(customer.getName());
                    orderCustomers.add(orderCustomer);
                }
                /*     */
            }
            /*     */
        }
        /* 162 */
        return orderCustomers;
    }


    /*     */
    /*     */
    @RequestMapping({"/find"})
    public OrderCustomer findOrderById(int id) {
        Order order = null;
        /*     */
        try {
            /* 169 */
            order = this.orderMapper.selectByPrimaryKey(Integer.valueOf(id));
            /* 170 */
        } catch (Exception e) {
            /* 171 */
            LOGGER.error("orderMapper.selectByExample查询数据失败", e);
            /*     */
        }
        /* 173 */
        if (Objects.equals(order, null)) {
            /* 174 */
            LOGGER.error("查询结果为空");
            /*     */
        }
        /* 176 */
        Customer customer = this.customerService.findCustomerById(order.getCustomerId().intValue());
        /* 177 */
        OrderCustomer orderCustomer = new OrderCustomer();
        /* 178 */
        if (customer != null) {
            /* 179 */
            BeanUtils.copyProperties(order, orderCustomer);
            /* 180 */
            orderCustomer.setCustomerName(customer.getName());
            /*     */
        }
        /* 182 */
        return orderCustomer;
    }

    @RequestMapping({"/report"})
    public List<OrderReport> findOrderReport() {
        List<OrderCustomer> orderCustomers = this.ListOrder();
        List<OrderReport> orderReports = new ArrayList<>();

        for (OrderCustomer orderCustomer : orderCustomers) {
            OrderReport orderReport = new OrderReport();
            BeanUtils.copyProperties(orderCustomer, orderReport);

            List<Resourcevps> resourcevpsList = null;

            List<Resourceoss> resourceossList = null;

            List<Resourcerds> resourcerdsList = null;

            List<Resourceslb> resourceslbList = null;


            try {
                resourcevpsList = resourcevpsService.findByOrderId(orderCustomer.getId());
            } catch (Exception e) {
                LOGGER.info("根据orderId取不到resourcevpsList");
            }
            try {
                resourceossList = resourceossService.findByOrderId(orderCustomer.getId());
            } catch (Exception e) {
                LOGGER.info("根据orderId取不到resourceossList");
            }
            try {
                resourcerdsList = resourcerdsService.findByOrderId(orderCustomer.getId());
            } catch (Exception e) {
                LOGGER.info("根据orderId取不到resourcerdsList");
            }
            try {
                resourceslbList = resourceslbService.findByOrderId(orderCustomer.getId());
            } catch (Exception e) {
                LOGGER.info("根据orderId取不到resourceslbList");
            }

            List<Integer> vps_specification = null;
            List<String> vps_value = null;
            List<Integer> vps_quantity = null;

            if (resourcevpsList != null) {
                vps_specification = resourcevpsList.stream().map(Resourcevps::getSpecification).collect(Collectors.toList());
                vps_quantity = resourcevpsList.stream().map(Resourcevps::getQuantity).collect(Collectors.toList());
                vps_value = dictvalueService.vpsValue("specification", vps_specification);
            }

            List<Integer> rds_memory = null;
            List<String> rds_value = null;
            List<Integer> rds_quantity = null;
            List<Integer> rds_storage = null;

            if (resourcerdsList != null) {
                rds_memory = resourcerdsList.stream().map(Resourcerds::getMemory).collect(Collectors.toList());
                rds_quantity = resourcerdsList.stream().map(Resourcerds::getQuantity).collect(Collectors.toList());
                rds_value = dictvalueService.vpsValue("memory", rds_memory);
                rds_storage = resourcerdsList.stream().map(Resourcerds::getStorage).collect(Collectors.toList());
            }

            List<Integer> oss_size = null;

            List<Integer> oss_quantity = null;

            if (resourceossList != null) {
                oss_size = resourceossList.stream().map(Resourceoss::getSize).collect(Collectors.toList());
                oss_quantity = resourceossList.stream().map(Resourceoss::getQuantity).collect(Collectors.toList());
            }
            List<Integer> slb_quantity = null;

            if (resourceslbList != null) {
                slb_quantity = resourceslbList.stream().map(Resourceslb::getQuantity).collect(Collectors.toList());
            }

            orderReport.setVps_quantity(vps_quantity).setVps_specification(vps_specification).setVps_value(vps_value)
                    .setRds_memory(rds_memory).setRds_quantity(rds_quantity).setRds_storage(rds_storage).setRds_value(rds_value)
                    .setOss_quantity(oss_quantity).setOss_size(oss_size).setSlb_quantity(slb_quantity);

            orderReports.add(orderReport);

        }
        return orderReports;
    }

    /*     */   public List<Integer> findOrderIdsByName(String orderName) {
        /* 127 */     List<Order> orders = null;
        /*     */     try {
            OrderExample example = new OrderExample();
            OrderExample.Criteria criteria = example.createCriteria();
            criteria.andNameLike(Stringstr.parse(orderName));
            /* 129 */       orders = this.orderMapper.selectByExample2(example);
            /* 130 */     } catch (Exception e) {
            /* 131 */       LOGGER.error("orderMapper.selectByExample2查询数据失败", e);
            /*     */     }
        /* 133 */     if (Objects.equals(orders, null)) {
            /* 134 */       LOGGER.error("查询结果为空");
            /*     */     }
        /* 136 */     return orders.stream().map(Order::getId).collect(Collectors.toList());
        /*     */   }



    @RequestMapping({"/quantity"})
    public List<QuantityWeek> quantityWeek() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        List<Date> dates = BeforeWeek.getBeforeWeek();
        List<Resourcerds> resourcerds = resourcerdsService.findAll();
        List<Resourceoss> resourceoss = resourceossService.findAll();
        List<Resourcevps> resourcevps = resourcevpsService.findAll();
        List<Resourceslb> resourceslb = resourceslbService.findAll();

        List<QuantityWeek> quantityWeeks = new ArrayList<>();

        int sum1, sum2, sum3, sum4;

        for (Date date : dates) {
            Map<String, Integer> map = new HashMap<String, Integer>();

            sum1 = 0;
            sum2 = 0;
            sum3 = 0;
            sum4 = 0;
            QuantityWeek quantityWeek = new QuantityWeek();
            String str = df.format(date);
            quantityWeek.setDate(str);

            try {
                sum1 = resourcerds.stream().filter(x -> str.equals(df.format(x.getCreateTime()))).mapToInt(Resourcerds::getQuantity).sum();
            } catch (Exception e) {
            }

            try {
                sum2 = resourceoss.stream().filter(x -> str.equals(df.format(x.getCreateTime()))).mapToInt(Resourceoss::getQuantity).sum();
            } catch (Exception e) {
            }

            try {
                sum3 = resourcevps.stream().filter(x -> str.equals(df.format(x.getCreateTime()))).mapToInt(Resourcevps::getQuantity).sum();
                System.out.println();
            } catch (Exception e) {
            }

            try {
                sum4 = resourceslb.stream().filter(x -> str.equals(df.format(x.getCreateTime()))).mapToInt(Resourceslb::getQuantity).sum();
            } catch (Exception e) {
            }

            String str1 = df.format(resourcevps.get(0).getCreateTime());

            map.put("RDS", sum1);
            map.put("OSS", sum2);
            map.put("VPS", sum3);
            map.put("SLB", sum4);

            quantityWeek.setDate(str);
            quantityWeek.setMap(map);

            quantityWeeks.add(quantityWeek);

        }

        return quantityWeeks;
    }

    @RequestMapping({"/select"})
    public List<OrderCustomer> select(@RequestParam(required = false) String customerName,
                              @RequestParam(required = false) Integer customerId,
                              @RequestParam(required = false) String contact,
                              @RequestParam(required = false) String contactPhone,
                              @RequestParam(required = false) Integer queueId,
                              @RequestParam(required = false) String kcontact,
                              @RequestParam(required = false) String kcontactPhone,
                              @RequestParam(required = false) String name,
                              @RequestParam(required = false) String startTime,
                              @RequestParam(required = false) String endTime) {

        Date beforedate = null;
        Date afterDate = null;

        if (startTime != null && endTime != null) {
            startTime += " 00:00:00";
            endTime += " 23:59:59";


            try {
                beforedate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(startTime);
                afterDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(endTime);
            } catch (ParseException e) {
                LOGGER.error("日期转化错误");
            }

        }

        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        if (customerId != null) {
            criteria.andCustomerIdEqualTo(customerId);
        }

        if (customerName != null) {
            List<Integer> customerIds = customerService.findCustomerIdByName(customerName);
            criteria.andCustomerIdIn(customerIds);
        }

        if (contact != null) {
            criteria.andContactLike(Stringstr.parse(contact));
        }
        if (name != null) {
            criteria.andNameLike(Stringstr.parse(name));
        }
        if (contactPhone != null) {
            criteria.andContactPhoneLike(Stringstr.parse(contactPhone));
        }
        if (kcontactPhone != null) {
            criteria.andKcontactPhoneLike(Stringstr.parse(kcontactPhone));
        }
        if (queueId != null) {
            criteria.andQueueIdEqualTo(queueId);
        }
        if (kcontact != null) {
            criteria.andKcontactLike(Stringstr.parse(kcontact));
        }
        if (startTime != null && endTime != null) {
            criteria.andUpdateTimeBetween(beforedate, afterDate);
        }
//        List<Order> orders2 = orderMapper.selectByExample2(null);

        List<Order> orders = orderMapper.selectByExample2(orderExample);

        List<OrderCustomer> orderCustomers = new ArrayList<>();

        for(Order order:orders){
            OrderCustomer orderCustomer = new OrderCustomer();
            BeanUtils.copyProperties(order,orderCustomer);
            try {
                orderCustomer.setCustomerName(customerService.findCustomerById(order.getCustomerId()).getName());
            }catch (Exception e){
                LOGGER.error("根据"+order.getCustomerId().toString()+"无法找到customerName");
            }
            orderCustomers.add(orderCustomer);

        }
        return orderCustomers;


    }
}
