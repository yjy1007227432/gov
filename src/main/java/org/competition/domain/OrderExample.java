/*     */
package org.competition.domain;
/*     */
/*     */

import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;

/*     */
/*     */
/*     */
/*     */
/*     */
/*     */ public class OrderExample
        /*     */ {
    /*     */   protected String orderByClause;
    /*     */   protected boolean distinct;
    /*  15 */   protected List<Criteria> oredCriteria = new ArrayList<>();

    /*     */
    /*     */
    /*     */
    public void setOrderByClause(String orderByClause) {
        /*  19 */
        this.orderByClause = orderByClause;
        /*     */
    }

    /*     */
    /*     */
    public String getOrderByClause() {
        /*  23 */
        return this.orderByClause;
        /*     */
    }

    /*     */
    /*     */
    public void setDistinct(boolean distinct) {
        /*  27 */
        this.distinct = distinct;
        /*     */
    }

    /*     */
    /*     */
    public boolean isDistinct() {
        /*  31 */
        return this.distinct;
        /*     */
    }

    /*     */
    /*     */
    public List<Criteria> getOredCriteria() {
        /*  35 */
        return this.oredCriteria;
        /*     */
    }

    /*     */
    /*     */
    public void or(Criteria criteria) {
        /*  39 */
        this.oredCriteria.add(criteria);
        /*     */
    }

    /*     */
    /*     */
    public Criteria or() {
        /*  43 */
        Criteria criteria = createCriteriaInternal();
        /*  44 */
        this.oredCriteria.add(criteria);
        /*  45 */
        return criteria;
        /*     */
    }

    /*     */
    /*     */
    public Criteria createCriteria() {
        /*  49 */
        Criteria criteria = createCriteriaInternal();
        /*  50 */
        if (this.oredCriteria.size() == 0) {
            /*  51 */
            this.oredCriteria.add(criteria);
            /*     */
        }
        /*  53 */
        return criteria;
        /*     */
    }

    /*     */
    /*     */
    protected Criteria createCriteriaInternal() {
        /*  57 */
        Criteria criteria = new Criteria();
        /*  58 */
        return criteria;
        /*     */
    }

    /*     */
    /*     */
    public void clear() {
        /*  62 */
        this.oredCriteria.clear();
        /*  63 */
        this.orderByClause = null;
        /*  64 */
        this.distinct = false;
        /*     */
    }


    /*     */   protected static abstract class GeneratedCriteria
            /*     */ {
        /*  72 */     protected List<OrderExample.Criterion> criteria = new ArrayList<>();

        /*     */
        /*     */
        /*     */
        public boolean isValid() {
            /*  76 */
            return (this.criteria.size() > 0);
            /*     */
        }

        /*     */
        /*     */
        public List<OrderExample.Criterion> getAllCriteria() {
            /*  80 */
            return this.criteria;
            /*     */
        }

        /*     */
        /*     */
        public List<OrderExample.Criterion> getCriteria() {
            /*  84 */
            return this.criteria;
            /*     */
        }

        /*     */
        /*     */
        protected void addCriterion(String condition) {
            /*  88 */
            if (condition == null) {
                /*  89 */
                throw new RuntimeException("Value for condition cannot be null");
                /*     */
            }
            /*  91 */
            this.criteria.add(new OrderExample.Criterion(condition));
            /*     */
        }

        /*     */
        /*     */
        protected void addCriterion(String condition, Object value, String property) {
            /*  95 */
            if (value == null) {
                /*  96 */
                throw new RuntimeException("Value for " + property + " cannot be null");
                /*     */
            }
            /*  98 */
            this.criteria.add(new OrderExample.Criterion(condition, value));
            /*     */
        }

        /*     */
        /*     */
        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            /* 102 */
            if (value1 == null || value2 == null) {
                /* 103 */
                throw new RuntimeException("Between values for " + property + " cannot be null");
                /*     */
            }
            /* 105 */
            this.criteria.add(new OrderExample.Criterion(condition, value1, value2));
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andIdIsNull() {
            /* 109 */
            addCriterion("id is null");
            /* 110 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andIdIsNotNull() {
            /* 114 */
            addCriterion("id is not null");
            /* 115 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andIdEqualTo(Integer value) {
            /* 119 */
            addCriterion("id =", value, "id");
            /* 120 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andIdNotEqualTo(Integer value) {
            /* 124 */
            addCriterion("id <>", value, "id");
            /* 125 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andIdGreaterThan(Integer value) {
            /* 129 */
            addCriterion("id >", value, "id");
            /* 130 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
            /* 134 */
            addCriterion("id >=", value, "id");
            /* 135 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andIdLessThan(Integer value) {
            /* 139 */
            addCriterion("id <", value, "id");
            /* 140 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andIdLessThanOrEqualTo(Integer value) {
            /* 144 */
            addCriterion("id <=", value, "id");
            /* 145 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andIdIn(List<Integer> values) {
            /* 149 */
            addCriterion("id in", values, "id");
            /* 150 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andIdNotIn(List<Integer> values) {
            /* 154 */
            addCriterion("id not in", values, "id");
            /* 155 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andIdBetween(Integer value1, Integer value2) {
            /* 159 */
            addCriterion("id between", value1, value2, "id");
            /* 160 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
            /* 164 */
            addCriterion("id not between", value1, value2, "id");
            /* 165 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCustomerIdIsNull() {
            /* 169 */
            addCriterion("customer_id is null");
            /* 170 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCustomerIdIsNotNull() {
            /* 174 */
            addCriterion("customer_id is not null");
            /* 175 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCustomerIdEqualTo(Integer value) {
            /* 179 */
            addCriterion("customer_id =", value, "customerId");
            /* 180 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCustomerIdNotEqualTo(Integer value) {
            /* 184 */
            addCriterion("customer_id <>", value, "customerId");
            /* 185 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCustomerIdGreaterThan(Integer value) {
            /* 189 */
            addCriterion("customer_id >", value, "customerId");
            /* 190 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            /* 194 */
            addCriterion("customer_id >=", value, "customerId");
            /* 195 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCustomerIdLessThan(Integer value) {
            /* 199 */
            addCriterion("customer_id <", value, "customerId");
            /* 200 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            /* 204 */
            addCriterion("customer_id <=", value, "customerId");
            /* 205 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCustomerIdIn(List<Integer> values) {
            /* 209 */
            addCriterion("customer_id in", values, "customerId");
            /* 210 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCustomerIdNotIn(List<Integer> values) {
            /* 214 */
            addCriterion("customer_id not in", values, "customerId");
            /* 215 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            /* 219 */
            addCriterion("customer_id between", value1, value2, "customerId");
            /* 220 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            /* 224 */
            addCriterion("customer_id not between", value1, value2, "customerId");
            /* 225 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCreateTimeIsNull() {
            /* 229 */
            addCriterion("create_time is null");
            /* 230 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCreateTimeIsNotNull() {
            /* 234 */
            addCriterion("create_time is not null");
            /* 235 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCreateTimeEqualTo(Date value) {
            /* 239 */
            addCriterion("create_time =", value, "createTime");
            /* 240 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCreateTimeNotEqualTo(Date value) {
            /* 244 */
            addCriterion("create_time <>", value, "createTime");
            /* 245 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCreateTimeGreaterThan(Date value) {
            /* 249 */
            addCriterion("create_time >", value, "createTime");
            /* 250 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            /* 254 */
            addCriterion("create_time >=", value, "createTime");
            /* 255 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCreateTimeLessThan(Date value) {
            /* 259 */
            addCriterion("create_time <", value, "createTime");
            /* 260 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            /* 264 */
            addCriterion("create_time <=", value, "createTime");
            /* 265 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCreateTimeIn(List<Date> values) {
            /* 269 */
            addCriterion("create_time in", values, "createTime");
            /* 270 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCreateTimeNotIn(List<Date> values) {
            /* 274 */
            addCriterion("create_time not in", values, "createTime");
            /* 275 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
            /* 279 */
            addCriterion("create_time between", value1, value2, "createTime");
            /* 280 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            /* 284 */
            addCriterion("create_time not between", value1, value2, "createTime");
            /* 285 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateTimeIsNull() {
            /* 289 */
            addCriterion("update_time is null");
            /* 290 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateTimeIsNotNull() {
            /* 294 */
            addCriterion("update_time is not null");
            /* 295 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateTimeEqualTo(Date value) {
            /* 299 */
            addCriterion("update_time =", value, "updateTime");
            /* 300 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateTimeNotEqualTo(Date value) {
            /* 304 */
            addCriterion("update_time <>", value, "updateTime");
            /* 305 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateTimeGreaterThan(Date value) {
            /* 309 */
            addCriterion("update_time >", value, "updateTime");
            /* 310 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            /* 314 */
            addCriterion("update_time >=", value, "updateTime");
            /* 315 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateTimeLessThan(Date value) {
            /* 319 */
            addCriterion("update_time <", value, "updateTime");
            /* 320 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            /* 324 */
            addCriterion("update_time <=", value, "updateTime");
            /* 325 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateTimeIn(List<Date> values) {
            /* 329 */
            addCriterion("update_time in", values, "updateTime");
            /* 330 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateTimeNotIn(List<Date> values) {
            /* 334 */
            addCriterion("update_time not in", values, "updateTime");
            /* 335 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateTimeBetween(Date value1, Date value2) {
            /* 339 */
            addCriterion("update_time between", value1, value2, "updateTime");
            /* 340 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            /* 344 */
            addCriterion("update_time not between", value1, value2, "updateTime");
            /* 345 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateUserIsNull() {
            /* 349 */
            addCriterion("update_user is null");
            /* 350 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateUserIsNotNull() {
            /* 354 */
            addCriterion("update_user is not null");
            /* 355 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateUserEqualTo(String value) {
            /* 359 */
            addCriterion("update_user =", value, "updateUser");
            /* 360 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateUserNotEqualTo(String value) {
            /* 364 */
            addCriterion("update_user <>", value, "updateUser");
            /* 365 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateUserGreaterThan(String value) {
            /* 369 */
            addCriterion("update_user >", value, "updateUser");
            /* 370 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            /* 374 */
            addCriterion("update_user >=", value, "updateUser");
            /* 375 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateUserLessThan(String value) {
            /* 379 */
            addCriterion("update_user <", value, "updateUser");
            /* 380 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateUserLessThanOrEqualTo(String value) {
            /* 384 */
            addCriterion("update_user <=", value, "updateUser");
            /* 385 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateUserLike(String value) {
            /* 389 */
            addCriterion("update_user like", value, "updateUser");
            /* 390 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateUserNotLike(String value) {
            /* 394 */
            addCriterion("update_user not like", value, "updateUser");
            /* 395 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateUserIn(List<String> values) {
            /* 399 */
            addCriterion("update_user in", values, "updateUser");
            /* 400 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateUserNotIn(List<String> values) {
            /* 404 */
            addCriterion("update_user not in", values, "updateUser");
            /* 405 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateUserBetween(String value1, String value2) {
            /* 409 */
            addCriterion("update_user between", value1, value2, "updateUser");
            /* 410 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andUpdateUserNotBetween(String value1, String value2) {
            /* 414 */
            addCriterion("update_user not between", value1, value2, "updateUser");
            /* 415 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactIsNull() {
            /* 419 */
            addCriterion("contact is null");
            /* 420 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactIsNotNull() {
            /* 424 */
            addCriterion("contact is not null");
            /* 425 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactEqualTo(String value) {
            /* 429 */
            addCriterion("contact =", value, "contact");
            /* 430 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactNotEqualTo(String value) {
            /* 434 */
            addCriterion("contact <>", value, "contact");
            /* 435 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactGreaterThan(String value) {
            /* 439 */
            addCriterion("contact >", value, "contact");
            /* 440 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactGreaterThanOrEqualTo(String value) {
            /* 444 */
            addCriterion("contact >=", value, "contact");
            /* 445 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactLessThan(String value) {
            /* 449 */
            addCriterion("contact <", value, "contact");
            /* 450 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactLessThanOrEqualTo(String value) {
            /* 454 */
            addCriterion("contact <=", value, "contact");
            /* 455 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactLike(String value) {
            /* 459 */
            addCriterion("contact like", value, "contact");
            /* 460 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactNotLike(String value) {
            /* 464 */
            addCriterion("contact not like", value, "contact");
            /* 465 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactIn(List<String> values) {
            /* 469 */
            addCriterion("contact in", values, "contact");
            /* 470 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactNotIn(List<String> values) {
            /* 474 */
            addCriterion("contact not in", values, "contact");
            /* 475 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactBetween(String value1, String value2) {
            /* 479 */
            addCriterion("contact between", value1, value2, "contact");
            /* 480 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactNotBetween(String value1, String value2) {
            /* 484 */
            addCriterion("contact not between", value1, value2, "contact");
            /* 485 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactPhoneIsNull() {
            /* 489 */
            addCriterion("contact_phone is null");
            /* 490 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactPhoneIsNotNull() {
            /* 494 */
            addCriterion("contact_phone is not null");
            /* 495 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactPhoneEqualTo(String value) {
            /* 499 */
            addCriterion("contact_phone =", value, "contactPhone");
            /* 500 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactPhoneNotEqualTo(String value) {
            /* 504 */
            addCriterion("contact_phone <>", value, "contactPhone");
            /* 505 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactPhoneGreaterThan(String value) {
            /* 509 */
            addCriterion("contact_phone >", value, "contactPhone");
            /* 510 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            /* 514 */
            addCriterion("contact_phone >=", value, "contactPhone");
            /* 515 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactPhoneLessThan(String value) {
            /* 519 */
            addCriterion("contact_phone <", value, "contactPhone");
            /* 520 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactPhoneLessThanOrEqualTo(String value) {
            /* 524 */
            addCriterion("contact_phone <=", value, "contactPhone");
            /* 525 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactPhoneLike(String value) {
            /* 529 */
            addCriterion("contact_phone like", value, "contactPhone");
            /* 530 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactPhoneNotLike(String value) {
            /* 534 */
            addCriterion("contact_phone not like", value, "contactPhone");
            /* 535 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactPhoneIn(List<String> values) {
            /* 539 */
            addCriterion("contact_phone in", values, "contactPhone");
            /* 540 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactPhoneNotIn(List<String> values) {
            /* 544 */
            addCriterion("contact_phone not in", values, "contactPhone");
            /* 545 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactPhoneBetween(String value1, String value2) {
            /* 549 */
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            /* 550 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactPhoneNotBetween(String value1, String value2) {
            /* 554 */
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            /* 555 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactEmailIsNull() {
            /* 559 */
            addCriterion("contact_email is null");
            /* 560 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactEmailIsNotNull() {
            /* 564 */
            addCriterion("contact_email is not null");
            /* 565 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactEmailEqualTo(String value) {
            /* 569 */
            addCriterion("contact_email =", value, "contactEmail");
            /* 570 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactEmailNotEqualTo(String value) {
            /* 574 */
            addCriterion("contact_email <>", value, "contactEmail");
            /* 575 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactEmailGreaterThan(String value) {
            /* 579 */
            addCriterion("contact_email >", value, "contactEmail");
            /* 580 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactEmailGreaterThanOrEqualTo(String value) {
            /* 584 */
            addCriterion("contact_email >=", value, "contactEmail");
            /* 585 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactEmailLessThan(String value) {
            /* 589 */
            addCriterion("contact_email <", value, "contactEmail");
            /* 590 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactEmailLessThanOrEqualTo(String value) {
            /* 594 */
            addCriterion("contact_email <=", value, "contactEmail");
            /* 595 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactEmailLike(String value) {
            /* 599 */
            addCriterion("contact_email like", value, "contactEmail");
            /* 600 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactEmailNotLike(String value) {
            /* 604 */
            addCriterion("contact_email not like", value, "contactEmail");
            /* 605 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactEmailIn(List<String> values) {
            /* 609 */
            addCriterion("contact_email in", values, "contactEmail");
            /* 610 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactEmailNotIn(List<String> values) {
            /* 614 */
            addCriterion("contact_email not in", values, "contactEmail");
            /* 615 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactEmailBetween(String value1, String value2) {
            /* 619 */
            addCriterion("contact_email between", value1, value2, "contactEmail");
            /* 620 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContactEmailNotBetween(String value1, String value2) {
            /* 624 */
            addCriterion("contact_email not between", value1, value2, "contactEmail");
            /* 625 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContentIsNull() {
            /* 629 */
            addCriterion("content is null");
            /* 630 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContentIsNotNull() {
            /* 634 */
            addCriterion("content is not null");
            /* 635 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContentEqualTo(String value) {
            /* 639 */
            addCriterion("content =", value, "content");
            /* 640 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContentNotEqualTo(String value) {
            /* 644 */
            addCriterion("content <>", value, "content");
            /* 645 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContentGreaterThan(String value) {
            /* 649 */
            addCriterion("content >", value, "content");
            /* 650 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContentGreaterThanOrEqualTo(String value) {
            /* 654 */
            addCriterion("content >=", value, "content");
            /* 655 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContentLessThan(String value) {
            /* 659 */
            addCriterion("content <", value, "content");
            /* 660 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContentLessThanOrEqualTo(String value) {
            /* 664 */
            addCriterion("content <=", value, "content");
            /* 665 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContentLike(String value) {
            /* 669 */
            addCriterion("content like", value, "content");
            /* 670 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContentNotLike(String value) {
            /* 674 */
            addCriterion("content not like", value, "content");
            /* 675 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContentIn(List<String> values) {
            /* 679 */
            addCriterion("content in", values, "content");
            /* 680 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContentNotIn(List<String> values) {
            /* 684 */
            addCriterion("content not in", values, "content");
            /* 685 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContentBetween(String value1, String value2) {
            /* 689 */
            addCriterion("content between", value1, value2, "content");
            /* 690 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andContentNotBetween(String value1, String value2) {
            /* 694 */
            addCriterion("content not between", value1, value2, "content");
            /* 695 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andFeedbackIsNull() {
            /* 699 */
            addCriterion("feedback is null");
            /* 700 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andFeedbackIsNotNull() {
            /* 704 */
            addCriterion("feedback is not null");
            /* 705 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andFeedbackEqualTo(String value) {
            /* 709 */
            addCriterion("feedback =", value, "feedback");
            /* 710 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andFeedbackNotEqualTo(String value) {
            /* 714 */
            addCriterion("feedback <>", value, "feedback");
            /* 715 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andFeedbackGreaterThan(String value) {
            /* 719 */
            addCriterion("feedback >", value, "feedback");
            /* 720 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andFeedbackGreaterThanOrEqualTo(String value) {
            /* 724 */
            addCriterion("feedback >=", value, "feedback");
            /* 725 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andFeedbackLessThan(String value) {
            /* 729 */
            addCriterion("feedback <", value, "feedback");
            /* 730 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andFeedbackLessThanOrEqualTo(String value) {
            /* 734 */
            addCriterion("feedback <=", value, "feedback");
            /* 735 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andFeedbackLike(String value) {
            /* 739 */
            addCriterion("feedback like", value, "feedback");
            /* 740 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andFeedbackNotLike(String value) {
            /* 744 */
            addCriterion("feedback not like", value, "feedback");
            /* 745 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andFeedbackIn(List<String> values) {
            /* 749 */
            addCriterion("feedback in", values, "feedback");
            /* 750 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andFeedbackNotIn(List<String> values) {
            /* 754 */
            addCriterion("feedback not in", values, "feedback");
            /* 755 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andFeedbackBetween(String value1, String value2) {
            /* 759 */
            addCriterion("feedback between", value1, value2, "feedback");
            /* 760 */
            return (OrderExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public OrderExample.Criteria andFeedbackNotBetween(String value1, String value2) {
            /* 764 */
            addCriterion("feedback not between", value1, value2, "feedback");
            /* 765 */
            return (OrderExample.Criteria) this;
            /*     */
        }
        /*     */
    }

    /*     */
    /*     */
    /*     */   public static class Criteria
            /*     */ extends GeneratedCriteria {
    }

    /*     */
    /*     */
    /*     */   public static class Criterion
            /*     */ {
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
        /*     */
        public String getCondition() {
            /* 794 */
            return this.condition;
            /*     */
        }

        /*     */
        /*     */
        public Object getValue() {
            /* 798 */
            return this.value;
            /*     */
        }

        /*     */
        /*     */
        public Object getSecondValue() {
            /* 802 */
            return this.secondValue;
            /*     */
        }

        /*     */
        /*     */
        public boolean isNoValue() {
            /* 806 */
            return this.noValue;
            /*     */
        }

        /*     */
        /*     */
        public boolean isSingleValue() {
            /* 810 */
            return this.singleValue;
            /*     */
        }

        /*     */
        /*     */
        public boolean isBetweenValue() {
            /* 814 */
            return this.betweenValue;
            /*     */
        }

        /*     */
        /*     */
        public boolean isListValue() {
            /* 818 */
            return this.listValue;
            /*     */
        }

        /*     */
        /*     */
        public String getTypeHandler() {
            /* 822 */
            return this.typeHandler;
            /*     */
        }

        /*     */
        /*     */
        /*     */
        protected Criterion(String condition) {
            /* 827 */
            this.condition = condition;
            /* 828 */
            this.typeHandler = null;
            /* 829 */
            this.noValue = true;
            /*     */
        }

        /*     */
        /*     */
        /*     */
        protected Criterion(String condition, Object value, String typeHandler) {
            /* 834 */
            this.condition = condition;
            /* 835 */
            this.value = value;
            /* 836 */
            this.typeHandler = typeHandler;
            /* 837 */
            if (value instanceof List) {
                /* 838 */
                this.listValue = true;
                /*     */
            } else {
                /* 840 */
                this.singleValue = true;
                /*     */
            }
            /*     */
        }

        /*     */
        /*     */
        protected Criterion(String condition, Object value) {
            /* 845 */
            this(condition, value, (String) null);
            /*     */
        }

        /*     */
        /*     */
        /*     */
        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            /* 850 */
            this.condition = condition;
            /* 851 */
            this.value = value;
            /* 852 */
            this.secondValue = secondValue;
            /* 853 */
            this.typeHandler = typeHandler;
            /* 854 */
            this.betweenValue = true;
            /*     */
        }

        /*     */
        /*     */
        protected Criterion(String condition, Object value, Object secondValue) {
            /* 858 */
            this(condition, value, secondValue, null);
            /*     */
        }
        /*     */
    }
    /*     */
}


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\domain\OrderExample.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */