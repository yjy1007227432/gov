package org.competition.service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.competition.dao.OrderTaskResult;
import org.competition.domain.*;
import org.competition.mapper.OrdertaskMapper;
import org.competition.utils.Stringstr;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
@RestController
@RequestMapping({"/gov/ordertask"})
@CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
public class OrderTaskService {

    @Autowired
    private OrdertaskMapper ordertaskMapper;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ResourcevpsService resourcevpsService;

    @Autowired
    private ResourceossService resourceossService;

    @Autowired
    private ResourcerdsService resourcerdsService;

    @Autowired
    private ResourceslbService resourceslbService;




    public static final Logger LOGGER = LogManager.getLogger(OrderTaskService.class);


    @RequestMapping({"/list"})
    public List<OrderTaskResult> findList(){
        OrdertaskExample ordertaskExample = new OrdertaskExample();
        ordertaskExample.setOrderByClause("update_time DESC");

        List<Ordertask> ordertasks = ordertaskMapper.selectByExample(ordertaskExample);
        if (ordertasks.size()==0||ordertasks==null){
            return null;
        }
        List<OrderTaskResult> orderTaskResults = new ArrayList<>();
        for (Ordertask ordertask:ordertasks) {
            OrderTaskResult orderTaskResult = new OrderTaskResult();
            BeanUtils.copyProperties(ordertask, orderTaskResult);
            try {
                orderTaskResult.setCustomer_name(customerService.findCustomerById(ordertask.getCustomerId()).getName());
            }catch(Exception e){
                    LOGGER.error("根据customerId找不到customername"); }
            try {
            if (ordertask.getOrderId()!=null){
                orderTaskResult.setOrder_name(orderService.findOrderById(ordertask.getOrderId()).getName());
            }}catch(Exception e){
                    LOGGER.error("根据orderId找不到customername"); }
            try {
            switch (ordertask.getTaskType()){
                case "VPS": try {orderTaskResult.setResource_name(resourcevpsService.findById(ordertask.getResourceId()).getName()); }catch(Exception e){
                    LOGGER.error("根据ResourceId找不到VPSname");
                } break;
                case "OSS": try {orderTaskResult.setResource_name(resourceossService.findById(ordertask.getResourceId()).getName());  }catch(Exception e){
                    LOGGER.error("根据ResourceId找不到OSSname");
                }break;
                case "SLB": try {orderTaskResult.setResource_name(resourceslbService.findById(ordertask.getResourceId()).getName());  }catch(Exception e){
                    LOGGER.error("根据ResourceId找不到SLBname");
                }break;
                case "RDS": try {orderTaskResult.setResource_name(resourcerdsService.findById(ordertask.getResourceId()).getName());  }catch(Exception e){
                    LOGGER.error("根据ResourceId找不到RDSname");
                }break;
            }
            }catch(Exception e){
                LOGGER.error("根据TaskType找不到name"); }
            orderTaskResults.add(orderTaskResult);

        }
        return orderTaskResults;
    }

    @RequestMapping({"/listcustomer"})
    public List<OrderTaskResult> findListCoumster(Integer customer_id){
        OrdertaskExample ordertaskExample = new OrdertaskExample();
        ordertaskExample.setOrderByClause("update_time DESC");
        OrdertaskExample.Criteria criteria= ordertaskExample.createCriteria();
        criteria.andCustomerIdEqualTo(customer_id);

            List<Ordertask> ordertasks = ordertaskMapper.selectByExample(ordertaskExample);

        if (ordertasks.size()==0||ordertasks==null){
            return null;
        }
        List<OrderTaskResult> orderTaskResults = new ArrayList<>();
        for (Ordertask ordertask:ordertasks) {
            OrderTaskResult orderTaskResult = new OrderTaskResult();
            BeanUtils.copyProperties(ordertask, orderTaskResult);

        try {
            orderTaskResult.setCustomer_name(customerService.findCustomerById(ordertask.getCustomerId()).getName());
        }catch(Exception e){
            LOGGER.error("根据customerId找不到customername");
        }
            try {
            if (ordertask.getOrderId()!=null){
                orderTaskResult.setOrder_name(orderService.findOrderById(ordertask.getOrderId()).getName()); }
            }catch(Exception e){
                LOGGER.error("根据OrderId找不到ordername");
            }

            switch (ordertask.getTaskType()){
                case "VPS": try {orderTaskResult.setResource_name(resourcevpsService.findById(ordertask.getResourceId()).getName()); }catch(Exception e){
                    LOGGER.error("根据ResourceId找不到VPSname");
                } break;
                case "OSS": try {orderTaskResult.setResource_name(resourceossService.findById(ordertask.getResourceId()).getName());  }catch(Exception e){
                    LOGGER.error("根据ResourceId找不到OSSname");
                }break;
                case "SLB": try {orderTaskResult.setResource_name(resourceslbService.findById(ordertask.getResourceId()).getName());  }catch(Exception e){
                    LOGGER.error("根据ResourceId找不到SLBname");
                }break;
                case "RDS": try {orderTaskResult.setResource_name(resourcerdsService.findById(ordertask.getResourceId()).getName());  }catch(Exception e){
                    LOGGER.error("根据ResourceId找不到RDSname");
                }break;
            }
            orderTaskResults.add(orderTaskResult);

        }
        return orderTaskResults;
    }


