package cn.music.po;

import java.util.ArrayList;
import java.util.List;

public class AmountstatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmountstatusExample() {
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

        public Criteria andAmountstatusidIsNull() {
            addCriterion("amountStatusid is null");
            return (Criteria) this;
        }

        public Criteria andAmountstatusidIsNotNull() {
            addCriterion("amountStatusid is not null");
            return (Criteria) this;
        }

        public Criteria andAmountstatusidEqualTo(Integer value) {
            addCriterion("amountStatusid =", value, "amountstatusid");
            return (Criteria) this;
        }

        public Criteria andAmountstatusidNotEqualTo(Integer value) {
            addCriterion("amountStatusid <>", value, "amountstatusid");
            return (Criteria) this;
        }

        public Criteria andAmountstatusidGreaterThan(Integer value) {
            addCriterion("amountStatusid >", value, "amountstatusid");
            return (Criteria) this;
        }

        public Criteria andAmountstatusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("amountStatusid >=", value, "amountstatusid");
            return (Criteria) this;
        }

        public Criteria andAmountstatusidLessThan(Integer value) {
            addCriterion("amountStatusid <", value, "amountstatusid");
            return (Criteria) this;
        }

        public Criteria andAmountstatusidLessThanOrEqualTo(Integer value) {
            addCriterion("amountStatusid <=", value, "amountstatusid");
            return (Criteria) this;
        }

        public Criteria andAmountstatusidIn(List<Integer> values) {
            addCriterion("amountStatusid in", values, "amountstatusid");
            return (Criteria) this;
        }

        public Criteria andAmountstatusidNotIn(List<Integer> values) {
            addCriterion("amountStatusid not in", values, "amountstatusid");
            return (Criteria) this;
        }

        public Criteria andAmountstatusidBetween(Integer value1, Integer value2) {
            addCriterion("amountStatusid between", value1, value2, "amountstatusid");
            return (Criteria) this;
        }

        public Criteria andAmountstatusidNotBetween(Integer value1, Integer value2) {
            addCriterion("amountStatusid not between", value1, value2, "amountstatusid");
            return (Criteria) this;
        }

        public Criteria andAmountstatusvalueIsNull() {
            addCriterion("amountStatusvalue is null");
            return (Criteria) this;
        }

        public Criteria andAmountstatusvalueIsNotNull() {
            addCriterion("amountStatusvalue is not null");
            return (Criteria) this;
        }

        public Criteria andAmountstatusvalueEqualTo(String value) {
            addCriterion("amountStatusvalue =", value, "amountstatusvalue");
            return (Criteria) this;
        }

        public Criteria andAmountstatusvalueNotEqualTo(String value) {
            addCriterion("amountStatusvalue <>", value, "amountstatusvalue");
            return (Criteria) this;
        }

        public Criteria andAmountstatusvalueGreaterThan(String value) {
            addCriterion("amountStatusvalue >", value, "amountstatusvalue");
            return (Criteria) this;
        }

        public Criteria andAmountstatusvalueGreaterThanOrEqualTo(String value) {
            addCriterion("amountStatusvalue >=", value, "amountstatusvalue");
            return (Criteria) this;
        }

        public Criteria andAmountstatusvalueLessThan(String value) {
            addCriterion("amountStatusvalue <", value, "amountstatusvalue");
            return (Criteria) this;
        }

        public Criteria andAmountstatusvalueLessThanOrEqualTo(String value) {
            addCriterion("amountStatusvalue <=", value, "amountstatusvalue");
            return (Criteria) this;
        }

        public Criteria andAmountstatusvalueLike(String value) {
            addCriterion("amountStatusvalue like", value, "amountstatusvalue");
            return (Criteria) this;
        }

        public Criteria andAmountstatusvalueNotLike(String value) {
            addCriterion("amountStatusvalue not like", value, "amountstatusvalue");
            return (Criteria) this;
        }

        public Criteria andAmountstatusvalueIn(List<String> values) {
            addCriterion("amountStatusvalue in", values, "amountstatusvalue");
            return (Criteria) this;
        }

        public Criteria andAmountstatusvalueNotIn(List<String> values) {
            addCriterion("amountStatusvalue not in", values, "amountstatusvalue");
            return (Criteria) this;
        }

        public Criteria andAmountstatusvalueBetween(String value1, String value2) {
            addCriterion("amountStatusvalue between", value1, value2, "amountstatusvalue");
            return (Criteria) this;
        }

        public Criteria andAmountstatusvalueNotBetween(String value1, String value2) {
            addCriterion("amountStatusvalue not between", value1, value2, "amountstatusvalue");
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