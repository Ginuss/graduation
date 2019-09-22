package com.client.eurekaclient.pojo;

import java.util.ArrayList;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andNoticenameIsNull() {
            addCriterion("noticename is null");
            return (Criteria) this;
        }

        public Criteria andNoticenameIsNotNull() {
            addCriterion("noticename is not null");
            return (Criteria) this;
        }

        public Criteria andNoticenameEqualTo(String value) {
            addCriterion("noticename =", value, "noticename");
            return (Criteria) this;
        }

        public Criteria andNoticenameNotEqualTo(String value) {
            addCriterion("noticename <>", value, "noticename");
            return (Criteria) this;
        }

        public Criteria andNoticenameGreaterThan(String value) {
            addCriterion("noticename >", value, "noticename");
            return (Criteria) this;
        }

        public Criteria andNoticenameGreaterThanOrEqualTo(String value) {
            addCriterion("noticename >=", value, "noticename");
            return (Criteria) this;
        }

        public Criteria andNoticenameLessThan(String value) {
            addCriterion("noticename <", value, "noticename");
            return (Criteria) this;
        }

        public Criteria andNoticenameLessThanOrEqualTo(String value) {
            addCriterion("noticename <=", value, "noticename");
            return (Criteria) this;
        }

        public Criteria andNoticenameLike(String value) {
            addCriterion("noticename like", value, "noticename");
            return (Criteria) this;
        }

        public Criteria andNoticenameNotLike(String value) {
            addCriterion("noticename not like", value, "noticename");
            return (Criteria) this;
        }

        public Criteria andNoticenameIn(List<String> values) {
            addCriterion("noticename in", values, "noticename");
            return (Criteria) this;
        }

        public Criteria andNoticenameNotIn(List<String> values) {
            addCriterion("noticename not in", values, "noticename");
            return (Criteria) this;
        }

        public Criteria andNoticenameBetween(String value1, String value2) {
            addCriterion("noticename between", value1, value2, "noticename");
            return (Criteria) this;
        }

        public Criteria andNoticenameNotBetween(String value1, String value2) {
            addCriterion("noticename not between", value1, value2, "noticename");
            return (Criteria) this;
        }

        public Criteria andNoticevalueIsNull() {
            addCriterion("noticevalue is null");
            return (Criteria) this;
        }

        public Criteria andNoticevalueIsNotNull() {
            addCriterion("noticevalue is not null");
            return (Criteria) this;
        }

        public Criteria andNoticevalueEqualTo(String value) {
            addCriterion("noticevalue =", value, "noticevalue");
            return (Criteria) this;
        }

        public Criteria andNoticevalueNotEqualTo(String value) {
            addCriterion("noticevalue <>", value, "noticevalue");
            return (Criteria) this;
        }

        public Criteria andNoticevalueGreaterThan(String value) {
            addCriterion("noticevalue >", value, "noticevalue");
            return (Criteria) this;
        }

        public Criteria andNoticevalueGreaterThanOrEqualTo(String value) {
            addCriterion("noticevalue >=", value, "noticevalue");
            return (Criteria) this;
        }

        public Criteria andNoticevalueLessThan(String value) {
            addCriterion("noticevalue <", value, "noticevalue");
            return (Criteria) this;
        }

        public Criteria andNoticevalueLessThanOrEqualTo(String value) {
            addCriterion("noticevalue <=", value, "noticevalue");
            return (Criteria) this;
        }

        public Criteria andNoticevalueLike(String value) {
            addCriterion("noticevalue like", value, "noticevalue");
            return (Criteria) this;
        }

        public Criteria andNoticevalueNotLike(String value) {
            addCriterion("noticevalue not like", value, "noticevalue");
            return (Criteria) this;
        }

        public Criteria andNoticevalueIn(List<String> values) {
            addCriterion("noticevalue in", values, "noticevalue");
            return (Criteria) this;
        }

        public Criteria andNoticevalueNotIn(List<String> values) {
            addCriterion("noticevalue not in", values, "noticevalue");
            return (Criteria) this;
        }

        public Criteria andNoticevalueBetween(String value1, String value2) {
            addCriterion("noticevalue between", value1, value2, "noticevalue");
            return (Criteria) this;
        }

        public Criteria andNoticevalueNotBetween(String value1, String value2) {
            addCriterion("noticevalue not between", value1, value2, "noticevalue");
            return (Criteria) this;
        }

        public Criteria andNoticeauthorIsNull() {
            addCriterion("noticeauthor is null");
            return (Criteria) this;
        }

        public Criteria andNoticeauthorIsNotNull() {
            addCriterion("noticeauthor is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeauthorEqualTo(String value) {
            addCriterion("noticeauthor =", value, "noticeauthor");
            return (Criteria) this;
        }

        public Criteria andNoticeauthorNotEqualTo(String value) {
            addCriterion("noticeauthor <>", value, "noticeauthor");
            return (Criteria) this;
        }

        public Criteria andNoticeauthorGreaterThan(String value) {
            addCriterion("noticeauthor >", value, "noticeauthor");
            return (Criteria) this;
        }

        public Criteria andNoticeauthorGreaterThanOrEqualTo(String value) {
            addCriterion("noticeauthor >=", value, "noticeauthor");
            return (Criteria) this;
        }

        public Criteria andNoticeauthorLessThan(String value) {
            addCriterion("noticeauthor <", value, "noticeauthor");
            return (Criteria) this;
        }

        public Criteria andNoticeauthorLessThanOrEqualTo(String value) {
            addCriterion("noticeauthor <=", value, "noticeauthor");
            return (Criteria) this;
        }

        public Criteria andNoticeauthorLike(String value) {
            addCriterion("noticeauthor like", value, "noticeauthor");
            return (Criteria) this;
        }

        public Criteria andNoticeauthorNotLike(String value) {
            addCriterion("noticeauthor not like", value, "noticeauthor");
            return (Criteria) this;
        }

        public Criteria andNoticeauthorIn(List<String> values) {
            addCriterion("noticeauthor in", values, "noticeauthor");
            return (Criteria) this;
        }

        public Criteria andNoticeauthorNotIn(List<String> values) {
            addCriterion("noticeauthor not in", values, "noticeauthor");
            return (Criteria) this;
        }

        public Criteria andNoticeauthorBetween(String value1, String value2) {
            addCriterion("noticeauthor between", value1, value2, "noticeauthor");
            return (Criteria) this;
        }

        public Criteria andNoticeauthorNotBetween(String value1, String value2) {
            addCriterion("noticeauthor not between", value1, value2, "noticeauthor");
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