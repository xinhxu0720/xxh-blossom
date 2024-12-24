package com.blossom.backend.repository.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockPriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockPriceExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNameIsNull() {
            addCriterion("code_name is null");
            return (Criteria) this;
        }

        public Criteria andCodeNameIsNotNull() {
            addCriterion("code_name is not null");
            return (Criteria) this;
        }

        public Criteria andCodeNameEqualTo(String value) {
            addCriterion("code_name =", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotEqualTo(String value) {
            addCriterion("code_name <>", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameGreaterThan(String value) {
            addCriterion("code_name >", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("code_name >=", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameLessThan(String value) {
            addCriterion("code_name <", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameLessThanOrEqualTo(String value) {
            addCriterion("code_name <=", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameLike(String value) {
            addCriterion("code_name like", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotLike(String value) {
            addCriterion("code_name not like", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameIn(List<String> values) {
            addCriterion("code_name in", values, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotIn(List<String> values) {
            addCriterion("code_name not in", values, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameBetween(String value1, String value2) {
            addCriterion("code_name between", value1, value2, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotBetween(String value1, String value2) {
            addCriterion("code_name not between", value1, value2, "codeName");
            return (Criteria) this;
        }

        public Criteria andCurrentIsNull() {
            addCriterion("current is null");
            return (Criteria) this;
        }

        public Criteria andCurrentIsNotNull() {
            addCriterion("current is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentEqualTo(String value) {
            addCriterion("current =", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotEqualTo(String value) {
            addCriterion("current <>", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentGreaterThan(String value) {
            addCriterion("current >", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentGreaterThanOrEqualTo(String value) {
            addCriterion("current >=", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLessThan(String value) {
            addCriterion("current <", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLessThanOrEqualTo(String value) {
            addCriterion("current <=", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLike(String value) {
            addCriterion("current like", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotLike(String value) {
            addCriterion("current not like", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentIn(List<String> values) {
            addCriterion("current in", values, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotIn(List<String> values) {
            addCriterion("current not in", values, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentBetween(String value1, String value2) {
            addCriterion("current between", value1, value2, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotBetween(String value1, String value2) {
            addCriterion("current not between", value1, value2, "current");
            return (Criteria) this;
        }

        public Criteria andPercentIsNull() {
            addCriterion("percent is null");
            return (Criteria) this;
        }

        public Criteria andPercentIsNotNull() {
            addCriterion("percent is not null");
            return (Criteria) this;
        }

        public Criteria andPercentEqualTo(String value) {
            addCriterion("percent =", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotEqualTo(String value) {
            addCriterion("percent <>", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentGreaterThan(String value) {
            addCriterion("percent >", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentGreaterThanOrEqualTo(String value) {
            addCriterion("percent >=", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentLessThan(String value) {
            addCriterion("percent <", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentLessThanOrEqualTo(String value) {
            addCriterion("percent <=", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentLike(String value) {
            addCriterion("percent like", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotLike(String value) {
            addCriterion("percent not like", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentIn(List<String> values) {
            addCriterion("percent in", values, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotIn(List<String> values) {
            addCriterion("percent not in", values, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentBetween(String value1, String value2) {
            addCriterion("percent between", value1, value2, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotBetween(String value1, String value2) {
            addCriterion("percent not between", value1, value2, "percent");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateIsNull() {
            addCriterion("turnover_rate is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateIsNotNull() {
            addCriterion("turnover_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateEqualTo(String value) {
            addCriterion("turnover_rate =", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateNotEqualTo(String value) {
            addCriterion("turnover_rate <>", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateGreaterThan(String value) {
            addCriterion("turnover_rate >", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateGreaterThanOrEqualTo(String value) {
            addCriterion("turnover_rate >=", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateLessThan(String value) {
            addCriterion("turnover_rate <", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateLessThanOrEqualTo(String value) {
            addCriterion("turnover_rate <=", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateLike(String value) {
            addCriterion("turnover_rate like", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateNotLike(String value) {
            addCriterion("turnover_rate not like", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateIn(List<String> values) {
            addCriterion("turnover_rate in", values, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateNotIn(List<String> values) {
            addCriterion("turnover_rate not in", values, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateBetween(String value1, String value2) {
            addCriterion("turnover_rate between", value1, value2, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateNotBetween(String value1, String value2) {
            addCriterion("turnover_rate not between", value1, value2, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andChgIsNull() {
            addCriterion("chg is null");
            return (Criteria) this;
        }

        public Criteria andChgIsNotNull() {
            addCriterion("chg is not null");
            return (Criteria) this;
        }

        public Criteria andChgEqualTo(String value) {
            addCriterion("chg =", value, "chg");
            return (Criteria) this;
        }

        public Criteria andChgNotEqualTo(String value) {
            addCriterion("chg <>", value, "chg");
            return (Criteria) this;
        }

        public Criteria andChgGreaterThan(String value) {
            addCriterion("chg >", value, "chg");
            return (Criteria) this;
        }

        public Criteria andChgGreaterThanOrEqualTo(String value) {
            addCriterion("chg >=", value, "chg");
            return (Criteria) this;
        }

        public Criteria andChgLessThan(String value) {
            addCriterion("chg <", value, "chg");
            return (Criteria) this;
        }

        public Criteria andChgLessThanOrEqualTo(String value) {
            addCriterion("chg <=", value, "chg");
            return (Criteria) this;
        }

        public Criteria andChgLike(String value) {
            addCriterion("chg like", value, "chg");
            return (Criteria) this;
        }

        public Criteria andChgNotLike(String value) {
            addCriterion("chg not like", value, "chg");
            return (Criteria) this;
        }

        public Criteria andChgIn(List<String> values) {
            addCriterion("chg in", values, "chg");
            return (Criteria) this;
        }

        public Criteria andChgNotIn(List<String> values) {
            addCriterion("chg not in", values, "chg");
            return (Criteria) this;
        }

        public Criteria andChgBetween(String value1, String value2) {
            addCriterion("chg between", value1, value2, "chg");
            return (Criteria) this;
        }

        public Criteria andChgNotBetween(String value1, String value2) {
            addCriterion("chg not between", value1, value2, "chg");
            return (Criteria) this;
        }

        public Criteria andHighIsNull() {
            addCriterion("high is null");
            return (Criteria) this;
        }

        public Criteria andHighIsNotNull() {
            addCriterion("high is not null");
            return (Criteria) this;
        }

        public Criteria andHighEqualTo(String value) {
            addCriterion("high =", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotEqualTo(String value) {
            addCriterion("high <>", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThan(String value) {
            addCriterion("high >", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThanOrEqualTo(String value) {
            addCriterion("high >=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThan(String value) {
            addCriterion("high <", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThanOrEqualTo(String value) {
            addCriterion("high <=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLike(String value) {
            addCriterion("high like", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotLike(String value) {
            addCriterion("high not like", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighIn(List<String> values) {
            addCriterion("high in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotIn(List<String> values) {
            addCriterion("high not in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighBetween(String value1, String value2) {
            addCriterion("high between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotBetween(String value1, String value2) {
            addCriterion("high not between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andLowIsNull() {
            addCriterion("low is null");
            return (Criteria) this;
        }

        public Criteria andLowIsNotNull() {
            addCriterion("low is not null");
            return (Criteria) this;
        }

        public Criteria andLowEqualTo(String value) {
            addCriterion("low =", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotEqualTo(String value) {
            addCriterion("low <>", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowGreaterThan(String value) {
            addCriterion("low >", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowGreaterThanOrEqualTo(String value) {
            addCriterion("low >=", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLessThan(String value) {
            addCriterion("low <", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLessThanOrEqualTo(String value) {
            addCriterion("low <=", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLike(String value) {
            addCriterion("low like", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotLike(String value) {
            addCriterion("low not like", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowIn(List<String> values) {
            addCriterion("low in", values, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotIn(List<String> values) {
            addCriterion("low not in", values, "low");
            return (Criteria) this;
        }

        public Criteria andLowBetween(String value1, String value2) {
            addCriterion("low between", value1, value2, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotBetween(String value1, String value2) {
            addCriterion("low not between", value1, value2, "low");
            return (Criteria) this;
        }

        public Criteria andOpenIsNull() {
            addCriterion("open is null");
            return (Criteria) this;
        }

        public Criteria andOpenIsNotNull() {
            addCriterion("open is not null");
            return (Criteria) this;
        }

        public Criteria andOpenEqualTo(String value) {
            addCriterion("open =", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotEqualTo(String value) {
            addCriterion("open <>", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThan(String value) {
            addCriterion("open >", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThanOrEqualTo(String value) {
            addCriterion("open >=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThan(String value) {
            addCriterion("open <", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThanOrEqualTo(String value) {
            addCriterion("open <=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLike(String value) {
            addCriterion("open like", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotLike(String value) {
            addCriterion("open not like", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenIn(List<String> values) {
            addCriterion("open in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotIn(List<String> values) {
            addCriterion("open not in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenBetween(String value1, String value2) {
            addCriterion("open between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotBetween(String value1, String value2) {
            addCriterion("open not between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andLastCloseIsNull() {
            addCriterion("last_close is null");
            return (Criteria) this;
        }

        public Criteria andLastCloseIsNotNull() {
            addCriterion("last_close is not null");
            return (Criteria) this;
        }

        public Criteria andLastCloseEqualTo(String value) {
            addCriterion("last_close =", value, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseNotEqualTo(String value) {
            addCriterion("last_close <>", value, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseGreaterThan(String value) {
            addCriterion("last_close >", value, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseGreaterThanOrEqualTo(String value) {
            addCriterion("last_close >=", value, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseLessThan(String value) {
            addCriterion("last_close <", value, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseLessThanOrEqualTo(String value) {
            addCriterion("last_close <=", value, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseLike(String value) {
            addCriterion("last_close like", value, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseNotLike(String value) {
            addCriterion("last_close not like", value, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseIn(List<String> values) {
            addCriterion("last_close in", values, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseNotIn(List<String> values) {
            addCriterion("last_close not in", values, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseBetween(String value1, String value2) {
            addCriterion("last_close between", value1, value2, "lastClose");
            return (Criteria) this;
        }

        public Criteria andLastCloseNotBetween(String value1, String value2) {
            addCriterion("last_close not between", value1, value2, "lastClose");
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

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Long value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Long value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Long value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Long value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Long value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Long value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Long> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Long> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Long value1, Long value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Long value1, Long value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("amount like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("amount not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andMarketCapitalIsNull() {
            addCriterion("market_capital is null");
            return (Criteria) this;
        }

        public Criteria andMarketCapitalIsNotNull() {
            addCriterion("market_capital is not null");
            return (Criteria) this;
        }

        public Criteria andMarketCapitalEqualTo(String value) {
            addCriterion("market_capital =", value, "marketCapital");
            return (Criteria) this;
        }

        public Criteria andMarketCapitalNotEqualTo(String value) {
            addCriterion("market_capital <>", value, "marketCapital");
            return (Criteria) this;
        }

        public Criteria andMarketCapitalGreaterThan(String value) {
            addCriterion("market_capital >", value, "marketCapital");
            return (Criteria) this;
        }

        public Criteria andMarketCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("market_capital >=", value, "marketCapital");
            return (Criteria) this;
        }

        public Criteria andMarketCapitalLessThan(String value) {
            addCriterion("market_capital <", value, "marketCapital");
            return (Criteria) this;
        }

        public Criteria andMarketCapitalLessThanOrEqualTo(String value) {
            addCriterion("market_capital <=", value, "marketCapital");
            return (Criteria) this;
        }

        public Criteria andMarketCapitalLike(String value) {
            addCriterion("market_capital like", value, "marketCapital");
            return (Criteria) this;
        }

        public Criteria andMarketCapitalNotLike(String value) {
            addCriterion("market_capital not like", value, "marketCapital");
            return (Criteria) this;
        }

        public Criteria andMarketCapitalIn(List<String> values) {
            addCriterion("market_capital in", values, "marketCapital");
            return (Criteria) this;
        }

        public Criteria andMarketCapitalNotIn(List<String> values) {
            addCriterion("market_capital not in", values, "marketCapital");
            return (Criteria) this;
        }

        public Criteria andMarketCapitalBetween(String value1, String value2) {
            addCriterion("market_capital between", value1, value2, "marketCapital");
            return (Criteria) this;
        }

        public Criteria andMarketCapitalNotBetween(String value1, String value2) {
            addCriterion("market_capital not between", value1, value2, "marketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalIsNull() {
            addCriterion("float_market_capital is null");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalIsNotNull() {
            addCriterion("float_market_capital is not null");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalEqualTo(String value) {
            addCriterion("float_market_capital =", value, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalNotEqualTo(String value) {
            addCriterion("float_market_capital <>", value, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalGreaterThan(String value) {
            addCriterion("float_market_capital >", value, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("float_market_capital >=", value, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalLessThan(String value) {
            addCriterion("float_market_capital <", value, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalLessThanOrEqualTo(String value) {
            addCriterion("float_market_capital <=", value, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalLike(String value) {
            addCriterion("float_market_capital like", value, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalNotLike(String value) {
            addCriterion("float_market_capital not like", value, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalIn(List<String> values) {
            addCriterion("float_market_capital in", values, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalNotIn(List<String> values) {
            addCriterion("float_market_capital not in", values, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalBetween(String value1, String value2) {
            addCriterion("float_market_capital between", value1, value2, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andFloatMarketCapitalNotBetween(String value1, String value2) {
            addCriterion("float_market_capital not between", value1, value2, "floatMarketCapital");
            return (Criteria) this;
        }

        public Criteria andAmplitudeIsNull() {
            addCriterion("amplitude is null");
            return (Criteria) this;
        }

        public Criteria andAmplitudeIsNotNull() {
            addCriterion("amplitude is not null");
            return (Criteria) this;
        }

        public Criteria andAmplitudeEqualTo(String value) {
            addCriterion("amplitude =", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeNotEqualTo(String value) {
            addCriterion("amplitude <>", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeGreaterThan(String value) {
            addCriterion("amplitude >", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeGreaterThanOrEqualTo(String value) {
            addCriterion("amplitude >=", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeLessThan(String value) {
            addCriterion("amplitude <", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeLessThanOrEqualTo(String value) {
            addCriterion("amplitude <=", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeLike(String value) {
            addCriterion("amplitude like", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeNotLike(String value) {
            addCriterion("amplitude not like", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeIn(List<String> values) {
            addCriterion("amplitude in", values, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeNotIn(List<String> values) {
            addCriterion("amplitude not in", values, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeBetween(String value1, String value2) {
            addCriterion("amplitude between", value1, value2, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeNotBetween(String value1, String value2) {
            addCriterion("amplitude not between", value1, value2, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAvgPriceIsNull() {
            addCriterion("avg_price is null");
            return (Criteria) this;
        }

        public Criteria andAvgPriceIsNotNull() {
            addCriterion("avg_price is not null");
            return (Criteria) this;
        }

        public Criteria andAvgPriceEqualTo(String value) {
            addCriterion("avg_price =", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceNotEqualTo(String value) {
            addCriterion("avg_price <>", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceGreaterThan(String value) {
            addCriterion("avg_price >", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceGreaterThanOrEqualTo(String value) {
            addCriterion("avg_price >=", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceLessThan(String value) {
            addCriterion("avg_price <", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceLessThanOrEqualTo(String value) {
            addCriterion("avg_price <=", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceLike(String value) {
            addCriterion("avg_price like", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceNotLike(String value) {
            addCriterion("avg_price not like", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceIn(List<String> values) {
            addCriterion("avg_price in", values, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceNotIn(List<String> values) {
            addCriterion("avg_price not in", values, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceBetween(String value1, String value2) {
            addCriterion("avg_price between", value1, value2, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceNotBetween(String value1, String value2) {
            addCriterion("avg_price not between", value1, value2, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeIsNull() {
            addCriterion("trade_volume is null");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeIsNotNull() {
            addCriterion("trade_volume is not null");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeEqualTo(Long value) {
            addCriterion("trade_volume =", value, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeNotEqualTo(Long value) {
            addCriterion("trade_volume <>", value, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeGreaterThan(Long value) {
            addCriterion("trade_volume >", value, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeGreaterThanOrEqualTo(Long value) {
            addCriterion("trade_volume >=", value, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeLessThan(Long value) {
            addCriterion("trade_volume <", value, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeLessThanOrEqualTo(Long value) {
            addCriterion("trade_volume <=", value, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeIn(List<Long> values) {
            addCriterion("trade_volume in", values, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeNotIn(List<Long> values) {
            addCriterion("trade_volume not in", values, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeBetween(Long value1, Long value2) {
            addCriterion("trade_volume between", value1, value2, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andTradeVolumeNotBetween(Long value1, Long value2) {
            addCriterion("trade_volume not between", value1, value2, "tradeVolume");
            return (Criteria) this;
        }

        public Criteria andCurrentYearPercentIsNull() {
            addCriterion("current_year_percent is null");
            return (Criteria) this;
        }

        public Criteria andCurrentYearPercentIsNotNull() {
            addCriterion("current_year_percent is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentYearPercentEqualTo(String value) {
            addCriterion("current_year_percent =", value, "currentYearPercent");
            return (Criteria) this;
        }

        public Criteria andCurrentYearPercentNotEqualTo(String value) {
            addCriterion("current_year_percent <>", value, "currentYearPercent");
            return (Criteria) this;
        }

        public Criteria andCurrentYearPercentGreaterThan(String value) {
            addCriterion("current_year_percent >", value, "currentYearPercent");
            return (Criteria) this;
        }

        public Criteria andCurrentYearPercentGreaterThanOrEqualTo(String value) {
            addCriterion("current_year_percent >=", value, "currentYearPercent");
            return (Criteria) this;
        }

        public Criteria andCurrentYearPercentLessThan(String value) {
            addCriterion("current_year_percent <", value, "currentYearPercent");
            return (Criteria) this;
        }

        public Criteria andCurrentYearPercentLessThanOrEqualTo(String value) {
            addCriterion("current_year_percent <=", value, "currentYearPercent");
            return (Criteria) this;
        }

        public Criteria andCurrentYearPercentLike(String value) {
            addCriterion("current_year_percent like", value, "currentYearPercent");
            return (Criteria) this;
        }

        public Criteria andCurrentYearPercentNotLike(String value) {
            addCriterion("current_year_percent not like", value, "currentYearPercent");
            return (Criteria) this;
        }

        public Criteria andCurrentYearPercentIn(List<String> values) {
            addCriterion("current_year_percent in", values, "currentYearPercent");
            return (Criteria) this;
        }

        public Criteria andCurrentYearPercentNotIn(List<String> values) {
            addCriterion("current_year_percent not in", values, "currentYearPercent");
            return (Criteria) this;
        }

        public Criteria andCurrentYearPercentBetween(String value1, String value2) {
            addCriterion("current_year_percent between", value1, value2, "currentYearPercent");
            return (Criteria) this;
        }

        public Criteria andCurrentYearPercentNotBetween(String value1, String value2) {
            addCriterion("current_year_percent not between", value1, value2, "currentYearPercent");
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

        public Criteria andVolumeRatioIsNull() {
            addCriterion("volume_ratio is null");
            return (Criteria) this;
        }

        public Criteria andVolumeRatioIsNotNull() {
            addCriterion("volume_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeRatioEqualTo(String value) {
            addCriterion("volume_ratio =", value, "volumeRatio");
            return (Criteria) this;
        }

        public Criteria andVolumeRatioNotEqualTo(String value) {
            addCriterion("volume_ratio <>", value, "volumeRatio");
            return (Criteria) this;
        }

        public Criteria andVolumeRatioGreaterThan(String value) {
            addCriterion("volume_ratio >", value, "volumeRatio");
            return (Criteria) this;
        }

        public Criteria andVolumeRatioGreaterThanOrEqualTo(String value) {
            addCriterion("volume_ratio >=", value, "volumeRatio");
            return (Criteria) this;
        }

        public Criteria andVolumeRatioLessThan(String value) {
            addCriterion("volume_ratio <", value, "volumeRatio");
            return (Criteria) this;
        }

        public Criteria andVolumeRatioLessThanOrEqualTo(String value) {
            addCriterion("volume_ratio <=", value, "volumeRatio");
            return (Criteria) this;
        }

        public Criteria andVolumeRatioLike(String value) {
            addCriterion("volume_ratio like", value, "volumeRatio");
            return (Criteria) this;
        }

        public Criteria andVolumeRatioNotLike(String value) {
            addCriterion("volume_ratio not like", value, "volumeRatio");
            return (Criteria) this;
        }

        public Criteria andVolumeRatioIn(List<String> values) {
            addCriterion("volume_ratio in", values, "volumeRatio");
            return (Criteria) this;
        }

        public Criteria andVolumeRatioNotIn(List<String> values) {
            addCriterion("volume_ratio not in", values, "volumeRatio");
            return (Criteria) this;
        }

        public Criteria andVolumeRatioBetween(String value1, String value2) {
            addCriterion("volume_ratio between", value1, value2, "volumeRatio");
            return (Criteria) this;
        }

        public Criteria andVolumeRatioNotBetween(String value1, String value2) {
            addCriterion("volume_ratio not between", value1, value2, "volumeRatio");
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