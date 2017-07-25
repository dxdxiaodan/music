package cn.music.po;

import java.util.ArrayList;
import java.util.List;

public class MusiclibraryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MusiclibraryExample() {
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

        public Criteria andMusicnameIsNull() {
            addCriterion("musicName is null");
            return (Criteria) this;
        }

        public Criteria andMusicnameIsNotNull() {
            addCriterion("musicName is not null");
            return (Criteria) this;
        }

        public Criteria andMusicnameEqualTo(String value) {
            addCriterion("musicName =", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameNotEqualTo(String value) {
            addCriterion("musicName <>", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameGreaterThan(String value) {
            addCriterion("musicName >", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameGreaterThanOrEqualTo(String value) {
            addCriterion("musicName >=", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameLessThan(String value) {
            addCriterion("musicName <", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameLessThanOrEqualTo(String value) {
            addCriterion("musicName <=", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameLike(String value) {
            addCriterion("musicName like", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameNotLike(String value) {
            addCriterion("musicName not like", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameIn(List<String> values) {
            addCriterion("musicName in", values, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameNotIn(List<String> values) {
            addCriterion("musicName not in", values, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameBetween(String value1, String value2) {
            addCriterion("musicName between", value1, value2, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameNotBetween(String value1, String value2) {
            addCriterion("musicName not between", value1, value2, "musicname");
            return (Criteria) this;
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

        public Criteria andDownloadpermissionsidIsNull() {
            addCriterion("downloadPermissionsid is null");
            return (Criteria) this;
        }

        public Criteria andDownloadpermissionsidIsNotNull() {
            addCriterion("downloadPermissionsid is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadpermissionsidEqualTo(Integer value) {
            addCriterion("downloadPermissionsid =", value, "downloadpermissionsid");
            return (Criteria) this;
        }

        public Criteria andDownloadpermissionsidNotEqualTo(Integer value) {
            addCriterion("downloadPermissionsid <>", value, "downloadpermissionsid");
            return (Criteria) this;
        }

        public Criteria andDownloadpermissionsidGreaterThan(Integer value) {
            addCriterion("downloadPermissionsid >", value, "downloadpermissionsid");
            return (Criteria) this;
        }

        public Criteria andDownloadpermissionsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("downloadPermissionsid >=", value, "downloadpermissionsid");
            return (Criteria) this;
        }

        public Criteria andDownloadpermissionsidLessThan(Integer value) {
            addCriterion("downloadPermissionsid <", value, "downloadpermissionsid");
            return (Criteria) this;
        }

        public Criteria andDownloadpermissionsidLessThanOrEqualTo(Integer value) {
            addCriterion("downloadPermissionsid <=", value, "downloadpermissionsid");
            return (Criteria) this;
        }

        public Criteria andDownloadpermissionsidIn(List<Integer> values) {
            addCriterion("downloadPermissionsid in", values, "downloadpermissionsid");
            return (Criteria) this;
        }

        public Criteria andDownloadpermissionsidNotIn(List<Integer> values) {
            addCriterion("downloadPermissionsid not in", values, "downloadpermissionsid");
            return (Criteria) this;
        }

        public Criteria andDownloadpermissionsidBetween(Integer value1, Integer value2) {
            addCriterion("downloadPermissionsid between", value1, value2, "downloadpermissionsid");
            return (Criteria) this;
        }

        public Criteria andDownloadpermissionsidNotBetween(Integer value1, Integer value2) {
            addCriterion("downloadPermissionsid not between", value1, value2, "downloadpermissionsid");
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