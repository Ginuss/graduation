package com.client.eurekaclient.pojo;

import java.util.ArrayList;
import java.util.List;

public class TaskBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskBookExample() {
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

        public Criteria andTasknameIsNull() {
            addCriterion("taskname is null");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNotNull() {
            addCriterion("taskname is not null");
            return (Criteria) this;
        }

        public Criteria andTasknameEqualTo(String value) {
            addCriterion("taskname =", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotEqualTo(String value) {
            addCriterion("taskname <>", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThan(String value) {
            addCriterion("taskname >", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThanOrEqualTo(String value) {
            addCriterion("taskname >=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThan(String value) {
            addCriterion("taskname <", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThanOrEqualTo(String value) {
            addCriterion("taskname <=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLike(String value) {
            addCriterion("taskname like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotLike(String value) {
            addCriterion("taskname not like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameIn(List<String> values) {
            addCriterion("taskname in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotIn(List<String> values) {
            addCriterion("taskname not in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameBetween(String value1, String value2) {
            addCriterion("taskname between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotBetween(String value1, String value2) {
            addCriterion("taskname not between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTaskvalueIsNull() {
            addCriterion("taskvalue is null");
            return (Criteria) this;
        }

        public Criteria andTaskvalueIsNotNull() {
            addCriterion("taskvalue is not null");
            return (Criteria) this;
        }

        public Criteria andTaskvalueEqualTo(String value) {
            addCriterion("taskvalue =", value, "taskvalue");
            return (Criteria) this;
        }

        public Criteria andTaskvalueNotEqualTo(String value) {
            addCriterion("taskvalue <>", value, "taskvalue");
            return (Criteria) this;
        }

        public Criteria andTaskvalueGreaterThan(String value) {
            addCriterion("taskvalue >", value, "taskvalue");
            return (Criteria) this;
        }

        public Criteria andTaskvalueGreaterThanOrEqualTo(String value) {
            addCriterion("taskvalue >=", value, "taskvalue");
            return (Criteria) this;
        }

        public Criteria andTaskvalueLessThan(String value) {
            addCriterion("taskvalue <", value, "taskvalue");
            return (Criteria) this;
        }

        public Criteria andTaskvalueLessThanOrEqualTo(String value) {
            addCriterion("taskvalue <=", value, "taskvalue");
            return (Criteria) this;
        }

        public Criteria andTaskvalueLike(String value) {
            addCriterion("taskvalue like", value, "taskvalue");
            return (Criteria) this;
        }

        public Criteria andTaskvalueNotLike(String value) {
            addCriterion("taskvalue not like", value, "taskvalue");
            return (Criteria) this;
        }

        public Criteria andTaskvalueIn(List<String> values) {
            addCriterion("taskvalue in", values, "taskvalue");
            return (Criteria) this;
        }

        public Criteria andTaskvalueNotIn(List<String> values) {
            addCriterion("taskvalue not in", values, "taskvalue");
            return (Criteria) this;
        }

        public Criteria andTaskvalueBetween(String value1, String value2) {
            addCriterion("taskvalue between", value1, value2, "taskvalue");
            return (Criteria) this;
        }

        public Criteria andTaskvalueNotBetween(String value1, String value2) {
            addCriterion("taskvalue not between", value1, value2, "taskvalue");
            return (Criteria) this;
        }

        public Criteria andTaskauthIsNull() {
            addCriterion("taskauth is null");
            return (Criteria) this;
        }

        public Criteria andTaskauthIsNotNull() {
            addCriterion("taskauth is not null");
            return (Criteria) this;
        }

        public Criteria andTaskauthEqualTo(String value) {
            addCriterion("taskauth =", value, "taskauth");
            return (Criteria) this;
        }

        public Criteria andTaskauthNotEqualTo(String value) {
            addCriterion("taskauth <>", value, "taskauth");
            return (Criteria) this;
        }

        public Criteria andTaskauthGreaterThan(String value) {
            addCriterion("taskauth >", value, "taskauth");
            return (Criteria) this;
        }

        public Criteria andTaskauthGreaterThanOrEqualTo(String value) {
            addCriterion("taskauth >=", value, "taskauth");
            return (Criteria) this;
        }

        public Criteria andTaskauthLessThan(String value) {
            addCriterion("taskauth <", value, "taskauth");
            return (Criteria) this;
        }

        public Criteria andTaskauthLessThanOrEqualTo(String value) {
            addCriterion("taskauth <=", value, "taskauth");
            return (Criteria) this;
        }

        public Criteria andTaskauthLike(String value) {
            addCriterion("taskauth like", value, "taskauth");
            return (Criteria) this;
        }

        public Criteria andTaskauthNotLike(String value) {
            addCriterion("taskauth not like", value, "taskauth");
            return (Criteria) this;
        }

        public Criteria andTaskauthIn(List<String> values) {
            addCriterion("taskauth in", values, "taskauth");
            return (Criteria) this;
        }

        public Criteria andTaskauthNotIn(List<String> values) {
            addCriterion("taskauth not in", values, "taskauth");
            return (Criteria) this;
        }

        public Criteria andTaskauthBetween(String value1, String value2) {
            addCriterion("taskauth between", value1, value2, "taskauth");
            return (Criteria) this;
        }

        public Criteria andTaskauthNotBetween(String value1, String value2) {
            addCriterion("taskauth not between", value1, value2, "taskauth");
            return (Criteria) this;
        }

        public Criteria andTasktimeIsNull() {
            addCriterion("tasktime is null");
            return (Criteria) this;
        }

        public Criteria andTasktimeIsNotNull() {
            addCriterion("tasktime is not null");
            return (Criteria) this;
        }

        public Criteria andTasktimeEqualTo(String value) {
            addCriterion("tasktime =", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeNotEqualTo(String value) {
            addCriterion("tasktime <>", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeGreaterThan(String value) {
            addCriterion("tasktime >", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeGreaterThanOrEqualTo(String value) {
            addCriterion("tasktime >=", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeLessThan(String value) {
            addCriterion("tasktime <", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeLessThanOrEqualTo(String value) {
            addCriterion("tasktime <=", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeLike(String value) {
            addCriterion("tasktime like", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeNotLike(String value) {
            addCriterion("tasktime not like", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeIn(List<String> values) {
            addCriterion("tasktime in", values, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeNotIn(List<String> values) {
            addCriterion("tasktime not in", values, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeBetween(String value1, String value2) {
            addCriterion("tasktime between", value1, value2, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeNotBetween(String value1, String value2) {
            addCriterion("tasktime not between", value1, value2, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTaskhandlerIsNull() {
            addCriterion("taskhandler is null");
            return (Criteria) this;
        }

        public Criteria andTaskhandlerIsNotNull() {
            addCriterion("taskhandler is not null");
            return (Criteria) this;
        }

        public Criteria andTaskhandlerEqualTo(String value) {
            addCriterion("taskhandler =", value, "taskhandler");
            return (Criteria) this;
        }

        public Criteria andTaskhandlerNotEqualTo(String value) {
            addCriterion("taskhandler <>", value, "taskhandler");
            return (Criteria) this;
        }

        public Criteria andTaskhandlerGreaterThan(String value) {
            addCriterion("taskhandler >", value, "taskhandler");
            return (Criteria) this;
        }

        public Criteria andTaskhandlerGreaterThanOrEqualTo(String value) {
            addCriterion("taskhandler >=", value, "taskhandler");
            return (Criteria) this;
        }

        public Criteria andTaskhandlerLessThan(String value) {
            addCriterion("taskhandler <", value, "taskhandler");
            return (Criteria) this;
        }

        public Criteria andTaskhandlerLessThanOrEqualTo(String value) {
            addCriterion("taskhandler <=", value, "taskhandler");
            return (Criteria) this;
        }

        public Criteria andTaskhandlerLike(String value) {
            addCriterion("taskhandler like", value, "taskhandler");
            return (Criteria) this;
        }

        public Criteria andTaskhandlerNotLike(String value) {
            addCriterion("taskhandler not like", value, "taskhandler");
            return (Criteria) this;
        }

        public Criteria andTaskhandlerIn(List<String> values) {
            addCriterion("taskhandler in", values, "taskhandler");
            return (Criteria) this;
        }

        public Criteria andTaskhandlerNotIn(List<String> values) {
            addCriterion("taskhandler not in", values, "taskhandler");
            return (Criteria) this;
        }

        public Criteria andTaskhandlerBetween(String value1, String value2) {
            addCriterion("taskhandler between", value1, value2, "taskhandler");
            return (Criteria) this;
        }

        public Criteria andTaskhandlerNotBetween(String value1, String value2) {
            addCriterion("taskhandler not between", value1, value2, "taskhandler");
            return (Criteria) this;
        }

        public Criteria andSubjectidIsNull() {
            addCriterion("subjectid is null");
            return (Criteria) this;
        }

        public Criteria andSubjectidIsNotNull() {
            addCriterion("subjectid is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectidEqualTo(String value) {
            addCriterion("subjectid =", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotEqualTo(String value) {
            addCriterion("subjectid <>", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThan(String value) {
            addCriterion("subjectid >", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThanOrEqualTo(String value) {
            addCriterion("subjectid >=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThan(String value) {
            addCriterion("subjectid <", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThanOrEqualTo(String value) {
            addCriterion("subjectid <=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLike(String value) {
            addCriterion("subjectid like", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotLike(String value) {
            addCriterion("subjectid not like", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidIn(List<String> values) {
            addCriterion("subjectid in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotIn(List<String> values) {
            addCriterion("subjectid not in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidBetween(String value1, String value2) {
            addCriterion("subjectid between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotBetween(String value1, String value2) {
            addCriterion("subjectid not between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andArticleidIsNull() {
            addCriterion("articleid is null");
            return (Criteria) this;
        }

        public Criteria andArticleidIsNotNull() {
            addCriterion("articleid is not null");
            return (Criteria) this;
        }

        public Criteria andArticleidEqualTo(String value) {
            addCriterion("articleid =", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotEqualTo(String value) {
            addCriterion("articleid <>", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThan(String value) {
            addCriterion("articleid >", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThanOrEqualTo(String value) {
            addCriterion("articleid >=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThan(String value) {
            addCriterion("articleid <", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThanOrEqualTo(String value) {
            addCriterion("articleid <=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLike(String value) {
            addCriterion("articleid like", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotLike(String value) {
            addCriterion("articleid not like", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidIn(List<String> values) {
            addCriterion("articleid in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotIn(List<String> values) {
            addCriterion("articleid not in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidBetween(String value1, String value2) {
            addCriterion("articleid between", value1, value2, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotBetween(String value1, String value2) {
            addCriterion("articleid not between", value1, value2, "articleid");
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