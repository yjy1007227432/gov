/*     */ package org.competition.domain;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class UserExample
/*     */ {
/*     */   protected String orderByClause;
/*     */   protected boolean distinct;
/*  15 */   protected List<Criteria> oredCriteria = new ArrayList<>();
/*     */ 
/*     */   
/*     */   public void setOrderByClause(String orderByClause) {
/*  19 */     this.orderByClause = orderByClause;
/*     */   }
/*     */   
/*     */   public String getOrderByClause() {
/*  23 */     return this.orderByClause;
/*     */   }
/*     */   
/*     */   public void setDistinct(boolean distinct) {
/*  27 */     this.distinct = distinct;
/*     */   }
/*     */   
/*     */   public boolean isDistinct() {
/*  31 */     return this.distinct;
/*     */   }
/*     */   
/*     */   public List<Criteria> getOredCriteria() {
/*  35 */     return this.oredCriteria;
/*     */   }
/*     */   
/*     */   public void or(Criteria criteria) {
/*  39 */     this.oredCriteria.add(criteria);
/*     */   }
/*     */   
/*     */   public Criteria or() {
/*  43 */     Criteria criteria = createCriteriaInternal();
/*  44 */     this.oredCriteria.add(criteria);
/*  45 */     return criteria;
/*     */   }
/*     */   
/*     */   public Criteria createCriteria() {
/*  49 */     Criteria criteria = createCriteriaInternal();
/*  50 */     if (this.oredCriteria.size() == 0) {
/*  51 */       this.oredCriteria.add(criteria);
/*     */     }
/*  53 */     return criteria;
/*     */   }
/*     */   
/*     */   protected Criteria createCriteriaInternal() {
/*  57 */     Criteria criteria = new Criteria();
/*  58 */     return criteria;
/*     */   }
/*     */   
/*     */   public void clear() {
/*  62 */     this.oredCriteria.clear();
/*  63 */     this.orderByClause = null;
/*  64 */     this.distinct = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static abstract class GeneratedCriteria
/*     */   {
/*  72 */     protected List<UserExample.Criterion> criteria = new ArrayList<>();
/*     */ 
/*     */     
/*     */     public boolean isValid() {
/*  76 */       return (this.criteria.size() > 0);
/*     */     }
/*     */     
/*     */     public List<UserExample.Criterion> getAllCriteria() {
/*  80 */       return this.criteria;
/*     */     }
/*     */     
/*     */     public List<UserExample.Criterion> getCriteria() {
/*  84 */       return this.criteria;
/*     */     }
/*     */     
/*     */     protected void addCriterion(String condition) {
/*  88 */       if (condition == null) {
/*  89 */         throw new RuntimeException("Value for condition cannot be null");
/*     */       }
/*  91 */       this.criteria.add(new UserExample.Criterion(condition));
/*     */     }
/*     */     
/*     */     protected void addCriterion(String condition, Object value, String property) {
/*  95 */       if (value == null) {
/*  96 */         throw new RuntimeException("Value for " + property + " cannot be null");
/*     */       }
/*  98 */       this.criteria.add(new UserExample.Criterion(condition, value));
/*     */     }
/*     */     
/*     */     protected void addCriterion(String condition, Object value1, Object value2, String property) {
/* 102 */       if (value1 == null || value2 == null) {
/* 103 */         throw new RuntimeException("Between values for " + property + " cannot be null");
/*     */       }
/* 105 */       this.criteria.add(new UserExample.Criterion(condition, value1, value2));
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andIdIsNull() {
/* 109 */       addCriterion("id is null");
/* 110 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andIdIsNotNull() {
/* 114 */       addCriterion("id is not null");
/* 115 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andIdEqualTo(Integer value) {
/* 119 */       addCriterion("id =", value, "id");
/* 120 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andIdNotEqualTo(Integer value) {
/* 124 */       addCriterion("id <>", value, "id");
/* 125 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andIdGreaterThan(Integer value) {
/* 129 */       addCriterion("id >", value, "id");
/* 130 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
/* 134 */       addCriterion("id >=", value, "id");
/* 135 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andIdLessThan(Integer value) {
/* 139 */       addCriterion("id <", value, "id");
/* 140 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andIdLessThanOrEqualTo(Integer value) {
/* 144 */       addCriterion("id <=", value, "id");
/* 145 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andIdIn(List<Integer> values) {
/* 149 */       addCriterion("id in", values, "id");
/* 150 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andIdNotIn(List<Integer> values) {
/* 154 */       addCriterion("id not in", values, "id");
/* 155 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andIdBetween(Integer value1, Integer value2) {
/* 159 */       addCriterion("id between", value1, value2, "id");
/* 160 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
/* 164 */       addCriterion("id not between", value1, value2, "id");
/* 165 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andLoginIdIsNull() {
/* 169 */       addCriterion("login_id is null");
/* 170 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andLoginIdIsNotNull() {
/* 174 */       addCriterion("login_id is not null");
/* 175 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andLoginIdEqualTo(String value) {
/* 179 */       addCriterion("login_id =", value, "loginId");
/* 180 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andLoginIdNotEqualTo(String value) {
/* 184 */       addCriterion("login_id <>", value, "loginId");
/* 185 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andLoginIdGreaterThan(String value) {
/* 189 */       addCriterion("login_id >", value, "loginId");
/* 190 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andLoginIdGreaterThanOrEqualTo(String value) {
/* 194 */       addCriterion("login_id >=", value, "loginId");
/* 195 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andLoginIdLessThan(String value) {
/* 199 */       addCriterion("login_id <", value, "loginId");
/* 200 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andLoginIdLessThanOrEqualTo(String value) {
/* 204 */       addCriterion("login_id <=", value, "loginId");
/* 205 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andLoginIdLike(String value) {
/* 209 */       addCriterion("login_id like", value, "loginId");
/* 210 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andLoginIdNotLike(String value) {
/* 214 */       addCriterion("login_id not like", value, "loginId");
/* 215 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andLoginIdIn(List<String> values) {
/* 219 */       addCriterion("login_id in", values, "loginId");
/* 220 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andLoginIdNotIn(List<String> values) {
/* 224 */       addCriterion("login_id not in", values, "loginId");
/* 225 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andLoginIdBetween(String value1, String value2) {
/* 229 */       addCriterion("login_id between", value1, value2, "loginId");
/* 230 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andLoginIdNotBetween(String value1, String value2) {
/* 234 */       addCriterion("login_id not between", value1, value2, "loginId");
/* 235 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateTimeIsNull() {
/* 239 */       addCriterion("create_time is null");
/* 240 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateTimeIsNotNull() {
/* 244 */       addCriterion("create_time is not null");
/* 245 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateTimeEqualTo(Date value) {
/* 249 */       addCriterion("create_time =", value, "createTime");
/* 250 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateTimeNotEqualTo(Date value) {
/* 254 */       addCriterion("create_time <>", value, "createTime");
/* 255 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateTimeGreaterThan(Date value) {
/* 259 */       addCriterion("create_time >", value, "createTime");
/* 260 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
/* 264 */       addCriterion("create_time >=", value, "createTime");
/* 265 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateTimeLessThan(Date value) {
/* 269 */       addCriterion("create_time <", value, "createTime");
/* 270 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
/* 274 */       addCriterion("create_time <=", value, "createTime");
/* 275 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateTimeIn(List<Date> values) {
/* 279 */       addCriterion("create_time in", values, "createTime");
/* 280 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateTimeNotIn(List<Date> values) {
/* 284 */       addCriterion("create_time not in", values, "createTime");
/* 285 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
/* 289 */       addCriterion("create_time between", value1, value2, "createTime");
/* 290 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
/* 294 */       addCriterion("create_time not between", value1, value2, "createTime");
/* 295 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateTimeIsNull() {
/* 299 */       addCriterion("update_time is null");
/* 300 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateTimeIsNotNull() {
/* 304 */       addCriterion("update_time is not null");
/* 305 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateTimeEqualTo(Date value) {
/* 309 */       addCriterion("update_time =", value, "updateTime");
/* 310 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateTimeNotEqualTo(Date value) {
/* 314 */       addCriterion("update_time <>", value, "updateTime");
/* 315 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateTimeGreaterThan(Date value) {
/* 319 */       addCriterion("update_time >", value, "updateTime");
/* 320 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
/* 324 */       addCriterion("update_time >=", value, "updateTime");
/* 325 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateTimeLessThan(Date value) {
/* 329 */       addCriterion("update_time <", value, "updateTime");
/* 330 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
/* 334 */       addCriterion("update_time <=", value, "updateTime");
/* 335 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateTimeIn(List<Date> values) {
/* 339 */       addCriterion("update_time in", values, "updateTime");
/* 340 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateTimeNotIn(List<Date> values) {
/* 344 */       addCriterion("update_time not in", values, "updateTime");
/* 345 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateTimeBetween(Date value1, Date value2) {
/* 349 */       addCriterion("update_time between", value1, value2, "updateTime");
/* 350 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
/* 354 */       addCriterion("update_time not between", value1, value2, "updateTime");
/* 355 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateUserIsNull() {
/* 359 */       addCriterion("create_user is null");
/* 360 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateUserIsNotNull() {
/* 364 */       addCriterion("create_user is not null");
/* 365 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateUserEqualTo(String value) {
/* 369 */       addCriterion("create_user =", value, "createUser");
/* 370 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateUserNotEqualTo(String value) {
/* 374 */       addCriterion("create_user <>", value, "createUser");
/* 375 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateUserGreaterThan(String value) {
/* 379 */       addCriterion("create_user >", value, "createUser");
/* 380 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateUserGreaterThanOrEqualTo(String value) {
/* 384 */       addCriterion("create_user >=", value, "createUser");
/* 385 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateUserLessThan(String value) {
/* 389 */       addCriterion("create_user <", value, "createUser");
/* 390 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateUserLessThanOrEqualTo(String value) {
/* 394 */       addCriterion("create_user <=", value, "createUser");
/* 395 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateUserLike(String value) {
/* 399 */       addCriterion("create_user like", value, "createUser");
/* 400 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateUserNotLike(String value) {
/* 404 */       addCriterion("create_user not like", value, "createUser");
/* 405 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateUserIn(List<String> values) {
/* 409 */       addCriterion("create_user in", values, "createUser");
/* 410 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateUserNotIn(List<String> values) {
/* 414 */       addCriterion("create_user not in", values, "createUser");
/* 415 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateUserBetween(String value1, String value2) {
/* 419 */       addCriterion("create_user between", value1, value2, "createUser");
/* 420 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andCreateUserNotBetween(String value1, String value2) {
/* 424 */       addCriterion("create_user not between", value1, value2, "createUser");
/* 425 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateUserIsNull() {
/* 429 */       addCriterion("update_user is null");
/* 430 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateUserIsNotNull() {
/* 434 */       addCriterion("update_user is not null");
/* 435 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateUserEqualTo(String value) {
/* 439 */       addCriterion("update_user =", value, "updateUser");
/* 440 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateUserNotEqualTo(String value) {
/* 444 */       addCriterion("update_user <>", value, "updateUser");
/* 445 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateUserGreaterThan(String value) {
/* 449 */       addCriterion("update_user >", value, "updateUser");
/* 450 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
/* 454 */       addCriterion("update_user >=", value, "updateUser");
/* 455 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateUserLessThan(String value) {
/* 459 */       addCriterion("update_user <", value, "updateUser");
/* 460 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateUserLessThanOrEqualTo(String value) {
/* 464 */       addCriterion("update_user <=", value, "updateUser");
/* 465 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateUserLike(String value) {
/* 469 */       addCriterion("update_user like", value, "updateUser");
/* 470 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateUserNotLike(String value) {
/* 474 */       addCriterion("update_user not like", value, "updateUser");
/* 475 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateUserIn(List<String> values) {
/* 479 */       addCriterion("update_user in", values, "updateUser");
/* 480 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateUserNotIn(List<String> values) {
/* 484 */       addCriterion("update_user not in", values, "updateUser");
/* 485 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateUserBetween(String value1, String value2) {
/* 489 */       addCriterion("update_user between", value1, value2, "updateUser");
/* 490 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUpdateUserNotBetween(String value1, String value2) {
/* 494 */       addCriterion("update_user not between", value1, value2, "updateUser");
/* 495 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andNameIsNull() {
/* 499 */       addCriterion("name is null");
/* 500 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andNameIsNotNull() {
/* 504 */       addCriterion("name is not null");
/* 505 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andNameEqualTo(String value) {
/* 509 */       addCriterion("name =", value, "name");
/* 510 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andNameNotEqualTo(String value) {
/* 514 */       addCriterion("name <>", value, "name");
/* 515 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andNameGreaterThan(String value) {
/* 519 */       addCriterion("name >", value, "name");
/* 520 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andNameGreaterThanOrEqualTo(String value) {
/* 524 */       addCriterion("name >=", value, "name");
/* 525 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andNameLessThan(String value) {
/* 529 */       addCriterion("name <", value, "name");
/* 530 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andNameLessThanOrEqualTo(String value) {
/* 534 */       addCriterion("name <=", value, "name");
/* 535 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andNameLike(String value) {
/* 539 */       addCriterion("name like", value, "name");
/* 540 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andNameNotLike(String value) {
/* 544 */       addCriterion("name not like", value, "name");
/* 545 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andNameIn(List<String> values) {
/* 549 */       addCriterion("name in", values, "name");
/* 550 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andNameNotIn(List<String> values) {
/* 554 */       addCriterion("name not in", values, "name");
/* 555 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andNameBetween(String value1, String value2) {
/* 559 */       addCriterion("name between", value1, value2, "name");
/* 560 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andNameNotBetween(String value1, String value2) {
/* 564 */       addCriterion("name not between", value1, value2, "name");
/* 565 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPhoneIsNull() {
/* 569 */       addCriterion("phone is null");
/* 570 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPhoneIsNotNull() {
/* 574 */       addCriterion("phone is not null");
/* 575 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPhoneEqualTo(String value) {
/* 579 */       addCriterion("phone =", value, "phone");
/* 580 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPhoneNotEqualTo(String value) {
/* 584 */       addCriterion("phone <>", value, "phone");
/* 585 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPhoneGreaterThan(String value) {
/* 589 */       addCriterion("phone >", value, "phone");
/* 590 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPhoneGreaterThanOrEqualTo(String value) {
/* 594 */       addCriterion("phone >=", value, "phone");
/* 595 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPhoneLessThan(String value) {
/* 599 */       addCriterion("phone <", value, "phone");
/* 600 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPhoneLessThanOrEqualTo(String value) {
/* 604 */       addCriterion("phone <=", value, "phone");
/* 605 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPhoneLike(String value) {
/* 609 */       addCriterion("phone like", value, "phone");
/* 610 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPhoneNotLike(String value) {
/* 614 */       addCriterion("phone not like", value, "phone");
/* 615 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPhoneIn(List<String> values) {
/* 619 */       addCriterion("phone in", values, "phone");
/* 620 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPhoneNotIn(List<String> values) {
/* 624 */       addCriterion("phone not in", values, "phone");
/* 625 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPhoneBetween(String value1, String value2) {
/* 629 */       addCriterion("phone between", value1, value2, "phone");
/* 630 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPhoneNotBetween(String value1, String value2) {
/* 634 */       addCriterion("phone not between", value1, value2, "phone");
/* 635 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPasswordIsNull() {
/* 639 */       addCriterion("password is null");
/* 640 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPasswordIsNotNull() {
/* 644 */       addCriterion("password is not null");
/* 645 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPasswordEqualTo(String value) {
/* 649 */       addCriterion("password =", value, "password");
/* 650 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPasswordNotEqualTo(String value) {
/* 654 */       addCriterion("password <>", value, "password");
/* 655 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPasswordGreaterThan(String value) {
/* 659 */       addCriterion("password >", value, "password");
/* 660 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPasswordGreaterThanOrEqualTo(String value) {
/* 664 */       addCriterion("password >=", value, "password");
/* 665 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPasswordLessThan(String value) {
/* 669 */       addCriterion("password <", value, "password");
/* 670 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPasswordLessThanOrEqualTo(String value) {
/* 674 */       addCriterion("password <=", value, "password");
/* 675 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPasswordLike(String value) {
/* 679 */       addCriterion("password like", value, "password");
/* 680 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPasswordNotLike(String value) {
/* 684 */       addCriterion("password not like", value, "password");
/* 685 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPasswordIn(List<String> values) {
/* 689 */       addCriterion("password in", values, "password");
/* 690 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPasswordNotIn(List<String> values) {
/* 694 */       addCriterion("password not in", values, "password");
/* 695 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPasswordBetween(String value1, String value2) {
/* 699 */       addCriterion("password between", value1, value2, "password");
/* 700 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andPasswordNotBetween(String value1, String value2) {
/* 704 */       addCriterion("password not between", value1, value2, "password");
/* 705 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUserTypeIsNull() {
/* 709 */       addCriterion("user_type is null");
/* 710 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUserTypeIsNotNull() {
/* 714 */       addCriterion("user_type is not null");
/* 715 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUserTypeEqualTo(String value) {
/* 719 */       addCriterion("user_type =", value, "userType");
/* 720 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUserTypeNotEqualTo(String value) {
/* 724 */       addCriterion("user_type <>", value, "userType");
/* 725 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUserTypeGreaterThan(String value) {
/* 729 */       addCriterion("user_type >", value, "userType");
/* 730 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUserTypeGreaterThanOrEqualTo(String value) {
/* 734 */       addCriterion("user_type >=", value, "userType");
/* 735 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUserTypeLessThan(String value) {
/* 739 */       addCriterion("user_type <", value, "userType");
/* 740 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUserTypeLessThanOrEqualTo(String value) {
/* 744 */       addCriterion("user_type <=", value, "userType");
/* 745 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUserTypeLike(String value) {
/* 749 */       addCriterion("user_type like", value, "userType");
/* 750 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUserTypeNotLike(String value) {
/* 754 */       addCriterion("user_type not like", value, "userType");
/* 755 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUserTypeIn(List<String> values) {
/* 759 */       addCriterion("user_type in", values, "userType");
/* 760 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUserTypeNotIn(List<String> values) {
/* 764 */       addCriterion("user_type not in", values, "userType");
/* 765 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUserTypeBetween(String value1, String value2) {
/* 769 */       addCriterion("user_type between", value1, value2, "userType");
/* 770 */       return (UserExample.Criteria)this;
/*     */     }
/*     */     
/*     */     public UserExample.Criteria andUserTypeNotBetween(String value1, String value2) {
/* 774 */       addCriterion("user_type not between", value1, value2, "userType");
/* 775 */       return (UserExample.Criteria)this;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class Criteria
/*     */     extends GeneratedCriteria {}
/*     */ 
/*     */   
/*     */   public static class Criterion
/*     */   {
/*     */     private String condition;
/*     */     
/*     */     private Object value;
/*     */     
/*     */     private Object secondValue;
/*     */     
/*     */     private boolean noValue;
/*     */     
/*     */     private boolean singleValue;
/*     */     
/*     */     private boolean betweenValue;
/*     */     
/*     */     private boolean listValue;
/*     */     
/*     */     private String typeHandler;
/*     */ 
/*     */     
/*     */     public String getCondition() {
/* 804 */       return this.condition;
/*     */     }
/*     */     
/*     */     public Object getValue() {
/* 808 */       return this.value;
/*     */     }
/*     */     
/*     */     public Object getSecondValue() {
/* 812 */       return this.secondValue;
/*     */     }
/*     */     
/*     */     public boolean isNoValue() {
/* 816 */       return this.noValue;
/*     */     }
/*     */     
/*     */     public boolean isSingleValue() {
/* 820 */       return this.singleValue;
/*     */     }
/*     */     
/*     */     public boolean isBetweenValue() {
/* 824 */       return this.betweenValue;
/*     */     }
/*     */     
/*     */     public boolean isListValue() {
/* 828 */       return this.listValue;
/*     */     }
/*     */     
/*     */     public String getTypeHandler() {
/* 832 */       return this.typeHandler;
/*     */     }
/*     */ 
/*     */     
/*     */     protected Criterion(String condition) {
/* 837 */       this.condition = condition;
/* 838 */       this.typeHandler = null;
/* 839 */       this.noValue = true;
/*     */     }
/*     */ 
/*     */     
/*     */     protected Criterion(String condition, Object value, String typeHandler) {
/* 844 */       this.condition = condition;
/* 845 */       this.value = value;
/* 846 */       this.typeHandler = typeHandler;
/* 847 */       if (value instanceof List) {
/* 848 */         this.listValue = true;
/*     */       } else {
/* 850 */         this.singleValue = true;
/*     */       } 
/*     */     }
/*     */     
/*     */     protected Criterion(String condition, Object value) {
/* 855 */       this(condition, value, (String)null);
/*     */     }
/*     */ 
/*     */     
/*     */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
/* 860 */       this.condition = condition;
/* 861 */       this.value = value;
/* 862 */       this.secondValue = secondValue;
/* 863 */       this.typeHandler = typeHandler;
/* 864 */       this.betweenValue = true;
/*     */     }
/*     */     
/*     */     protected Criterion(String condition, Object value, Object secondValue) {
/* 868 */       this(condition, value, secondValue, null);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\domain\UserExample.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */