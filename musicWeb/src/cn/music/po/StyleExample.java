package cn.music.po;

import java.util.ArrayList;
import java.util.List;

public class StyleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StyleExample() {
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

        public Criteria andStyleidIsNull() {
            addCriterion("styleid is null");
            return (Criteria) this;
        }

        public Criteria andStyleidIsNotNull() {
            addCriterion("styleid is not null");
            return (Criteria) this;
        }

        public Criteria andStyleidEqualTo(Integer value) {
            addCriterion("styleid =", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotEqualTo(Integer value) {
            addCriterion("styleid <>", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidGreaterThan(Integer value) {
            addCriterion("styleid >", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("styleid >=", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidLessThan(Integer value) {
            addCriterion("styleid <", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidLessThanOrEqualTo(Integer value) {
            addCriterion("styleid <=", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidIn(List<Integer> values) {
            addCriterion("styleid in", values, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotIn(List<Integer> values) {
            addCriterion("styleid not in", values, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidBetween(Integer value1, Integer value2) {
            addCriterion("styleid between", value1, value2, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotBetween(Integer value1, Integer value2) {
            addCriterion("styleid not between", value1, value2, "styleid");
            return (Criteria) this;
        }

        public Criteria andStylevalueIsNull() {
            addCriterion("stylevalue is null");
            return (Criteria) this;
        }

        public Criteria andStylevalueIsNotNull() {
            addCriterion("stylevalue is not null");
            return (Criteria) this;
        }

        public Criteria andStylevalueEqualTo(String value) {
            addCriterion("stylevalue =", value, "stylevalue");
            return (Criteria) this;
        }

        public Criteria andStylevalueNotEqualTo(String value) {
            addCriterion("stylevalue <>", value, "stylevalue");
            return (Criteria) this;
        }

        public Criteria andStylevalueGreaterThan(String value) {
            addCriterion("stylevalue >", value, "stylevalue");
            return (Criteria) this;
        }

        public Criteria andStylevalueGreaterThanOrEqualTo(String value) {
            addCriterion("stylevalue >=", value, "stylevalue");
            return (Criteria) this;
        }

        public Criteria andStylevalueLessThan(String value) {
            addCriterion("stylevalue <", value, "stylevalue");
            return (Criteria) this;
        }

        public Criteria andStylevalueLessThanOrEqualTo(String value) {
            addCriterion("stylevalue <=", value, "stylevalue");
            return (Criteria) this;
        }

        public Criteria andStylevalueLike(String value) {
            addCriterion("stylevalue like", value, "stylevalue");
            return (Criteria) this;
        }

        public Criteria andStylevalueNotLike(String value) {
            addCriterion("stylevalue not like", value, "stylevalue");
            return (Criteria) this;
        }

        public Criteria andStylevalueIn(List<String> values) {
            addCriterion("stylevalue in", values, "stylevalue");
            return (Criteria) this;
        }

        public Criteria andStylevalueNotIn(List<String> values) {
            addCriterion("stylevalue not in", values, "stylevalue");
            return (Criteria) this;
        }

        public Criteria andStylevalueBetween(String value1, String value2) {
            addCriterion("stylevalue between", value1, value2, "stylevalue");
            return (Criteria) this;
        }

        public Criteria andStylevalueNotBetween(String value1, String value2) {
            addCriterion("stylevalue not between", value1, value2, "stylevalue");
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