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
/*     */ public class ProductExample
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

    /*     */
    /*     */
    /*     */
    /*     */
    /*     */   protected static abstract class GeneratedCriteria
            /*     */ {
        /*  72 */     protected List<ProductExample.Criterion> criteria = new ArrayList<>();

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
        public List<ProductExample.Criterion> getAllCriteria() {
            /*  80 */
            return this.criteria;
            /*     */
        }

        /*     */
        /*     */
        public List<ProductExample.Criterion> getCriteria() {
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
            this.criteria.add(new ProductExample.Criterion(condition));
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
            this.criteria.add(new ProductExample.Criterion(condition, value));
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
            this.criteria.add(new ProductExample.Criterion(condition, value1, value2));
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andIdIsNull() {
            /* 109 */
            addCriterion("id is null");
            /* 110 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andIdIsNotNull() {
            /* 114 */
            addCriterion("id is not null");
            /* 115 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andIdEqualTo(Integer value) {
            /* 119 */
            addCriterion("id =", value, "id");
            /* 120 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andIdNotEqualTo(Integer value) {
            /* 124 */
            addCriterion("id <>", value, "id");
            /* 125 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andIdGreaterThan(Integer value) {
            /* 129 */
            addCriterion("id >", value, "id");
            /* 130 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
            /* 134 */
            addCriterion("id >=", value, "id");
            /* 135 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andIdLessThan(Integer value) {
            /* 139 */
            addCriterion("id <", value, "id");
            /* 140 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andIdLessThanOrEqualTo(Integer value) {
            /* 144 */
            addCriterion("id <=", value, "id");
            /* 145 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andIdIn(List<Integer> values) {
            /* 149 */
            addCriterion("id in", values, "id");
            /* 150 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andIdNotIn(List<Integer> values) {
            /* 154 */
            addCriterion("id not in", values, "id");
            /* 155 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andIdBetween(Integer value1, Integer value2) {
            /* 159 */
            addCriterion("id between", value1, value2, "id");
            /* 160 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
            /* 164 */
            addCriterion("id not between", value1, value2, "id");
            /* 165 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andNameIsNull() {
            /* 169 */
            addCriterion("name is null");
            /* 170 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andNameIsNotNull() {
            /* 174 */
            addCriterion("name is not null");
            /* 175 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andNameEqualTo(String value) {
            /* 179 */
            addCriterion("name =", value, "name");
            /* 180 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andNameNotEqualTo(String value) {
            /* 184 */
            addCriterion("name <>", value, "name");
            /* 185 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andNameGreaterThan(String value) {
            /* 189 */
            addCriterion("name >", value, "name");
            /* 190 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andNameGreaterThanOrEqualTo(String value) {
            /* 194 */
            addCriterion("name >=", value, "name");
            /* 195 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andNameLessThan(String value) {
            /* 199 */
            addCriterion("name <", value, "name");
            /* 200 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andNameLessThanOrEqualTo(String value) {
            /* 204 */
            addCriterion("name <=", value, "name");
            /* 205 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andNameLike(String value) {
            /* 209 */
            addCriterion("name like", value, "name");
            /* 210 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andNameNotLike(String value) {
            /* 214 */
            addCriterion("name not like", value, "name");
            /* 215 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andNameIn(List<String> values) {
            /* 219 */
            addCriterion("name in", values, "name");
            /* 220 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andNameNotIn(List<String> values) {
            /* 224 */
            addCriterion("name not in", values, "name");
            /* 225 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andNameBetween(String value1, String value2) {
            /* 229 */
            addCriterion("name between", value1, value2, "name");
            /* 230 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andNameNotBetween(String value1, String value2) {
            /* 234 */
            addCriterion("name not between", value1, value2, "name");
            /* 235 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateTimeIsNull() {
            /* 239 */
            addCriterion("create_time is null");
            /* 240 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateTimeIsNotNull() {
            /* 244 */
            addCriterion("create_time is not null");
            /* 245 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateTimeEqualTo(Date value) {
            /* 249 */
            addCriterion("create_time =", value, "createTime");
            /* 250 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateTimeNotEqualTo(Date value) {
            /* 254 */
            addCriterion("create_time <>", value, "createTime");
            /* 255 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateTimeGreaterThan(Date value) {
            /* 259 */
            addCriterion("create_time >", value, "createTime");
            /* 260 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            /* 264 */
            addCriterion("create_time >=", value, "createTime");
            /* 265 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateTimeLessThan(Date value) {
            /* 269 */
            addCriterion("create_time <", value, "createTime");
            /* 270 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            /* 274 */
            addCriterion("create_time <=", value, "createTime");
            /* 275 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateTimeIn(List<Date> values) {
            /* 279 */
            addCriterion("create_time in", values, "createTime");
            /* 280 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateTimeNotIn(List<Date> values) {
            /* 284 */
            addCriterion("create_time not in", values, "createTime");
            /* 285 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateTimeBetween(Date value1, Date value2) {
            /* 289 */
            addCriterion("create_time between", value1, value2, "createTime");
            /* 290 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            /* 294 */
            addCriterion("create_time not between", value1, value2, "createTime");
            /* 295 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateTimeIsNull() {
            /* 299 */
            addCriterion("update_time is null");
            /* 300 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateTimeIsNotNull() {
            /* 304 */
            addCriterion("update_time is not null");
            /* 305 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateTimeEqualTo(Date value) {
            /* 309 */
            addCriterion("update_time =", value, "updateTime");
            /* 310 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateTimeNotEqualTo(Date value) {
            /* 314 */
            addCriterion("update_time <>", value, "updateTime");
            /* 315 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateTimeGreaterThan(Date value) {
            /* 319 */
            addCriterion("update_time >", value, "updateTime");
            /* 320 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            /* 324 */
            addCriterion("update_time >=", value, "updateTime");
            /* 325 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateTimeLessThan(Date value) {
            /* 329 */
            addCriterion("update_time <", value, "updateTime");
            /* 330 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            /* 334 */
            addCriterion("update_time <=", value, "updateTime");
            /* 335 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateTimeIn(List<Date> values) {
            /* 339 */
            addCriterion("update_time in", values, "updateTime");
            /* 340 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateTimeNotIn(List<Date> values) {
            /* 344 */
            addCriterion("update_time not in", values, "updateTime");
            /* 345 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateTimeBetween(Date value1, Date value2) {
            /* 349 */
            addCriterion("update_time between", value1, value2, "updateTime");
            /* 350 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            /* 354 */
            addCriterion("update_time not between", value1, value2, "updateTime");
            /* 355 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateUserIsNull() {
            /* 359 */
            addCriterion("create_user is null");
            /* 360 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateUserIsNotNull() {
            /* 364 */
            addCriterion("create_user is not null");
            /* 365 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateUserEqualTo(String value) {
            /* 369 */
            addCriterion("create_user =", value, "createUser");
            /* 370 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateUserNotEqualTo(String value) {
            /* 374 */
            addCriterion("create_user <>", value, "createUser");
            /* 375 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateUserGreaterThan(String value) {
            /* 379 */
            addCriterion("create_user >", value, "createUser");
            /* 380 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            /* 384 */
            addCriterion("create_user >=", value, "createUser");
            /* 385 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateUserLessThan(String value) {
            /* 389 */
            addCriterion("create_user <", value, "createUser");
            /* 390 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateUserLessThanOrEqualTo(String value) {
            /* 394 */
            addCriterion("create_user <=", value, "createUser");
            /* 395 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateUserLike(String value) {
            /* 399 */
            addCriterion("create_user like", value, "createUser");
            /* 400 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateUserNotLike(String value) {
            /* 404 */
            addCriterion("create_user not like", value, "createUser");
            /* 405 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateUserIn(List<String> values) {
            /* 409 */
            addCriterion("create_user in", values, "createUser");
            /* 410 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateUserNotIn(List<String> values) {
            /* 414 */
            addCriterion("create_user not in", values, "createUser");
            /* 415 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateUserBetween(String value1, String value2) {
            /* 419 */
            addCriterion("create_user between", value1, value2, "createUser");
            /* 420 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andCreateUserNotBetween(String value1, String value2) {
            /* 424 */
            addCriterion("create_user not between", value1, value2, "createUser");
            /* 425 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateUserIsNull() {
            /* 429 */
            addCriterion("update_user is null");
            /* 430 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateUserIsNotNull() {
            /* 434 */
            addCriterion("update_user is not null");
            /* 435 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateUserEqualTo(String value) {
            /* 439 */
            addCriterion("update_user =", value, "updateUser");
            /* 440 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateUserNotEqualTo(String value) {
            /* 444 */
            addCriterion("update_user <>", value, "updateUser");
            /* 445 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateUserGreaterThan(String value) {
            /* 449 */
            addCriterion("update_user >", value, "updateUser");
            /* 450 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            /* 454 */
            addCriterion("update_user >=", value, "updateUser");
            /* 455 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateUserLessThan(String value) {
            /* 459 */
            addCriterion("update_user <", value, "updateUser");
            /* 460 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateUserLessThanOrEqualTo(String value) {
            /* 464 */
            addCriterion("update_user <=", value, "updateUser");
            /* 465 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateUserLike(String value) {
            /* 469 */
            addCriterion("update_user like", value, "updateUser");
            /* 470 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateUserNotLike(String value) {
            /* 474 */
            addCriterion("update_user not like", value, "updateUser");
            /* 475 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateUserIn(List<String> values) {
            /* 479 */
            addCriterion("update_user in", values, "updateUser");
            /* 480 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateUserNotIn(List<String> values) {
            /* 484 */
            addCriterion("update_user not in", values, "updateUser");
            /* 485 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateUserBetween(String value1, String value2) {
            /* 489 */
            addCriterion("update_user between", value1, value2, "updateUser");
            /* 490 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andUpdateUserNotBetween(String value1, String value2) {
            /* 494 */
            addCriterion("update_user not between", value1, value2, "updateUser");
            /* 495 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andContentIsNull() {
            /* 499 */
            addCriterion("content is null");
            /* 500 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andContentIsNotNull() {
            /* 504 */
            addCriterion("content is not null");
            /* 505 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andContentEqualTo(String value) {
            /* 509 */
            addCriterion("content =", value, "content");
            /* 510 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andContentNotEqualTo(String value) {
            /* 514 */
            addCriterion("content <>", value, "content");
            /* 515 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andContentGreaterThan(String value) {
            /* 519 */
            addCriterion("content >", value, "content");
            /* 520 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andContentGreaterThanOrEqualTo(String value) {
            /* 524 */
            addCriterion("content >=", value, "content");
            /* 525 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andContentLessThan(String value) {
            /* 529 */
            addCriterion("content <", value, "content");
            /* 530 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andContentLessThanOrEqualTo(String value) {
            /* 534 */
            addCriterion("content <=", value, "content");
            /* 535 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andContentLike(String value) {
            /* 539 */
            addCriterion("content like", value, "content");
            /* 540 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andContentNotLike(String value) {
            /* 544 */
            addCriterion("content not like", value, "content");
            /* 545 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andContentIn(List<String> values) {
            /* 549 */
            addCriterion("content in", values, "content");
            /* 550 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andContentNotIn(List<String> values) {
            /* 554 */
            addCriterion("content not in", values, "content");
            /* 555 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andContentBetween(String value1, String value2) {
            /* 559 */
            addCriterion("content between", value1, value2, "content");
            /* 560 */
            return (ProductExample.Criteria) this;
            /*     */
        }

        /*     */
        /*     */
        public ProductExample.Criteria andContentNotBetween(String value1, String value2) {
            /* 564 */
            addCriterion("content not between", value1, value2, "content");
            /* 565 */
            return (ProductExample.Criteria) this;
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
            /* 594 */
            return this.condition;
            /*     */
        }

        /*     */
        /*     */
        public Object getValue() {
            /* 598 */
            return this.value;
            /*     */
        }

        /*     */
        /*     */
        public Object getSecondValue() {
            /* 602 */
            return this.secondValue;
            /*     */
        }

        /*     */
        /*     */
        public boolean isNoValue() {
            /* 606 */
            return this.noValue;
            /*     */
        }

        /*     */
        /*     */
        public boolean isSingleValue() {
            /* 610 */
            return this.singleValue;
            /*     */
        }

        /*     */
        /*     */
        public boolean isBetweenValue() {
            /* 614 */
            return this.betweenValue;
            /*     */
        }

        /*     */
        /*     */
        public boolean isListValue() {
            /* 618 */
            return this.listValue;
            /*     */
        }

        /*     */
        /*     */
        public String getTypeHandler() {
            /* 622 */
            return this.typeHandler;
            /*     */
        }

        /*     */
        /*     */
        /*     */
        protected Criterion(String condition) {
            /* 627 */
            this.condition = condition;
            /* 628 */
            this.typeHandler = null;
            /* 629 */
            this.noValue = true;
            /*     */
        }

        /*     */
        /*     */
        /*     */
        protected Criterion(String condition, Object value, String typeHandler) {
            /* 634 */
            this.condition = condition;
            /* 635 */
            this.value = value;
            /* 636 */
            this.typeHandler = typeHandler;
            /* 637 */
            if (value instanceof List) {
                /* 638 */
                this.listValue = true;
                /*     */
            } else {
                /* 640 */
                this.singleValue = true;
                /*     */
            }
            /*     */
        }

        /*     */
        /*     */
        protected Criterion(String condition, Object value) {
            /* 645 */
            this(condition, value, (String) null);
            /*     */
        }

        /*     */
        /*     */
        /*     */
        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            /* 650 */
            this.condition = condition;
            /* 651 */
            this.value = value;
            /* 652 */
            this.secondValue = secondValue;
            /* 653 */
            this.typeHandler = typeHandler;
            /* 654 */
            this.betweenValue = true;
            /*     */
        }

        /*     */
        /*     */
        protected Criterion(String condition, Object value, Object secondValue) {
            /* 658 */
            this(condition, value, secondValue, null);
            /*     */
        }
        /*     */
    }
    /*     */
}


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\domain\ProductExample.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */