package cn.music.po;

import java.util.ArrayList;
import java.util.List;

public class CatogeryOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CatogeryOExample() {
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

        public Criteria andCategoryidIsNull() {
            addCriterion("categoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Integer value) {
            addCriterion("categoryId =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Integer value) {
            addCriterion("categoryId <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Integer value) {
            addCriterion("categoryId >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("categoryId >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Integer value) {
            addCriterion("categoryId <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("categoryId <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Integer> values) {
            addCriterion("categoryId in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Integer> values) {
            addCriterion("categoryId not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("categoryId between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("categoryId not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andOriginalsingerIsNull() {
            addCriterion("originalSinger is null");
            return (Criteria) this;
        }

        public Criteria andOriginalsingerIsNotNull() {
            addCriterion("originalSinger is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalsingerEqualTo(String value) {
            addCriterion("originalSinger =", value, "originalsinger");
            return (Criteria) this;
        }

        public Criteria andOriginalsingerNotEqualTo(String value) {
            addCriterion("originalSinger <>", value, "originalsinger");
            return (Criteria) this;
        }

        public Criteria andOriginalsingerGreaterThan(String value) {
            addCriterion("originalSinger >", value, "originalsinger");
            return (Criteria) this;
        }

        public Criteria andOriginalsingerGreaterThanOrEqualTo(String value) {
            addCriterion("originalSinger >=", value, "originalsinger");
            return (Criteria) this;
        }

        public Criteria andOriginalsingerLessThan(String value) {
            addCriterion("originalSinger <", value, "originalsinger");
            return (Criteria) this;
        }

        public Criteria andOriginalsingerLessThanOrEqualTo(String value) {
            addCriterion("originalSinger <=", value, "originalsinger");
            return (Criteria) this;
        }

        public Criteria andOriginalsingerLike(String value) {
            addCriterion("originalSinger like", value, "originalsinger");
            return (Criteria) this;
        }

        public Criteria andOriginalsingerNotLike(String value) {
            addCriterion("originalSinger not like", value, "originalsinger");
            return (Criteria) this;
        }

        public Criteria andOriginalsingerIn(List<String> values) {
            addCriterion("originalSinger in", values, "originalsinger");
            return (Criteria) this;
        }

        public Criteria andOriginalsingerNotIn(List<String> values) {
            addCriterion("originalSinger not in", values, "originalsinger");
            return (Criteria) this;
        }

        public Criteria andOriginalsingerBetween(String value1, String value2) {
            addCriterion("originalSinger between", value1, value2, "originalsinger");
            return (Criteria) this;
        }

        public Criteria andOriginalsingerNotBetween(String value1, String value2) {
            addCriterion("originalSinger not between", value1, value2, "originalsinger");
            return (Criteria) this;
        }

        public Criteria andWritelyricIsNull() {
            addCriterion("writeLyric is null");
            return (Criteria) this;
        }

        public Criteria andWritelyricIsNotNull() {
            addCriterion("writeLyric is not null");
            return (Criteria) this;
        }

        public Criteria andWritelyricEqualTo(String value) {
            addCriterion("writeLyric =", value, "writelyric");
            return (Criteria) this;
        }

        public Criteria andWritelyricNotEqualTo(String value) {
            addCriterion("writeLyric <>", value, "writelyric");
            return (Criteria) this;
        }

        public Criteria andWritelyricGreaterThan(String value) {
            addCriterion("writeLyric >", value, "writelyric");
            return (Criteria) this;
        }

        public Criteria andWritelyricGreaterThanOrEqualTo(String value) {
            addCriterion("writeLyric >=", value, "writelyric");
            return (Criteria) this;
        }

        public Criteria andWritelyricLessThan(String value) {
            addCriterion("writeLyric <", value, "writelyric");
            return (Criteria) this;
        }

        public Criteria andWritelyricLessThanOrEqualTo(String value) {
            addCriterion("writeLyric <=", value, "writelyric");
            return (Criteria) this;
        }

        public Criteria andWritelyricLike(String value) {
            addCriterion("writeLyric like", value, "writelyric");
            return (Criteria) this;
        }

        public Criteria andWritelyricNotLike(String value) {
            addCriterion("writeLyric not like", value, "writelyric");
            return (Criteria) this;
        }

        public Criteria andWritelyricIn(List<String> values) {
            addCriterion("writeLyric in", values, "writelyric");
            return (Criteria) this;
        }

        public Criteria andWritelyricNotIn(List<String> values) {
            addCriterion("writeLyric not in", values, "writelyric");
            return (Criteria) this;
        }

        public Criteria andWritelyricBetween(String value1, String value2) {
            addCriterion("writeLyric between", value1, value2, "writelyric");
            return (Criteria) this;
        }

        public Criteria andWritelyricNotBetween(String value1, String value2) {
            addCriterion("writeLyric not between", value1, value2, "writelyric");
            return (Criteria) this;
        }

        public Criteria andComposeIsNull() {
            addCriterion("compose is null");
            return (Criteria) this;
        }

        public Criteria andComposeIsNotNull() {
            addCriterion("compose is not null");
            return (Criteria) this;
        }

        public Criteria andComposeEqualTo(String value) {
            addCriterion("compose =", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeNotEqualTo(String value) {
            addCriterion("compose <>", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeGreaterThan(String value) {
            addCriterion("compose >", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeGreaterThanOrEqualTo(String value) {
            addCriterion("compose >=", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeLessThan(String value) {
            addCriterion("compose <", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeLessThanOrEqualTo(String value) {
            addCriterion("compose <=", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeLike(String value) {
            addCriterion("compose like", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeNotLike(String value) {
            addCriterion("compose not like", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeIn(List<String> values) {
            addCriterion("compose in", values, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeNotIn(List<String> values) {
            addCriterion("compose not in", values, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeBetween(String value1, String value2) {
            addCriterion("compose between", value1, value2, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeNotBetween(String value1, String value2) {
            addCriterion("compose not between", value1, value2, "compose");
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