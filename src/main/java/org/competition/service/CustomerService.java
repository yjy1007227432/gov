/*     */ package org.competition.service;
/*     */ import java.time.Instant;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.competition.dao.IdAndName;
/*     */ import org.competition.domain.Customer;
/*     */ import org.competition.mapper.CustomerMapper;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Component;
/*     */ import org.springframework.web.bind.annotation.CrossOrigin;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import org.springframework.web.bind.annotation.RequestParam;
/*     */ import org.springframework.web.bind.annotation.RestController;
/*     */ 
/*     */ @Component
/*     */ @RestController
/*     */ @RequestMapping({"/gov/customer"})
/*     */ @CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
/*     */ public class CustomerService {
/*  24 */   static final Logger LOGGER = LogManager.getLogger(CustomerService.class);
/*     */   
/*     */   @Autowired
/*     */   private CustomerMapper customerMapper;
/*     */   
/*     */   @RequestMapping({"/selectIdAndName"})
/*     */   public List<IdAndName> selectIdAndName() {
/*  31 */     List<IdAndName> result = new ArrayList<>();
/*  32 */     List<Customer> customers = this.customerMapper.selectByExample(null);
/*     */     
/*  34 */     for (Customer customer : customers) {
/*  35 */       IdAndName idAndName = new IdAndName(customer.getId(), customer.getName());
/*  36 */       result.add(idAndName);
/*     */     } 
/*  38 */     return result;
/*     */   }

/*     */   @RequestMapping({"/add"})
/*     */   public int addCustomer(@RequestParam(required = false) String name, @RequestParam(required = false) String contact, @RequestParam(required = false) String createUser, @RequestParam(required = false) String vipCard, @RequestParam(required = false) String customerManager, @RequestParam(required = false) String managerPhone, @RequestParam(required = false) String contactPhone, @RequestParam(required = false) String customerType, @RequestParam(required = false) String customerGroup) {
/*  53 */     Customer customer = new Customer();
/*  54 */     customer.setName(name).setContact(contact).setCreateUser(createUser)
/*  55 */       .setVipcard(vipCard).setCustomerManager(customerManager)
/*  56 */       .setManagerPhone(managerPhone).setContactPhone(contactPhone)
/*  57 */       .setCustomerType(customerType).setCustomerGroup(customerGroup)
/*  58 */       .setCreateTime(Date.from(Instant.now()));
/*     */     
/*  60 */     int result = 0;
/*     */     try {
/*  62 */       result = this.customerMapper.insert(customer);
/*  63 */     } catch (Exception e) {
/*  64 */       LOGGER.error("customerMapper.insert插入数据失败", e);
/*     */     } 
/*  66 */     return result;
/*     */   }
/*     */ 

/*     */   @RequestMapping({"/update"})
/*     */   public int updateCustomer(@RequestParam(required = false) String name, @RequestParam(required = false) String contact, String vipCard, @RequestParam(required = false) String customerManager, @RequestParam(required = false) String managerPhone, @RequestParam(required = false) String contactPhone, @RequestParam(required = false) String customerType, @RequestParam(required = false) String customerGroup, @RequestParam(required = false) String updateUser, int id) {
/*  81 */     Customer customer = new Customer();
/*  82 */     customer.setName(name).setContact(contact).setUpdateUser(updateUser)
/*  83 */       .setVipcard(vipCard).setCustomerManager(customerManager)
/*  84 */       .setManagerPhone(managerPhone).setContactPhone(contactPhone)
/*  85 */       .setCustomerType(customerType).setCustomerGroup(customerGroup)
/*  86 */       .setUpdateTime(Date.from(Instant.now())).setId(Integer.valueOf(id));
/*     */     
/*  88 */     int result = 0;
/*     */     try {
/*  90 */       result = this.customerMapper.updateByPrimaryKeySelective(customer);
/*  91 */     } catch (Exception e) {
/*  92 */       LOGGER.error("customerMapper.updateByPrimaryKey更新数据失败", e);
/*     */     } 
/*  94 */     if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
/*  95 */       LOGGER.error("无法查询到需要更新的数据");
/*     */     }
/*  97 */     return result;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/delete"})
/*     */   public int deleteCustomerById(int id) {
/* 102 */     int result = 0;
/*     */     try {
/* 104 */       result = this.customerMapper.deleteByPrimaryKey(Integer.valueOf(id));
/* 105 */     } catch (Exception e) {
/* 106 */       LOGGER.error("customerMapper.deleteByPrimaryKey删除数据失败", e);
/*     */     } 
/* 108 */     if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
/* 109 */       LOGGER.error("无法删除不存在的数据");
/*     */     }
/* 111 */     return result;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/list"})
/*     */   public List<Customer> ListCustomer() {
/* 116 */     List<Customer> customers = null;
/*     */     try {
/* 118 */       customers = this.customerMapper.selectByExample(null);
/* 119 */     } catch (Exception e) {
/* 120 */       LOGGER.error("customerMapper.selectByExample查询数据失败", e);
/*     */     } 
/* 122 */     return customers;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/find"})
/*     */   public Customer findCustomerById(int id) {
/* 127 */     Customer customer = null;
/*     */     try {
/* 129 */       customer = this.customerMapper.selectByPrimaryKey(Integer.valueOf(id));
/* 130 */     } catch (Exception e) {
/* 131 */       LOGGER.error("newsMapper.selectByExample查询数据失败", e);
/*     */     } 
/* 133 */     if (Objects.equals(customer, null)) {
/* 134 */       LOGGER.error("查询结果为空");
/*     */     }
/* 136 */     return customer;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\service\CustomerService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */