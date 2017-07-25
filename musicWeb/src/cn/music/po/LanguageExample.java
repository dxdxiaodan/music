package cn.music.po;

import java.util.ArrayList;
import java.util.List;

public class LanguageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LanguageExample() {
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

        public Criteria andLanguageidIsNull() {
            addCriterion("languageid is null");
            return (Criteria) this;
        }

        public Criteria andLanguageidIsNotNull() {
            addCriterion("languageid is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageidEqualTo(Integer value) {
            addCriterion("languageid =", value, "languageid");
            return (Criteria) this;
        }

        public Criteria andLanguageidNotEqualTo(Integer value) {
            addCriterion("languageid <>", value, "languageid");
            return (Criteria) this;
        }

        public Criteria andLanguageidGreaterThan(Integer value) {
            addCriterion("languageid >", value, "languageid");
            return (Criteria) this;
        }

        public Criteria andLanguageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("languageid >=", value, "languageid");
            return (Criteria) this;
        }

        public Criteria andLanguageidLessThan(Integer value) {
            addCriterion("languageid <", value, "languageid");
            return (Criteria) this;
        }

        public Criteria andLanguageidLessThanOrEqualTo(Integer value) {
            addCriterion("languageid <=", value, "languageid");
            return (Criteria) this;
        }

        public Criteria andLanguageidIn(List<Integer> values) {
            addCriterion("languageid in", values, "languageid");
            return (Criteria) this;
        }

        public Criteria andLanguageidNotIn(List<Integer> values) {
            addCriterion("languageid not in", values, "languageid");
            return (Criteria) this;
        }

        public Criteria andLanguageidBetween(Integer value1, Integer value2) {
            addCriterion("languageid between", value1, value2, "languageid");
            return (Criteria) this;
        }

        public Criteria andLanguageidNotBetween(Integer value1, Integer value2) {
            addCriterion("languageid not between", value1, value2, "languageid");
            return (Criteria) this;
        }

        public Criteria andLanguagevalueIsNull() {
            addCriterion("languagevalue is null");
            return (Criteria) this;
        }

        public Criteria andLanguagevalueIsNotNull() {
            addCriterion("languagevalue is not null");
            return (Criteria) this;
        }

        public Criteria andLanguagevalueEqualTo(String value) {
            addCriterion("languagevalue =", value, "languagevalue");
            return (Criteria) this;
        }

        public Criteria andLanguagevalueNotEqualTo(String value) {
            addCriterion("languagevalue <>", value, "languagevalue");
            return (Criteria) this;
        }

        public Criteria andLanguagevalueGreaterThan(String value) {
            addCriterion("languagevalue >", value, "languagevalue");
            return (Criteria) this;
        }

        public Criteria andLanguagevalueGreaterThanOrEqualTo(String value) {
            addCriterion("languagevalue >=", value, "languagevalue");
            return (Criteria) this;
        }

        public Criteria andLanguagevalueLessThan(String value) {
            addCriterion("languagevalue <", value, "languagevalue");
            return (Criteria) this;
        }

        public Criteria andLanguagevalueLessThanOrEqualTo(String value) {
            addCriterion("languagevalue <=", value, "languagevalue");
            return (Criteria) this;
        }

        public Criteria andLanguagevalueLike(String value) {
            addCriterion("languagevalue like", value, "languagevalue");
            return (Criteria) this;
        }

        public Criteria andLanguagevalueNotLike(String value) {
            addCriterion("languagevalue not like", value, "languagevalue");
            return (Criteria) this;
        }

        public Criteria andLanguagevalueIn(List<String> values) {
            addCriterion("languagevalue in", values, "languagevalue");
            return (Criteria) this;
        }

        public Criteria andLanguagevalueNotIn(List<String> values) {
            addCriterion("languagevalue not in", values, "languagevalue");
            return (Criteria) this;
        }

        public Criteria andLanguagevalueBetween(String value1, String value2) {
            addCriterion("languagevalue between", value1, value2, "languagevalue");
            return (Criteria) this;
        }

        public Criteria andLanguagevalueNotBetween(String value1, String value2) {
            addCriterion("languagevalue not between", value1, value2, "languagevalue");
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