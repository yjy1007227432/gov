package org.competition.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdertaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdertaskExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNull() {
            addCriterion("resource_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(Integer value) {
            addCriterion("resource_id =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(Integer value) {
            addCriterion("resource_id <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(Integer value) {
            addCriterion("resource_id >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resource_id >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(Integer value) {
            addCriterion("resource_id <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("resource_id <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<Integer> values) {
            addCriterion("resource_id in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<Integer> values) {
            addCriterion("resource_id not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(Integer value1, Integer value2) {
            addCriterion("resource_id between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resource_id not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andTaskActionIsNull() {
            addCriterion("task_action is null");
            return (Criteria) this;
        }

        public Criteria andTaskActionIsNotNull() {
            addCriterion("task_action is not null");
            return (Criteria) this;
        }

        public Criteria andTaskActionEqualTo(String value) {
            addCriterion("task_action =", value, "taskAction");
            return (Criteria) this;
        }

        public Criteria andTaskActionNotEqualTo(String value) {
            addCriterion("task_action <>", value, "taskAction");
            return (Criteria) this;
        }

        public Criteria andTaskActionGreaterThan(String value) {
            addCriterion("task_action >", value, "taskAction");
            return (Criteria) this;
        }

        public Criteria andTaskActionGreaterThanOrEqualTo(String value) {
            addCriterion("task_action >=", value, "taskAction");
            return (Criteria) this;
        }

        public Criteria andTaskActionLessThan(String value) {
            addCriterion("task_action <", value, "taskAction");
            return (Criteria) this;
        }

        public Criteria andTaskActionLessThanOrEqualTo(String value) {
            addCriterion("task_action <=", value, "taskAction");
            return (Criteria) this;
        }

        public Criteria andTaskActionLike(String value) {
            addCriterion("task_action like", value, "taskAction");
            return (Criteria) this;
        }

        public Criteria andTaskActionNotLike(String value) {
            addCriterion("task_action not like", value, "taskAction");
            return (Criteria) this;
        }

        public Criteria andTaskActionIn(List<String> values) {
            addCriterion("task_action in", values, "taskAction");
            return (Criteria) this;
        }

        public Criteria andTaskActionNotIn(List<String> values) {
            addCriterion("task_action not in", values, "taskAction");
            return (Criteria) this;
        }

        public Criteria andTaskActionBetween(String value1, String value2) {
            addCriterion("task_action between", value1, value2, "taskAction");
            return (Criteria) this;
        }

        public Criteria andTaskActionNotBetween(String value1, String value2) {
            addCriterion("task_action not between", value1, value2, "taskAction");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("task_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("task_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(String value) {
            addCriterion("task_type =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(String value) {
            addCriterion("task_type <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(String value) {
            addCriterion("task_type >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("task_type >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(String value) {
            addCriterion("task_type <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("task_type <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLike(String value) {
            addCriterion("task_type like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotLike(String value) {
            addCriterion("task_type not like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<String> values) {
            addCriterion("task_type in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<String> values) {
            addCriterion("task_type not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(String value1, String value2) {
            addCriterion("task_type between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(String value1, String value2) {
            addCriterion("task_type not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNull() {
            addCriterion("attachment is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNotNull() {
            addCriterion("attachment is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentEqualTo(String value) {
            addCriterion("attachment =", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotEqualTo(String value) {
            addCriterion("attachment <>", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThan(String value) {
            addCriterion("attachment >", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("attachment >=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThan(String value) {
            addCriterion("attachment <", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThanOrEqualTo(String value) {
            addCriterion("attachment <=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLike(String value) {
            addCriterion("attachment like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotLike(String value) {
            addCriterion("attachment not like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentIn(List<String> values) {
            addCriterion("attachment in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotIn(List<String> values) {
            addCriterion("attachment not in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentBetween(String value1, String value2) {
            addCriterion("attachment between", value1, value2, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotBetween(String value1, String value2) {
            addCriterion("attachment not between", value1, value2, "attachment");
            return (Criteria) this;
        }

        public Criteria andBackupIsNull() {
            addCriterion("backup is null");
            return (Criteria) this;
        }

        public Criteria andBackupIsNotNull() {
            addCriterion("backup is not null");
            return (Criteria) this;
        }

        public Criteria andBackupEqualTo(String value) {
            addCriterion("backup =", value, "backup");
            return (Criteria) this;
        }

        public Criteria andBackupNotEqualTo(String value) {
            addCriterion("backup <>", value, "backup");
            return (Criteria) this;
        }

        public Criteria andBackupGreaterThan(String value) {
            addCriterion("backup >", value, "backup");
            return (Criteria) this;
        }

        public Criteria andBackupGreaterThanOrEqualTo(String value) {
            addCriterion("backup >=", value, "backup");
            return (Criteria) this;
        }

        public Criteria andBackupLessThan(String value) {
            addCriterion("backup <", value, "backup");
            return (Criteria) this;
        }

        public Criteria andBackupLessThanOrEqualTo(String value) {
            addCriterion("backup <=", value, "backup");
            return (Criteria) this;
        }

        public Criteria andBackupLike(String value) {
            addCriterion("backup like", value, "backup");
            return (Criteria) this;
        }

        public Criteria andBackupNotLike(String value) {
            addCriterion("backup not like", value, "backup");
            return (Criteria) this;
        }

        public Criteria andBackupIn(List<String> values) {
            addCriterion("backup in", values, "backup");
            return (Criteria) this;
        }

        public Criteria andBackupNotIn(List<String> values) {
            addCriterion("backup not in", values, "backup");
            return (Criteria) this;
        }

        public Criteria andBackupBetween(String value1, String value2) {
            addCriterion("backup between", value1, value2, "backup");
            return (Criteria) this;
        }

        public Criteria andBackupNotBetween(String value1, String value2) {
            addCriterion("backup not between", value1, value2, "backup");
            return (Criteria) this;
        }

        public Criteria andKeyword1IsNull() {
            addCriterion("keyword1 is null");
            return (Criteria) this;
        }

        public Criteria andKeyword1IsNotNull() {
            addCriterion("keyword1 is not null");
            return (Criteria) this;
        }

        public Criteria andKeyword1EqualTo(String value) {
            addCriterion("keyword1 =", value, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1NotEqualTo(String value) {
            addCriterion("keyword1 <>", value, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1GreaterThan(String value) {
            addCriterion("keyword1 >", value, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1GreaterThanOrEqualTo(String value) {
            addCriterion("keyword1 >=", value, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1LessThan(String value) {
            addCriterion("keyword1 <", value, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1LessThanOrEqualTo(String value) {
            addCriterion("keyword1 <=", value, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1Like(String value) {
            addCriterion("keyword1 like", value, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1NotLike(String value) {
            addCriterion("keyword1 not like", value, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1In(List<String> values) {
            addCriterion("keyword1 in", values, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1NotIn(List<String> values) {
            addCriterion("keyword1 not in", values, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1Between(String value1, String value2) {
            addCriterion("keyword1 between", value1, value2, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword1NotBetween(String value1, String value2) {
            addCriterion("keyword1 not between", value1, value2, "keyword1");
            return (Criteria) this;
        }

        public Criteria andKeyword2IsNull() {
            addCriterion("keyword2 is null");
            return (Criteria) this;
        }

        public Criteria andKeyword2IsNotNull() {
            addCriterion("keyword2 is not null");
            return (Criteria) this;
        }

        public Criteria andKeyword2EqualTo(String value) {
            addCriterion("keyword2 =", value, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2NotEqualTo(String value) {
            addCriterion("keyword2 <>", value, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2GreaterThan(String value) {
            addCriterion("keyword2 >", value, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2GreaterThanOrEqualTo(String value) {
            addCriterion("keyword2 >=", value, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2LessThan(String value) {
            addCriterion("keyword2 <", value, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2LessThanOrEqualTo(String value) {
            addCriterion("keyword2 <=", value, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2Like(String value) {
            addCriterion("keyword2 like", value, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2NotLike(String value) {
            addCriterion("keyword2 not like", value, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2In(List<String> values) {
            addCriterion("keyword2 in", values, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2NotIn(List<String> values) {
            addCriterion("keyword2 not in", values, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2Between(String value1, String value2) {
            addCriterion("keyword2 between", value1, value2, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword2NotBetween(String value1, String value2) {
            addCriterion("keyword2 not between", value1, value2, "keyword2");
            return (Criteria) this;
        }

        public Criteria andKeyword3IsNull() {
            addCriterion("keyword3 is null");
            return (Criteria) this;
        }

        public Criteria andKeyword3IsNotNull() {
            addCriterion("keyword3 is not null");
            return (Criteria) this;
        }

        public Criteria andKeyword3EqualTo(String value) {
            addCriterion("keyword3 =", value, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3NotEqualTo(String value) {
            addCriterion("keyword3 <>", value, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3GreaterThan(String value) {
            addCriterion("keyword3 >", value, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3GreaterThanOrEqualTo(String value) {
            addCriterion("keyword3 >=", value, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3LessThan(String value) {
            addCriterion("keyword3 <", value, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3LessThanOrEqualTo(String value) {
            addCriterion("keyword3 <=", value, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3Like(String value) {
            addCriterion("keyword3 like", value, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3NotLike(String value) {
            addCriterion("keyword3 not like", value, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3In(List<String> values) {
            addCriterion("keyword3 in", values, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3NotIn(List<String> values) {
            addCriterion("keyword3 not in", values, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3Between(String value1, String value2) {
            addCriterion("keyword3 between", value1, value2, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword3NotBetween(String value1, String value2) {
            addCriterion("keyword3 not between", value1, value2, "keyword3");
            return (Criteria) this;
        }

        public Criteria andKeyword4IsNull() {
            addCriterion("keyword4 is null");
            return (Criteria) this;
        }

        public Criteria andKeyword4IsNotNull() {
            addCriterion("keyword4 is not null");
            return (Criteria) this;
        }

        public Criteria andKeyword4EqualTo(String value) {
            addCriterion("keyword4 =", value, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4NotEqualTo(String value) {
            addCriterion("keyword4 <>", value, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4GreaterThan(String value) {
            addCriterion("keyword4 >", value, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4GreaterThanOrEqualTo(String value) {
            addCriterion("keyword4 >=", value, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4LessThan(String value) {
            addCriterion("keyword4 <", value, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4LessThanOrEqualTo(String value) {
            addCriterion("keyword4 <=", value, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4Like(String value) {
            addCriterion("keyword4 like", value, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4NotLike(String value) {
            addCriterion("keyword4 not like", value, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4In(List<String> values) {
            addCriterion("keyword4 in", values, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4NotIn(List<String> values) {
            addCriterion("keyword4 not in", values, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4Between(String value1, String value2) {
            addCriterion("keyword4 between", value1, value2, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword4NotBetween(String value1, String value2) {
            addCriterion("keyword4 not between", value1, value2, "keyword4");
            return (Criteria) this;
        }

        public Criteria andKeyword5IsNull() {
            addCriterion("keyword5 is null");
            return (Criteria) this;
        }

        public Criteria andKeyword5IsNotNull() {
            addCriterion("keyword5 is not null");
            return (Criteria) this;
        }

        public Criteria andKeyword5EqualTo(String value) {
            addCriterion("keyword5 =", value, "keyword5");
            return (Criteria) this;
        }

        public Criteria andKeyword5NotEqualTo(String value) {
            addCriterion("keyword5 <>", value, "keyword5");
            return (Criteria) this;
        }

        public Criteria andKeyword5GreaterThan(String value) {
            addCriterion("keyword5 >", value, "keyword5");
            return (Criteria) this;
        }

        public Criteria andKeyword5GreaterThanOrEqualTo(String value) {
            addCriterion("keyword5 >=", value, "keyword5");
            return (Criteria) this;
        }

        public Criteria andKeyword5LessThan(String value) {
            addCriterion("keyword5 <", value, "keyword5");
            return (Criteria) this;
        }

        public Criteria andKeyword5LessThanOrEqualTo(String value) {
            addCriterion("keyword5 <=", value, "keyword5");
            return (Criteria) this;
        }

        public Criteria andKeyword5Like(String value) {
            addCriterion("keyword5 like", value, "keyword5");
            return (Criteria) this;
        }

        public Criteria andKeyword5NotLike(String value) {
            addCriterion("keyword5 not like", value, "keyword5");
            return (Criteria) this;
        }

        public Criteria andKeyword5In(List<String> values) {
            addCriterion("keyword5 in", values, "keyword5");
            return (Criteria) this;
        }

        public Criteria andKeyword5NotIn(List<String> values) {
            addCriterion("keyword5 not in", values, "keyword5");
            return (Criteria) this;
        }

        public Criteria andKeyword5Between(String value1, String value2) {
            addCriterion("keyword5 between", value1, value2, "keyword5");
            return (Criteria) this;
        }

        public Criteria andKeyword5NotBetween(String value1, String value2) {
            addCriterion("keyword5 not between", value1, value2, "keyword5");
            return (Criteria) this;
        }

        public Criteria andKeyword6IsNull() {
            addCriterion("keyword6 is null");
            return (Criteria) this;
        }

        public Criteria andKeyword6IsNotNull() {
            addCriterion("keyword6 is not null");
            return (Criteria) this;
        }

        public Criteria andKeyword6EqualTo(String value) {
            addCriterion("keyword6 =", value, "keyword6");
            return (Criteria) this;
        }

        public Criteria andKeyword6NotEqualTo(String value) {
            addCriterion("keyword6 <>", value, "keyword6");
            return (Criteria) this;
        }

        public Criteria andKeyword6GreaterThan(String value) {
            addCriterion("keyword6 >", value, "keyword6");
            return (Criteria) this;
        }

        public Criteria andKeyword6GreaterThanOrEqualTo(String value) {
            addCriterion("keyword6 >=", value, "keyword6");
            return (Criteria) this;
        }

        public Criteria andKeyword6LessThan(String value) {
            addCriterion("keyword6 <", value, "keyword6");
            return (Criteria) this;
        }

        public Criteria andKeyword6LessThanOrEqualTo(String value) {
            addCriterion("keyword6 <=", value, "keyword6");
            return (Criteria) this;
        }

        public Criteria andKeyword6Like(String value) {
            addCriterion("keyword6 like", value, "keyword6");
            return (Criteria) this;
        }

        public Criteria andKeyword6NotLike(String value) {
            addCriterion("keyword6 not like", value, "keyword6");
            return (Criteria) this;
        }

        public Criteria andKeyword6In(List<String> values) {
            addCriterion("keyword6 in", values, "keyword6");
            return (Criteria) this;
        }

        public Criteria andKeyword6NotIn(List<String> values) {
            addCriterion("keyword6 not in", values, "keyword6");
            return (Criteria) this;
        }

        public Criteria andKeyword6Between(String value1, String value2) {
            addCriterion("keyword6 between", value1, value2, "keyword6");
            return (Criteria) this;
        }

        public Criteria andKeyword6NotBetween(String value1, String value2) {
            addCriterion("keyword6 not between", value1, value2, "keyword6");
            return (Criteria) this;
        }

        public Criteria andKeyword7IsNull() {
            addCriterion("keyword7 is null");
            return (Criteria) this;
        }

        public Criteria andKeyword7IsNotNull() {
            addCriterion("keyword7 is not null");
            return (Criteria) this;
        }

        public Criteria andKeyword7EqualTo(String value) {
            addCriterion("keyword7 =", value, "keyword7");
            return (Criteria) this;
        }

        public Criteria andKeyword7NotEqualTo(String value) {
            addCriterion("keyword7 <>", value, "keyword7");
            return (Criteria) this;
        }

        public Criteria andKeyword7GreaterThan(String value) {
            addCriterion("keyword7 >", value, "keyword7");
            return (Criteria) this;
        }

        public Criteria andKeyword7GreaterThanOrEqualTo(String value) {
            addCriterion("keyword7 >=", value, "keyword7");
            return (Criteria) this;
        }

        public Criteria andKeyword7LessThan(String value) {
            addCriterion("keyword7 <", value, "keyword7");
            return (Criteria) this;
        }

        public Criteria andKeyword7LessThanOrEqualTo(String value) {
            addCriterion("keyword7 <=", value, "keyword7");
            return (Criteria) this;
        }

        public Criteria andKeyword7Like(String value) {
            addCriterion("keyword7 like", value, "keyword7");
            return (Criteria) this;
        }

        public Criteria andKeyword7NotLike(String value) {
            addCriterion("keyword7 not like", value, "keyword7");
            return (Criteria) this;
        }

        public Criteria andKeyword7In(List<String> values) {
            addCriterion("keyword7 in", values, "keyword7");
            return (Criteria) this;
        }

        public Criteria andKeyword7NotIn(List<String> values) {
            addCriterion("keyword7 not in", values, "keyword7");
            return (Criteria) this;
        }

        public Criteria andKeyword7Between(String value1, String value2) {
            addCriterion("keyword7 between", value1, value2, "keyword7");
            return (Criteria) this;
        }

        public Criteria andKeyword7NotBetween(String value1, String value2) {
            addCriterion("keyword7 not between", value1, value2, "keyword7");
            return (Criteria) this;
        }

        public Criteria andKeyword8IsNull() {
            addCriterion("keyword8 is null");
            return (Criteria) this;
        }

        public Criteria andKeyword8IsNotNull() {
            addCriterion("keyword8 is not null");
            return (Criteria) this;
        }

        public Criteria andKeyword8EqualTo(String value) {
            addCriterion("keyword8 =", value, "keyword8");
            return (Criteria) this;
        }

        public Criteria andKeyword8NotEqualTo(String value) {
            addCriterion("keyword8 <>", value, "keyword8");
            return (Criteria) this;
        }

        public Criteria andKeyword8GreaterThan(String value) {
            addCriterion("keyword8 >", value, "keyword8");
            return (Criteria) this;
        }

        public Criteria andKeyword8GreaterThanOrEqualTo(String value) {
            addCriterion("keyword8 >=", value, "keyword8");
            return (Criteria) this;
        }

        public Criteria andKeyword8LessThan(String value) {
            addCriterion("keyword8 <", value, "keyword8");
            return (Criteria) this;
        }

        public Criteria andKeyword8LessThanOrEqualTo(String value) {
            addCriterion("keyword8 <=", value, "keyword8");
            return (Criteria) this;
        }

        public Criteria andKeyword8Like(String value) {
            addCriterion("keyword8 like", value, "keyword8");
            return (Criteria) this;
        }

        public Criteria andKeyword8NotLike(String value) {
            addCriterion("keyword8 not like", value, "keyword8");
            return (Criteria) this;
        }

        public Criteria andKeyword8In(List<String> values) {
            addCriterion("keyword8 in", values, "keyword8");
            return (Criteria) this;
        }

        public Criteria andKeyword8NotIn(List<String> values) {
            addCriterion("keyword8 not in", values, "keyword8");
            return (Criteria) this;
        }

        public Criteria andKeyword8Between(String value1, String value2) {
            addCriterion("keyword8 between", value1, value2, "keyword8");
            return (Criteria) this;
        }

        public Criteria andKeyword8NotBetween(String value1, String value2) {
            addCriterion("keyword8 not between", value1, value2, "keyword8");
            return (Criteria) this;
        }

        public Criteria andKeyword9IsNull() {
            addCriterion("keyword9 is null");
            return (Criteria) this;
        }

        public Criteria andKeyword9IsNotNull() {
            addCriterion("keyword9 is not null");
            return (Criteria) this;
        }

        public Criteria andKeyword9EqualTo(String value) {
            addCriterion("keyword9 =", value, "keyword9");
            return (Criteria) this;
        }

        public Criteria andKeyword9NotEqualTo(String value) {
            addCriterion("keyword9 <>", value, "keyword9");
            return (Criteria) this;
        }

        public Criteria andKeyword9GreaterThan(String value) {
            addCriterion("keyword9 >", value, "keyword9");
            return (Criteria) this;
        }

        public Criteria andKeyword9GreaterThanOrEqualTo(String value) {
            addCriterion("keyword9 >=", value, "keyword9");
            return (Criteria) this;
        }

        public Criteria andKeyword9LessThan(String value) {
            addCriterion("keyword9 <", value, "keyword9");
            return (Criteria) this;
        }

        public Criteria andKeyword9LessThanOrEqualTo(String value) {
            addCriterion("keyword9 <=", value, "keyword9");
            return (Criteria) this;
        }

        public Criteria andKeyword9Like(String value) {
            addCriterion("keyword9 like", value, "keyword9");
            return (Criteria) this;
        }

        public Criteria andKeyword9NotLike(String value) {
            addCriterion("keyword9 not like", value, "keyword9");
            return (Criteria) this;
        }

        public Criteria andKeyword9In(List<String> values) {
            addCriterion("keyword9 in", values, "keyword9");
            return (Criteria) this;
        }

        public Criteria andKeyword9NotIn(List<String> values) {
            addCriterion("keyword9 not in", values, "keyword9");
            return (Criteria) this;
        }

        public Criteria andKeyword9Between(String value1, String value2) {
            addCriterion("keyword9 between", value1, value2, "keyword9");
            return (Criteria) this;
        }

        public Criteria andKeyword9NotBetween(String value1, String value2) {
            addCriterion("keyword9 not between", value1, value2, "keyword9");
            return (Criteria) this;
        }

        public Criteria andKeyword10IsNull() {
            addCriterion("keyword10 is null");
            return (Criteria) this;
        }

        public Criteria andKeyword10IsNotNull() {
            addCriterion("keyword10 is not null");
            return (Criteria) this;
        }

        public Criteria andKeyword10EqualTo(String value) {
            addCriterion("keyword10 =", value, "keyword10");
            return (Criteria) this;
        }

        public Criteria andKeyword10NotEqualTo(String value) {
            addCriterion("keyword10 <>", value, "keyword10");
            return (Criteria) this;
        }

        public Criteria andKeyword10GreaterThan(String value) {
            addCriterion("keyword10 >", value, "keyword10");
            return (Criteria) this;
        }

        public Criteria andKeyword10GreaterThanOrEqualTo(String value) {
            addCriterion("keyword10 >=", value, "keyword10");
            return (Criteria) this;
        }

        public Criteria andKeyword10LessThan(String value) {
            addCriterion("keyword10 <", value, "keyword10");
            return (Criteria) this;
        }

        public Criteria andKeyword10LessThanOrEqualTo(String value) {
            addCriterion("keyword10 <=", value, "keyword10");
            return (Criteria) this;
        }

        public Criteria andKeyword10Like(String value) {
            addCriterion("keyword10 like", value, "keyword10");
            return (Criteria) this;
        }

        public Criteria andKeyword10NotLike(String value) {
            addCriterion("keyword10 not like", value, "keyword10");
            return (Criteria) this;
        }

        public Criteria andKeyword10In(List<String> values) {
            addCriterion("keyword10 in", values, "keyword10");
            return (Criteria) this;
        }

        public Criteria andKeyword10NotIn(List<String> values) {
            addCriterion("keyword10 not in", values, "keyword10");
            return (Criteria) this;
        }

        public Criteria andKeyword10Between(String value1, String value2) {
            addCriterion("keyword10 between", value1, value2, "keyword10");
            return (Criteria) this;
        }

        public Criteria andKeyword10NotBetween(String value1, String value2) {
            addCriterion("keyword10 not between", value1, value2, "keyword10");
            return (Criteria) this;
        }

        public Criteria andKeyword11IsNull() {
            addCriterion("keyword11 is null");
            return (Criteria) this;
        }

        public Criteria andKeyword11IsNotNull() {
            addCriterion("keyword11 is not null");
            return (Criteria) this;
        }

        public Criteria andKeyword11EqualTo(String value) {
            addCriterion("keyword11 =", value, "keyword11");
            return (Criteria) this;
        }

        public Criteria andKeyword11NotEqualTo(String value) {
            addCriterion("keyword11 <>", value, "keyword11");
            return (Criteria) this;
        }

        public Criteria andKeyword11GreaterThan(String value) {
            addCriterion("keyword11 >", value, "keyword11");
            return (Criteria) this;
        }

        public Criteria andKeyword11GreaterThanOrEqualTo(String value) {
            addCriterion("keyword11 >=", value, "keyword11");
            return (Criteria) this;
        }

        public Criteria andKeyword11LessThan(String value) {
            addCriterion("keyword11 <", value, "keyword11");
            return (Criteria) this;
        }

        public Criteria andKeyword11LessThanOrEqualTo(String value) {
            addCriterion("keyword11 <=", value, "keyword11");
            return (Criteria) this;
        }

        public Criteria andKeyword11Like(String value) {
            addCriterion("keyword11 like", value, "keyword11");
            return (Criteria) this;
        }

        public Criteria andKeyword11NotLike(String value) {
            addCriterion("keyword11 not like", value, "keyword11");
            return (Criteria) this;
        }

        public Criteria andKeyword11In(List<String> values) {
            addCriterion("keyword11 in", values, "keyword11");
            return (Criteria) this;
        }

        public Criteria andKeyword11NotIn(List<String> values) {
            addCriterion("keyword11 not in", values, "keyword11");
            return (Criteria) this;
        }

        public Criteria andKeyword11Between(String value1, String value2) {
            addCriterion("keyword11 between", value1, value2, "keyword11");
            return (Criteria) this;
        }

        public Criteria andKeyword11NotBetween(String value1, String value2) {
            addCriterion("keyword11 not between", value1, value2, "keyword11");
            return (Criteria) this;
        }

        public Criteria andKeyword12IsNull() {
            addCriterion("keyword12 is null");
            return (Criteria) this;
        }

        public Criteria andKeyword12IsNotNull() {
            addCriterion("keyword12 is not null");
            return (Criteria) this;
        }

        public Criteria andKeyword12EqualTo(String value) {
            addCriterion("keyword12 =", value, "keyword12");
            return (Criteria) this;
        }

        public Criteria andKeyword12NotEqualTo(String value) {
            addCriterion("keyword12 <>", value, "keyword12");
            return (Criteria) this;
        }

        public Criteria andKeyword12GreaterThan(String value) {
            addCriterion("keyword12 >", value, "keyword12");
            return (Criteria) this;
        }

        public Criteria andKeyword12GreaterThanOrEqualTo(String value) {
            addCriterion("keyword12 >=", value, "keyword12");
            return (Criteria) this;
        }

        public Criteria andKeyword12LessThan(String value) {
            addCriterion("keyword12 <", value, "keyword12");
            return (Criteria) this;
        }

        public Criteria andKeyword12LessThanOrEqualTo(String value) {
            addCriterion("keyword12 <=", value, "keyword12");
            return (Criteria) this;
        }

        public Criteria andKeyword12Like(String value) {
            addCriterion("keyword12 like", value, "keyword12");
            return (Criteria) this;
        }

        public Criteria andKeyword12NotLike(String value) {
            addCriterion("keyword12 not like", value, "keyword12");
            return (Criteria) this;
        }

        public Criteria andKeyword12In(List<String> values) {
            addCriterion("keyword12 in", values, "keyword12");
            return (Criteria) this;
        }

        public Criteria andKeyword12NotIn(List<String> values) {
            addCriterion("keyword12 not in", values, "keyword12");
            return (Criteria) this;
        }

        public Criteria andKeyword12Between(String value1, String value2) {
            addCriterion("keyword12 between", value1, value2, "keyword12");
            return (Criteria) this;
        }

        public Criteria andKeyword12NotBetween(String value1, String value2) {
            addCriterion("keyword12 not between", value1, value2, "keyword12");
            return (Criteria) this;
        }

        public Criteria andKeyword13IsNull() {
            addCriterion("keyword13 is null");
            return (Criteria) this;
        }

        public Criteria andKeyword13IsNotNull() {
            addCriterion("keyword13 is not null");
            return (Criteria) this;
        }

        public Criteria andKeyword13EqualTo(String value) {
            addCriterion("keyword13 =", value, "keyword13");
            return (Criteria) this;
        }

        public Criteria andKeyword13NotEqualTo(String value) {
            addCriterion("keyword13 <>", value, "keyword13");
            return (Criteria) this;
        }

        public Criteria andKeyword13GreaterThan(String value) {
            addCriterion("keyword13 >", value, "keyword13");
            return (Criteria) this;
        }

        public Criteria andKeyword13GreaterThanOrEqualTo(String value) {
            addCriterion("keyword13 >=", value, "keyword13");
            return (Criteria) this;
        }

        public Criteria andKeyword13LessThan(String value) {
            addCriterion("keyword13 <", value, "keyword13");
            return (Criteria) this;
        }

        public Criteria andKeyword13LessThanOrEqualTo(String value) {
            addCriterion("keyword13 <=", value, "keyword13");
            return (Criteria) this;
        }

        public Criteria andKeyword13Like(String value) {
            addCriterion("keyword13 like", value, "keyword13");
            return (Criteria) this;
        }

        public Criteria andKeyword13NotLike(String value) {
            addCriterion("keyword13 not like", value, "keyword13");
            return (Criteria) this;
        }

        public Criteria andKeyword13In(List<String> values) {
            addCriterion("keyword13 in", values, "keyword13");
            return (Criteria) this;
        }

        public Criteria andKeyword13NotIn(List<String> values) {
            addCriterion("keyword13 not in", values, "keyword13");
            return (Criteria) this;
        }

        public Criteria andKeyword13Between(String value1, String value2) {
            addCriterion("keyword13 between", value1, value2, "keyword13");
            return (Criteria) this;
        }

        public Criteria andKeyword13NotBetween(String value1, String value2) {
            addCriterion("keyword13 not between", value1, value2, "keyword13");
            return (Criteria) this;
        }

        public Criteria andKeyword14IsNull() {
            addCriterion("keyword14 is null");
            return (Criteria) this;
        }

        public Criteria andKeyword14IsNotNull() {
            addCriterion("keyword14 is not null");
            return (Criteria) this;
        }

        public Criteria andKeyword14EqualTo(String value) {
            addCriterion("keyword14 =", value, "keyword14");
            return (Criteria) this;
        }

        public Criteria andKeyword14NotEqualTo(String value) {
            addCriterion("keyword14 <>", value, "keyword14");
            return (Criteria) this;
        }

        public Criteria andKeyword14GreaterThan(String value) {
            addCriterion("keyword14 >", value, "keyword14");
            return (Criteria) this;
        }

        public Criteria andKeyword14GreaterThanOrEqualTo(String value) {
            addCriterion("keyword14 >=", value, "keyword14");
            return (Criteria) this;
        }

        public Criteria andKeyword14LessThan(String value) {
            addCriterion("keyword14 <", value, "keyword14");
            return (Criteria) this;
        }

        public Criteria andKeyword14LessThanOrEqualTo(String value) {
            addCriterion("keyword14 <=", value, "keyword14");
            return (Criteria) this;
        }

        public Criteria andKeyword14Like(String value) {
            addCriterion("keyword14 like", value, "keyword14");
            return (Criteria) this;
        }

        public Criteria andKeyword14NotLike(String value) {
            addCriterion("keyword14 not like", value, "keyword14");
            return (Criteria) this;
        }

        public Criteria andKeyword14In(List<String> values) {
            addCriterion("keyword14 in", values, "keyword14");
            return (Criteria) this;
        }

        public Criteria andKeyword14NotIn(List<String> values) {
            addCriterion("keyword14 not in", values, "keyword14");
            return (Criteria) this;
        }

        public Criteria andKeyword14Between(String value1, String value2) {
            addCriterion("keyword14 between", value1, value2, "keyword14");
            return (Criteria) this;
        }

        public Criteria andKeyword14NotBetween(String value1, String value2) {
            addCriterion("keyword14 not between", value1, value2, "keyword14");
            return (Criteria) this;
        }

        public Criteria andKeyword15IsNull() {
            addCriterion("keyword15 is null");
            return (Criteria) this;
        }

        public Criteria andKeyword15IsNotNull() {
            addCriterion("keyword15 is not null");
            return (Criteria) this;
        }

        public Criteria andKeyword15EqualTo(String value) {
            addCriterion("keyword15 =", value, "keyword15");
            return (Criteria) this;
        }

        public Criteria andKeyword15NotEqualTo(String value) {
            addCriterion("keyword15 <>", value, "keyword15");
            return (Criteria) this;
        }

        public Criteria andKeyword15GreaterThan(String value) {
            addCriterion("keyword15 >", value, "keyword15");
            return (Criteria) this;
        }

        public Criteria andKeyword15GreaterThanOrEqualTo(String value) {
            addCriterion("keyword15 >=", value, "keyword15");
            return (Criteria) this;
        }

        public Criteria andKeyword15LessThan(String value) {
            addCriterion("keyword15 <", value, "keyword15");
            return (Criteria) this;
        }

        public Criteria andKeyword15LessThanOrEqualTo(String value) {
            addCriterion("keyword15 <=", value, "keyword15");
            return (Criteria) this;
        }

        public Criteria andKeyword15Like(String value) {
            addCriterion("keyword15 like", value, "keyword15");
            return (Criteria) this;
        }

        public Criteria andKeyword15NotLike(String value) {
            addCriterion("keyword15 not like", value, "keyword15");
            return (Criteria) this;
        }

        public Criteria andKeyword15In(List<String> values) {
            addCriterion("keyword15 in", values, "keyword15");
            return (Criteria) this;
        }

        public Criteria andKeyword15NotIn(List<String> values) {
            addCriterion("keyword15 not in", values, "keyword15");
            return (Criteria) this;
        }

        public Criteria andKeyword15Between(String value1, String value2) {
            addCriterion("keyword15 between", value1, value2, "keyword15");
            return (Criteria) this;
        }

        public Criteria andKeyword15NotBetween(String value1, String value2) {
            addCriterion("keyword15 not between", value1, value2, "keyword15");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}