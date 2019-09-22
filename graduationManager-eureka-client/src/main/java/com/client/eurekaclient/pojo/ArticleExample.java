package com.client.eurekaclient.pojo;

import java.util.ArrayList;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andArticlenameIsNull() {
            addCriterion("articlename is null");
            return (Criteria) this;
        }

        public Criteria andArticlenameIsNotNull() {
            addCriterion("articlename is not null");
            return (Criteria) this;
        }

        public Criteria andArticlenameEqualTo(String value) {
            addCriterion("articlename =", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotEqualTo(String value) {
            addCriterion("articlename <>", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameGreaterThan(String value) {
            addCriterion("articlename >", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameGreaterThanOrEqualTo(String value) {
            addCriterion("articlename >=", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameLessThan(String value) {
            addCriterion("articlename <", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameLessThanOrEqualTo(String value) {
            addCriterion("articlename <=", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameLike(String value) {
            addCriterion("articlename like", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotLike(String value) {
            addCriterion("articlename not like", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameIn(List<String> values) {
            addCriterion("articlename in", values, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotIn(List<String> values) {
            addCriterion("articlename not in", values, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameBetween(String value1, String value2) {
            addCriterion("articlename between", value1, value2, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotBetween(String value1, String value2) {
            addCriterion("articlename not between", value1, value2, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlevalueIsNull() {
            addCriterion("articlevalue is null");
            return (Criteria) this;
        }

        public Criteria andArticlevalueIsNotNull() {
            addCriterion("articlevalue is not null");
            return (Criteria) this;
        }

        public Criteria andArticlevalueEqualTo(String value) {
            addCriterion("articlevalue =", value, "articlevalue");
            return (Criteria) this;
        }

        public Criteria andArticlevalueNotEqualTo(String value) {
            addCriterion("articlevalue <>", value, "articlevalue");
            return (Criteria) this;
        }

        public Criteria andArticlevalueGreaterThan(String value) {
            addCriterion("articlevalue >", value, "articlevalue");
            return (Criteria) this;
        }

        public Criteria andArticlevalueGreaterThanOrEqualTo(String value) {
            addCriterion("articlevalue >=", value, "articlevalue");
            return (Criteria) this;
        }

        public Criteria andArticlevalueLessThan(String value) {
            addCriterion("articlevalue <", value, "articlevalue");
            return (Criteria) this;
        }

        public Criteria andArticlevalueLessThanOrEqualTo(String value) {
            addCriterion("articlevalue <=", value, "articlevalue");
            return (Criteria) this;
        }

        public Criteria andArticlevalueLike(String value) {
            addCriterion("articlevalue like", value, "articlevalue");
            return (Criteria) this;
        }

        public Criteria andArticlevalueNotLike(String value) {
            addCriterion("articlevalue not like", value, "articlevalue");
            return (Criteria) this;
        }

        public Criteria andArticlevalueIn(List<String> values) {
            addCriterion("articlevalue in", values, "articlevalue");
            return (Criteria) this;
        }

        public Criteria andArticlevalueNotIn(List<String> values) {
            addCriterion("articlevalue not in", values, "articlevalue");
            return (Criteria) this;
        }

        public Criteria andArticlevalueBetween(String value1, String value2) {
            addCriterion("articlevalue between", value1, value2, "articlevalue");
            return (Criteria) this;
        }

        public Criteria andArticlevalueNotBetween(String value1, String value2) {
            addCriterion("articlevalue not between", value1, value2, "articlevalue");
            return (Criteria) this;
        }

        public Criteria andArticleauthIsNull() {
            addCriterion("articleauth is null");
            return (Criteria) this;
        }

        public Criteria andArticleauthIsNotNull() {
            addCriterion("articleauth is not null");
            return (Criteria) this;
        }

        public Criteria andArticleauthEqualTo(String value) {
            addCriterion("articleauth =", value, "articleauth");
            return (Criteria) this;
        }

        public Criteria andArticleauthNotEqualTo(String value) {
            addCriterion("articleauth <>", value, "articleauth");
            return (Criteria) this;
        }

        public Criteria andArticleauthGreaterThan(String value) {
            addCriterion("articleauth >", value, "articleauth");
            return (Criteria) this;
        }

        public Criteria andArticleauthGreaterThanOrEqualTo(String value) {
            addCriterion("articleauth >=", value, "articleauth");
            return (Criteria) this;
        }

        public Criteria andArticleauthLessThan(String value) {
            addCriterion("articleauth <", value, "articleauth");
            return (Criteria) this;
        }

        public Criteria andArticleauthLessThanOrEqualTo(String value) {
            addCriterion("articleauth <=", value, "articleauth");
            return (Criteria) this;
        }

        public Criteria andArticleauthLike(String value) {
            addCriterion("articleauth like", value, "articleauth");
            return (Criteria) this;
        }

        public Criteria andArticleauthNotLike(String value) {
            addCriterion("articleauth not like", value, "articleauth");
            return (Criteria) this;
        }

        public Criteria andArticleauthIn(List<String> values) {
            addCriterion("articleauth in", values, "articleauth");
            return (Criteria) this;
        }

        public Criteria andArticleauthNotIn(List<String> values) {
            addCriterion("articleauth not in", values, "articleauth");
            return (Criteria) this;
        }

        public Criteria andArticleauthBetween(String value1, String value2) {
            addCriterion("articleauth between", value1, value2, "articleauth");
            return (Criteria) this;
        }

        public Criteria andArticleauthNotBetween(String value1, String value2) {
            addCriterion("articleauth not between", value1, value2, "articleauth");
            return (Criteria) this;
        }

        public Criteria andArticlerecordidIsNull() {
            addCriterion("articlerecordid is null");
            return (Criteria) this;
        }

        public Criteria andArticlerecordidIsNotNull() {
            addCriterion("articlerecordid is not null");
            return (Criteria) this;
        }

        public Criteria andArticlerecordidEqualTo(String value) {
            addCriterion("articlerecordid =", value, "articlerecordid");
            return (Criteria) this;
        }

        public Criteria andArticlerecordidNotEqualTo(String value) {
            addCriterion("articlerecordid <>", value, "articlerecordid");
            return (Criteria) this;
        }

        public Criteria andArticlerecordidGreaterThan(String value) {
            addCriterion("articlerecordid >", value, "articlerecordid");
            return (Criteria) this;
        }

        public Criteria andArticlerecordidGreaterThanOrEqualTo(String value) {
            addCriterion("articlerecordid >=", value, "articlerecordid");
            return (Criteria) this;
        }

        public Criteria andArticlerecordidLessThan(String value) {
            addCriterion("articlerecordid <", value, "articlerecordid");
            return (Criteria) this;
        }

        public Criteria andArticlerecordidLessThanOrEqualTo(String value) {
            addCriterion("articlerecordid <=", value, "articlerecordid");
            return (Criteria) this;
        }

        public Criteria andArticlerecordidLike(String value) {
            addCriterion("articlerecordid like", value, "articlerecordid");
            return (Criteria) this;
        }

        public Criteria andArticlerecordidNotLike(String value) {
            addCriterion("articlerecordid not like", value, "articlerecordid");
            return (Criteria) this;
        }

        public Criteria andArticlerecordidIn(List<String> values) {
            addCriterion("articlerecordid in", values, "articlerecordid");
            return (Criteria) this;
        }

        public Criteria andArticlerecordidNotIn(List<String> values) {
            addCriterion("articlerecordid not in", values, "articlerecordid");
            return (Criteria) this;
        }

        public Criteria andArticlerecordidBetween(String value1, String value2) {
            addCriterion("articlerecordid between", value1, value2, "articlerecordid");
            return (Criteria) this;
        }

        public Criteria andArticlerecordidNotBetween(String value1, String value2) {
            addCriterion("articlerecordid not between", value1, value2, "articlerecordid");
            return (Criteria) this;
        }

        public Criteria andArticlecreatetimeIsNull() {
            addCriterion("articlecreatetime is null");
            return (Criteria) this;
        }

        public Criteria andArticlecreatetimeIsNotNull() {
            addCriterion("articlecreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andArticlecreatetimeEqualTo(String value) {
            addCriterion("articlecreatetime =", value, "articlecreatetime");
            return (Criteria) this;
        }

        public Criteria andArticlecreatetimeNotEqualTo(String value) {
            addCriterion("articlecreatetime <>", value, "articlecreatetime");
            return (Criteria) this;
        }

        public Criteria andArticlecreatetimeGreaterThan(String value) {
            addCriterion("articlecreatetime >", value, "articlecreatetime");
            return (Criteria) this;
        }

        public Criteria andArticlecreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("articlecreatetime >=", value, "articlecreatetime");
            return (Criteria) this;
        }

        public Criteria andArticlecreatetimeLessThan(String value) {
            addCriterion("articlecreatetime <", value, "articlecreatetime");
            return (Criteria) this;
        }

        public Criteria andArticlecreatetimeLessThanOrEqualTo(String value) {
            addCriterion("articlecreatetime <=", value, "articlecreatetime");
            return (Criteria) this;
        }

        public Criteria andArticlecreatetimeLike(String value) {
            addCriterion("articlecreatetime like", value, "articlecreatetime");
            return (Criteria) this;
        }

        public Criteria andArticlecreatetimeNotLike(String value) {
            addCriterion("articlecreatetime not like", value, "articlecreatetime");
            return (Criteria) this;
        }

        public Criteria andArticlecreatetimeIn(List<String> values) {
            addCriterion("articlecreatetime in", values, "articlecreatetime");
            return (Criteria) this;
        }

        public Criteria andArticlecreatetimeNotIn(List<String> values) {
            addCriterion("articlecreatetime not in", values, "articlecreatetime");
            return (Criteria) this;
        }

        public Criteria andArticlecreatetimeBetween(String value1, String value2) {
            addCriterion("articlecreatetime between", value1, value2, "articlecreatetime");
            return (Criteria) this;
        }

        public Criteria andArticlecreatetimeNotBetween(String value1, String value2) {
            addCriterion("articlecreatetime not between", value1, value2, "articlecreatetime");
            return (Criteria) this;
        }

        public Criteria andArticleedittimeIsNull() {
            addCriterion("articleedittime is null");
            return (Criteria) this;
        }

        public Criteria andArticleedittimeIsNotNull() {
            addCriterion("articleedittime is not null");
            return (Criteria) this;
        }

        public Criteria andArticleedittimeEqualTo(String value) {
            addCriterion("articleedittime =", value, "articleedittime");
            return (Criteria) this;
        }

        public Criteria andArticleedittimeNotEqualTo(String value) {
            addCriterion("articleedittime <>", value, "articleedittime");
            return (Criteria) this;
        }

        public Criteria andArticleedittimeGreaterThan(String value) {
            addCriterion("articleedittime >", value, "articleedittime");
            return (Criteria) this;
        }

        public Criteria andArticleedittimeGreaterThanOrEqualTo(String value) {
            addCriterion("articleedittime >=", value, "articleedittime");
            return (Criteria) this;
        }

        public Criteria andArticleedittimeLessThan(String value) {
            addCriterion("articleedittime <", value, "articleedittime");
            return (Criteria) this;
        }

        public Criteria andArticleedittimeLessThanOrEqualTo(String value) {
            addCriterion("articleedittime <=", value, "articleedittime");
            return (Criteria) this;
        }

        public Criteria andArticleedittimeLike(String value) {
            addCriterion("articleedittime like", value, "articleedittime");
            return (Criteria) this;
        }

        public Criteria andArticleedittimeNotLike(String value) {
            addCriterion("articleedittime not like", value, "articleedittime");
            return (Criteria) this;
        }

        public Criteria andArticleedittimeIn(List<String> values) {
            addCriterion("articleedittime in", values, "articleedittime");
            return (Criteria) this;
        }

        public Criteria andArticleedittimeNotIn(List<String> values) {
            addCriterion("articleedittime not in", values, "articleedittime");
            return (Criteria) this;
        }

        public Criteria andArticleedittimeBetween(String value1, String value2) {
            addCriterion("articleedittime between", value1, value2, "articleedittime");
            return (Criteria) this;
        }

        public Criteria andArticleedittimeNotBetween(String value1, String value2) {
            addCriterion("articleedittime not between", value1, value2, "articleedittime");
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

        public Criteria andArticlehandlerIsNull() {
            addCriterion("articlehandler is null");
            return (Criteria) this;
        }

        public Criteria andArticlehandlerIsNotNull() {
            addCriterion("articlehandler is not null");
            return (Criteria) this;
        }

        public Criteria andArticlehandlerEqualTo(String value) {
            addCriterion("articlehandler =", value, "articlehandler");
            return (Criteria) this;
        }

        public Criteria andArticlehandlerNotEqualTo(String value) {
            addCriterion("articlehandler <>", value, "articlehandler");
            return (Criteria) this;
        }

        public Criteria andArticlehandlerGreaterThan(String value) {
            addCriterion("articlehandler >", value, "articlehandler");
            return (Criteria) this;
        }

        public Criteria andArticlehandlerGreaterThanOrEqualTo(String value) {
            addCriterion("articlehandler >=", value, "articlehandler");
            return (Criteria) this;
        }

        public Criteria andArticlehandlerLessThan(String value) {
            addCriterion("articlehandler <", value, "articlehandler");
            return (Criteria) this;
        }

        public Criteria andArticlehandlerLessThanOrEqualTo(String value) {
            addCriterion("articlehandler <=", value, "articlehandler");
            return (Criteria) this;
        }

        public Criteria andArticlehandlerLike(String value) {
            addCriterion("articlehandler like", value, "articlehandler");
            return (Criteria) this;
        }

        public Criteria andArticlehandlerNotLike(String value) {
            addCriterion("articlehandler not like", value, "articlehandler");
            return (Criteria) this;
        }

        public Criteria andArticlehandlerIn(List<String> values) {
            addCriterion("articlehandler in", values, "articlehandler");
            return (Criteria) this;
        }

        public Criteria andArticlehandlerNotIn(List<String> values) {
            addCriterion("articlehandler not in", values, "articlehandler");
            return (Criteria) this;
        }

        public Criteria andArticlehandlerBetween(String value1, String value2) {
            addCriterion("articlehandler between", value1, value2, "articlehandler");
            return (Criteria) this;
        }

        public Criteria andArticlehandlerNotBetween(String value1, String value2) {
            addCriterion("articlehandler not between", value1, value2, "articlehandler");
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