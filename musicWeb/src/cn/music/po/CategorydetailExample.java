package cn.music.po;

import java.util.ArrayList;
import java.util.List;

public class CategorydetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategorydetailExample() {
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

        public Criteria andCategorydetailIdIsNull() {
            addCriterion("categorydetail_id is null");
            return (Criteria) this;
        }

        public Criteria andCategorydetailIdIsNotNull() {
            addCriterion("categorydetail_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategorydetailIdEqualTo(Integer value) {
            addCriterion("categorydetail_id =", value, "categorydetailId");
            return (Criteria) this;
        }

        public Criteria andCategorydetailIdNotEqualTo(Integer value) {
            addCriterion("categorydetail_id <>", value, "categorydetailId");
            return (Criteria) this;
        }

        public Criteria andCategorydetailIdGreaterThan(Integer value) {
            addCriterion("categorydetail_id >", value, "categorydetailId");
            return (Criteria) this;
        }

        public Criteria andCategorydetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("categorydetail_id >=", value, "categorydetailId");
            return (Criteria) this;
        }

        public Criteria andCategorydetailIdLessThan(Integer value) {
            addCriterion("categorydetail_id <", value, "categorydetailId");
            return (Criteria) this;
        }

        public Criteria andCategorydetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("categorydetail_id <=", value, "categorydetailId");
            return (Criteria) this;
        }

        public Criteria andCategorydetailIdIn(List<Integer> values) {
            addCriterion("categorydetail_id in", values, "categorydetailId");
            return (Criteria) this;
        }

        public Criteria andCategorydetailIdNotIn(List<Integer> values) {
            addCriterion("categorydetail_id not in", values, "categorydetailId");
            return (Criteria) this;
        }

        public Criteria andCategorydetailIdBetween(Integer value1, Integer value2) {
            addCriterion("categorydetail_id between", value1, value2, "categorydetailId");
            return (Criteria) this;
        }

        public Criteria andCategorydetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("categorydetail_id not between", value1, value2, "categorydetailId");
            return (Criteria) this;
        }

        public Criteria andCategorydetailvalueIsNull() {
            addCriterion("categorydetailvalue is null");
            return (Criteria) this;
        }

        public Criteria andCategorydetailvalueIsNotNull() {
            addCriterion("categorydetailvalue is not null");
            return (Criteria) this;
        }

        public Criteria andCategorydetailvalueEqualTo(String value) {
            addCriterion("categorydetailvalue =", value, "categorydetailvalue");
            return (Criteria) this;
        }

        public Criteria andCategorydetailvalueNotEqualTo(String value) {
            addCriterion("categorydetailvalue <>", value, "categorydetailvalue");
            return (Criteria) this;
        }

        public Criteria andCategorydetailvalueGreaterThan(String value) {
            addCriterion("categorydetailvalue >", value, "categorydetailvalue");
            return (Criteria) this;
        }

        public Criteria andCategorydetailvalueGreaterThanOrEqualTo(String value) {
            addCriterion("categorydetailvalue >=", value, "categorydetailvalue");
            return (Criteria) this;
        }

        public Criteria andCategorydetailvalueLessThan(String value) {
            addCriterion("categorydetailvalue <", value, "categorydetailvalue");
            return (Criteria) this;
        }

        public Criteria andCategorydetailvalueLessThanOrEqualTo(String value) {
            addCriterion("categorydetailvalue <=", value, "categorydetailvalue");
            return (Criteria) this;
        }

        public Criteria andCategorydetailvalueLike(String value) {
            addCriterion("categorydetailvalue like", value, "categorydetailvalue");
            return (Criteria) this;
        }

        public Criteria andCategorydetailvalueNotLike(String value) {
            addCriterion("categorydetailvalue not like", value, "categorydetailvalue");
            return (Criteria) this;
        }

        public Criteria andCategorydetailvalueIn(List<String> values) {
            addCriterion("categorydetailvalue in", values, "categorydetailvalue");
            return (Criteria) this;
        }

        public Criteria andCategorydetailvalueNotIn(List<String> values) {
            addCriterion("categorydetailvalue not in", values, "categorydetailvalue");
            return (Criteria) this;
        }

        public Criteria andCategorydetailvalueBetween(String value1, String value2) {
            addCriterion("categorydetailvalue between", value1, value2, "categorydetailvalue");
            return (Criteria) this;
        }

        public Criteria andCategorydetailvalueNotBetween(String value1, String value2) {
            addCriterion("categorydetailvalue not between", value1, value2, "categorydetailvalue");
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