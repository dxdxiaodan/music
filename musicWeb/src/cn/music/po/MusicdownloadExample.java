package cn.music.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MusicdownloadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MusicdownloadExample() {
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

        public Criteria andDownloadidIsNull() {
            addCriterion("downloadId is null");
            return (Criteria) this;
        }

        public Criteria andDownloadidIsNotNull() {
            addCriterion("downloadId is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadidEqualTo(Integer value) {
            addCriterion("downloadId =", value, "downloadid");
            return (Criteria) this;
        }

        public Criteria andDownloadidNotEqualTo(Integer value) {
            addCriterion("downloadId <>", value, "downloadid");
            return (Criteria) this;
        }

        public Criteria andDownloadidGreaterThan(Integer value) {
            addCriterion("downloadId >", value, "downloadid");
            return (Criteria) this;
        }

        public Criteria andDownloadidGreaterThanOrEqualTo(Integer value) {
            addCriterion("downloadId >=", value, "downloadid");
            return (Criteria) this;
        }

        public Criteria andDownloadidLessThan(Integer value) {
            addCriterion("downloadId <", value, "downloadid");
            return (Criteria) this;
        }

        public Criteria andDownloadidLessThanOrEqualTo(Integer value) {
            addCriterion("downloadId <=", value, "downloadid");
            return (Criteria) this;
        }

        public Criteria andDownloadidIn(List<Integer> values) {
            addCriterion("downloadId in", values, "downloadid");
            return (Criteria) this;
        }

        public Criteria andDownloadidNotIn(List<Integer> values) {
            addCriterion("downloadId not in", values, "downloadid");
            return (Criteria) this;
        }

        public Criteria andDownloadidBetween(Integer value1, Integer value2) {
            addCriterion("downloadId between", value1, value2, "downloadid");
            return (Criteria) this;
        }

        public Criteria andDownloadidNotBetween(Integer value1, Integer value2) {
            addCriterion("downloadId not between", value1, value2, "downloadid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andMusicidIsNull() {
            addCriterion("musicId is null");
            return (Criteria) this;
        }

        public Criteria andMusicidIsNotNull() {
            addCriterion("musicId is not null");
            return (Criteria) this;
        }

        public Criteria andMusicidEqualTo(Integer value) {
            addCriterion("musicId =", value, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidNotEqualTo(Integer value) {
            addCriterion("musicId <>", value, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidGreaterThan(Integer value) {
            addCriterion("musicId >", value, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("musicId >=", value, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidLessThan(Integer value) {
            addCriterion("musicId <", value, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidLessThanOrEqualTo(Integer value) {
            addCriterion("musicId <=", value, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidIn(List<Integer> values) {
            addCriterion("musicId in", values, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidNotIn(List<Integer> values) {
            addCriterion("musicId not in", values, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidBetween(Integer value1, Integer value2) {
            addCriterion("musicId between", value1, value2, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidNotBetween(Integer value1, Integer value2) {
            addCriterion("musicId not between", value1, value2, "musicid");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeIsNull() {
            addCriterion("downloadTime is null");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeIsNotNull() {
            addCriterion("downloadTime is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeEqualTo(Date value) {
            addCriterion("downloadTime =", value, "downloadtime");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeNotEqualTo(Date value) {
            addCriterion("downloadTime <>", value, "downloadtime");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeGreaterThan(Date value) {
            addCriterion("downloadTime >", value, "downloadtime");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("downloadTime >=", value, "downloadtime");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeLessThan(Date value) {
            addCriterion("downloadTime <", value, "downloadtime");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeLessThanOrEqualTo(Date value) {
            addCriterion("downloadTime <=", value, "downloadtime");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeIn(List<Date> values) {
            addCriterion("downloadTime in", values, "downloadtime");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeNotIn(List<Date> values) {
            addCriterion("downloadTime not in", values, "downloadtime");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeBetween(Date value1, Date value2) {
            addCriterion("downloadTime between", value1, value2, "downloadtime");
            return (Criteria) this;
        }

        public Criteria andDownloadtimeNotBetween(Date value1, Date value2) {
            addCriterion("downloadTime not between", value1, value2, "downloadtime");
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