    @RequestMapping({"/findbyid"})
    public Ordertask findById(Integer id){
         Ordertask ordertask = ordertaskMapper.selectByPrimaryKey(id);
         return ordertask;
    }


    @RequestMapping({"/add"})
    public int addOrderTask(
            Integer customer_id,
            @RequestParam(required = false) Integer order_id,
            @RequestParam(required = false) Integer resource_id,
            @RequestParam(required = false) Date create_time,
            @RequestParam(required = false) Date update_time,
            @RequestParam(required = false) String update_user,
            @RequestParam(required = false) String task_action,
            @RequestParam(required = false) String task_type,
            @RequestParam(required = false) String status,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer quantity,
            @RequestParam(required = false) String attachment,
            @RequestParam(required = false) String backup,
            @RequestParam(required = false) String keyword1,
            @RequestParam(required = false) String keyword2,
            @RequestParam(required = false) String keyword3,
            @RequestParam(required = false) String keyword4,
            @RequestParam(required = false) String keyword5,
            @RequestParam(required = false) String keyword6,
            @RequestParam(required = false) String keyword7,
            @RequestParam(required = false) String keyword8,
            @RequestParam(required = false) String keyword9,
            @RequestParam(required = false) String keyword10,
            @RequestParam(required = false) String keyword11,
            @RequestParam(required = false) String keyword12,
            @RequestParam(required = false) String keyword13,
            @RequestParam(required = false) String keyword14,
            @RequestParam(required = false) String keyword15
    ) {
        Ordertask ordertask = new Ordertask().setCustomerId(customer_id).setOrderId(order_id)
                .setResourceId(resource_id).setCreateTime(create_time).setUpdateTime(update_time)
                .setUpdateUser(update_user).setTaskAction(task_action).setTaskType(task_type)
                .setStatus(status).setName(name).setQuantity(quantity).setAttachment(attachment)
                .setBackup(backup).setKeyword1(keyword1).setKeyword2(keyword2).setKeyword3(keyword3)
                .setKeyword4(keyword4).setKeyword5(keyword5).setKeyword6(keyword6).setKeyword7(keyword7)
                .setKeyword8(keyword8).setKeyword9(keyword9).setKeyword10(keyword10).setKeyword11(keyword11)
                .setKeyword12(keyword12).setKeyword13(keyword13).setKeyword13(keyword14).setKeyword13(keyword15);

         int result = ordertaskMapper.insert(ordertask);
         return result;

    }


    @RequestMapping({"/update"})
    public int updateOrderTask(
            Integer id,
            Integer customer_id,
            @RequestParam(required = false) Integer order_id,
            @RequestParam(required = false) Integer resource_id,
            @RequestParam(required = false) Date create_time,
            @RequestParam(required = false) Date update_time,
            @RequestParam(required = false) String update_user,
            @RequestParam(required = false) String task_action,
            @RequestParam(required = false) String task_type,
            @RequestParam(required = false) String status,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer quantity,
            @RequestParam(required = false) String attachment,
            @RequestParam(required = false) String backup,
            @RequestParam(required = false) String keyword1,
            @RequestParam(required = false) String keyword2,
            @RequestParam(required = false) String keyword3,
            @RequestParam(required = false) String keyword4,
            @RequestParam(required = false) String keyword5,
            @RequestParam(required = false) String keyword6,
            @RequestParam(required = false) String keyword7,
            @RequestParam(required = false) String keyword8,
            @RequestParam(required = false) String keyword9,
            @RequestParam(required = false) String keyword10,
            @RequestParam(required = false) String keyword11,
            @RequestParam(required = false) String keyword12,
            @RequestParam(required = false) String keyword13,
            @RequestParam(required = false) String keyword14,
            @RequestParam(required = false) String keyword15

    ) {
        Ordertask ordertask = new Ordertask().setId(id).setCustomerId(customer_id).setOrderId(order_id)
                .setResourceId(resource_id).setCreateTime(create_time).setUpdateTime(update_time)
                .setUpdateUser(update_user).setTaskAction(task_action).setTaskType(task_type)
                .setStatus(status).setName(name).setQuantity(quantity).setAttachment(attachment)
                .setBackup(backup).setKeyword1(keyword1).setKeyword2(keyword2).setKeyword3(keyword3)
                .setKeyword4(keyword4).setKeyword5(keyword5).setKeyword6(keyword6).setKeyword7(keyword7)
                .setKeyword8(keyword8).setKeyword9(keyword9).setKeyword10(keyword10).setKeyword11(keyword11)
                .setKeyword12(keyword12).setKeyword13(keyword13).setKeyword13(keyword14).setKeyword13(keyword15);

        int result = ordertaskMapper.updateByPrimaryKeySelective(ordertask);
        return result;

    }

    @RequestMapping({"/deletebyid"})
    public int deleteById(Integer Id){
        int result = ordertaskMapper.deleteByPrimaryKey(Id);
        return result;
    }

    @RequestMapping({"/select"})
    public List<OrderTaskResult> select(  @RequestParam(required = false) String customerName,
                                    @RequestParam(required = false) String orderName,
                                    @RequestParam(required = false) String resourceName,
                                    @RequestParam(required = false) String name,
                                    @RequestParam(required = false) List<String> status,
                                    @RequestParam(required = false) List<String> taskAction,
                                    @RequestParam(required = false) List<String> taskType,
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


        OrdertaskExample example = new OrdertaskExample();
        OrdertaskExample.Criteria criteria = example.createCriteria();

        example.setOrderByClause("update_time DESC");

        if (customerName != null) {
            List<Integer> customerIds = customerService.findCustomerIdByName(customerName);
            criteria.andCustomerIdIn(customerIds);
        }
        if (orderName != null) {
            List<Integer> orderIds = orderService.findOrderIdsByName(orderName);
            criteria.andCustomerIdIn(orderIds);
        }
        if(resourceName!=null) {
            List<Integer> oss = resourceossService.findOssIdByName(resourceName);
            List<Integer> rds = resourcerdsService.findRdsIdByName(resourceName);
            List<Integer> vps = resourcevpsService.findvpsIdByName(resourceName);
            List<Integer> slb = resourceslbService.findslbIdByName(resourceName);
            oss.addAll(rds);
            oss.addAll(vps);
            oss.addAll(slb);
            criteria.andResourceIdIn(oss);
        }
        if(startTime != null && endTime != null) {
            criteria.andUpdateTimeBetween(beforedate, afterDate);
        }
        if (name!=null) {
            criteria.andNameLike(Stringstr.parse(name));
        }
        if(status!=null) {
            criteria.andStatusIn(status);
        }
        if (taskAction!=null) {
            criteria.andTaskActionIn(taskAction);
        }
        if (taskType!=null) {
            criteria.andTaskTypeIn(taskType);
        }

        List<Ordertask> ordertasks = ordertaskMapper.selectByExample(example);


        if (ordertasks.size()==0||ordertasks==null){
            return null;
        }
        List<OrderTaskResult> orderTaskResults = new ArrayList<>();
        for (Ordertask ordertask:ordertasks) {
            OrderTaskResult orderTaskResult = new OrderTaskResult();
            BeanUtils.copyProperties(ordertask, orderTaskResult);
            try {
                orderTaskResult.setCustomer_name(customerService.findCustomerById(ordertask.getCustomerId()).getName());
            }catch(Exception e){
                LOGGER.error("根据customerId找不到customername"); }
            try {
                if (ordertask.getOrderId()!=null){
                    orderTaskResult.setOrder_name(orderService.findOrderById(ordertask.getOrderId()).getName());
                }}catch(Exception e){
                LOGGER.error("根据orderId找不到customername"); }
            try {
                switch (ordertask.getTaskType()){
                    case "VPS": try {orderTaskResult.setResource_name(resourcevpsService.findById(ordertask.getResourceId()).getName()); }catch(Exception e){
                        LOGGER.error("根据ResourceId找不到VPSname");
                    } break;
                    case "OSS": try {orderTaskResult.setResource_name(resourceossService.findById(ordertask.getResourceId()).getName());  }catch(Exception e){
                        LOGGER.error("根据ResourceId找不到OSSname");
                    }break;
                    case "SLB": try {orderTaskResult.setResource_name(resourceslbService.findById(ordertask.getResourceId()).getName());  }catch(Exception e){
                        LOGGER.error("根据ResourceId找不到SLBname");
                    }break;
                    case "RDS": try {orderTaskResult.setResource_name(resourcerdsService.findById(ordertask.getResourceId()).getName());  }catch(Exception e){
                        LOGGER.error("根据ResourceId找不到RDSname");
                    }break;
                }
            }catch(Exception e){
                LOGGER.error("根据TaskType找不到name"); }
            orderTaskResults.add(orderTaskResult);

        }
        return orderTaskResults;
    }



}
