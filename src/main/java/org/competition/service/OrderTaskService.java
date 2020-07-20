package org.competition.service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.competition.dao.OrderTaskResult;
import org.competition.domain.Order;
import org.competition.domain.Ordertask;
import org.competition.domain.OrdertaskExample;
import org.competition.mapper.OrdertaskMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

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
        List<Ordertask> ordertasks = ordertaskMapper.selectByExample(new OrdertaskExample());
        if (ordertasks.size()==0||ordertasks==null){
            return null;
        }
        List<OrderTaskResult> orderTaskResults = new ArrayList<>();
        for (Ordertask ordertask:ordertasks) {
            OrderTaskResult orderTaskResult = new OrderTaskResult();
            BeanUtils.copyProperties(ordertask, orderTaskResult);
            orderTaskResult.setCustomer_name(customerService.findCustomerById(ordertask.getCustomerId()).getName());
            if (ordertask.getOrderId()!=null){
                orderTaskResult.setOrder_name(orderService.findOrderById(ordertask.getOrderId()).getName());
            }
            switch (ordertask.getTaskType()){
                case "VPS": orderTaskResult.setResource_name(resourcevpsService.findById(ordertask.getResourceId()).getName()); break;
                case "OSS": orderTaskResult.setResource_name(resourceossService.findById(ordertask.getResourceId()).getName()); break;
                case "SLB": orderTaskResult.setResource_name(resourceslbService.findById(ordertask.getResourceId()).getName()); break;
                case "RDS": orderTaskResult.setResource_name(resourcerdsService.findById(ordertask.getResourceId()).getName()); break;
            }
            orderTaskResults.add(orderTaskResult);

        }
        return orderTaskResults;
    }

    @RequestMapping({"/listcustomer"})
    public List<OrderTaskResult> findListCoumster(Integer customerId){
        OrdertaskExample ordertaskExample = new OrdertaskExample();
        OrdertaskExample.Criteria criteria= ordertaskExample.createCriteria();
        criteria.andCustomerIdEqualTo(customerId);

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
            Integer customerId,
            @RequestParam(required = false) Integer orderId,
            @RequestParam(required = false) Integer resourceId,
            @RequestParam(required = false) Date createTime,
            @RequestParam(required = false) Date updateTime,
            @RequestParam(required = false) String updateUser,
            @RequestParam(required = false) String taskAction,
            @RequestParam(required = false) String taskType,
            @RequestParam(required = false) String status,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer quantity,
            @RequestParam(required = false) String attachment,
            @RequestParam(required = false) String backup

    ) {
        Ordertask ordertask = new Ordertask().setCustomerId(customerId).setOrderId(orderId)
                .setResourceId(resourceId).setCreateTime(createTime).setUpdateTime(updateTime)
                .setUpdateUser(updateUser).setTaskAction(taskAction).setTaskType(taskType)
                .setStatus(status).setName(name).setQuantity(quantity).setAttachment(attachment)
                .setBackup(backup);

         int result = ordertaskMapper.insert(ordertask);
         return result;

    }


    @RequestMapping({"/update"})
    public int updateOrderTask(
            Integer customerId,
            @RequestParam(required = false) Integer orderId,
            @RequestParam(required = false) Integer resourceId,
            @RequestParam(required = false) Date createTime,
            @RequestParam(required = false) Date updateTime,
            @RequestParam(required = false) String updateUser,
            @RequestParam(required = false) String taskAction,
            @RequestParam(required = false) String taskType,
            @RequestParam(required = false) String status,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer quantity,
            @RequestParam(required = false) String attachment,
            @RequestParam(required = false) String backup

    ) {

        OrdertaskExample ordertaskExample = new OrdertaskExample();
        OrdertaskExample.Criteria criteria= ordertaskExample.createCriteria();
        criteria.andCustomerIdEqualTo(customerId);

        Ordertask ordertask = new Ordertask().setCustomerId(customerId).setOrderId(orderId)
                .setResourceId(resourceId).setCreateTime(createTime).setUpdateTime(updateTime)
                .setUpdateUser(updateUser).setTaskAction(taskAction).setTaskType(taskType)
                .setStatus(status).setName(name).setQuantity(quantity).setAttachment(attachment)
                .setBackup(backup);

        int result = ordertaskMapper.updateByExampleSelective(ordertask,ordertaskExample);
        return result;

    }

    @RequestMapping({"/deletebyid"})
    public int deleteById(Integer customerId){
        OrdertaskExample ordertaskExample = new OrdertaskExample();
        OrdertaskExample.Criteria criteria= ordertaskExample.createCriteria();
        criteria.andCustomerIdEqualTo(customerId);
        int result = ordertaskMapper.deleteByExample(ordertaskExample);
        return result;
    }
}
