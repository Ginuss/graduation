package com.client.eurekaclient.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportExample() {
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

        public Criteria andRepnameIsNull() {
            addCriterion("repname is null");
            return (Criteria) this;
        }

        public Criteria andRepnameIsNotNull() {
            addCriterion("repname is not null");
            return (Criteria) this;
        }

        public Criteria andRepnameEqualTo(String value) {
            addCriterion("repname =", value, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameNotEqualTo(String value) {
            addCriterion("repname <>", value, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameGreaterThan(String value) {
            addCriterion("repname >", value, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameGreaterThanOrEqualTo(String value) {
            addCriterion("repname >=", value, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameLessThan(String value) {
            addCriterion("repname <", value, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameLessThanOrEqualTo(String value) {
            addCriterion("repname <=", value, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameLike(String value) {
            addCriterion("repname like", value, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameNotLike(String value) {
            addCriterion("repname not like", value, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameIn(List<String> values) {
            addCriterion("repname in", values, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameNotIn(List<String> values) {
            addCriterion("repname not in", values, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameBetween(String value1, String value2) {
            addCriterion("repname between", value1, value2, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameNotBetween(String value1, String value2) {
            addCriterion("repname not between", value1, value2, "repname");
            return (Criteria) this;
        }

        public Criteria andRepvalueIsNull() {
            addCriterion("repvalue is null");
            return (Criteria) this;
        }

        public Criteria andRepvalueIsNotNull() {
            addCriterion("repvalue is not null");
            return (Criteria) this;
        }

        public Criteria andRepvalueEqualTo(String value) {
            addCriterion("repvalue =", value, "repvalue");
            return (Criteria) this;
        }

        public Criteria andRepvalueNotEqualTo(String value) {
            addCriterion("repvalue <>", value, "repvalue");
            return (Criteria) this;
        }

        public Criteria andRepvalueGreaterThan(String value) {
            addCriterion("repvalue >", value, "repvalue");
            return (Criteria) this;
        }

        public Criteria andRepvalueGreaterThanOrEqualTo(String value) {
            addCriterion("repvalue >=", value, "repvalue");
            return (Criteria) this;
        }

        public Criteria andRepvalueLessThan(String value) {
            addCriterion("repvalue <", value, "repvalue");
            return (Criteria) this;
        }

        public Criteria andRepvalueLessThanOrEqualTo(String value) {
            addCriterion("repvalue <=", value, "repvalue");
            return (Criteria) this;
        }

        public Criteria andRepvalueLike(String value) {
            addCriterion("repvalue like", value, "repvalue");
            return (Criteria) this;
        }

        public Criteria andRepvalueNotLike(String value) {
            addCriterion("repvalue not like", value, "repvalue");
            return (Criteria) this;
        }

        public Criteria andRepvalueIn(List<String> values) {
            addCriterion("repvalue in", values, "repvalue");
            return (Criteria) this;
        }

        public Criteria andRepvalueNotIn(List<String> values) {
            addCriterion("repvalue not in", values, "repvalue");
            return (Criteria) this;
        }

        public Criteria andRepvalueBetween(String value1, String value2) {
            addCriterion("repvalue between", value1, value2, "repvalue");
            return (Criteria) this;
        }

        public Criteria andRepvalueNotBetween(String value1, String value2) {
            addCriterion("repvalue not between", value1, value2, "repvalue");
            return (Criteria) this;
        }

        public Criteria andRepauthIsNull() {
            addCriterion("repauth is null");
            return (Criteria) this;
        }

        public Criteria andRepauthIsNotNull() {
            addCriterion("repauth is not null");
            return (Criteria) this;
        }

        public Criteria andRepauthEqualTo(String value) {
            addCriterion("repauth =", value, "repauth");
            return (Criteria) this;
        }

        public Criteria andRepauthNotEqualTo(String value) {
            addCriterion("repauth <>", value, "repauth");
            return (Criteria) this;
        }

        public Criteria andRepauthGreaterThan(String value) {
            addCriterion("repauth >", value, "repauth");
            return (Criteria) this;
        }

        public Criteria andRepauthGreaterThanOrEqualTo(String value) {
            addCriterion("repauth >=", value, "repauth");
            return (Criteria) this;
        }

        public Criteria andRepauthLessThan(String value) {
            addCriterion("repauth <", value, "repauth");
            return (Criteria) this;
        }

        public Criteria andRepauthLessThanOrEqualTo(String value) {
            addCriterion("repauth <=", value, "repauth");
            return (Criteria) this;
        }

        public Criteria andRepauthLike(String value) {
            addCriterion("repauth like", value, "repauth");
            return (Criteria) this;
        }

        public Criteria andRepauthNotLike(String value) {
            addCriterion("repauth not like", value, "repauth");
            return (Criteria) this;
        }

        public Criteria andRepauthIn(List<String> values) {
            addCriterion("repauth in", values, "repauth");
            return (Criteria) this;
        }

        public Criteria andRepauthNotIn(List<String> values) {
            addCriterion("repauth not in", values, "repauth");
            return (Criteria) this;
        }

        public Criteria andRepauthBetween(String value1, String value2) {
            addCriterion("repauth between", value1, value2, "repauth");
            return (Criteria) this;
        }

        public Criteria andRepauthNotBetween(String value1, String value2) {
            addCriterion("repauth not between", value1, value2, "repauth");
            return (Criteria) this;
        }

        public Criteria andReprecordidIsNull() {
            addCriterion("reprecordid is null");
            return (Criteria) this;
        }

        public Criteria andReprecordidIsNotNull() {
            addCriterion("reprecordid is not null");
            return (Criteria) this;
        }

        public Criteria andReprecordidEqualTo(String value) {
            addCriterion("reprecordid =", value, "reprecordid");
            return (Criteria) this;
        }

        public Criteria andReprecordidNotEqualTo(String value) {
            addCriterion("reprecordid <>", value, "reprecordid");
            return (Criteria) this;
        }

        public Criteria andReprecordidGreaterThan(String value) {
            addCriterion("reprecordid >", value, "reprecordid");
            return (Criteria) this;
        }

        public Criteria andReprecordidGreaterThanOrEqualTo(String value) {
            addCriterion("reprecordid >=", value, "reprecordid");
            return (Criteria) this;
        }

        public Criteria andReprecordidLessThan(String value) {
            addCriterion("reprecordid <", value, "reprecordid");
            return (Criteria) this;
        }

        public Criteria andReprecordidLessThanOrEqualTo(String value) {
            addCriterion("reprecordid <=", value, "reprecordid");
            return (Criteria) this;
        }

        public Criteria andReprecordidLike(String value) {
            addCriterion("reprecordid like", value, "reprecordid");
            return (Criteria) this;
        }

        public Criteria andReprecordidNotLike(String value) {
            addCriterion("reprecordid not like", value, "reprecordid");
            return (Criteria) this;
        }

        public Criteria andReprecordidIn(List<String> values) {
            addCriterion("reprecordid in", values, "reprecordid");
            return (Criteria) this;
        }

        public Criteria andReprecordidNotIn(List<String> values) {
            addCriterion("reprecordid not in", values, "reprecordid");
            return (Criteria) this;
        }

        public Criteria andReprecordidBetween(String value1, String value2) {
            addCriterion("reprecordid between", value1, value2, "reprecordid");
            return (Criteria) this;
        }

        public Criteria andReprecordidNotBetween(String value1, String value2) {
            addCriterion("reprecordid not between", value1, value2, "reprecordid");
            return (Criteria) this;
        }

        public Criteria andRepcreatetimeIsNull() {
            addCriterion("repcreatetime is null");
            return (Criteria) this;
        }

        public Criteria andRepcreatetimeIsNotNull() {
            addCriterion("repcreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andRepcreatetimeEqualTo(String value) {
            addCriterion("repcreatetime =", value, "repcreatetime");
            return (Criteria) this;
        }

        public Criteria andRepcreatetimeNotEqualTo(String value) {
            addCriterion("repcreatetime <>", value, "repcreatetime");
            return (Criteria) this;
        }

        public Criteria andRepcreatetimeGreaterThan(String value) {
            addCriterion("repcreatetime >", value, "repcreatetime");
            return (Criteria) this;
        }

        public Criteria andRepcreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("repcreatetime >=", value, "repcreatetime");
            return (Criteria) this;
        }

        public Criteria andRepcreatetimeLessThan(String value) {
            addCriterion("repcreatetime <", value, "repcreatetime");
            return (Criteria) this;
        }

        public Criteria andRepcreatetimeLessThanOrEqualTo(String value) {
            addCriterion("repcreatetime <=", value, "repcreatetime");
            return (Criteria) this;
        }

        public Criteria andRepcreatetimeLike(String value) {
            addCriterion("repcreatetime like", value, "repcreatetime");
            return (Criteria) this;
        }

        public Criteria andRepcreatetimeNotLike(String value) {
            addCriterion("repcreatetime not like", value, "repcreatetime");
            return (Criteria) this;
        }

        public Criteria andRepcreatetimeIn(List<String> values) {
            addCriterion("repcreatetime in", values, "repcreatetime");
            return (Criteria) this;
        }

        public Criteria andRepcreatetimeNotIn(List<String> values) {
            addCriterion("repcreatetime not in", values, "repcreatetime");
            return (Criteria) this;
        }

        public Criteria andRepcreatetimeBetween(String value1, String value2) {
            addCriterion("repcreatetime between", value1, value2, "repcreatetime");
            return (Criteria) this;
        }

        public Criteria andRepcreatetimeNotBetween(String value1, String value2) {
            addCriterion("repcreatetime not between", value1, value2, "repcreatetime");
            return (Criteria) this;
        }

        public Criteria andRepedittimeIsNull() {
            addCriterion("repedittime is null");
            return (Criteria) this;
        }

        public Criteria andRepedittimeIsNotNull() {
            addCriterion("repedittime is not null");
            return (Criteria) this;
        }

        public Criteria andRepedittimeEqualTo(String value) {
            addCriterion("repedittime =", value, "repedittime");
            return (Criteria) this;
        }

        public Criteria andRepedittimeNotEqualTo(String value) {
            addCriterion("repedittime <>", value, "repedittime");
            return (Criteria) this;
        }

        public Criteria andRepedittimeGreaterThan(String value) {
            addCriterion("repedittime >", value, "repedittime");
            return (Criteria) this;
        }

        public Criteria andRepedittimeGreaterThanOrEqualTo(String value) {
            addCriterion("repedittime >=", value, "repedittime");
            return (Criteria) this;
        }

        public Criteria andRepedittimeLessThan(String value) {
            addCriterion("repedittime <", value, "repedittime");
            return (Criteria) this;
        }

        public Criteria andRepedittimeLessThanOrEqualTo(String value) {
            addCriterion("repedittime <=", value, "repedittime");
            return (Criteria) this;
        }

        public Criteria andRepedittimeLike(String value) {
            addCriterion("repedittime like", value, "repedittime");
            return (Criteria) this;
        }

        public Criteria andRepedittimeNotLike(String value) {
            addCriterion("repedittime not like", value, "repedittime");
            return (Criteria) this;
        }

        public Criteria andRepedittimeIn(List<String> values) {
            addCriterion("repedittime in", values, "repedittime");
            return (Criteria) this;
        }

        public Criteria andRepedittimeNotIn(List<String> values) {
            addCriterion("repedittime not in", values, "repedittime");
            return (Criteria) this;
        }

        public Criteria andRepedittimeBetween(String value1, String value2) {
            addCriterion("repedittime between", value1, value2, "repedittime");
            return (Criteria) this;
        }

        public Criteria andRepedittimeNotBetween(String value1, String value2) {
            addCriterion("repedittime not between", value1, value2, "repedittime");
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

        public Criteria andRephandlerIsNull() {
            addCriterion("rephandler is null");
            return (Criteria) this;
        }

        public Criteria andRephandlerIsNotNull() {
            addCriterion("rephandler is not null");
            return (Criteria) this;
        }

        public Criteria andRephandlerEqualTo(String value) {
            addCriterion("rephandler =", value, "rephandler");
            return (Criteria) this;
        }

        public Criteria andRephandlerNotEqualTo(String value) {
            addCriterion("rephandler <>", value, "rephandler");
            return (Criteria) this;
        }

        public Criteria andRephandlerGreaterThan(String value) {
            addCriterion("rephandler >", value, "rephandler");
            return (Criteria) this;
        }

        public Criteria andRephandlerGreaterThanOrEqualTo(String value) {
            addCriterion("rephandler >=", value, "rephandler");
            return (Criteria) this;
        }

        public Criteria andRephandlerLessThan(String value) {
            addCriterion("rephandler <", value, "rephandler");
            return (Criteria) this;
        }

        public Criteria andRephandlerLessThanOrEqualTo(String value) {
            addCriterion("rephandler <=", value, "rephandler");
            return (Criteria) this;
        }

        public Criteria andRephandlerLike(String value) {
            addCriterion("rephandler like", value, "rephandler");
            return (Criteria) this;
        }

        public Criteria andRephandlerNotLike(String value) {
            addCriterion("rephandler not like", value, "rephandler");
            return (Criteria) this;
        }

        public Criteria andRephandlerIn(List<String> values) {
            addCriterion("rephandler in", values, "rephandler");
            return (Criteria) this;
        }

        public Criteria andRephandlerNotIn(List<String> values) {
            addCriterion("rephandler not in", values, "rephandler");
            return (Criteria) this;
        }

        public Criteria andRephandlerBetween(String value1, String value2) {
            addCriterion("rephandler between", value1, value2, "rephandler");
            return (Criteria) this;
        }

        public Criteria andRephandlerNotBetween(String value1, String value2) {
            addCriterion("rephandler not between", value1, value2, "rephandler");
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

        public Criteria andReportaddrIsNull() {
            addCriterion("reportaddr is null");
            return (Criteria) this;
        }

        public Criteria andReportaddrIsNotNull() {
            addCriterion("reportaddr is not null");
            return (Criteria) this;
        }

        public Criteria andReportaddrEqualTo(String value) {
            addCriterion("reportaddr =", value, "reportaddr");
            return (Criteria) this;
        }

        public Criteria andReportaddrNotEqualTo(String value) {
            addCriterion("reportaddr <>", value, "reportaddr");
            return (Criteria) this;
        }

        public Criteria andReportaddrGreaterThan(String value) {
            addCriterion("reportaddr >", value, "reportaddr");
            return (Criteria) this;
        }

        public Criteria andReportaddrGreaterThanOrEqualTo(String value) {
            addCriterion("reportaddr >=", value, "reportaddr");
            return (Criteria) this;
        }

        public Criteria andReportaddrLessThan(String value) {
            addCriterion("reportaddr <", value, "reportaddr");
            return (Criteria) this;
        }

        public Criteria andReportaddrLessThanOrEqualTo(String value) {
            addCriterion("reportaddr <=", value, "reportaddr");
            return (Criteria) this;
        }

        public Criteria andReportaddrLike(String value) {
            addCriterion("reportaddr like", value, "reportaddr");
            return (Criteria) this;
        }

        public Criteria andReportaddrNotLike(String value) {
            addCriterion("reportaddr not like", value, "reportaddr");
            return (Criteria) this;
        }

        public Criteria andReportaddrIn(List<String> values) {
            addCriterion("reportaddr in", values, "reportaddr");
            return (Criteria) this;
        }

        public Criteria andReportaddrNotIn(List<String> values) {
            addCriterion("reportaddr not in", values, "reportaddr");
            return (Criteria) this;
        }

        public Criteria andReportaddrBetween(String value1, String value2) {
            addCriterion("reportaddr between", value1, value2, "reportaddr");
            return (Criteria) this;
        }

        public Criteria andReportaddrNotBetween(String value1, String value2) {
            addCriterion("reportaddr not between", value1, value2, "reportaddr");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
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