/*      */ package org.competition.domain;
/*      */ 
/*      */ import java.util.ArrayList;
/*      */ import java.util.Date;
/*      */ import java.util.List;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class CustomerExample
/*      */ {
/*      */   protected String orderByClause;
/*      */   protected boolean distinct;
/*   15 */   protected List<Criteria> oredCriteria = new ArrayList<>();
/*      */ 
/*      */   
/*      */   public void setOrderByClause(String orderByClause) {
/*   19 */     this.orderByClause = orderByClause;
/*      */   }
/*      */   
/*      */   public String getOrderByClause() {
/*   23 */     return this.orderByClause;
/*      */   }
/*      */   
/*      */   public void setDistinct(boolean distinct) {
/*   27 */     this.distinct = distinct;
/*      */   }
/*      */   
/*      */   public boolean isDistinct() {
/*   31 */     return this.distinct;
/*      */   }
/*      */   
/*      */   public List<Criteria> getOredCriteria() {
/*   35 */     return this.oredCriteria;
/*      */   }
/*      */   
/*      */   public void or(Criteria criteria) {
/*   39 */     this.oredCriteria.add(criteria);
/*      */   }
/*      */   
/*      */   public Criteria or() {
/*   43 */     Criteria criteria = createCriteriaInternal();
/*   44 */     this.oredCriteria.add(criteria);
/*   45 */     return criteria;
/*      */   }
/*      */   
/*      */   public Criteria createCriteria() {
/*   49 */     Criteria criteria = createCriteriaInternal();
/*   50 */     if (this.oredCriteria.size() == 0) {
/*   51 */       this.oredCriteria.add(criteria);
/*      */     }
/*   53 */     return criteria;
/*      */   }
/*      */   
/*      */   protected Criteria createCriteriaInternal() {
/*   57 */     Criteria criteria = new Criteria();
/*   58 */     return criteria;
/*      */   }
/*      */   
/*      */   public void clear() {
/*   62 */     this.oredCriteria.clear();
/*   63 */     this.orderByClause = null;
/*   64 */     this.distinct = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected static abstract class GeneratedCriteria
/*      */   {
/*   72 */     protected List<CustomerExample.Criterion> criteria = new ArrayList<>();
/*      */ 
/*      */     
/*      */     public boolean isValid() {
/*   76 */       return (this.criteria.size() > 0);
/*      */     }
/*      */     
/*      */     public List<CustomerExample.Criterion> getAllCriteria() {
/*   80 */       return this.criteria;
/*      */     }
/*      */     
/*      */     public List<CustomerExample.Criterion> getCriteria() {
/*   84 */       return this.criteria;
/*      */     }
/*      */     
/*      */     protected void addCriterion(String condition) {
/*   88 */       if (condition == null) {
/*   89 */         throw new RuntimeException("Value for condition cannot be null");
/*      */       }
/*   91 */       this.criteria.add(new CustomerExample.Criterion(condition));
/*      */     }
/*      */     
/*      */     protected void addCriterion(String condition, Object value, String property) {
/*   95 */       if (value == null) {
/*   96 */         throw new RuntimeException("Value for " + property + " cannot be null");
/*      */       }
/*   98 */       this.criteria.add(new CustomerExample.Criterion(condition, value));
/*      */     }
/*      */     
/*      */     protected void addCriterion(String condition, Object value1, Object value2, String property) {
/*  102 */       if (value1 == null || value2 == null) {
/*  103 */         throw new RuntimeException("Between values for " + property + " cannot be null");
/*      */       }
/*  105 */       this.criteria.add(new CustomerExample.Criterion(condition, value1, value2));
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andIdIsNull() {
/*  109 */       addCriterion("id is null");
/*  110 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andIdIsNotNull() {
/*  114 */       addCriterion("id is not null");
/*  115 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andIdEqualTo(Integer value) {
/*  119 */       addCriterion("id =", value, "id");
/*  120 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andIdNotEqualTo(Integer value) {
/*  124 */       addCriterion("id <>", value, "id");
/*  125 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andIdGreaterThan(Integer value) {
/*  129 */       addCriterion("id >", value, "id");
/*  130 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
/*  134 */       addCriterion("id >=", value, "id");
/*  135 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andIdLessThan(Integer value) {
/*  139 */       addCriterion("id <", value, "id");
/*  140 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andIdLessThanOrEqualTo(Integer value) {
/*  144 */       addCriterion("id <=", value, "id");
/*  145 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andIdIn(List<Integer> values) {
/*  149 */       addCriterion("id in", values, "id");
/*  150 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andIdNotIn(List<Integer> values) {
/*  154 */       addCriterion("id not in", values, "id");
/*  155 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andIdBetween(Integer value1, Integer value2) {
/*  159 */       addCriterion("id between", value1, value2, "id");
/*  160 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
/*  164 */       addCriterion("id not between", value1, value2, "id");
/*  165 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateTimeIsNull() {
/*  169 */       addCriterion("create_time is null");
/*  170 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateTimeIsNotNull() {
/*  174 */       addCriterion("create_time is not null");
/*  175 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateTimeEqualTo(Date value) {
/*  179 */       addCriterion("create_time =", value, "createTime");
/*  180 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateTimeNotEqualTo(Date value) {
/*  184 */       addCriterion("create_time <>", value, "createTime");
/*  185 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateTimeGreaterThan(Date value) {
/*  189 */       addCriterion("create_time >", value, "createTime");
/*  190 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
/*  194 */       addCriterion("create_time >=", value, "createTime");
/*  195 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateTimeLessThan(Date value) {
/*  199 */       addCriterion("create_time <", value, "createTime");
/*  200 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
/*  204 */       addCriterion("create_time <=", value, "createTime");
/*  205 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateTimeIn(List<Date> values) {
/*  209 */       addCriterion("create_time in", values, "createTime");
/*  210 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateTimeNotIn(List<Date> values) {
/*  214 */       addCriterion("create_time not in", values, "createTime");
/*  215 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
/*  219 */       addCriterion("create_time between", value1, value2, "createTime");
/*  220 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
/*  224 */       addCriterion("create_time not between", value1, value2, "createTime");
/*  225 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateTimeIsNull() {
/*  229 */       addCriterion("update_time is null");
/*  230 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateTimeIsNotNull() {
/*  234 */       addCriterion("update_time is not null");
/*  235 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateTimeEqualTo(Date value) {
/*  239 */       addCriterion("update_time =", value, "updateTime");
/*  240 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateTimeNotEqualTo(Date value) {
/*  244 */       addCriterion("update_time <>", value, "updateTime");
/*  245 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateTimeGreaterThan(Date value) {
/*  249 */       addCriterion("update_time >", value, "updateTime");
/*  250 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
/*  254 */       addCriterion("update_time >=", value, "updateTime");
/*  255 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateTimeLessThan(Date value) {
/*  259 */       addCriterion("update_time <", value, "updateTime");
/*  260 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
/*  264 */       addCriterion("update_time <=", value, "updateTime");
/*  265 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateTimeIn(List<Date> values) {
/*  269 */       addCriterion("update_time in", values, "updateTime");
/*  270 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateTimeNotIn(List<Date> values) {
/*  274 */       addCriterion("update_time not in", values, "updateTime");
/*  275 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateTimeBetween(Date value1, Date value2) {
/*  279 */       addCriterion("update_time between", value1, value2, "updateTime");
/*  280 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
/*  284 */       addCriterion("update_time not between", value1, value2, "updateTime");
/*  285 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateUserIsNull() {
/*  289 */       addCriterion("create_user is null");
/*  290 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateUserIsNotNull() {
/*  294 */       addCriterion("create_user is not null");
/*  295 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateUserEqualTo(String value) {
/*  299 */       addCriterion("create_user =", value, "createUser");
/*  300 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateUserNotEqualTo(String value) {
/*  304 */       addCriterion("create_user <>", value, "createUser");
/*  305 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateUserGreaterThan(String value) {
/*  309 */       addCriterion("create_user >", value, "createUser");
/*  310 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateUserGreaterThanOrEqualTo(String value) {
/*  314 */       addCriterion("create_user >=", value, "createUser");
/*  315 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateUserLessThan(String value) {
/*  319 */       addCriterion("create_user <", value, "createUser");
/*  320 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateUserLessThanOrEqualTo(String value) {
/*  324 */       addCriterion("create_user <=", value, "createUser");
/*  325 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateUserLike(String value) {
/*  329 */       addCriterion("create_user like", value, "createUser");
/*  330 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateUserNotLike(String value) {
/*  334 */       addCriterion("create_user not like", value, "createUser");
/*  335 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateUserIn(List<String> values) {
/*  339 */       addCriterion("create_user in", values, "createUser");
/*  340 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateUserNotIn(List<String> values) {
/*  344 */       addCriterion("create_user not in", values, "createUser");
/*  345 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateUserBetween(String value1, String value2) {
/*  349 */       addCriterion("create_user between", value1, value2, "createUser");
/*  350 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCreateUserNotBetween(String value1, String value2) {
/*  354 */       addCriterion("create_user not between", value1, value2, "createUser");
/*  355 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateUserIsNull() {
/*  359 */       addCriterion("update_user is null");
/*  360 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateUserIsNotNull() {
/*  364 */       addCriterion("update_user is not null");
/*  365 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateUserEqualTo(String value) {
/*  369 */       addCriterion("update_user =", value, "updateUser");
/*  370 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateUserNotEqualTo(String value) {
/*  374 */       addCriterion("update_user <>", value, "updateUser");
/*  375 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateUserGreaterThan(String value) {
/*  379 */       addCriterion("update_user >", value, "updateUser");
/*  380 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
/*  384 */       addCriterion("update_user >=", value, "updateUser");
/*  385 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateUserLessThan(String value) {
/*  389 */       addCriterion("update_user <", value, "updateUser");
/*  390 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateUserLessThanOrEqualTo(String value) {
/*  394 */       addCriterion("update_user <=", value, "updateUser");
/*  395 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateUserLike(String value) {
/*  399 */       addCriterion("update_user like", value, "updateUser");
/*  400 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateUserNotLike(String value) {
/*  404 */       addCriterion("update_user not like", value, "updateUser");
/*  405 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateUserIn(List<String> values) {
/*  409 */       addCriterion("update_user in", values, "updateUser");
/*  410 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateUserNotIn(List<String> values) {
/*  414 */       addCriterion("update_user not in", values, "updateUser");
/*  415 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateUserBetween(String value1, String value2) {
/*  419 */       addCriterion("update_user between", value1, value2, "updateUser");
/*  420 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andUpdateUserNotBetween(String value1, String value2) {
/*  424 */       addCriterion("update_user not between", value1, value2, "updateUser");
/*  425 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andVipcardIsNull() {
/*  429 */       addCriterion("vipcard is null");
/*  430 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andVipcardIsNotNull() {
/*  434 */       addCriterion("vipcard is not null");
/*  435 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andVipcardEqualTo(String value) {
/*  439 */       addCriterion("vipcard =", value, "vipcard");
/*  440 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andVipcardNotEqualTo(String value) {
/*  444 */       addCriterion("vipcard <>", value, "vipcard");
/*  445 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andVipcardGreaterThan(String value) {
/*  449 */       addCriterion("vipcard >", value, "vipcard");
/*  450 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andVipcardGreaterThanOrEqualTo(String value) {
/*  454 */       addCriterion("vipcard >=", value, "vipcard");
/*  455 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andVipcardLessThan(String value) {
/*  459 */       addCriterion("vipcard <", value, "vipcard");
/*  460 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andVipcardLessThanOrEqualTo(String value) {
/*  464 */       addCriterion("vipcard <=", value, "vipcard");
/*  465 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andVipcardLike(String value) {
/*  469 */       addCriterion("vipcard like", value, "vipcard");
/*  470 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andVipcardNotLike(String value) {
/*  474 */       addCriterion("vipcard not like", value, "vipcard");
/*  475 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andVipcardIn(List<String> values) {
/*  479 */       addCriterion("vipcard in", values, "vipcard");
/*  480 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andVipcardNotIn(List<String> values) {
/*  484 */       addCriterion("vipcard not in", values, "vipcard");
/*  485 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andVipcardBetween(String value1, String value2) {
/*  489 */       addCriterion("vipcard between", value1, value2, "vipcard");
/*  490 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andVipcardNotBetween(String value1, String value2) {
/*  494 */       addCriterion("vipcard not between", value1, value2, "vipcard");
/*  495 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andNameIsNull() {
/*  499 */       addCriterion("name is null");
/*  500 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andNameIsNotNull() {
/*  504 */       addCriterion("name is not null");
/*  505 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andNameEqualTo(String value) {
/*  509 */       addCriterion("name =", value, "name");
/*  510 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andNameNotEqualTo(String value) {
/*  514 */       addCriterion("name <>", value, "name");
/*  515 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andNameGreaterThan(String value) {
/*  519 */       addCriterion("name >", value, "name");
/*  520 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andNameGreaterThanOrEqualTo(String value) {
/*  524 */       addCriterion("name >=", value, "name");
/*  525 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andNameLessThan(String value) {
/*  529 */       addCriterion("name <", value, "name");
/*  530 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andNameLessThanOrEqualTo(String value) {
/*  534 */       addCriterion("name <=", value, "name");
/*  535 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andNameLike(String value) {
/*  539 */       addCriterion("name like", value, "name");
/*  540 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andNameNotLike(String value) {
/*  544 */       addCriterion("name not like", value, "name");
/*  545 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andNameIn(List<String> values) {
/*  549 */       addCriterion("name in", values, "name");
/*  550 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andNameNotIn(List<String> values) {
/*  554 */       addCriterion("name not in", values, "name");
/*  555 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andNameBetween(String value1, String value2) {
/*  559 */       addCriterion("name between", value1, value2, "name");
/*  560 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andNameNotBetween(String value1, String value2) {
/*  564 */       addCriterion("name not between", value1, value2, "name");
/*  565 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerManagerIsNull() {
/*  569 */       addCriterion("customer_manager is null");
/*  570 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerManagerIsNotNull() {
/*  574 */       addCriterion("customer_manager is not null");
/*  575 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerManagerEqualTo(String value) {
/*  579 */       addCriterion("customer_manager =", value, "customerManager");
/*  580 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerManagerNotEqualTo(String value) {
/*  584 */       addCriterion("customer_manager <>", value, "customerManager");
/*  585 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerManagerGreaterThan(String value) {
/*  589 */       addCriterion("customer_manager >", value, "customerManager");
/*  590 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerManagerGreaterThanOrEqualTo(String value) {
/*  594 */       addCriterion("customer_manager >=", value, "customerManager");
/*  595 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerManagerLessThan(String value) {
/*  599 */       addCriterion("customer_manager <", value, "customerManager");
/*  600 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerManagerLessThanOrEqualTo(String value) {
/*  604 */       addCriterion("customer_manager <=", value, "customerManager");
/*  605 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerManagerLike(String value) {
/*  609 */       addCriterion("customer_manager like", value, "customerManager");
/*  610 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerManagerNotLike(String value) {
/*  614 */       addCriterion("customer_manager not like", value, "customerManager");
/*  615 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerManagerIn(List<String> values) {
/*  619 */       addCriterion("customer_manager in", values, "customerManager");
/*  620 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerManagerNotIn(List<String> values) {
/*  624 */       addCriterion("customer_manager not in", values, "customerManager");
/*  625 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerManagerBetween(String value1, String value2) {
/*  629 */       addCriterion("customer_manager between", value1, value2, "customerManager");
/*  630 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerManagerNotBetween(String value1, String value2) {
/*  634 */       addCriterion("customer_manager not between", value1, value2, "customerManager");
/*  635 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andManagerPhoneIsNull() {
/*  639 */       addCriterion("manager_phone is null");
/*  640 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andManagerPhoneIsNotNull() {
/*  644 */       addCriterion("manager_phone is not null");
/*  645 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andManagerPhoneEqualTo(String value) {
/*  649 */       addCriterion("manager_phone =", value, "managerPhone");
/*  650 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andManagerPhoneNotEqualTo(String value) {
/*  654 */       addCriterion("manager_phone <>", value, "managerPhone");
/*  655 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andManagerPhoneGreaterThan(String value) {
/*  659 */       addCriterion("manager_phone >", value, "managerPhone");
/*  660 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andManagerPhoneGreaterThanOrEqualTo(String value) {
/*  664 */       addCriterion("manager_phone >=", value, "managerPhone");
/*  665 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andManagerPhoneLessThan(String value) {
/*  669 */       addCriterion("manager_phone <", value, "managerPhone");
/*  670 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andManagerPhoneLessThanOrEqualTo(String value) {
/*  674 */       addCriterion("manager_phone <=", value, "managerPhone");
/*  675 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andManagerPhoneLike(String value) {
/*  679 */       addCriterion("manager_phone like", value, "managerPhone");
/*  680 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andManagerPhoneNotLike(String value) {
/*  684 */       addCriterion("manager_phone not like", value, "managerPhone");
/*  685 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andManagerPhoneIn(List<String> values) {
/*  689 */       addCriterion("manager_phone in", values, "managerPhone");
/*  690 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andManagerPhoneNotIn(List<String> values) {
/*  694 */       addCriterion("manager_phone not in", values, "managerPhone");
/*  695 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andManagerPhoneBetween(String value1, String value2) {
/*  699 */       addCriterion("manager_phone between", value1, value2, "managerPhone");
/*  700 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andManagerPhoneNotBetween(String value1, String value2) {
/*  704 */       addCriterion("manager_phone not between", value1, value2, "managerPhone");
/*  705 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactIsNull() {
/*  709 */       addCriterion("contact is null");
/*  710 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactIsNotNull() {
/*  714 */       addCriterion("contact is not null");
/*  715 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactEqualTo(String value) {
/*  719 */       addCriterion("contact =", value, "contact");
/*  720 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactNotEqualTo(String value) {
/*  724 */       addCriterion("contact <>", value, "contact");
/*  725 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactGreaterThan(String value) {
/*  729 */       addCriterion("contact >", value, "contact");
/*  730 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactGreaterThanOrEqualTo(String value) {
/*  734 */       addCriterion("contact >=", value, "contact");
/*  735 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactLessThan(String value) {
/*  739 */       addCriterion("contact <", value, "contact");
/*  740 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactLessThanOrEqualTo(String value) {
/*  744 */       addCriterion("contact <=", value, "contact");
/*  745 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactLike(String value) {
/*  749 */       addCriterion("contact like", value, "contact");
/*  750 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactNotLike(String value) {
/*  754 */       addCriterion("contact not like", value, "contact");
/*  755 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactIn(List<String> values) {
/*  759 */       addCriterion("contact in", values, "contact");
/*  760 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactNotIn(List<String> values) {
/*  764 */       addCriterion("contact not in", values, "contact");
/*  765 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactBetween(String value1, String value2) {
/*  769 */       addCriterion("contact between", value1, value2, "contact");
/*  770 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactNotBetween(String value1, String value2) {
/*  774 */       addCriterion("contact not between", value1, value2, "contact");
/*  775 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactPhoneIsNull() {
/*  779 */       addCriterion("contact_phone is null");
/*  780 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactPhoneIsNotNull() {
/*  784 */       addCriterion("contact_phone is not null");
/*  785 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactPhoneEqualTo(String value) {
/*  789 */       addCriterion("contact_phone =", value, "contactPhone");
/*  790 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactPhoneNotEqualTo(String value) {
/*  794 */       addCriterion("contact_phone <>", value, "contactPhone");
/*  795 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactPhoneGreaterThan(String value) {
/*  799 */       addCriterion("contact_phone >", value, "contactPhone");
/*  800 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
/*  804 */       addCriterion("contact_phone >=", value, "contactPhone");
/*  805 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactPhoneLessThan(String value) {
/*  809 */       addCriterion("contact_phone <", value, "contactPhone");
/*  810 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactPhoneLessThanOrEqualTo(String value) {
/*  814 */       addCriterion("contact_phone <=", value, "contactPhone");
/*  815 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactPhoneLike(String value) {
/*  819 */       addCriterion("contact_phone like", value, "contactPhone");
/*  820 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactPhoneNotLike(String value) {
/*  824 */       addCriterion("contact_phone not like", value, "contactPhone");
/*  825 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactPhoneIn(List<String> values) {
/*  829 */       addCriterion("contact_phone in", values, "contactPhone");
/*  830 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactPhoneNotIn(List<String> values) {
/*  834 */       addCriterion("contact_phone not in", values, "contactPhone");
/*  835 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactPhoneBetween(String value1, String value2) {
/*  839 */       addCriterion("contact_phone between", value1, value2, "contactPhone");
/*  840 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andContactPhoneNotBetween(String value1, String value2) {
/*  844 */       addCriterion("contact_phone not between", value1, value2, "contactPhone");
/*  845 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerTypeIsNull() {
/*  849 */       addCriterion("customer_type is null");
/*  850 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerTypeIsNotNull() {
/*  854 */       addCriterion("customer_type is not null");
/*  855 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerTypeEqualTo(String value) {
/*  859 */       addCriterion("customer_type =", value, "customerType");
/*  860 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerTypeNotEqualTo(String value) {
/*  864 */       addCriterion("customer_type <>", value, "customerType");
/*  865 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerTypeGreaterThan(String value) {
/*  869 */       addCriterion("customer_type >", value, "customerType");
/*  870 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerTypeGreaterThanOrEqualTo(String value) {
/*  874 */       addCriterion("customer_type >=", value, "customerType");
/*  875 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerTypeLessThan(String value) {
/*  879 */       addCriterion("customer_type <", value, "customerType");
/*  880 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerTypeLessThanOrEqualTo(String value) {
/*  884 */       addCriterion("customer_type <=", value, "customerType");
/*  885 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerTypeLike(String value) {
/*  889 */       addCriterion("customer_type like", value, "customerType");
/*  890 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerTypeNotLike(String value) {
/*  894 */       addCriterion("customer_type not like", value, "customerType");
/*  895 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerTypeIn(List<String> values) {
/*  899 */       addCriterion("customer_type in", values, "customerType");
/*  900 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerTypeNotIn(List<String> values) {
/*  904 */       addCriterion("customer_type not in", values, "customerType");
/*  905 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerTypeBetween(String value1, String value2) {
/*  909 */       addCriterion("customer_type between", value1, value2, "customerType");
/*  910 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerTypeNotBetween(String value1, String value2) {
/*  914 */       addCriterion("customer_type not between", value1, value2, "customerType");
/*  915 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerGroupIsNull() {
/*  919 */       addCriterion("customer_group is null");
/*  920 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerGroupIsNotNull() {
/*  924 */       addCriterion("customer_group is not null");
/*  925 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerGroupEqualTo(String value) {
/*  929 */       addCriterion("customer_group =", value, "customerGroup");
/*  930 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerGroupNotEqualTo(String value) {
/*  934 */       addCriterion("customer_group <>", value, "customerGroup");
/*  935 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerGroupGreaterThan(String value) {
/*  939 */       addCriterion("customer_group >", value, "customerGroup");
/*  940 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerGroupGreaterThanOrEqualTo(String value) {
/*  944 */       addCriterion("customer_group >=", value, "customerGroup");
/*  945 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerGroupLessThan(String value) {
/*  949 */       addCriterion("customer_group <", value, "customerGroup");
/*  950 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerGroupLessThanOrEqualTo(String value) {
/*  954 */       addCriterion("customer_group <=", value, "customerGroup");
/*  955 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerGroupLike(String value) {
/*  959 */       addCriterion("customer_group like", value, "customerGroup");
/*  960 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerGroupNotLike(String value) {
/*  964 */       addCriterion("customer_group not like", value, "customerGroup");
/*  965 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerGroupIn(List<String> values) {
/*  969 */       addCriterion("customer_group in", values, "customerGroup");
/*  970 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerGroupNotIn(List<String> values) {
/*  974 */       addCriterion("customer_group not in", values, "customerGroup");
/*  975 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerGroupBetween(String value1, String value2) {
/*  979 */       addCriterion("customer_group between", value1, value2, "customerGroup");
/*  980 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */     
/*      */     public CustomerExample.Criteria andCustomerGroupNotBetween(String value1, String value2) {
/*  984 */       addCriterion("customer_group not between", value1, value2, "customerGroup");
/*  985 */       return (CustomerExample.Criteria)this;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class Criteria
/*      */     extends GeneratedCriteria {}
/*      */ 
/*      */   
/*      */   public static class Criterion
/*      */   {
/*      */     private String condition;
/*      */     
/*      */     private Object value;
/*      */     
/*      */     private Object secondValue;
/*      */     
/*      */     private boolean noValue;
/*      */     
/*      */     private boolean singleValue;
/*      */     
/*      */     private boolean betweenValue;
/*      */     
/*      */     private boolean listValue;
/*      */     
/*      */     private String typeHandler;
/*      */ 
/*      */     
/*      */     public String getCondition() {
/* 1014 */       return this.condition;
/*      */     }
/*      */     
/*      */     public Object getValue() {
/* 1018 */       return this.value;
/*      */     }
/*      */     
/*      */     public Object getSecondValue() {
/* 1022 */       return this.secondValue;
/*      */     }
/*      */     
/*      */     public boolean isNoValue() {
/* 1026 */       return this.noValue;
/*      */     }
/*      */     
/*      */     public boolean isSingleValue() {
/* 1030 */       return this.singleValue;
/*      */     }
/*      */     
/*      */     public boolean isBetweenValue() {
/* 1034 */       return this.betweenValue;
/*      */     }
/*      */     
/*      */     public boolean isListValue() {
/* 1038 */       return this.listValue;
/*      */     }
/*      */     
/*      */     public String getTypeHandler() {
/* 1042 */       return this.typeHandler;
/*      */     }
/*      */ 
/*      */     
/*      */     protected Criterion(String condition) {
/* 1047 */       this.condition = condition;
/* 1048 */       this.typeHandler = null;
/* 1049 */       this.noValue = true;
/*      */     }
/*      */ 
/*      */     
/*      */     protected Criterion(String condition, Object value, String typeHandler) {
/* 1054 */       this.condition = condition;
/* 1055 */       this.value = value;
/* 1056 */       this.typeHandler = typeHandler;
/* 1057 */       if (value instanceof List) {
/* 1058 */         this.listValue = true;
/*      */       } else {
/* 1060 */         this.singleValue = true;
/*      */       } 
/*      */     }
/*      */     
/*      */     protected Criterion(String condition, Object value) {
/* 1065 */       this(condition, value, (String)null);
/*      */     }
/*      */ 
/*      */     
/*      */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
/* 1070 */       this.condition = condition;
/* 1071 */       this.value = value;
/* 1072 */       this.secondValue = secondValue;
/* 1073 */       this.typeHandler = typeHandler;
/* 1074 */       this.betweenValue = true;
/*      */     }
/*      */     
/*      */     protected Criterion(String condition, Object value, Object secondValue) {
/* 1078 */       this(condition, value, secondValue, null);
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\domain\CustomerExample.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */