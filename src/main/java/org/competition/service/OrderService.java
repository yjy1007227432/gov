/*     */ package org.competition.service;
/*     */ 
/*     */ import java.time.Instant;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.competition.dao.OrderCustomer;
/*     */ import org.competition.dao.OrderPojo;
/*     */ import org.competition.domain.Customer;
/*     */ import org.competition.domain.Order;
/*     */ import org.competition.mapper.OrderMapper;
/*     */ import org.springframework.beans.BeanUtils;
/*     */ import org.springframework.beans.BeansException;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Component;
/*     */ import org.springframework.web.bind.annotation.CrossOrigin;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import org.springframework.web.bind.annotation.RequestParam;
/*     */ import org.springframework.web.bind.annotation.RestController;
/*     */ 
/*     */ @Component
/*     */ @RestController
/*     */ @RequestMapping({"/gov/order"})
/*     */ @CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
/*     */ public class OrderService
/*     */ {
/*     */   @Autowired
/*     */   private OrderMapper orderMapper;
/*     */   @Autowired
/*     */   private CustomerService customerService;
/*  34 */   public static final Logger LOGGER = LogManager.getLogger(OrderService.class);
/*     */   
/*     */   @RequestMapping({"/insert"})
/*     */   public int insertOrder(OrderPojo orderPojo) {
/*  38 */     Order order = new Order();
/*     */     try {
/*  40 */       BeanUtils.copyProperties(orderPojo, order);
/*  41 */     } catch (BeansException e) {
/*  42 */       LOGGER.error("BeanUtil property copy  failed :BeansException", (Throwable)e);
/*  43 */     } catch (Exception e) {
/*  44 */       LOGGER.error("BeanUtil property copy failed:Exception", e);
/*     */     } 
/*  46 */     order.setCreateTime(Date.from(Instant.now()));
/*  47 */     int result = 0;
/*     */     try {
/*  49 */       result = this.orderMapper.insert(order);
/*     */     }
/*  51 */     catch (Exception e) {
/*  52 */       LOGGER.error("orderMapper.insert插入数据失败", e);
/*     */     } 
/*  54 */     return result;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"/add"})
/*     */   public int addOrder(@RequestParam(required = false) Integer customerId, @RequestParam(required = false) String contact, @RequestParam(required = false) String contactPhone, @RequestParam(required = false) String contactMail, @RequestParam(required = false) String feedback, @RequestParam(required = false) String content, @RequestParam(required = false) Integer queueId, @RequestParam(required = false) String backup1) {
/*  77 */     Order order = (new Order()).setCustomerId(customerId).setContact(contact).setContactPhone(contactPhone).setContactEmail(contactMail).setFeedback(feedback).setContent(content).setCreateTime(Date.from(Instant.now())).setQueueId(queueId).setBackup1(backup1);
/*  78 */     int result = 0;
/*     */     try {
/*  80 */       result = this.orderMapper.insert(order);
/*     */     }
/*  82 */     catch (Exception e) {
/*  83 */       LOGGER.error("orderMapper.insert插入数据失败", e);
/*     */     } 
/*  85 */     return result;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"/update"})
/*     */   public int updateOrder(@RequestParam(required = false) Integer customerId, @RequestParam(required = false) String contact, @RequestParam(required = false) String contactPhone, @RequestParam(required = false) String contactMail, @RequestParam(required = false) String feedback, @RequestParam(required = false) String content, @RequestParam(required = false) String updateUser, Integer id, @RequestParam(required = false) Integer queueId) {
/* 113 */     Order order = (new Order()).setCustomerId(customerId).setContact(contact).setContactPhone(contactPhone).setContactEmail(contactMail).setFeedback(feedback).setContent(content).setId(id).setUpdateUser(updateUser).setUpdateTime(Date.from(Instant.now())).setQueueId(queueId);
/* 114 */     int result = 0;
/*     */     try {
/* 116 */       result = this.orderMapper.updateByPrimaryKeySelective(order);
/*     */     }
/* 118 */     catch (Exception e) {
/* 119 */       LOGGER.error("orderMapper.updateByPrimaryKey更新数据失败", e);
/*     */     } 
/* 121 */     if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
/* 122 */       LOGGER.error("无法查询到需要更新的数据");
/*     */     }
/* 124 */     return result;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/delete"})
/*     */   public int deleteOrderById(int id) {
/* 129 */     int result = 0;
/*     */     try {
/* 131 */       result = this.orderMapper.deleteByPrimaryKey(Integer.valueOf(id));
/*     */     }
/* 133 */     catch (Exception e) {
/* 134 */       LOGGER.error("orderMapper.deleteByPrimaryKey更新数据失败", e);
/*     */     } 
/* 136 */     if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
/* 137 */       LOGGER.error("无法删除不存在的数据");
/*     */     }
/* 139 */     return result;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/list"})
/*     */   public List<OrderCustomer> ListOrder() {
/* 144 */     List<Order> orderList = null;
/*     */     try {
/* 146 */       orderList = this.orderMapper.selectByExample(null);
/* 147 */     } catch (Exception e) {
/* 148 */       LOGGER.error("orderMapper.selectByExample查询数据失败", e);
/*     */     } 
/* 150 */     List<OrderCustomer> orderCustomers = new ArrayList<>();
/* 151 */     if (orderList != null) {
/* 152 */       for (Order order : orderList) {
/* 153 */         Customer customer = this.customerService.findCustomerById(order.getCustomerId().intValue());
/* 154 */         if (customer != null) {
/* 155 */           OrderCustomer orderCustomer = new OrderCustomer();
/* 156 */           BeanUtils.copyProperties(order, orderCustomer);
/* 157 */           orderCustomer.setName(customer.getName());
/* 158 */           orderCustomers.add(orderCustomer);
/*     */         } 
/*     */       } 
/*     */     }
/* 162 */     return orderCustomers;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/find"})
/*     */   public OrderCustomer findOrderById(int id) {
/* 167 */     Order order = null;
/*     */     try {
/* 169 */       order = this.orderMapper.selectByPrimaryKey(Integer.valueOf(id));
/* 170 */     } catch (Exception e) {
/* 171 */       LOGGER.error("orderMapper.selectByExample查询数据失败", e);
/*     */     } 
/* 173 */     if (Objects.equals(order, null)) {
/* 174 */       LOGGER.error("查询结果为空");
/*     */     }
/* 176 */     Customer customer = this.customerService.findCustomerById(order.getCustomerId().intValue());
/* 177 */     OrderCustomer orderCustomer = new OrderCustomer();
/* 178 */     if (customer != null) {
/* 179 */       BeanUtils.copyProperties(order, orderCustomer);
/* 180 */       orderCustomer.setName(customer.getName());
/*     */     } 
/* 182 */     return orderCustomer;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\service\OrderService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */