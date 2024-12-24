package com.blossom.backend.repository.model;

import java.util.ArrayList;
import java.util.List;

public class StockNewsArticlesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockNewsArticlesExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSeqIsNull() {
            addCriterion("seq is null");
            return (Criteria) this;
        }

        public Criteria andSeqIsNotNull() {
            addCriterion("seq is not null");
            return (Criteria) this;
        }

        public Criteria andSeqEqualTo(Long value) {
            addCriterion("seq =", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotEqualTo(Long value) {
            addCriterion("seq <>", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThan(Long value) {
            addCriterion("seq >", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThanOrEqualTo(Long value) {
            addCriterion("seq >=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThan(Long value) {
            addCriterion("seq <", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThanOrEqualTo(Long value) {
            addCriterion("seq <=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqIn(List<Long> values) {
            addCriterion("seq in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotIn(List<Long> values) {
            addCriterion("seq not in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqBetween(Long value1, Long value2) {
            addCriterion("seq between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotBetween(Long value1, Long value2) {
            addCriterion("seq not between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andAppUrlIsNull() {
            addCriterion("app_url is null");
            return (Criteria) this;
        }

        public Criteria andAppUrlIsNotNull() {
            addCriterion("app_url is not null");
            return (Criteria) this;
        }

        public Criteria andAppUrlEqualTo(String value) {
            addCriterion("app_url =", value, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlNotEqualTo(String value) {
            addCriterion("app_url <>", value, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlGreaterThan(String value) {
            addCriterion("app_url >", value, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlGreaterThanOrEqualTo(String value) {
            addCriterion("app_url >=", value, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlLessThan(String value) {
            addCriterion("app_url <", value, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlLessThanOrEqualTo(String value) {
            addCriterion("app_url <=", value, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlLike(String value) {
            addCriterion("app_url like", value, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlNotLike(String value) {
            addCriterion("app_url not like", value, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlIn(List<String> values) {
            addCriterion("app_url in", values, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlNotIn(List<String> values) {
            addCriterion("app_url not in", values, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlBetween(String value1, String value2) {
            addCriterion("app_url between", value1, value2, "appUrl");
            return (Criteria) this;
        }

        public Criteria andAppUrlNotBetween(String value1, String value2) {
            addCriterion("app_url not between", value1, value2, "appUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlIsNull() {
            addCriterion("share_url is null");
            return (Criteria) this;
        }

        public Criteria andShareUrlIsNotNull() {
            addCriterion("share_url is not null");
            return (Criteria) this;
        }

        public Criteria andShareUrlEqualTo(String value) {
            addCriterion("share_url =", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotEqualTo(String value) {
            addCriterion("share_url <>", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlGreaterThan(String value) {
            addCriterion("share_url >", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlGreaterThanOrEqualTo(String value) {
            addCriterion("share_url >=", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlLessThan(String value) {
            addCriterion("share_url <", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlLessThanOrEqualTo(String value) {
            addCriterion("share_url <=", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlLike(String value) {
            addCriterion("share_url like", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotLike(String value) {
            addCriterion("share_url not like", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlIn(List<String> values) {
            addCriterion("share_url in", values, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotIn(List<String> values) {
            addCriterion("share_url not in", values, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlBetween(String value1, String value2) {
            addCriterion("share_url between", value1, value2, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotBetween(String value1, String value2) {
            addCriterion("share_url not between", value1, value2, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andStocksIsNull() {
            addCriterion("stocks is null");
            return (Criteria) this;
        }

        public Criteria andStocksIsNotNull() {
            addCriterion("stocks is not null");
            return (Criteria) this;
        }

        public Criteria andStocksEqualTo(String value) {
            addCriterion("stocks =", value, "stocks");
            return (Criteria) this;
        }

        public Criteria andStocksNotEqualTo(String value) {
            addCriterion("stocks <>", value, "stocks");
            return (Criteria) this;
        }

        public Criteria andStocksGreaterThan(String value) {
            addCriterion("stocks >", value, "stocks");
            return (Criteria) this;
        }

        public Criteria andStocksGreaterThanOrEqualTo(String value) {
            addCriterion("stocks >=", value, "stocks");
            return (Criteria) this;
        }

        public Criteria andStocksLessThan(String value) {
            addCriterion("stocks <", value, "stocks");
            return (Criteria) this;
        }

        public Criteria andStocksLessThanOrEqualTo(String value) {
            addCriterion("stocks <=", value, "stocks");
            return (Criteria) this;
        }

        public Criteria andStocksLike(String value) {
            addCriterion("stocks like", value, "stocks");
            return (Criteria) this;
        }

        public Criteria andStocksNotLike(String value) {
            addCriterion("stocks not like", value, "stocks");
            return (Criteria) this;
        }

        public Criteria andStocksIn(List<String> values) {
            addCriterion("stocks in", values, "stocks");
            return (Criteria) this;
        }

        public Criteria andStocksNotIn(List<String> values) {
            addCriterion("stocks not in", values, "stocks");
            return (Criteria) this;
        }

        public Criteria andStocksBetween(String value1, String value2) {
            addCriterion("stocks between", value1, value2, "stocks");
            return (Criteria) this;
        }

        public Criteria andStocksNotBetween(String value1, String value2) {
            addCriterion("stocks not between", value1, value2, "stocks");
            return (Criteria) this;
        }

        public Criteria andFieldsIsNull() {
            addCriterion("fields is null");
            return (Criteria) this;
        }

        public Criteria andFieldsIsNotNull() {
            addCriterion("fields is not null");
            return (Criteria) this;
        }

        public Criteria andFieldsEqualTo(String value) {
            addCriterion("fields =", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsNotEqualTo(String value) {
            addCriterion("fields <>", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsGreaterThan(String value) {
            addCriterion("fields >", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsGreaterThanOrEqualTo(String value) {
            addCriterion("fields >=", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsLessThan(String value) {
            addCriterion("fields <", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsLessThanOrEqualTo(String value) {
            addCriterion("fields <=", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsLike(String value) {
            addCriterion("fields like", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsNotLike(String value) {
            addCriterion("fields not like", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsIn(List<String> values) {
            addCriterion("fields in", values, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsNotIn(List<String> values) {
            addCriterion("fields not in", values, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsBetween(String value1, String value2) {
            addCriterion("fields between", value1, value2, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsNotBetween(String value1, String value2) {
            addCriterion("fields not between", value1, value2, "fields");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andPicurlIsNull() {
            addCriterion("picUrl is null");
            return (Criteria) this;
        }

        public Criteria andPicurlIsNotNull() {
            addCriterion("picUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPicurlEqualTo(String value) {
            addCriterion("picUrl =", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotEqualTo(String value) {
            addCriterion("picUrl <>", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlGreaterThan(String value) {
            addCriterion("picUrl >", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlGreaterThanOrEqualTo(String value) {
            addCriterion("picUrl >=", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLessThan(String value) {
            addCriterion("picUrl <", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLessThanOrEqualTo(String value) {
            addCriterion("picUrl <=", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLike(String value) {
            addCriterion("picUrl like", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotLike(String value) {
            addCriterion("picUrl not like", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlIn(List<String> values) {
            addCriterion("picUrl in", values, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotIn(List<String> values) {
            addCriterion("picUrl not in", values, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlBetween(String value1, String value2) {
            addCriterion("picUrl between", value1, value2, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotBetween(String value1, String value2) {
            addCriterion("picUrl not between", value1, value2, "picurl");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andReadAmountIsNull() {
            addCriterion("read_amount is null");
            return (Criteria) this;
        }

        public Criteria andReadAmountIsNotNull() {
            addCriterion("read_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReadAmountEqualTo(Integer value) {
            addCriterion("read_amount =", value, "readAmount");
            return (Criteria) this;
        }

        public Criteria andReadAmountNotEqualTo(Integer value) {
            addCriterion("read_amount <>", value, "readAmount");
            return (Criteria) this;
        }

        public Criteria andReadAmountGreaterThan(Integer value) {
            addCriterion("read_amount >", value, "readAmount");
            return (Criteria) this;
        }

        public Criteria andReadAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_amount >=", value, "readAmount");
            return (Criteria) this;
        }

        public Criteria andReadAmountLessThan(Integer value) {
            addCriterion("read_amount <", value, "readAmount");
            return (Criteria) this;
        }

        public Criteria andReadAmountLessThanOrEqualTo(Integer value) {
            addCriterion("read_amount <=", value, "readAmount");
            return (Criteria) this;
        }

        public Criteria andReadAmountIn(List<Integer> values) {
            addCriterion("read_amount in", values, "readAmount");
            return (Criteria) this;
        }

        public Criteria andReadAmountNotIn(List<Integer> values) {
            addCriterion("read_amount not in", values, "readAmount");
            return (Criteria) this;
        }

        public Criteria andReadAmountBetween(Integer value1, Integer value2) {
            addCriterion("read_amount between", value1, value2, "readAmount");
            return (Criteria) this;
        }

        public Criteria andReadAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("read_amount not between", value1, value2, "readAmount");
            return (Criteria) this;
        }

        public Criteria andShareAmountIsNull() {
            addCriterion("share_amount is null");
            return (Criteria) this;
        }

        public Criteria andShareAmountIsNotNull() {
            addCriterion("share_amount is not null");
            return (Criteria) this;
        }

        public Criteria andShareAmountEqualTo(Integer value) {
            addCriterion("share_amount =", value, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andShareAmountNotEqualTo(Integer value) {
            addCriterion("share_amount <>", value, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andShareAmountGreaterThan(Integer value) {
            addCriterion("share_amount >", value, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andShareAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_amount >=", value, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andShareAmountLessThan(Integer value) {
            addCriterion("share_amount <", value, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andShareAmountLessThanOrEqualTo(Integer value) {
            addCriterion("share_amount <=", value, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andShareAmountIn(List<Integer> values) {
            addCriterion("share_amount in", values, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andShareAmountNotIn(List<Integer> values) {
            addCriterion("share_amount not in", values, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andShareAmountBetween(Integer value1, Integer value2) {
            addCriterion("share_amount between", value1, value2, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andShareAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("share_amount not between", value1, value2, "shareAmount");
            return (Criteria) this;
        }

        public Criteria andQianfanAiIsNull() {
            addCriterion("qianfan_ai is null");
            return (Criteria) this;
        }

        public Criteria andQianfanAiIsNotNull() {
            addCriterion("qianfan_ai is not null");
            return (Criteria) this;
        }

        public Criteria andQianfanAiEqualTo(String value) {
            addCriterion("qianfan_ai =", value, "qianfanAi");
            return (Criteria) this;
        }

        public Criteria andQianfanAiNotEqualTo(String value) {
            addCriterion("qianfan_ai <>", value, "qianfanAi");
            return (Criteria) this;
        }

        public Criteria andQianfanAiGreaterThan(String value) {
            addCriterion("qianfan_ai >", value, "qianfanAi");
            return (Criteria) this;
        }

        public Criteria andQianfanAiGreaterThanOrEqualTo(String value) {
            addCriterion("qianfan_ai >=", value, "qianfanAi");
            return (Criteria) this;
        }

        public Criteria andQianfanAiLessThan(String value) {
            addCriterion("qianfan_ai <", value, "qianfanAi");
            return (Criteria) this;
        }

        public Criteria andQianfanAiLessThanOrEqualTo(String value) {
            addCriterion("qianfan_ai <=", value, "qianfanAi");
            return (Criteria) this;
        }

        public Criteria andQianfanAiLike(String value) {
            addCriterion("qianfan_ai like", value, "qianfanAi");
            return (Criteria) this;
        }

        public Criteria andQianfanAiNotLike(String value) {
            addCriterion("qianfan_ai not like", value, "qianfanAi");
            return (Criteria) this;
        }

        public Criteria andQianfanAiIn(List<String> values) {
            addCriterion("qianfan_ai in", values, "qianfanAi");
            return (Criteria) this;
        }

        public Criteria andQianfanAiNotIn(List<String> values) {
            addCriterion("qianfan_ai not in", values, "qianfanAi");
            return (Criteria) this;
        }

        public Criteria andQianfanAiBetween(String value1, String value2) {
            addCriterion("qianfan_ai between", value1, value2, "qianfanAi");
            return (Criteria) this;
        }

        public Criteria andQianfanAiNotBetween(String value1, String value2) {
            addCriterion("qianfan_ai not between", value1, value2, "qianfanAi");
            return (Criteria) this;
        }

        public Criteria andResultTypeIsNull() {
            addCriterion("result_type is null");
            return (Criteria) this;
        }

        public Criteria andResultTypeIsNotNull() {
            addCriterion("result_type is not null");
            return (Criteria) this;
        }

        public Criteria andResultTypeEqualTo(Byte value) {
            addCriterion("result_type =", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeNotEqualTo(Byte value) {
            addCriterion("result_type <>", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeGreaterThan(Byte value) {
            addCriterion("result_type >", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("result_type >=", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeLessThan(Byte value) {
            addCriterion("result_type <", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeLessThanOrEqualTo(Byte value) {
            addCriterion("result_type <=", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeIn(List<Byte> values) {
            addCriterion("result_type in", values, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeNotIn(List<Byte> values) {
            addCriterion("result_type not in", values, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeBetween(Byte value1, Byte value2) {
            addCriterion("result_type between", value1, value2, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("result_type not between", value1, value2, "resultType");
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