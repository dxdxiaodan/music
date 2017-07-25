package cn.music.po;

import java.util.ArrayList;
import java.util.List;

public class CheckstatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckstatusExample() {
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

        public Criteria andCheckstatusidIsNull() {
            addCriterion("checkStatusid is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusidIsNotNull() {
            addCriterion("checkStatusid is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusidEqualTo(Integer value) {
            addCriterion("checkStatusid =", value, "checkstatusid");
            return (Criteria) this;
        }

        public Criteria andCheckstatusidNotEqualTo(Integer value) {
            addCriterion("checkStatusid <>", value, "checkstatusid");
            return (Criteria) this;
        }

        public Criteria andCheckstatusidGreaterThan(Integer value) {
            addCriterion("checkStatusid >", value, "checkstatusid");
            return (Criteria) this;
        }

        public Criteria andCheckstatusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkStatusid >=", value, "checkstatusid");
            return (Criteria) this;
        }

        public Criteria andCheckstatusidLessThan(Integer value) {
            addCriterion("checkStatusid <", value, "checkstatusid");
            return (Criteria) this;
        }

        public Criteria andCheckstatusidLessThanOrEqualTo(Integer value) {
            addCriterion("checkStatusid <=", value, "checkstatusid");
            return (Criteria) this;
        }

        public Criteria andCheckstatusidIn(List<Integer> values) {
            addCriterion("checkStatusid in", values, "checkstatusid");
            return (Criteria) this;
        }

        public Criteria andCheckstatusidNotIn(List<Integer> values) {
            addCriterion("checkStatusid not in", values, "checkstatusid");
            return (Criteria) this;
        }

        public Criteria andCheckstatusidBetween(Integer value1, Integer value2) {
            addCriterion("checkStatusid between", value1, value2, "checkstatusid");
            return (Criteria) this;
        }

        public Criteria andCheckstatusidNotBetween(Integer value1, Integer value2) {
            addCriterion("checkStatusid not between", value1, value2, "checkstatusid");
            return (Criteria) this;
        }

        public Criteria andCheckstatusvalueIsNull() {
            addCriterion("checkStatusvalue is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusvalueIsNotNull() {
            addCriterion("checkStatusvalue is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusvalueEqualTo(String value) {
            addCriterion("checkStatusvalue =", value, "checkstatusvalue");
            return (Criteria) this;
        }

        public Criteria andCheckstatusvalueNotEqualTo(String value) {
            addCriterion("checkStatusvalue <>", value, "checkstatusvalue");
            return (Criteria) this;
        }

        public Criteria andCheckstatusvalueGreaterThan(String value) {
            addCriterion("checkStatusvalue >", value, "checkstatusvalue");
            return (Criteria) this;
        }

        public Criteria andCheckstatusvalueGreaterThanOrEqualTo(String value) {
            addCriterion("checkStatusvalue >=", value, "checkstatusvalue");
            return (Criteria) this;
        }

        public Criteria andCheckstatusvalueLessThan(String value) {
            addCriterion("checkStatusvalue <", value, "checkstatusvalue");
            return (Criteria) this;
        }

        public Criteria andCheckstatusvalueLessThanOrEqualTo(String value) {
            addCriterion("checkStatusvalue <=", value, "checkstatusvalue");
            return (Criteria) this;
        }

        public Criteria andCheckstatusvalueLike(String value) {
            addCriterion("checkStatusvalue like", value, "checkstatusvalue");
            return (Criteria) this;
        }

        public Criteria andCheckstatusvalueNotLike(String value) {
            addCriterion("checkStatusvalue not like", value, "checkstatusvalue");
            return (Criteria) this;
        }

        public Criteria andCheckstatusvalueIn(List<String> values) {
            addCriterion("checkStatusvalue in", values, "checkstatusvalue");
            return (Criteria) this;
        }

        public Criteria andCheckstatusvalueNotIn(List<String> values) {
            addCriterion("checkStatusvalue not in", values, "checkstatusvalue");
            return (Criteria) this;
        }

        public Criteria andCheckstatusvalueBetween(String value1, String value2) {
            addCriterion("checkStatusvalue between", value1, value2, "checkstatusvalue");
            return (Criteria) this;
        }

        public Criteria andCheckstatusvalueNotBetween(String value1, String value2) {
            addCriterion("checkStatusvalue not between", value1, value2, "checkstatusvalue");
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