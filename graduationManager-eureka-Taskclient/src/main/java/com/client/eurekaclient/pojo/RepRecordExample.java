package com.client.eurekaclient.pojo;

import java.util.ArrayList;
import java.util.List;

public class RepRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepRecordExample() {
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

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andReportidIsNull() {
            addCriterion("reportid is null");
            return (Criteria) this;
        }

        public Criteria andReportidIsNotNull() {
            addCriterion("reportid is not null");
            return (Criteria) this;
        }

        public Criteria andReportidEqualTo(String value) {
            addCriterion("reportid =", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotEqualTo(String value) {
            addCriterion("reportid <>", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidGreaterThan(String value) {
            addCriterion("reportid >", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidGreaterThanOrEqualTo(String value) {
            addCriterion("reportid >=", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLessThan(String value) {
            addCriterion("reportid <", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLessThanOrEqualTo(String value) {
            addCriterion("reportid <=", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLike(String value) {
            addCriterion("reportid like", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotLike(String value) {
            addCriterion("reportid not like", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidIn(List<String> values) {
            addCriterion("reportid in", values, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotIn(List<String> values) {
            addCriterion("reportid not in", values, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidBetween(String value1, String value2) {
            addCriterion("reportid between", value1, value2, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotBetween(String value1, String value2) {
            addCriterion("reportid not between", value1, value2, "reportid");
            return (Criteria) this;
        }

        public Criteria andCurrmessageIsNull() {
            addCriterion("currmessage is null");
            return (Criteria) this;
        }

        public Criteria andCurrmessageIsNotNull() {
            addCriterion("currmessage is not null");
            return (Criteria) this;
        }

        public Criteria andCurrmessageEqualTo(String value) {
            addCriterion("currmessage =", value, "currmessage");
            return (Criteria) this;
        }

        public Criteria andCurrmessageNotEqualTo(String value) {
            addCriterion("currmessage <>", value, "currmessage");
            return (Criteria) this;
        }

        public Criteria andCurrmessageGreaterThan(String value) {
            addCriterion("currmessage >", value, "currmessage");
            return (Criteria) this;
        }

        public Criteria andCurrmessageGreaterThanOrEqualTo(String value) {
            addCriterion("currmessage >=", value, "currmessage");
            return (Criteria) this;
        }

        public Criteria andCurrmessageLessThan(String value) {
            addCriterion("currmessage <", value, "currmessage");
            return (Criteria) this;
        }

        public Criteria andCurrmessageLessThanOrEqualTo(String value) {
            addCriterion("currmessage <=", value, "currmessage");
            return (Criteria) this;
        }

        public Criteria andCurrmessageLike(String value) {
            addCriterion("currmessage like", value, "currmessage");
            return (Criteria) this;
        }

        public Criteria andCurrmessageNotLike(String value) {
            addCriterion("currmessage not like", value, "currmessage");
            return (Criteria) this;
        }

        public Criteria andCurrmessageIn(List<String> values) {
            addCriterion("currmessage in", values, "currmessage");
            return (Criteria) this;
        }

        public Criteria andCurrmessageNotIn(List<String> values) {
            addCriterion("currmessage not in", values, "currmessage");
            return (Criteria) this;
        }

        public Criteria andCurrmessageBetween(String value1, String value2) {
            addCriterion("currmessage between", value1, value2, "currmessage");
            return (Criteria) this;
        }

        public Criteria andCurrmessageNotBetween(String value1, String value2) {
            addCriterion("currmessage not between", value1, value2, "currmessage");
            return (Criteria) this;
        }

        public Criteria andPremessageIsNull() {
            addCriterion("premessage is null");
            return (Criteria) this;
        }

        public Criteria andPremessageIsNotNull() {
            addCriterion("premessage is not null");
            return (Criteria) this;
        }

        public Criteria andPremessageEqualTo(String value) {
            addCriterion("premessage =", value, "premessage");
            return (Criteria) this;
        }

        public Criteria andPremessageNotEqualTo(String value) {
            addCriterion("premessage <>", value, "premessage");
            return (Criteria) this;
        }

        public Criteria andPremessageGreaterThan(String value) {
            addCriterion("premessage >", value, "premessage");
            return (Criteria) this;
        }

        public Criteria andPremessageGreaterThanOrEqualTo(String value) {
            addCriterion("premessage >=", value, "premessage");
            return (Criteria) this;
        }

        public Criteria andPremessageLessThan(String value) {
            addCriterion("premessage <", value, "premessage");
            return (Criteria) this;
        }

        public Criteria andPremessageLessThanOrEqualTo(String value) {
            addCriterion("premessage <=", value, "premessage");
            return (Criteria) this;
        }

        public Criteria andPremessageLike(String value) {
            addCriterion("premessage like", value, "premessage");
            return (Criteria) this;
        }

        public Criteria andPremessageNotLike(String value) {
            addCriterion("premessage not like", value, "premessage");
            return (Criteria) this;
        }

        public Criteria andPremessageIn(List<String> values) {
            addCriterion("premessage in", values, "premessage");
            return (Criteria) this;
        }

        public Criteria andPremessageNotIn(List<String> values) {
            addCriterion("premessage not in", values, "premessage");
            return (Criteria) this;
        }

        public Criteria andPremessageBetween(String value1, String value2) {
            addCriterion("premessage between", value1, value2, "premessage");
            return (Criteria) this;
        }

        public Criteria andPremessageNotBetween(String value1, String value2) {
            addCriterion("premessage not between", value1, value2, "premessage");
            return (Criteria) this;
        }

        public Criteria andDealpersonIsNull() {
            addCriterion("dealperson is null");
            return (Criteria) this;
        }

        public Criteria andDealpersonIsNotNull() {
            addCriterion("dealperson is not null");
            return (Criteria) this;
        }

        public Criteria andDealpersonEqualTo(String value) {
            addCriterion("dealperson =", value, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonNotEqualTo(String value) {
            addCriterion("dealperson <>", value, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonGreaterThan(String value) {
            addCriterion("dealperson >", value, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonGreaterThanOrEqualTo(String value) {
            addCriterion("dealperson >=", value, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonLessThan(String value) {
            addCriterion("dealperson <", value, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonLessThanOrEqualTo(String value) {
            addCriterion("dealperson <=", value, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonLike(String value) {
            addCriterion("dealperson like", value, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonNotLike(String value) {
            addCriterion("dealperson not like", value, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonIn(List<String> values) {
            addCriterion("dealperson in", values, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonNotIn(List<String> values) {
            addCriterion("dealperson not in", values, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonBetween(String value1, String value2) {
            addCriterion("dealperson between", value1, value2, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealpersonNotBetween(String value1, String value2) {
            addCriterion("dealperson not between", value1, value2, "dealperson");
            return (Criteria) this;
        }

        public Criteria andDealtimeIsNull() {
            addCriterion("dealtime is null");
            return (Criteria) this;
        }

        public Criteria andDealtimeIsNotNull() {
            addCriterion("dealtime is not null");
            return (Criteria) this;
        }

        public Criteria andDealtimeEqualTo(String value) {
            addCriterion("dealtime =", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotEqualTo(String value) {
            addCriterion("dealtime <>", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeGreaterThan(String value) {
            addCriterion("dealtime >", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeGreaterThanOrEqualTo(String value) {
            addCriterion("dealtime >=", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeLessThan(String value) {
            addCriterion("dealtime <", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeLessThanOrEqualTo(String value) {
            addCriterion("dealtime <=", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeLike(String value) {
            addCriterion("dealtime like", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotLike(String value) {
            addCriterion("dealtime not like", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeIn(List<String> values) {
            addCriterion("dealtime in", values, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotIn(List<String> values) {
            addCriterion("dealtime not in", values, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeBetween(String value1, String value2) {
            addCriterion("dealtime between", value1, value2, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotBetween(String value1, String value2) {
            addCriterion("dealtime not between", value1, value2, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealmethodIsNull() {
            addCriterion("dealmethod is null");
            return (Criteria) this;
        }

        public Criteria andDealmethodIsNotNull() {
            addCriterion("dealmethod is not null");
            return (Criteria) this;
        }

        public Criteria andDealmethodEqualTo(String value) {
            addCriterion("dealmethod =", value, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodNotEqualTo(String value) {
            addCriterion("dealmethod <>", value, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodGreaterThan(String value) {
            addCriterion("dealmethod >", value, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodGreaterThanOrEqualTo(String value) {
            addCriterion("dealmethod >=", value, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodLessThan(String value) {
            addCriterion("dealmethod <", value, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodLessThanOrEqualTo(String value) {
            addCriterion("dealmethod <=", value, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodLike(String value) {
            addCriterion("dealmethod like", value, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodNotLike(String value) {
            addCriterion("dealmethod not like", value, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodIn(List<String> values) {
            addCriterion("dealmethod in", values, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodNotIn(List<String> values) {
            addCriterion("dealmethod not in", values, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodBetween(String value1, String value2) {
            addCriterion("dealmethod between", value1, value2, "dealmethod");
            return (Criteria) this;
        }

        public Criteria andDealmethodNotBetween(String value1, String value2) {
            addCriterion("dealmethod not between", value1, value2, "dealmethod");
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