package org.competition.service;

import org.apache.logging.log4j.LogManager;
import org.competition.dao.OrderPojo;
import org.competition.domain.News;
import org.competition.domain.Order;
import org.competition.mapper.OrderMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.Logger;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Component
@RestController
@RequestMapping("/gov/order")
@CrossOrigin
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public static final Logger LOGGER = LogManager.getLogger(OrderService.class);

    @GetMapping(value = "/insert")
    public int insertOrder(OrderPojo orderPojo){
        Order order = new Order();
        try {
            BeanUtils.copyProperties(orderPojo, order);
        } catch (BeansException e) {
            LOGGER.error("BeanUtil property copy  failed :BeansException", e);
        } catch (Exception e) {
            LOGGER.error("BeanUtil property copy failed:Exception", e);
        }
        order.setCreateTime(Date.from(Instant.now()));
        int result = 0;
        try {
            result =  orderMapper.insert(order);
        }
        catch (Exception e){
            LOGGER.error("orderMapper.insert插入数据失败", e);
        }
        return result;
    }

    @GetMapping(value = "/add")
    public int addOrder(Integer customerId,String contact,String contactPhone,String contactMail,String feedback,String content,Date createTime){
        Order order = new Order().setCustomerId(customerId).setContact(contact).setContactPhone(contactPhone).
                setContactEmail(contactMail).setFeedback(feedback).setContent(content).setCreateTime(Date.from(Instant.now()));
        int result = 0;
        try {
            result =  orderMapper.insert(order);
        }
        catch (Exception e){
            LOGGER.error("orderMapper.insert插入数据失败", e);
        }
        return result;
    }

    @GetMapping(value = "/update")
    public int updateByPrimaryKeySelective(int customerId,String contact,String contactPhone,String contactMail,String feedback,String content,String updateUser,int id){
        Order order = new Order().setCustomerId(customerId).setContact(contact).setContactPhone(contactPhone).
                setContactEmail(contactMail).setFeedback(feedback).setContent(content).setCreateTime(Date.from(Instant.now())).setId(id);
        int result = 0;
        try {
            result =  orderMapper.updateByPrimaryKey(order);
        }
        catch (Exception e){
            LOGGER.error("orderMapper.updateByPrimaryKey更新数据失败", e);
        }
        return result;
    }

    @GetMapping(value = "/delete")
    public int deleteOrderById(int id){
        int result = 0;
        try {
            result =  orderMapper.deleteByPrimaryKey(id);
        }
        catch (Exception e){
            LOGGER.error("orderMapper.deleteByPrimaryKey更新数据失败", e);
        }
        if(Objects.equals(result,0)){
            LOGGER.error("无法删除不存在的数据");
        }
        return result;
    }

    @GetMapping(value = "/list")
    public List<Order> ListOrder(){
        List<Order> orderList = null;
        try {
            orderList = orderMapper.selectByExample(null);
        } catch (Exception e) {
            LOGGER.error("orderMapper.selectByExample查询数据失败", e);
        }
        return orderList;
    }

    @GetMapping(value = "/find")
    public Order findOrderById(int id){
        Order order = null;
        try {
            order = orderMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            LOGGER.error("orderMapper.selectByExample查询数据失败", e);
        }
        return order;
    }

}