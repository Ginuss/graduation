package com.client.eurekaclient.pojo;

import java.util.ArrayList;
import java.util.List;

public class SubjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectExample() {
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

        public Criteria andSubnameIsNull() {
            addCriterion("subname is null");
            return (Criteria) this;
        }

        public Criteria andSubnameIsNotNull() {
            addCriterion("subname is not null");
            return (Criteria) this;
        }

        public Criteria andSubnameEqualTo(String value) {
            addCriterion("subname =", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameNotEqualTo(String value) {
            addCriterion("subname <>", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameGreaterThan(String value) {
            addCriterion("subname >", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameGreaterThanOrEqualTo(String value) {
            addCriterion("subname >=", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameLessThan(String value) {
            addCriterion("subname <", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameLessThanOrEqualTo(String value) {
            addCriterion("subname <=", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameLike(String value) {
            addCriterion("subname like", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameNotLike(String value) {
            addCriterion("subname not like", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameIn(List<String> values) {
            addCriterion("subname in", values, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameNotIn(List<String> values) {
            addCriterion("subname not in", values, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameBetween(String value1, String value2) {
            addCriterion("subname between", value1, value2, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameNotBetween(String value1, String value2) {
            addCriterion("subname not between", value1, value2, "subname");
            return (Criteria) this;
        }

        public Criteria andSubvalueIsNull() {
            addCriterion("subvalue is null");
            return (Criteria) this;
        }

        public Criteria andSubvalueIsNotNull() {
            addCriterion("subvalue is not null");
            return (Criteria) this;
        }

        public Criteria andSubvalueEqualTo(String value) {
            addCriterion("subvalue =", value, "subvalue");
            return (Criteria) this;
        }

        public Criteria andSubvalueNotEqualTo(String value) {
            addCriterion("subvalue <>", value, "subvalue");
            return (Criteria) this;
        }

        public Criteria andSubvalueGreaterThan(String value) {
            addCriterion("subvalue >", value, "subvalue");
            return (Criteria) this;
        }

        public Criteria andSubvalueGreaterThanOrEqualTo(String value) {
            addCriterion("subvalue >=", value, "subvalue");
            return (Criteria) this;
        }

        public Criteria andSubvalueLessThan(String value) {
            addCriterion("subvalue <", value, "subvalue");
            return (Criteria) this;
        }

        public Criteria andSubvalueLessThanOrEqualTo(String value) {
            addCriterion("subvalue <=", value, "subvalue");
            return (Criteria) this;
        }

        public Criteria andSubvalueLike(String value) {
            addCriterion("subvalue like", value, "subvalue");
            return (Criteria) this;
        }

        public Criteria andSubvalueNotLike(String value) {
            addCriterion("subvalue not like", value, "subvalue");
            return (Criteria) this;
        }

        public Criteria andSubvalueIn(List<String> values) {
            addCriterion("subvalue in", values, "subvalue");
            return (Criteria) this;
        }

        public Criteria andSubvalueNotIn(List<String> values) {
            addCriterion("subvalue not in", values, "subvalue");
            return (Criteria) this;
        }

        public Criteria andSubvalueBetween(String value1, String value2) {
            addCriterion("subvalue between", value1, value2, "subvalue");
            return (Criteria) this;
        }

        public Criteria andSubvalueNotBetween(String value1, String value2) {
            addCriterion("subvalue not between", value1, value2, "subvalue");
            return (Criteria) this;
        }

        public Criteria andSubtypeIsNull() {
            addCriterion("subtype is null");
            return (Criteria) this;
        }

        public Criteria andSubtypeIsNotNull() {
            addCriterion("subtype is not null");
            return (Criteria) this;
        }

        public Criteria andSubtypeEqualTo(String value) {
            addCriterion("subtype =", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeNotEqualTo(String value) {
            addCriterion("subtype <>", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeGreaterThan(String value) {
            addCriterion("subtype >", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeGreaterThanOrEqualTo(String value) {
            addCriterion("subtype >=", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeLessThan(String value) {
            addCriterion("subtype <", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeLessThanOrEqualTo(String value) {
            addCriterion("subtype <=", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeLike(String value) {
            addCriterion("subtype like", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeNotLike(String value) {
            addCriterion("subtype not like", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeIn(List<String> values) {
            addCriterion("subtype in", values, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeNotIn(List<String> values) {
            addCriterion("subtype not in", values, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeBetween(String value1, String value2) {
            addCriterion("subtype between", value1, value2, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeNotBetween(String value1, String value2) {
            addCriterion("subtype not between", value1, value2, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubauthIsNull() {
            addCriterion("subauth is null");
            return (Criteria) this;
        }

        public Criteria andSubauthIsNotNull() {
            addCriterion("subauth is not null");
            return (Criteria) this;
        }

        public Criteria andSubauthEqualTo(String value) {
            addCriterion("subauth =", value, "subauth");
            return (Criteria) this;
        }

        public Criteria andSubauthNotEqualTo(String value) {
            addCriterion("subauth <>", value, "subauth");
            return (Criteria) this;
        }

        public Criteria andSubauthGreaterThan(String value) {
            addCriterion("subauth >", value, "subauth");
            return (Criteria) this;
        }

        public Criteria andSubauthGreaterThanOrEqualTo(String value) {
            addCriterion("subauth >=", value, "subauth");
            return (Criteria) this;
        }

        public Criteria andSubauthLessThan(String value) {
            addCriterion("subauth <", value, "subauth");
            return (Criteria) this;
        }

        public Criteria andSubauthLessThanOrEqualTo(String value) {
            addCriterion("subauth <=", value, "subauth");
            return (Criteria) this;
        }

        public Criteria andSubauthLike(String value) {
            addCriterion("subauth like", value, "subauth");
            return (Criteria) this;
        }

        public Criteria andSubauthNotLike(String value) {
            addCriterion("subauth not like", value, "subauth");
            return (Criteria) this;
        }

        public Criteria andSubauthIn(List<String> values) {
            addCriterion("subauth in", values, "subauth");
            return (Criteria) this;
        }

        public Criteria andSubauthNotIn(List<String> values) {
            addCriterion("subauth not in", values, "subauth");
            return (Criteria) this;
        }

        public Criteria andSubauthBetween(String value1, String value2) {
            addCriterion("subauth between", value1, value2, "subauth");
            return (Criteria) this;
        }

        public Criteria andSubauthNotBetween(String value1, String value2) {
            addCriterion("subauth not between", value1, value2, "subauth");
            return (Criteria) this;
        }

        public Criteria andSubhandlerIsNull() {
            addCriterion("subhandler is null");
            return (Criteria) this;
        }

        public Criteria andSubhandlerIsNotNull() {
            addCriterion("subhandler is not null");
            return (Criteria) this;
        }

        public Criteria andSubhandlerEqualTo(String value) {
            addCriterion("subhandler =", value, "subhandler");
            return (Criteria) this;
        }

        public Criteria andSubhandlerNotEqualTo(String value) {
            addCriterion("subhandler <>", value, "subhandler");
            return (Criteria) this;
        }

        public Criteria andSubhandlerGreaterThan(String value) {
            addCriterion("subhandler >", value, "subhandler");
            return (Criteria) this;
        }

        public Criteria andSubhandlerGreaterThanOrEqualTo(String value) {
            addCriterion("subhandler >=", value, "subhandler");
            return (Criteria) this;
        }

        public Criteria andSubhandlerLessThan(String value) {
            addCriterion("subhandler <", value, "subhandler");
            return (Criteria) this;
        }

        public Criteria andSubhandlerLessThanOrEqualTo(String value) {
            addCriterion("subhandler <=", value, "subhandler");
            return (Criteria) this;
        }

        public Criteria andSubhandlerLike(String value) {
            addCriterion("subhandler like", value, "subhandler");
            return (Criteria) this;
        }

        public Criteria andSubhandlerNotLike(String value) {
            addCriterion("subhandler not like", value, "subhandler");
            return (Criteria) this;
        }

        public Criteria andSubhandlerIn(List<String> values) {
            addCriterion("subhandler in", values, "subhandler");
            return (Criteria) this;
        }

        public Criteria andSubhandlerNotIn(List<String> values) {
            addCriterion("subhandler not in", values, "subhandler");
            return (Criteria) this;
        }

        public Criteria andSubhandlerBetween(String value1, String value2) {
            addCriterion("subhandler between", value1, value2, "subhandler");
            return (Criteria) this;
        }

        public Criteria andSubhandlerNotBetween(String value1, String value2) {
            addCriterion("subhandler not between", value1, value2, "subhandler");
            return (Criteria) this;
        }

        public Criteria andSubrecordidIsNull() {
            addCriterion("subrecordid is null");
            return (Criteria) this;
        }

        public Criteria andSubrecordidIsNotNull() {
            addCriterion("subrecordid is not null");
            return (Criteria) this;
        }

        public Criteria andSubrecordidEqualTo(String value) {
            addCriterion("subrecordid =", value, "subrecordid");
            return (Criteria) this;
        }

        public Criteria andSubrecordidNotEqualTo(String value) {
            addCriterion("subrecordid <>", value, "subrecordid");
            return (Criteria) this;
        }

        public Criteria andSubrecordidGreaterThan(String value) {
            addCriterion("subrecordid >", value, "subrecordid");
            return (Criteria) this;
        }

        public Criteria andSubrecordidGreaterThanOrEqualTo(String value) {
            addCriterion("subrecordid >=", value, "subrecordid");
            return (Criteria) this;
        }

        public Criteria andSubrecordidLessThan(String value) {
            addCriterion("subrecordid <", value, "subrecordid");
            return (Criteria) this;
        }

        public Criteria andSubrecordidLessThanOrEqualTo(String value) {
            addCriterion("subrecordid <=", value, "subrecordid");
            return (Criteria) this;
        }

        public Criteria andSubrecordidLike(String value) {
            addCriterion("subrecordid like", value, "subrecordid");
            return (Criteria) this;
        }

        public Criteria andSubrecordidNotLike(String value) {
            addCriterion("subrecordid not like", value, "subrecordid");
            return (Criteria) this;
        }

        public Criteria andSubrecordidIn(List<String> values) {
            addCriterion("subrecordid in", values, "subrecordid");
            return (Criteria) this;
        }

        public Criteria andSubrecordidNotIn(List<String> values) {
            addCriterion("subrecordid not in", values, "subrecordid");
            return (Criteria) this;
        }

        public Criteria andSubrecordidBetween(String value1, String value2) {
            addCriterion("subrecordid between", value1, value2, "subrecordid");
            return (Criteria) this;
        }

        public Criteria andSubrecordidNotBetween(String value1, String value2) {
            addCriterion("subrecordid not between", value1, value2, "subrecordid");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andSubcreatetimeIsNull() {
            addCriterion("subcreatetime is null");
            return (Criteria) this;
        }

        public Criteria andSubcreatetimeIsNotNull() {
            addCriterion("subcreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andSubcreatetimeEqualTo(String value) {
            addCriterion("subcreatetime =", value, "subcreatetime");
            return (Criteria) this;
        }

        public Criteria andSubcreatetimeNotEqualTo(String value) {
            addCriterion("subcreatetime <>", value, "subcreatetime");
            return (Criteria) this;
        }

        public Criteria andSubcreatetimeGreaterThan(String value) {
            addCriterion("subcreatetime >", value, "subcreatetime");
            return (Criteria) this;
        }

        public Criteria andSubcreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("subcreatetime >=", value, "subcreatetime");
            return (Criteria) this;
        }

        public Criteria andSubcreatetimeLessThan(String value) {
            addCriterion("subcreatetime <", value, "subcreatetime");
            return (Criteria) this;
        }

        public Criteria andSubcreatetimeLessThanOrEqualTo(String value) {
            addCriterion("subcreatetime <=", value, "subcreatetime");
            return (Criteria) this;
        }

        public Criteria andSubcreatetimeLike(String value) {
            addCriterion("subcreatetime like", value, "subcreatetime");
            return (Criteria) this;
        }

        public Criteria andSubcreatetimeNotLike(String value) {
            addCriterion("subcreatetime not like", value, "subcreatetime");
            return (Criteria) this;
        }

        public Criteria andSubcreatetimeIn(List<String> values) {
            addCriterion("subcreatetime in", values, "subcreatetime");
            return (Criteria) this;
        }

        public Criteria andSubcreatetimeNotIn(List<String> values) {
            addCriterion("subcreatetime not in", values, "subcreatetime");
            return (Criteria) this;
        }

        public Criteria andSubcreatetimeBetween(String value1, String value2) {
            addCriterion("subcreatetime between", value1, value2, "subcreatetime");
            return (Criteria) this;
        }

        public Criteria andSubcreatetimeNotBetween(String value1, String value2) {
            addCriterion("subcreatetime not between", value1, value2, "subcreatetime");
            return (Criteria) this;
        }

        public Criteria andSubedittimeIsNull() {
            addCriterion("subedittime is null");
            return (Criteria) this;
        }

        public Criteria andSubedittimeIsNotNull() {
            addCriterion("subedittime is not null");
            return (Criteria) this;
        }

        public Criteria andSubedittimeEqualTo(String value) {
            addCriterion("subedittime =", value, "subedittime");
            return (Criteria) this;
        }

        public Criteria andSubedittimeNotEqualTo(String value) {
            addCriterion("subedittime <>", value, "subedittime");
            return (Criteria) this;
        }

        public Criteria andSubedittimeGreaterThan(String value) {
            addCriterion("subedittime >", value, "subedittime");
            return (Criteria) this;
        }

        public Criteria andSubedittimeGreaterThanOrEqualTo(String value) {
            addCriterion("subedittime >=", value, "subedittime");
            return (Criteria) this;
        }

        public Criteria andSubedittimeLessThan(String value) {
            addCriterion("subedittime <", value, "subedittime");
            return (Criteria) this;
        }

        public Criteria andSubedittimeLessThanOrEqualTo(String value) {
            addCriterion("subedittime <=", value, "subedittime");
            return (Criteria) this;
        }

        public Criteria andSubedittimeLike(String value) {
            addCriterion("subedittime like", value, "subedittime");
            return (Criteria) this;
        }

        public Criteria andSubedittimeNotLike(String value) {
            addCriterion("subedittime not like", value, "subedittime");
            return (Criteria) this;
        }

        public Criteria andSubedittimeIn(List<String> values) {
            addCriterion("subedittime in", values, "subedittime");
            return (Criteria) this;
        }

        public Criteria andSubedittimeNotIn(List<String> values) {
            addCriterion("subedittime not in", values, "subedittime");
            return (Criteria) this;
        }

        public Criteria andSubedittimeBetween(String value1, String value2) {
            addCriterion("subedittime between", value1, value2, "subedittime");
            return (Criteria) this;
        }

        public Criteria andSubedittimeNotBetween(String value1, String value2) {
            addCriterion("subedittime not between", value1, value2, "subedittime");
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

        public Criteria andSubjectaddIsNull() {
            addCriterion("subjectadd is null");
            return (Criteria) this;
        }

        public Criteria andSubjectaddIsNotNull() {
            addCriterion("subjectadd is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectaddEqualTo(String value) {
            addCriterion("subjectadd =", value, "subjectadd");
            return (Criteria) this;
        }

        public Criteria andSubjectaddNotEqualTo(String value) {
            addCriterion("subjectadd <>", value, "subjectadd");
            return (Criteria) this;
        }

        public Criteria andSubjectaddGreaterThan(String value) {
            addCriterion("subjectadd >", value, "subjectadd");
            return (Criteria) this;
        }

        public Criteria andSubjectaddGreaterThanOrEqualTo(String value) {
            addCriterion("subjectadd >=", value, "subjectadd");
            return (Criteria) this;
        }

        public Criteria andSubjectaddLessThan(String value) {
            addCriterion("subjectadd <", value, "subjectadd");
            return (Criteria) this;
        }

        public Criteria andSubjectaddLessThanOrEqualTo(String value) {
            addCriterion("subjectadd <=", value, "subjectadd");
            return (Criteria) this;
        }

        public Criteria andSubjectaddLike(String value) {
            addCriterion("subjectadd like", value, "subjectadd");
            return (Criteria) this;
        }

        public Criteria andSubjectaddNotLike(String value) {
            addCriterion("subjectadd not like", value, "subjectadd");
            return (Criteria) this;
        }

        public Criteria andSubjectaddIn(List<String> values) {
            addCriterion("subjectadd in", values, "subjectadd");
            return (Criteria) this;
        }

        public Criteria andSubjectaddNotIn(List<String> values) {
            addCriterion("subjectadd not in", values, "subjectadd");
            return (Criteria) this;
        }

        public Criteria andSubjectaddBetween(String value1, String value2) {
            addCriterion("subjectadd between", value1, value2, "subjectadd");
            return (Criteria) this;
        }

        public Criteria andSubjectaddNotBetween(String value1, String value2) {
            addCriterion("subjectadd not between", value1, value2, "subjectadd");
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