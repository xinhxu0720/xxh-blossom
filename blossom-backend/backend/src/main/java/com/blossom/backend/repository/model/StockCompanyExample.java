package com.blossom.backend.repository.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockCompanyExample() {
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

        public Criteria andTsCodIsNull() {
            addCriterion("ts_cod is null");
            return (Criteria) this;
        }

        public Criteria andTsCodIsNotNull() {
            addCriterion("ts_cod is not null");
            return (Criteria) this;
        }

        public Criteria andTsCodEqualTo(String value) {
            addCriterion("ts_cod =", value, "tsCod");
            return (Criteria) this;
        }

        public Criteria andTsCodNotEqualTo(String value) {
            addCriterion("ts_cod <>", value, "tsCod");
            return (Criteria) this;
        }

        public Criteria andTsCodGreaterThan(String value) {
            addCriterion("ts_cod >", value, "tsCod");
            return (Criteria) this;
        }

        public Criteria andTsCodGreaterThanOrEqualTo(String value) {
            addCriterion("ts_cod >=", value, "tsCod");
            return (Criteria) this;
        }

        public Criteria andTsCodLessThan(String value) {
            addCriterion("ts_cod <", value, "tsCod");
            return (Criteria) this;
        }

        public Criteria andTsCodLessThanOrEqualTo(String value) {
            addCriterion("ts_cod <=", value, "tsCod");
            return (Criteria) this;
        }

        public Criteria andTsCodLike(String value) {
            addCriterion("ts_cod like", value, "tsCod");
            return (Criteria) this;
        }

        public Criteria andTsCodNotLike(String value) {
            addCriterion("ts_cod not like", value, "tsCod");
            return (Criteria) this;
        }

        public Criteria andTsCodIn(List<String> values) {
            addCriterion("ts_cod in", values, "tsCod");
            return (Criteria) this;
        }

        public Criteria andTsCodNotIn(List<String> values) {
            addCriterion("ts_cod not in", values, "tsCod");
            return (Criteria) this;
        }

        public Criteria andTsCodBetween(String value1, String value2) {
            addCriterion("ts_cod between", value1, value2, "tsCod");
            return (Criteria) this;
        }

        public Criteria andTsCodNotBetween(String value1, String value2) {
            addCriterion("ts_cod not between", value1, value2, "tsCod");
            return (Criteria) this;
        }

        public Criteria andSymbolIsNull() {
            addCriterion("symbol is null");
            return (Criteria) this;
        }

        public Criteria andSymbolIsNotNull() {
            addCriterion("symbol is not null");
            return (Criteria) this;
        }

        public Criteria andSymbolEqualTo(String value) {
            addCriterion("symbol =", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotEqualTo(String value) {
            addCriterion("symbol <>", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolGreaterThan(String value) {
            addCriterion("symbol >", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("symbol >=", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLessThan(String value) {
            addCriterion("symbol <", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLessThanOrEqualTo(String value) {
            addCriterion("symbol <=", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLike(String value) {
            addCriterion("symbol like", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotLike(String value) {
            addCriterion("symbol not like", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolIn(List<String> values) {
            addCriterion("symbol in", values, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotIn(List<String> values) {
            addCriterion("symbol not in", values, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolBetween(String value1, String value2) {
            addCriterion("symbol between", value1, value2, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotBetween(String value1, String value2) {
            addCriterion("symbol not between", value1, value2, "symbol");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNull() {
            addCriterion("fullname is null");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNotNull() {
            addCriterion("fullname is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameEqualTo(String value) {
            addCriterion("fullname =", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotEqualTo(String value) {
            addCriterion("fullname <>", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThan(String value) {
            addCriterion("fullname >", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("fullname >=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThan(String value) {
            addCriterion("fullname <", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThanOrEqualTo(String value) {
            addCriterion("fullname <=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLike(String value) {
            addCriterion("fullname like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotLike(String value) {
            addCriterion("fullname not like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameIn(List<String> values) {
            addCriterion("fullname in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotIn(List<String> values) {
            addCriterion("fullname not in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameBetween(String value1, String value2) {
            addCriterion("fullname between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotBetween(String value1, String value2) {
            addCriterion("fullname not between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andMarketIsNull() {
            addCriterion("market is null");
            return (Criteria) this;
        }

        public Criteria andMarketIsNotNull() {
            addCriterion("market is not null");
            return (Criteria) this;
        }

        public Criteria andMarketEqualTo(String value) {
            addCriterion("market =", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotEqualTo(String value) {
            addCriterion("market <>", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketGreaterThan(String value) {
            addCriterion("market >", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketGreaterThanOrEqualTo(String value) {
            addCriterion("market >=", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLessThan(String value) {
            addCriterion("market <", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLessThanOrEqualTo(String value) {
            addCriterion("market <=", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLike(String value) {
            addCriterion("market like", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotLike(String value) {
            addCriterion("market not like", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketIn(List<String> values) {
            addCriterion("market in", values, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotIn(List<String> values) {
            addCriterion("market not in", values, "market");
            return (Criteria) this;
        }

        public Criteria andMarketBetween(String value1, String value2) {
            addCriterion("market between", value1, value2, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotBetween(String value1, String value2) {
            addCriterion("market not between", value1, value2, "market");
            return (Criteria) this;
        }

        public Criteria andListStatusIsNull() {
            addCriterion("list_status is null");
            return (Criteria) this;
        }

        public Criteria andListStatusIsNotNull() {
            addCriterion("list_status is not null");
            return (Criteria) this;
        }

        public Criteria andListStatusEqualTo(String value) {
            addCriterion("list_status =", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusNotEqualTo(String value) {
            addCriterion("list_status <>", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusGreaterThan(String value) {
            addCriterion("list_status >", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusGreaterThanOrEqualTo(String value) {
            addCriterion("list_status >=", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusLessThan(String value) {
            addCriterion("list_status <", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusLessThanOrEqualTo(String value) {
            addCriterion("list_status <=", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusLike(String value) {
            addCriterion("list_status like", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusNotLike(String value) {
            addCriterion("list_status not like", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusIn(List<String> values) {
            addCriterion("list_status in", values, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusNotIn(List<String> values) {
            addCriterion("list_status not in", values, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusBetween(String value1, String value2) {
            addCriterion("list_status between", value1, value2, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusNotBetween(String value1, String value2) {
            addCriterion("list_status not between", value1, value2, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListDateIsNull() {
            addCriterion("list_date is null");
            return (Criteria) this;
        }

        public Criteria andListDateIsNotNull() {
            addCriterion("list_date is not null");
            return (Criteria) this;
        }

        public Criteria andListDateEqualTo(String value) {
            addCriterion("list_date =", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateNotEqualTo(String value) {
            addCriterion("list_date <>", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateGreaterThan(String value) {
            addCriterion("list_date >", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateGreaterThanOrEqualTo(String value) {
            addCriterion("list_date >=", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateLessThan(String value) {
            addCriterion("list_date <", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateLessThanOrEqualTo(String value) {
            addCriterion("list_date <=", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateLike(String value) {
            addCriterion("list_date like", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateNotLike(String value) {
            addCriterion("list_date not like", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateIn(List<String> values) {
            addCriterion("list_date in", values, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateNotIn(List<String> values) {
            addCriterion("list_date not in", values, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateBetween(String value1, String value2) {
            addCriterion("list_date between", value1, value2, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateNotBetween(String value1, String value2) {
            addCriterion("list_date not between", value1, value2, "listDate");
            return (Criteria) this;
        }

        public Criteria andPeTtmIsNull() {
            addCriterion("pe_ttm is null");
            return (Criteria) this;
        }

        public Criteria andPeTtmIsNotNull() {
            addCriterion("pe_ttm is not null");
            return (Criteria) this;
        }

        public Criteria andPeTtmEqualTo(String value) {
            addCriterion("pe_ttm =", value, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmNotEqualTo(String value) {
            addCriterion("pe_ttm <>", value, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmGreaterThan(String value) {
            addCriterion("pe_ttm >", value, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmGreaterThanOrEqualTo(String value) {
            addCriterion("pe_ttm >=", value, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmLessThan(String value) {
            addCriterion("pe_ttm <", value, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmLessThanOrEqualTo(String value) {
            addCriterion("pe_ttm <=", value, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmLike(String value) {
            addCriterion("pe_ttm like", value, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmNotLike(String value) {
            addCriterion("pe_ttm not like", value, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmIn(List<String> values) {
            addCriterion("pe_ttm in", values, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmNotIn(List<String> values) {
            addCriterion("pe_ttm not in", values, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmBetween(String value1, String value2) {
            addCriterion("pe_ttm between", value1, value2, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmNotBetween(String value1, String value2) {
            addCriterion("pe_ttm not between", value1, value2, "peTtm");
            return (Criteria) this;
        }

        public Criteria andHigh52WeekIsNull() {
            addCriterion("high_52_week is null");
            return (Criteria) this;
        }

        public Criteria andHigh52WeekIsNotNull() {
            addCriterion("high_52_week is not null");
            return (Criteria) this;
        }

        public Criteria andHigh52WeekEqualTo(String value) {
            addCriterion("high_52_week =", value, "high52Week");
            return (Criteria) this;
        }

        public Criteria andHigh52WeekNotEqualTo(String value) {
            addCriterion("high_52_week <>", value, "high52Week");
            return (Criteria) this;
        }

        public Criteria andHigh52WeekGreaterThan(String value) {
            addCriterion("high_52_week >", value, "high52Week");
            return (Criteria) this;
        }

        public Criteria andHigh52WeekGreaterThanOrEqualTo(String value) {
            addCriterion("high_52_week >=", value, "high52Week");
            return (Criteria) this;
        }

        public Criteria andHigh52WeekLessThan(String value) {
            addCriterion("high_52_week <", value, "high52Week");
            return (Criteria) this;
        }

        public Criteria andHigh52WeekLessThanOrEqualTo(String value) {
            addCriterion("high_52_week <=", value, "high52Week");
            return (Criteria) this;
        }

        public Criteria andHigh52WeekLike(String value) {
            addCriterion("high_52_week like", value, "high52Week");
            return (Criteria) this;
        }

        public Criteria andHigh52WeekNotLike(String value) {
            addCriterion("high_52_week not like", value, "high52Week");
            return (Criteria) this;
        }

        public Criteria andHigh52WeekIn(List<String> values) {
            addCriterion("high_52_week in", values, "high52Week");
            return (Criteria) this;
        }

        public Criteria andHigh52WeekNotIn(List<String> values) {
            addCriterion("high_52_week not in", values, "high52Week");
            return (Criteria) this;
        }

        public Criteria andHigh52WeekBetween(String value1, String value2) {
            addCriterion("high_52_week between", value1, value2, "high52Week");
            return (Criteria) this;
        }

        public Criteria andHigh52WeekNotBetween(String value1, String value2) {
            addCriterion("high_52_week not between", value1, value2, "high52Week");
            return (Criteria) this;
        }

        public Criteria andLow52WeekIsNull() {
            addCriterion("low_52_week is null");
            return (Criteria) this;
        }

        public Criteria andLow52WeekIsNotNull() {
            addCriterion("low_52_week is not null");
            return (Criteria) this;
        }

        public Criteria andLow52WeekEqualTo(String value) {
            addCriterion("low_52_week =", value, "low52Week");
            return (Criteria) this;
        }

        public Criteria andLow52WeekNotEqualTo(String value) {
            addCriterion("low_52_week <>", value, "low52Week");
            return (Criteria) this;
        }

        public Criteria andLow52WeekGreaterThan(String value) {
            addCriterion("low_52_week >", value, "low52Week");
            return (Criteria) this;
        }

        public Criteria andLow52WeekGreaterThanOrEqualTo(String value) {
            addCriterion("low_52_week >=", value, "low52Week");
            return (Criteria) this;
        }

        public Criteria andLow52WeekLessThan(String value) {
            addCriterion("low_52_week <", value, "low52Week");
            return (Criteria) this;
        }

        public Criteria andLow52WeekLessThanOrEqualTo(String value) {
            addCriterion("low_52_week <=", value, "low52Week");
            return (Criteria) this;
        }

        public Criteria andLow52WeekLike(String value) {
            addCriterion("low_52_week like", value, "low52Week");
            return (Criteria) this;
        }

        public Criteria andLow52WeekNotLike(String value) {
            addCriterion("low_52_week not like", value, "low52Week");
            return (Criteria) this;
        }

        public Criteria andLow52WeekIn(List<String> values) {
            addCriterion("low_52_week in", values, "low52Week");
            return (Criteria) this;
        }

        public Criteria andLow52WeekNotIn(List<String> values) {
            addCriterion("low_52_week not in", values, "low52Week");
            return (Criteria) this;
        }

        public Criteria andLow52WeekBetween(String value1, String value2) {
            addCriterion("low_52_week between", value1, value2, "low52Week");
            return (Criteria) this;
        }

        public Criteria andLow52WeekNotBetween(String value1, String value2) {
            addCriterion("low_52_week not between", value1, value2, "low52Week");
            return (Criteria) this;
        }

        public Criteria andTotalSharesIsNull() {
            addCriterion("total_shares is null");
            return (Criteria) this;
        }

        public Criteria andTotalSharesIsNotNull() {
            addCriterion("total_shares is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSharesEqualTo(String value) {
            addCriterion("total_shares =", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesNotEqualTo(String value) {
            addCriterion("total_shares <>", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesGreaterThan(String value) {
            addCriterion("total_shares >", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesGreaterThanOrEqualTo(String value) {
            addCriterion("total_shares >=", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesLessThan(String value) {
            addCriterion("total_shares <", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesLessThanOrEqualTo(String value) {
            addCriterion("total_shares <=", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesLike(String value) {
            addCriterion("total_shares like", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesNotLike(String value) {
            addCriterion("total_shares not like", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesIn(List<String> values) {
            addCriterion("total_shares in", values, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesNotIn(List<String> values) {
            addCriterion("total_shares not in", values, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesBetween(String value1, String value2) {
            addCriterion("total_shares between", value1, value2, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesNotBetween(String value1, String value2) {
            addCriterion("total_shares not between", value1, value2, "totalShares");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
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

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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