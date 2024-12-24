package com.blossom.backend.repository.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockReportsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockReportsExample() {
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

        public Criteria andReportDateIsNull() {
            addCriterion("report_date is null");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNotNull() {
            addCriterion("report_date is not null");
            return (Criteria) this;
        }

        public Criteria andReportDateEqualTo(String value) {
            addCriterion("report_date =", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotEqualTo(String value) {
            addCriterion("report_date <>", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThan(String value) {
            addCriterion("report_date >", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThanOrEqualTo(String value) {
            addCriterion("report_date >=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThan(String value) {
            addCriterion("report_date <", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThanOrEqualTo(String value) {
            addCriterion("report_date <=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLike(String value) {
            addCriterion("report_date like", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotLike(String value) {
            addCriterion("report_date not like", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateIn(List<String> values) {
            addCriterion("report_date in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotIn(List<String> values) {
            addCriterion("report_date not in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateBetween(String value1, String value2) {
            addCriterion("report_date between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotBetween(String value1, String value2) {
            addCriterion("report_date not between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportNameIsNull() {
            addCriterion("report_name is null");
            return (Criteria) this;
        }

        public Criteria andReportNameIsNotNull() {
            addCriterion("report_name is not null");
            return (Criteria) this;
        }

        public Criteria andReportNameEqualTo(String value) {
            addCriterion("report_name =", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotEqualTo(String value) {
            addCriterion("report_name <>", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameGreaterThan(String value) {
            addCriterion("report_name >", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameGreaterThanOrEqualTo(String value) {
            addCriterion("report_name >=", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLessThan(String value) {
            addCriterion("report_name <", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLessThanOrEqualTo(String value) {
            addCriterion("report_name <=", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLike(String value) {
            addCriterion("report_name like", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotLike(String value) {
            addCriterion("report_name not like", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameIn(List<String> values) {
            addCriterion("report_name in", values, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotIn(List<String> values) {
            addCriterion("report_name not in", values, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameBetween(String value1, String value2) {
            addCriterion("report_name between", value1, value2, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotBetween(String value1, String value2) {
            addCriterion("report_name not between", value1, value2, "reportName");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(String value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(String value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(String value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(String value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(String value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLike(String value) {
            addCriterion("ctime like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotLike(String value) {
            addCriterion("ctime not like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<String> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<String> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(String value1, String value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(String value1, String value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueIsNull() {
            addCriterion("total_revenue is null");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueIsNotNull() {
            addCriterion("total_revenue is not null");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueEqualTo(String value) {
            addCriterion("total_revenue =", value, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueNotEqualTo(String value) {
            addCriterion("total_revenue <>", value, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueGreaterThan(String value) {
            addCriterion("total_revenue >", value, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueGreaterThanOrEqualTo(String value) {
            addCriterion("total_revenue >=", value, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueLessThan(String value) {
            addCriterion("total_revenue <", value, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueLessThanOrEqualTo(String value) {
            addCriterion("total_revenue <=", value, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueLike(String value) {
            addCriterion("total_revenue like", value, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueNotLike(String value) {
            addCriterion("total_revenue not like", value, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueIn(List<String> values) {
            addCriterion("total_revenue in", values, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueNotIn(List<String> values) {
            addCriterion("total_revenue not in", values, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueBetween(String value1, String value2) {
            addCriterion("total_revenue between", value1, value2, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueNotBetween(String value1, String value2) {
            addCriterion("total_revenue not between", value1, value2, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andAvgRoeIsNull() {
            addCriterion("avg_roe is null");
            return (Criteria) this;
        }

        public Criteria andAvgRoeIsNotNull() {
            addCriterion("avg_roe is not null");
            return (Criteria) this;
        }

        public Criteria andAvgRoeEqualTo(String value) {
            addCriterion("avg_roe =", value, "avgRoe");
            return (Criteria) this;
        }

        public Criteria andAvgRoeNotEqualTo(String value) {
            addCriterion("avg_roe <>", value, "avgRoe");
            return (Criteria) this;
        }

        public Criteria andAvgRoeGreaterThan(String value) {
            addCriterion("avg_roe >", value, "avgRoe");
            return (Criteria) this;
        }

        public Criteria andAvgRoeGreaterThanOrEqualTo(String value) {
            addCriterion("avg_roe >=", value, "avgRoe");
            return (Criteria) this;
        }

        public Criteria andAvgRoeLessThan(String value) {
            addCriterion("avg_roe <", value, "avgRoe");
            return (Criteria) this;
        }

        public Criteria andAvgRoeLessThanOrEqualTo(String value) {
            addCriterion("avg_roe <=", value, "avgRoe");
            return (Criteria) this;
        }

        public Criteria andAvgRoeLike(String value) {
            addCriterion("avg_roe like", value, "avgRoe");
            return (Criteria) this;
        }

        public Criteria andAvgRoeNotLike(String value) {
            addCriterion("avg_roe not like", value, "avgRoe");
            return (Criteria) this;
        }

        public Criteria andAvgRoeIn(List<String> values) {
            addCriterion("avg_roe in", values, "avgRoe");
            return (Criteria) this;
        }

        public Criteria andAvgRoeNotIn(List<String> values) {
            addCriterion("avg_roe not in", values, "avgRoe");
            return (Criteria) this;
        }

        public Criteria andAvgRoeBetween(String value1, String value2) {
            addCriterion("avg_roe between", value1, value2, "avgRoe");
            return (Criteria) this;
        }

        public Criteria andAvgRoeNotBetween(String value1, String value2) {
            addCriterion("avg_roe not between", value1, value2, "avgRoe");
            return (Criteria) this;
        }

        public Criteria andNpPerShareIsNull() {
            addCriterion("np_per_share is null");
            return (Criteria) this;
        }

        public Criteria andNpPerShareIsNotNull() {
            addCriterion("np_per_share is not null");
            return (Criteria) this;
        }

        public Criteria andNpPerShareEqualTo(String value) {
            addCriterion("np_per_share =", value, "npPerShare");
            return (Criteria) this;
        }

        public Criteria andNpPerShareNotEqualTo(String value) {
            addCriterion("np_per_share <>", value, "npPerShare");
            return (Criteria) this;
        }

        public Criteria andNpPerShareGreaterThan(String value) {
            addCriterion("np_per_share >", value, "npPerShare");
            return (Criteria) this;
        }

        public Criteria andNpPerShareGreaterThanOrEqualTo(String value) {
            addCriterion("np_per_share >=", value, "npPerShare");
            return (Criteria) this;
        }

        public Criteria andNpPerShareLessThan(String value) {
            addCriterion("np_per_share <", value, "npPerShare");
            return (Criteria) this;
        }

        public Criteria andNpPerShareLessThanOrEqualTo(String value) {
            addCriterion("np_per_share <=", value, "npPerShare");
            return (Criteria) this;
        }

        public Criteria andNpPerShareLike(String value) {
            addCriterion("np_per_share like", value, "npPerShare");
            return (Criteria) this;
        }

        public Criteria andNpPerShareNotLike(String value) {
            addCriterion("np_per_share not like", value, "npPerShare");
            return (Criteria) this;
        }

        public Criteria andNpPerShareIn(List<String> values) {
            addCriterion("np_per_share in", values, "npPerShare");
            return (Criteria) this;
        }

        public Criteria andNpPerShareNotIn(List<String> values) {
            addCriterion("np_per_share not in", values, "npPerShare");
            return (Criteria) this;
        }

        public Criteria andNpPerShareBetween(String value1, String value2) {
            addCriterion("np_per_share between", value1, value2, "npPerShare");
            return (Criteria) this;
        }

        public Criteria andNpPerShareNotBetween(String value1, String value2) {
            addCriterion("np_per_share not between", value1, value2, "npPerShare");
            return (Criteria) this;
        }

        public Criteria andGrossSellingRateIsNull() {
            addCriterion("gross_selling_rate is null");
            return (Criteria) this;
        }

        public Criteria andGrossSellingRateIsNotNull() {
            addCriterion("gross_selling_rate is not null");
            return (Criteria) this;
        }

        public Criteria andGrossSellingRateEqualTo(String value) {
            addCriterion("gross_selling_rate =", value, "grossSellingRate");
            return (Criteria) this;
        }

        public Criteria andGrossSellingRateNotEqualTo(String value) {
            addCriterion("gross_selling_rate <>", value, "grossSellingRate");
            return (Criteria) this;
        }

        public Criteria andGrossSellingRateGreaterThan(String value) {
            addCriterion("gross_selling_rate >", value, "grossSellingRate");
            return (Criteria) this;
        }

        public Criteria andGrossSellingRateGreaterThanOrEqualTo(String value) {
            addCriterion("gross_selling_rate >=", value, "grossSellingRate");
            return (Criteria) this;
        }

        public Criteria andGrossSellingRateLessThan(String value) {
            addCriterion("gross_selling_rate <", value, "grossSellingRate");
            return (Criteria) this;
        }

        public Criteria andGrossSellingRateLessThanOrEqualTo(String value) {
            addCriterion("gross_selling_rate <=", value, "grossSellingRate");
            return (Criteria) this;
        }

        public Criteria andGrossSellingRateLike(String value) {
            addCriterion("gross_selling_rate like", value, "grossSellingRate");
            return (Criteria) this;
        }

        public Criteria andGrossSellingRateNotLike(String value) {
            addCriterion("gross_selling_rate not like", value, "grossSellingRate");
            return (Criteria) this;
        }

        public Criteria andGrossSellingRateIn(List<String> values) {
            addCriterion("gross_selling_rate in", values, "grossSellingRate");
            return (Criteria) this;
        }

        public Criteria andGrossSellingRateNotIn(List<String> values) {
            addCriterion("gross_selling_rate not in", values, "grossSellingRate");
            return (Criteria) this;
        }

        public Criteria andGrossSellingRateBetween(String value1, String value2) {
            addCriterion("gross_selling_rate between", value1, value2, "grossSellingRate");
            return (Criteria) this;
        }

        public Criteria andGrossSellingRateNotBetween(String value1, String value2) {
            addCriterion("gross_selling_rate not between", value1, value2, "grossSellingRate");
            return (Criteria) this;
        }

        public Criteria andNetInterestOfTotalAssetsIsNull() {
            addCriterion("net_interest_of_total_assets is null");
            return (Criteria) this;
        }

        public Criteria andNetInterestOfTotalAssetsIsNotNull() {
            addCriterion("net_interest_of_total_assets is not null");
            return (Criteria) this;
        }

        public Criteria andNetInterestOfTotalAssetsEqualTo(String value) {
            addCriterion("net_interest_of_total_assets =", value, "netInterestOfTotalAssets");
            return (Criteria) this;
        }

        public Criteria andNetInterestOfTotalAssetsNotEqualTo(String value) {
            addCriterion("net_interest_of_total_assets <>", value, "netInterestOfTotalAssets");
            return (Criteria) this;
        }

        public Criteria andNetInterestOfTotalAssetsGreaterThan(String value) {
            addCriterion("net_interest_of_total_assets >", value, "netInterestOfTotalAssets");
            return (Criteria) this;
        }

        public Criteria andNetInterestOfTotalAssetsGreaterThanOrEqualTo(String value) {
            addCriterion("net_interest_of_total_assets >=", value, "netInterestOfTotalAssets");
            return (Criteria) this;
        }

        public Criteria andNetInterestOfTotalAssetsLessThan(String value) {
            addCriterion("net_interest_of_total_assets <", value, "netInterestOfTotalAssets");
            return (Criteria) this;
        }

        public Criteria andNetInterestOfTotalAssetsLessThanOrEqualTo(String value) {
            addCriterion("net_interest_of_total_assets <=", value, "netInterestOfTotalAssets");
            return (Criteria) this;
        }

        public Criteria andNetInterestOfTotalAssetsLike(String value) {
            addCriterion("net_interest_of_total_assets like", value, "netInterestOfTotalAssets");
            return (Criteria) this;
        }

        public Criteria andNetInterestOfTotalAssetsNotLike(String value) {
            addCriterion("net_interest_of_total_assets not like", value, "netInterestOfTotalAssets");
            return (Criteria) this;
        }

        public Criteria andNetInterestOfTotalAssetsIn(List<String> values) {
            addCriterion("net_interest_of_total_assets in", values, "netInterestOfTotalAssets");
            return (Criteria) this;
        }

        public Criteria andNetInterestOfTotalAssetsNotIn(List<String> values) {
            addCriterion("net_interest_of_total_assets not in", values, "netInterestOfTotalAssets");
            return (Criteria) this;
        }

        public Criteria andNetInterestOfTotalAssetsBetween(String value1, String value2) {
            addCriterion("net_interest_of_total_assets between", value1, value2, "netInterestOfTotalAssets");
            return (Criteria) this;
        }

        public Criteria andNetInterestOfTotalAssetsNotBetween(String value1, String value2) {
            addCriterion("net_interest_of_total_assets not between", value1, value2, "netInterestOfTotalAssets");
            return (Criteria) this;
        }

        public Criteria andNetSellingRateIsNull() {
            addCriterion("net_selling_rate is null");
            return (Criteria) this;
        }

        public Criteria andNetSellingRateIsNotNull() {
            addCriterion("net_selling_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNetSellingRateEqualTo(String value) {
            addCriterion("net_selling_rate =", value, "netSellingRate");
            return (Criteria) this;
        }

        public Criteria andNetSellingRateNotEqualTo(String value) {
            addCriterion("net_selling_rate <>", value, "netSellingRate");
            return (Criteria) this;
        }

        public Criteria andNetSellingRateGreaterThan(String value) {
            addCriterion("net_selling_rate >", value, "netSellingRate");
            return (Criteria) this;
        }

        public Criteria andNetSellingRateGreaterThanOrEqualTo(String value) {
            addCriterion("net_selling_rate >=", value, "netSellingRate");
            return (Criteria) this;
        }

        public Criteria andNetSellingRateLessThan(String value) {
            addCriterion("net_selling_rate <", value, "netSellingRate");
            return (Criteria) this;
        }

        public Criteria andNetSellingRateLessThanOrEqualTo(String value) {
            addCriterion("net_selling_rate <=", value, "netSellingRate");
            return (Criteria) this;
        }

        public Criteria andNetSellingRateLike(String value) {
            addCriterion("net_selling_rate like", value, "netSellingRate");
            return (Criteria) this;
        }

        public Criteria andNetSellingRateNotLike(String value) {
            addCriterion("net_selling_rate not like", value, "netSellingRate");
            return (Criteria) this;
        }

        public Criteria andNetSellingRateIn(List<String> values) {
            addCriterion("net_selling_rate in", values, "netSellingRate");
            return (Criteria) this;
        }

        public Criteria andNetSellingRateNotIn(List<String> values) {
            addCriterion("net_selling_rate not in", values, "netSellingRate");
            return (Criteria) this;
        }

        public Criteria andNetSellingRateBetween(String value1, String value2) {
            addCriterion("net_selling_rate between", value1, value2, "netSellingRate");
            return (Criteria) this;
        }

        public Criteria andNetSellingRateNotBetween(String value1, String value2) {
            addCriterion("net_selling_rate not between", value1, value2, "netSellingRate");
            return (Criteria) this;
        }

        public Criteria andOperateCashFlowPsIsNull() {
            addCriterion("operate_cash_flow_ps is null");
            return (Criteria) this;
        }

        public Criteria andOperateCashFlowPsIsNotNull() {
            addCriterion("operate_cash_flow_ps is not null");
            return (Criteria) this;
        }

        public Criteria andOperateCashFlowPsEqualTo(String value) {
            addCriterion("operate_cash_flow_ps =", value, "operateCashFlowPs");
            return (Criteria) this;
        }

        public Criteria andOperateCashFlowPsNotEqualTo(String value) {
            addCriterion("operate_cash_flow_ps <>", value, "operateCashFlowPs");
            return (Criteria) this;
        }

        public Criteria andOperateCashFlowPsGreaterThan(String value) {
            addCriterion("operate_cash_flow_ps >", value, "operateCashFlowPs");
            return (Criteria) this;
        }

        public Criteria andOperateCashFlowPsGreaterThanOrEqualTo(String value) {
            addCriterion("operate_cash_flow_ps >=", value, "operateCashFlowPs");
            return (Criteria) this;
        }

        public Criteria andOperateCashFlowPsLessThan(String value) {
            addCriterion("operate_cash_flow_ps <", value, "operateCashFlowPs");
            return (Criteria) this;
        }

        public Criteria andOperateCashFlowPsLessThanOrEqualTo(String value) {
            addCriterion("operate_cash_flow_ps <=", value, "operateCashFlowPs");
            return (Criteria) this;
        }

        public Criteria andOperateCashFlowPsLike(String value) {
            addCriterion("operate_cash_flow_ps like", value, "operateCashFlowPs");
            return (Criteria) this;
        }

        public Criteria andOperateCashFlowPsNotLike(String value) {
            addCriterion("operate_cash_flow_ps not like", value, "operateCashFlowPs");
            return (Criteria) this;
        }

        public Criteria andOperateCashFlowPsIn(List<String> values) {
            addCriterion("operate_cash_flow_ps in", values, "operateCashFlowPs");
            return (Criteria) this;
        }

        public Criteria andOperateCashFlowPsNotIn(List<String> values) {
            addCriterion("operate_cash_flow_ps not in", values, "operateCashFlowPs");
            return (Criteria) this;
        }

        public Criteria andOperateCashFlowPsBetween(String value1, String value2) {
            addCriterion("operate_cash_flow_ps between", value1, value2, "operateCashFlowPs");
            return (Criteria) this;
        }

        public Criteria andOperateCashFlowPsNotBetween(String value1, String value2) {
            addCriterion("operate_cash_flow_ps not between", value1, value2, "operateCashFlowPs");
            return (Criteria) this;
        }

        public Criteria andBasicEpsIsNull() {
            addCriterion("basic_eps is null");
            return (Criteria) this;
        }

        public Criteria andBasicEpsIsNotNull() {
            addCriterion("basic_eps is not null");
            return (Criteria) this;
        }

        public Criteria andBasicEpsEqualTo(String value) {
            addCriterion("basic_eps =", value, "basicEps");
            return (Criteria) this;
        }

        public Criteria andBasicEpsNotEqualTo(String value) {
            addCriterion("basic_eps <>", value, "basicEps");
            return (Criteria) this;
        }

        public Criteria andBasicEpsGreaterThan(String value) {
            addCriterion("basic_eps >", value, "basicEps");
            return (Criteria) this;
        }

        public Criteria andBasicEpsGreaterThanOrEqualTo(String value) {
            addCriterion("basic_eps >=", value, "basicEps");
            return (Criteria) this;
        }

        public Criteria andBasicEpsLessThan(String value) {
            addCriterion("basic_eps <", value, "basicEps");
            return (Criteria) this;
        }

        public Criteria andBasicEpsLessThanOrEqualTo(String value) {
            addCriterion("basic_eps <=", value, "basicEps");
            return (Criteria) this;
        }

        public Criteria andBasicEpsLike(String value) {
            addCriterion("basic_eps like", value, "basicEps");
            return (Criteria) this;
        }

        public Criteria andBasicEpsNotLike(String value) {
            addCriterion("basic_eps not like", value, "basicEps");
            return (Criteria) this;
        }

        public Criteria andBasicEpsIn(List<String> values) {
            addCriterion("basic_eps in", values, "basicEps");
            return (Criteria) this;
        }

        public Criteria andBasicEpsNotIn(List<String> values) {
            addCriterion("basic_eps not in", values, "basicEps");
            return (Criteria) this;
        }

        public Criteria andBasicEpsBetween(String value1, String value2) {
            addCriterion("basic_eps between", value1, value2, "basicEps");
            return (Criteria) this;
        }

        public Criteria andBasicEpsNotBetween(String value1, String value2) {
            addCriterion("basic_eps not between", value1, value2, "basicEps");
            return (Criteria) this;
        }

        public Criteria andCapitalReserveIsNull() {
            addCriterion("capital_reserve is null");
            return (Criteria) this;
        }

        public Criteria andCapitalReserveIsNotNull() {
            addCriterion("capital_reserve is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalReserveEqualTo(String value) {
            addCriterion("capital_reserve =", value, "capitalReserve");
            return (Criteria) this;
        }

        public Criteria andCapitalReserveNotEqualTo(String value) {
            addCriterion("capital_reserve <>", value, "capitalReserve");
            return (Criteria) this;
        }

        public Criteria andCapitalReserveGreaterThan(String value) {
            addCriterion("capital_reserve >", value, "capitalReserve");
            return (Criteria) this;
        }

        public Criteria andCapitalReserveGreaterThanOrEqualTo(String value) {
            addCriterion("capital_reserve >=", value, "capitalReserve");
            return (Criteria) this;
        }

        public Criteria andCapitalReserveLessThan(String value) {
            addCriterion("capital_reserve <", value, "capitalReserve");
            return (Criteria) this;
        }

        public Criteria andCapitalReserveLessThanOrEqualTo(String value) {
            addCriterion("capital_reserve <=", value, "capitalReserve");
            return (Criteria) this;
        }

        public Criteria andCapitalReserveLike(String value) {
            addCriterion("capital_reserve like", value, "capitalReserve");
            return (Criteria) this;
        }

        public Criteria andCapitalReserveNotLike(String value) {
            addCriterion("capital_reserve not like", value, "capitalReserve");
            return (Criteria) this;
        }

        public Criteria andCapitalReserveIn(List<String> values) {
            addCriterion("capital_reserve in", values, "capitalReserve");
            return (Criteria) this;
        }

        public Criteria andCapitalReserveNotIn(List<String> values) {
            addCriterion("capital_reserve not in", values, "capitalReserve");
            return (Criteria) this;
        }

        public Criteria andCapitalReserveBetween(String value1, String value2) {
            addCriterion("capital_reserve between", value1, value2, "capitalReserve");
            return (Criteria) this;
        }

        public Criteria andCapitalReserveNotBetween(String value1, String value2) {
            addCriterion("capital_reserve not between", value1, value2, "capitalReserve");
            return (Criteria) this;
        }

        public Criteria andUndistriProfitPsIsNull() {
            addCriterion("undistri_profit_ps is null");
            return (Criteria) this;
        }

        public Criteria andUndistriProfitPsIsNotNull() {
            addCriterion("undistri_profit_ps is not null");
            return (Criteria) this;
        }

        public Criteria andUndistriProfitPsEqualTo(String value) {
            addCriterion("undistri_profit_ps =", value, "undistriProfitPs");
            return (Criteria) this;
        }

        public Criteria andUndistriProfitPsNotEqualTo(String value) {
            addCriterion("undistri_profit_ps <>", value, "undistriProfitPs");
            return (Criteria) this;
        }

        public Criteria andUndistriProfitPsGreaterThan(String value) {
            addCriterion("undistri_profit_ps >", value, "undistriProfitPs");
            return (Criteria) this;
        }

        public Criteria andUndistriProfitPsGreaterThanOrEqualTo(String value) {
            addCriterion("undistri_profit_ps >=", value, "undistriProfitPs");
            return (Criteria) this;
        }

        public Criteria andUndistriProfitPsLessThan(String value) {
            addCriterion("undistri_profit_ps <", value, "undistriProfitPs");
            return (Criteria) this;
        }

        public Criteria andUndistriProfitPsLessThanOrEqualTo(String value) {
            addCriterion("undistri_profit_ps <=", value, "undistriProfitPs");
            return (Criteria) this;
        }

        public Criteria andUndistriProfitPsLike(String value) {
            addCriterion("undistri_profit_ps like", value, "undistriProfitPs");
            return (Criteria) this;
        }

        public Criteria andUndistriProfitPsNotLike(String value) {
            addCriterion("undistri_profit_ps not like", value, "undistriProfitPs");
            return (Criteria) this;
        }

        public Criteria andUndistriProfitPsIn(List<String> values) {
            addCriterion("undistri_profit_ps in", values, "undistriProfitPs");
            return (Criteria) this;
        }

        public Criteria andUndistriProfitPsNotIn(List<String> values) {
            addCriterion("undistri_profit_ps not in", values, "undistriProfitPs");
            return (Criteria) this;
        }

        public Criteria andUndistriProfitPsBetween(String value1, String value2) {
            addCriterion("undistri_profit_ps between", value1, value2, "undistriProfitPs");
            return (Criteria) this;
        }

        public Criteria andUndistriProfitPsNotBetween(String value1, String value2) {
            addCriterion("undistri_profit_ps not between", value1, value2, "undistriProfitPs");
            return (Criteria) this;
        }

        public Criteria andOperatingIncomeYoyIsNull() {
            addCriterion("operating_income_yoy is null");
            return (Criteria) this;
        }

        public Criteria andOperatingIncomeYoyIsNotNull() {
            addCriterion("operating_income_yoy is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingIncomeYoyEqualTo(String value) {
            addCriterion("operating_income_yoy =", value, "operatingIncomeYoy");
            return (Criteria) this;
        }

        public Criteria andOperatingIncomeYoyNotEqualTo(String value) {
            addCriterion("operating_income_yoy <>", value, "operatingIncomeYoy");
            return (Criteria) this;
        }

        public Criteria andOperatingIncomeYoyGreaterThan(String value) {
            addCriterion("operating_income_yoy >", value, "operatingIncomeYoy");
            return (Criteria) this;
        }

        public Criteria andOperatingIncomeYoyGreaterThanOrEqualTo(String value) {
            addCriterion("operating_income_yoy >=", value, "operatingIncomeYoy");
            return (Criteria) this;
        }

        public Criteria andOperatingIncomeYoyLessThan(String value) {
            addCriterion("operating_income_yoy <", value, "operatingIncomeYoy");
            return (Criteria) this;
        }

        public Criteria andOperatingIncomeYoyLessThanOrEqualTo(String value) {
            addCriterion("operating_income_yoy <=", value, "operatingIncomeYoy");
            return (Criteria) this;
        }

        public Criteria andOperatingIncomeYoyLike(String value) {
            addCriterion("operating_income_yoy like", value, "operatingIncomeYoy");
            return (Criteria) this;
        }

        public Criteria andOperatingIncomeYoyNotLike(String value) {
            addCriterion("operating_income_yoy not like", value, "operatingIncomeYoy");
            return (Criteria) this;
        }

        public Criteria andOperatingIncomeYoyIn(List<String> values) {
            addCriterion("operating_income_yoy in", values, "operatingIncomeYoy");
            return (Criteria) this;
        }

        public Criteria andOperatingIncomeYoyNotIn(List<String> values) {
            addCriterion("operating_income_yoy not in", values, "operatingIncomeYoy");
            return (Criteria) this;
        }

        public Criteria andOperatingIncomeYoyBetween(String value1, String value2) {
            addCriterion("operating_income_yoy between", value1, value2, "operatingIncomeYoy");
            return (Criteria) this;
        }

        public Criteria andOperatingIncomeYoyNotBetween(String value1, String value2) {
            addCriterion("operating_income_yoy not between", value1, value2, "operatingIncomeYoy");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcIsNull() {
            addCriterion("net_profit_atsopc is null");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcIsNotNull() {
            addCriterion("net_profit_atsopc is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcEqualTo(String value) {
            addCriterion("net_profit_atsopc =", value, "netProfitAtsopc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcNotEqualTo(String value) {
            addCriterion("net_profit_atsopc <>", value, "netProfitAtsopc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcGreaterThan(String value) {
            addCriterion("net_profit_atsopc >", value, "netProfitAtsopc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcGreaterThanOrEqualTo(String value) {
            addCriterion("net_profit_atsopc >=", value, "netProfitAtsopc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcLessThan(String value) {
            addCriterion("net_profit_atsopc <", value, "netProfitAtsopc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcLessThanOrEqualTo(String value) {
            addCriterion("net_profit_atsopc <=", value, "netProfitAtsopc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcLike(String value) {
            addCriterion("net_profit_atsopc like", value, "netProfitAtsopc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcNotLike(String value) {
            addCriterion("net_profit_atsopc not like", value, "netProfitAtsopc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcIn(List<String> values) {
            addCriterion("net_profit_atsopc in", values, "netProfitAtsopc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcNotIn(List<String> values) {
            addCriterion("net_profit_atsopc not in", values, "netProfitAtsopc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcBetween(String value1, String value2) {
            addCriterion("net_profit_atsopc between", value1, value2, "netProfitAtsopc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcNotBetween(String value1, String value2) {
            addCriterion("net_profit_atsopc not between", value1, value2, "netProfitAtsopc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcYoyIsNull() {
            addCriterion("net_profit_atsopc_yoy is null");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcYoyIsNotNull() {
            addCriterion("net_profit_atsopc_yoy is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcYoyEqualTo(String value) {
            addCriterion("net_profit_atsopc_yoy =", value, "netProfitAtsopcYoy");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcYoyNotEqualTo(String value) {
            addCriterion("net_profit_atsopc_yoy <>", value, "netProfitAtsopcYoy");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcYoyGreaterThan(String value) {
            addCriterion("net_profit_atsopc_yoy >", value, "netProfitAtsopcYoy");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcYoyGreaterThanOrEqualTo(String value) {
            addCriterion("net_profit_atsopc_yoy >=", value, "netProfitAtsopcYoy");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcYoyLessThan(String value) {
            addCriterion("net_profit_atsopc_yoy <", value, "netProfitAtsopcYoy");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcYoyLessThanOrEqualTo(String value) {
            addCriterion("net_profit_atsopc_yoy <=", value, "netProfitAtsopcYoy");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcYoyLike(String value) {
            addCriterion("net_profit_atsopc_yoy like", value, "netProfitAtsopcYoy");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcYoyNotLike(String value) {
            addCriterion("net_profit_atsopc_yoy not like", value, "netProfitAtsopcYoy");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcYoyIn(List<String> values) {
            addCriterion("net_profit_atsopc_yoy in", values, "netProfitAtsopcYoy");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcYoyNotIn(List<String> values) {
            addCriterion("net_profit_atsopc_yoy not in", values, "netProfitAtsopcYoy");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcYoyBetween(String value1, String value2) {
            addCriterion("net_profit_atsopc_yoy between", value1, value2, "netProfitAtsopcYoy");
            return (Criteria) this;
        }

        public Criteria andNetProfitAtsopcYoyNotBetween(String value1, String value2) {
            addCriterion("net_profit_atsopc_yoy not between", value1, value2, "netProfitAtsopcYoy");
            return (Criteria) this;
        }

        public Criteria andNetProfitAfterNrgalAtsolcIsNull() {
            addCriterion("net_profit_after_nrgal_atsolc is null");
            return (Criteria) this;
        }

        public Criteria andNetProfitAfterNrgalAtsolcIsNotNull() {
            addCriterion("net_profit_after_nrgal_atsolc is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitAfterNrgalAtsolcEqualTo(String value) {
            addCriterion("net_profit_after_nrgal_atsolc =", value, "netProfitAfterNrgalAtsolc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAfterNrgalAtsolcNotEqualTo(String value) {
            addCriterion("net_profit_after_nrgal_atsolc <>", value, "netProfitAfterNrgalAtsolc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAfterNrgalAtsolcGreaterThan(String value) {
            addCriterion("net_profit_after_nrgal_atsolc >", value, "netProfitAfterNrgalAtsolc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAfterNrgalAtsolcGreaterThanOrEqualTo(String value) {
            addCriterion("net_profit_after_nrgal_atsolc >=", value, "netProfitAfterNrgalAtsolc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAfterNrgalAtsolcLessThan(String value) {
            addCriterion("net_profit_after_nrgal_atsolc <", value, "netProfitAfterNrgalAtsolc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAfterNrgalAtsolcLessThanOrEqualTo(String value) {
            addCriterion("net_profit_after_nrgal_atsolc <=", value, "netProfitAfterNrgalAtsolc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAfterNrgalAtsolcLike(String value) {
            addCriterion("net_profit_after_nrgal_atsolc like", value, "netProfitAfterNrgalAtsolc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAfterNrgalAtsolcNotLike(String value) {
            addCriterion("net_profit_after_nrgal_atsolc not like", value, "netProfitAfterNrgalAtsolc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAfterNrgalAtsolcIn(List<String> values) {
            addCriterion("net_profit_after_nrgal_atsolc in", values, "netProfitAfterNrgalAtsolc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAfterNrgalAtsolcNotIn(List<String> values) {
            addCriterion("net_profit_after_nrgal_atsolc not in", values, "netProfitAfterNrgalAtsolc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAfterNrgalAtsolcBetween(String value1, String value2) {
            addCriterion("net_profit_after_nrgal_atsolc between", value1, value2, "netProfitAfterNrgalAtsolc");
            return (Criteria) this;
        }

        public Criteria andNetProfitAfterNrgalAtsolcNotBetween(String value1, String value2) {
            addCriterion("net_profit_after_nrgal_atsolc not between", value1, value2, "netProfitAfterNrgalAtsolc");
            return (Criteria) this;
        }

        public Criteria andNpAtsopcNrgalYoyIsNull() {
            addCriterion("np_atsopc_nrgal_yoy is null");
            return (Criteria) this;
        }

        public Criteria andNpAtsopcNrgalYoyIsNotNull() {
            addCriterion("np_atsopc_nrgal_yoy is not null");
            return (Criteria) this;
        }

        public Criteria andNpAtsopcNrgalYoyEqualTo(String value) {
            addCriterion("np_atsopc_nrgal_yoy =", value, "npAtsopcNrgalYoy");
            return (Criteria) this;
        }

        public Criteria andNpAtsopcNrgalYoyNotEqualTo(String value) {
            addCriterion("np_atsopc_nrgal_yoy <>", value, "npAtsopcNrgalYoy");
            return (Criteria) this;
        }

        public Criteria andNpAtsopcNrgalYoyGreaterThan(String value) {
            addCriterion("np_atsopc_nrgal_yoy >", value, "npAtsopcNrgalYoy");
            return (Criteria) this;
        }

        public Criteria andNpAtsopcNrgalYoyGreaterThanOrEqualTo(String value) {
            addCriterion("np_atsopc_nrgal_yoy >=", value, "npAtsopcNrgalYoy");
            return (Criteria) this;
        }

        public Criteria andNpAtsopcNrgalYoyLessThan(String value) {
            addCriterion("np_atsopc_nrgal_yoy <", value, "npAtsopcNrgalYoy");
            return (Criteria) this;
        }

        public Criteria andNpAtsopcNrgalYoyLessThanOrEqualTo(String value) {
            addCriterion("np_atsopc_nrgal_yoy <=", value, "npAtsopcNrgalYoy");
            return (Criteria) this;
        }

        public Criteria andNpAtsopcNrgalYoyLike(String value) {
            addCriterion("np_atsopc_nrgal_yoy like", value, "npAtsopcNrgalYoy");
            return (Criteria) this;
        }

        public Criteria andNpAtsopcNrgalYoyNotLike(String value) {
            addCriterion("np_atsopc_nrgal_yoy not like", value, "npAtsopcNrgalYoy");
            return (Criteria) this;
        }

        public Criteria andNpAtsopcNrgalYoyIn(List<String> values) {
            addCriterion("np_atsopc_nrgal_yoy in", values, "npAtsopcNrgalYoy");
            return (Criteria) this;
        }

        public Criteria andNpAtsopcNrgalYoyNotIn(List<String> values) {
            addCriterion("np_atsopc_nrgal_yoy not in", values, "npAtsopcNrgalYoy");
            return (Criteria) this;
        }

        public Criteria andNpAtsopcNrgalYoyBetween(String value1, String value2) {
            addCriterion("np_atsopc_nrgal_yoy between", value1, value2, "npAtsopcNrgalYoy");
            return (Criteria) this;
        }

        public Criteria andNpAtsopcNrgalYoyNotBetween(String value1, String value2) {
            addCriterion("np_atsopc_nrgal_yoy not between", value1, value2, "npAtsopcNrgalYoy");
            return (Criteria) this;
        }

        public Criteria andOreDltIsNull() {
            addCriterion("ore_dlt is null");
            return (Criteria) this;
        }

        public Criteria andOreDltIsNotNull() {
            addCriterion("ore_dlt is not null");
            return (Criteria) this;
        }

        public Criteria andOreDltEqualTo(String value) {
            addCriterion("ore_dlt =", value, "oreDlt");
            return (Criteria) this;
        }

        public Criteria andOreDltNotEqualTo(String value) {
            addCriterion("ore_dlt <>", value, "oreDlt");
            return (Criteria) this;
        }

        public Criteria andOreDltGreaterThan(String value) {
            addCriterion("ore_dlt >", value, "oreDlt");
            return (Criteria) this;
        }

        public Criteria andOreDltGreaterThanOrEqualTo(String value) {
            addCriterion("ore_dlt >=", value, "oreDlt");
            return (Criteria) this;
        }

        public Criteria andOreDltLessThan(String value) {
            addCriterion("ore_dlt <", value, "oreDlt");
            return (Criteria) this;
        }

        public Criteria andOreDltLessThanOrEqualTo(String value) {
            addCriterion("ore_dlt <=", value, "oreDlt");
            return (Criteria) this;
        }

        public Criteria andOreDltLike(String value) {
            addCriterion("ore_dlt like", value, "oreDlt");
            return (Criteria) this;
        }

        public Criteria andOreDltNotLike(String value) {
            addCriterion("ore_dlt not like", value, "oreDlt");
            return (Criteria) this;
        }

        public Criteria andOreDltIn(List<String> values) {
            addCriterion("ore_dlt in", values, "oreDlt");
            return (Criteria) this;
        }

        public Criteria andOreDltNotIn(List<String> values) {
            addCriterion("ore_dlt not in", values, "oreDlt");
            return (Criteria) this;
        }

        public Criteria andOreDltBetween(String value1, String value2) {
            addCriterion("ore_dlt between", value1, value2, "oreDlt");
            return (Criteria) this;
        }

        public Criteria andOreDltNotBetween(String value1, String value2) {
            addCriterion("ore_dlt not between", value1, value2, "oreDlt");
            return (Criteria) this;
        }

        public Criteria andRopIsNull() {
            addCriterion("rop is null");
            return (Criteria) this;
        }

        public Criteria andRopIsNotNull() {
            addCriterion("rop is not null");
            return (Criteria) this;
        }

        public Criteria andRopEqualTo(String value) {
            addCriterion("rop =", value, "rop");
            return (Criteria) this;
        }

        public Criteria andRopNotEqualTo(String value) {
            addCriterion("rop <>", value, "rop");
            return (Criteria) this;
        }

        public Criteria andRopGreaterThan(String value) {
            addCriterion("rop >", value, "rop");
            return (Criteria) this;
        }

        public Criteria andRopGreaterThanOrEqualTo(String value) {
            addCriterion("rop >=", value, "rop");
            return (Criteria) this;
        }

        public Criteria andRopLessThan(String value) {
            addCriterion("rop <", value, "rop");
            return (Criteria) this;
        }

        public Criteria andRopLessThanOrEqualTo(String value) {
            addCriterion("rop <=", value, "rop");
            return (Criteria) this;
        }

        public Criteria andRopLike(String value) {
            addCriterion("rop like", value, "rop");
            return (Criteria) this;
        }

        public Criteria andRopNotLike(String value) {
            addCriterion("rop not like", value, "rop");
            return (Criteria) this;
        }

        public Criteria andRopIn(List<String> values) {
            addCriterion("rop in", values, "rop");
            return (Criteria) this;
        }

        public Criteria andRopNotIn(List<String> values) {
            addCriterion("rop not in", values, "rop");
            return (Criteria) this;
        }

        public Criteria andRopBetween(String value1, String value2) {
            addCriterion("rop between", value1, value2, "rop");
            return (Criteria) this;
        }

        public Criteria andRopNotBetween(String value1, String value2) {
            addCriterion("rop not between", value1, value2, "rop");
            return (Criteria) this;
        }

        public Criteria andAssetLiabRatioIsNull() {
            addCriterion("asset_liab_ratio is null");
            return (Criteria) this;
        }

        public Criteria andAssetLiabRatioIsNotNull() {
            addCriterion("asset_liab_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andAssetLiabRatioEqualTo(String value) {
            addCriterion("asset_liab_ratio =", value, "assetLiabRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabRatioNotEqualTo(String value) {
            addCriterion("asset_liab_ratio <>", value, "assetLiabRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabRatioGreaterThan(String value) {
            addCriterion("asset_liab_ratio >", value, "assetLiabRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabRatioGreaterThanOrEqualTo(String value) {
            addCriterion("asset_liab_ratio >=", value, "assetLiabRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabRatioLessThan(String value) {
            addCriterion("asset_liab_ratio <", value, "assetLiabRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabRatioLessThanOrEqualTo(String value) {
            addCriterion("asset_liab_ratio <=", value, "assetLiabRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabRatioLike(String value) {
            addCriterion("asset_liab_ratio like", value, "assetLiabRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabRatioNotLike(String value) {
            addCriterion("asset_liab_ratio not like", value, "assetLiabRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabRatioIn(List<String> values) {
            addCriterion("asset_liab_ratio in", values, "assetLiabRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabRatioNotIn(List<String> values) {
            addCriterion("asset_liab_ratio not in", values, "assetLiabRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabRatioBetween(String value1, String value2) {
            addCriterion("asset_liab_ratio between", value1, value2, "assetLiabRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabRatioNotBetween(String value1, String value2) {
            addCriterion("asset_liab_ratio not between", value1, value2, "assetLiabRatio");
            return (Criteria) this;
        }

        public Criteria andCurrentRatioIsNull() {
            addCriterion("current_ratio is null");
            return (Criteria) this;
        }

        public Criteria andCurrentRatioIsNotNull() {
            addCriterion("current_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentRatioEqualTo(String value) {
            addCriterion("current_ratio =", value, "currentRatio");
            return (Criteria) this;
        }

        public Criteria andCurrentRatioNotEqualTo(String value) {
            addCriterion("current_ratio <>", value, "currentRatio");
            return (Criteria) this;
        }

        public Criteria andCurrentRatioGreaterThan(String value) {
            addCriterion("current_ratio >", value, "currentRatio");
            return (Criteria) this;
        }

        public Criteria andCurrentRatioGreaterThanOrEqualTo(String value) {
            addCriterion("current_ratio >=", value, "currentRatio");
            return (Criteria) this;
        }

        public Criteria andCurrentRatioLessThan(String value) {
            addCriterion("current_ratio <", value, "currentRatio");
            return (Criteria) this;
        }

        public Criteria andCurrentRatioLessThanOrEqualTo(String value) {
            addCriterion("current_ratio <=", value, "currentRatio");
            return (Criteria) this;
        }

        public Criteria andCurrentRatioLike(String value) {
            addCriterion("current_ratio like", value, "currentRatio");
            return (Criteria) this;
        }

        public Criteria andCurrentRatioNotLike(String value) {
            addCriterion("current_ratio not like", value, "currentRatio");
            return (Criteria) this;
        }

        public Criteria andCurrentRatioIn(List<String> values) {
            addCriterion("current_ratio in", values, "currentRatio");
            return (Criteria) this;
        }

        public Criteria andCurrentRatioNotIn(List<String> values) {
            addCriterion("current_ratio not in", values, "currentRatio");
            return (Criteria) this;
        }

        public Criteria andCurrentRatioBetween(String value1, String value2) {
            addCriterion("current_ratio between", value1, value2, "currentRatio");
            return (Criteria) this;
        }

        public Criteria andCurrentRatioNotBetween(String value1, String value2) {
            addCriterion("current_ratio not between", value1, value2, "currentRatio");
            return (Criteria) this;
        }

        public Criteria andQuickRatioIsNull() {
            addCriterion("quick_ratio is null");
            return (Criteria) this;
        }

        public Criteria andQuickRatioIsNotNull() {
            addCriterion("quick_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andQuickRatioEqualTo(String value) {
            addCriterion("quick_ratio =", value, "quickRatio");
            return (Criteria) this;
        }

        public Criteria andQuickRatioNotEqualTo(String value) {
            addCriterion("quick_ratio <>", value, "quickRatio");
            return (Criteria) this;
        }

        public Criteria andQuickRatioGreaterThan(String value) {
            addCriterion("quick_ratio >", value, "quickRatio");
            return (Criteria) this;
        }

        public Criteria andQuickRatioGreaterThanOrEqualTo(String value) {
            addCriterion("quick_ratio >=", value, "quickRatio");
            return (Criteria) this;
        }

        public Criteria andQuickRatioLessThan(String value) {
            addCriterion("quick_ratio <", value, "quickRatio");
            return (Criteria) this;
        }

        public Criteria andQuickRatioLessThanOrEqualTo(String value) {
            addCriterion("quick_ratio <=", value, "quickRatio");
            return (Criteria) this;
        }

        public Criteria andQuickRatioLike(String value) {
            addCriterion("quick_ratio like", value, "quickRatio");
            return (Criteria) this;
        }

        public Criteria andQuickRatioNotLike(String value) {
            addCriterion("quick_ratio not like", value, "quickRatio");
            return (Criteria) this;
        }

        public Criteria andQuickRatioIn(List<String> values) {
            addCriterion("quick_ratio in", values, "quickRatio");
            return (Criteria) this;
        }

        public Criteria andQuickRatioNotIn(List<String> values) {
            addCriterion("quick_ratio not in", values, "quickRatio");
            return (Criteria) this;
        }

        public Criteria andQuickRatioBetween(String value1, String value2) {
            addCriterion("quick_ratio between", value1, value2, "quickRatio");
            return (Criteria) this;
        }

        public Criteria andQuickRatioNotBetween(String value1, String value2) {
            addCriterion("quick_ratio not between", value1, value2, "quickRatio");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierIsNull() {
            addCriterion("equity_multiplier is null");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierIsNotNull() {
            addCriterion("equity_multiplier is not null");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierEqualTo(String value) {
            addCriterion("equity_multiplier =", value, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierNotEqualTo(String value) {
            addCriterion("equity_multiplier <>", value, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierGreaterThan(String value) {
            addCriterion("equity_multiplier >", value, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierGreaterThanOrEqualTo(String value) {
            addCriterion("equity_multiplier >=", value, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierLessThan(String value) {
            addCriterion("equity_multiplier <", value, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierLessThanOrEqualTo(String value) {
            addCriterion("equity_multiplier <=", value, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierLike(String value) {
            addCriterion("equity_multiplier like", value, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierNotLike(String value) {
            addCriterion("equity_multiplier not like", value, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierIn(List<String> values) {
            addCriterion("equity_multiplier in", values, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierNotIn(List<String> values) {
            addCriterion("equity_multiplier not in", values, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierBetween(String value1, String value2) {
            addCriterion("equity_multiplier between", value1, value2, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierNotBetween(String value1, String value2) {
            addCriterion("equity_multiplier not between", value1, value2, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityRatioIsNull() {
            addCriterion("equity_ratio is null");
            return (Criteria) this;
        }

        public Criteria andEquityRatioIsNotNull() {
            addCriterion("equity_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andEquityRatioEqualTo(String value) {
            addCriterion("equity_ratio =", value, "equityRatio");
            return (Criteria) this;
        }

        public Criteria andEquityRatioNotEqualTo(String value) {
            addCriterion("equity_ratio <>", value, "equityRatio");
            return (Criteria) this;
        }

        public Criteria andEquityRatioGreaterThan(String value) {
            addCriterion("equity_ratio >", value, "equityRatio");
            return (Criteria) this;
        }

        public Criteria andEquityRatioGreaterThanOrEqualTo(String value) {
            addCriterion("equity_ratio >=", value, "equityRatio");
            return (Criteria) this;
        }

        public Criteria andEquityRatioLessThan(String value) {
            addCriterion("equity_ratio <", value, "equityRatio");
            return (Criteria) this;
        }

        public Criteria andEquityRatioLessThanOrEqualTo(String value) {
            addCriterion("equity_ratio <=", value, "equityRatio");
            return (Criteria) this;
        }

        public Criteria andEquityRatioLike(String value) {
            addCriterion("equity_ratio like", value, "equityRatio");
            return (Criteria) this;
        }

        public Criteria andEquityRatioNotLike(String value) {
            addCriterion("equity_ratio not like", value, "equityRatio");
            return (Criteria) this;
        }

        public Criteria andEquityRatioIn(List<String> values) {
            addCriterion("equity_ratio in", values, "equityRatio");
            return (Criteria) this;
        }

        public Criteria andEquityRatioNotIn(List<String> values) {
            addCriterion("equity_ratio not in", values, "equityRatio");
            return (Criteria) this;
        }

        public Criteria andEquityRatioBetween(String value1, String value2) {
            addCriterion("equity_ratio between", value1, value2, "equityRatio");
            return (Criteria) this;
        }

        public Criteria andEquityRatioNotBetween(String value1, String value2) {
            addCriterion("equity_ratio not between", value1, value2, "equityRatio");
            return (Criteria) this;
        }

        public Criteria andHolderEquityIsNull() {
            addCriterion("holder_equity is null");
            return (Criteria) this;
        }

        public Criteria andHolderEquityIsNotNull() {
            addCriterion("holder_equity is not null");
            return (Criteria) this;
        }

        public Criteria andHolderEquityEqualTo(String value) {
            addCriterion("holder_equity =", value, "holderEquity");
            return (Criteria) this;
        }

        public Criteria andHolderEquityNotEqualTo(String value) {
            addCriterion("holder_equity <>", value, "holderEquity");
            return (Criteria) this;
        }

        public Criteria andHolderEquityGreaterThan(String value) {
            addCriterion("holder_equity >", value, "holderEquity");
            return (Criteria) this;
        }

        public Criteria andHolderEquityGreaterThanOrEqualTo(String value) {
            addCriterion("holder_equity >=", value, "holderEquity");
            return (Criteria) this;
        }

        public Criteria andHolderEquityLessThan(String value) {
            addCriterion("holder_equity <", value, "holderEquity");
            return (Criteria) this;
        }

        public Criteria andHolderEquityLessThanOrEqualTo(String value) {
            addCriterion("holder_equity <=", value, "holderEquity");
            return (Criteria) this;
        }

        public Criteria andHolderEquityLike(String value) {
            addCriterion("holder_equity like", value, "holderEquity");
            return (Criteria) this;
        }

        public Criteria andHolderEquityNotLike(String value) {
            addCriterion("holder_equity not like", value, "holderEquity");
            return (Criteria) this;
        }

        public Criteria andHolderEquityIn(List<String> values) {
            addCriterion("holder_equity in", values, "holderEquity");
            return (Criteria) this;
        }

        public Criteria andHolderEquityNotIn(List<String> values) {
            addCriterion("holder_equity not in", values, "holderEquity");
            return (Criteria) this;
        }

        public Criteria andHolderEquityBetween(String value1, String value2) {
            addCriterion("holder_equity between", value1, value2, "holderEquity");
            return (Criteria) this;
        }

        public Criteria andHolderEquityNotBetween(String value1, String value2) {
            addCriterion("holder_equity not between", value1, value2, "holderEquity");
            return (Criteria) this;
        }

        public Criteria andNcfFromOaToTotalLiabIsNull() {
            addCriterion("ncf_from_oa_to_total_liab is null");
            return (Criteria) this;
        }

        public Criteria andNcfFromOaToTotalLiabIsNotNull() {
            addCriterion("ncf_from_oa_to_total_liab is not null");
            return (Criteria) this;
        }

        public Criteria andNcfFromOaToTotalLiabEqualTo(String value) {
            addCriterion("ncf_from_oa_to_total_liab =", value, "ncfFromOaToTotalLiab");
            return (Criteria) this;
        }

        public Criteria andNcfFromOaToTotalLiabNotEqualTo(String value) {
            addCriterion("ncf_from_oa_to_total_liab <>", value, "ncfFromOaToTotalLiab");
            return (Criteria) this;
        }

        public Criteria andNcfFromOaToTotalLiabGreaterThan(String value) {
            addCriterion("ncf_from_oa_to_total_liab >", value, "ncfFromOaToTotalLiab");
            return (Criteria) this;
        }

        public Criteria andNcfFromOaToTotalLiabGreaterThanOrEqualTo(String value) {
            addCriterion("ncf_from_oa_to_total_liab >=", value, "ncfFromOaToTotalLiab");
            return (Criteria) this;
        }

        public Criteria andNcfFromOaToTotalLiabLessThan(String value) {
            addCriterion("ncf_from_oa_to_total_liab <", value, "ncfFromOaToTotalLiab");
            return (Criteria) this;
        }

        public Criteria andNcfFromOaToTotalLiabLessThanOrEqualTo(String value) {
            addCriterion("ncf_from_oa_to_total_liab <=", value, "ncfFromOaToTotalLiab");
            return (Criteria) this;
        }

        public Criteria andNcfFromOaToTotalLiabLike(String value) {
            addCriterion("ncf_from_oa_to_total_liab like", value, "ncfFromOaToTotalLiab");
            return (Criteria) this;
        }

        public Criteria andNcfFromOaToTotalLiabNotLike(String value) {
            addCriterion("ncf_from_oa_to_total_liab not like", value, "ncfFromOaToTotalLiab");
            return (Criteria) this;
        }

        public Criteria andNcfFromOaToTotalLiabIn(List<String> values) {
            addCriterion("ncf_from_oa_to_total_liab in", values, "ncfFromOaToTotalLiab");
            return (Criteria) this;
        }

        public Criteria andNcfFromOaToTotalLiabNotIn(List<String> values) {
            addCriterion("ncf_from_oa_to_total_liab not in", values, "ncfFromOaToTotalLiab");
            return (Criteria) this;
        }

        public Criteria andNcfFromOaToTotalLiabBetween(String value1, String value2) {
            addCriterion("ncf_from_oa_to_total_liab between", value1, value2, "ncfFromOaToTotalLiab");
            return (Criteria) this;
        }

        public Criteria andNcfFromOaToTotalLiabNotBetween(String value1, String value2) {
            addCriterion("ncf_from_oa_to_total_liab not between", value1, value2, "ncfFromOaToTotalLiab");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverDaysIsNull() {
            addCriterion("inventory_turnover_days is null");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverDaysIsNotNull() {
            addCriterion("inventory_turnover_days is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverDaysEqualTo(String value) {
            addCriterion("inventory_turnover_days =", value, "inventoryTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverDaysNotEqualTo(String value) {
            addCriterion("inventory_turnover_days <>", value, "inventoryTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverDaysGreaterThan(String value) {
            addCriterion("inventory_turnover_days >", value, "inventoryTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverDaysGreaterThanOrEqualTo(String value) {
            addCriterion("inventory_turnover_days >=", value, "inventoryTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverDaysLessThan(String value) {
            addCriterion("inventory_turnover_days <", value, "inventoryTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverDaysLessThanOrEqualTo(String value) {
            addCriterion("inventory_turnover_days <=", value, "inventoryTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverDaysLike(String value) {
            addCriterion("inventory_turnover_days like", value, "inventoryTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverDaysNotLike(String value) {
            addCriterion("inventory_turnover_days not like", value, "inventoryTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverDaysIn(List<String> values) {
            addCriterion("inventory_turnover_days in", values, "inventoryTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverDaysNotIn(List<String> values) {
            addCriterion("inventory_turnover_days not in", values, "inventoryTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverDaysBetween(String value1, String value2) {
            addCriterion("inventory_turnover_days between", value1, value2, "inventoryTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverDaysNotBetween(String value1, String value2) {
            addCriterion("inventory_turnover_days not between", value1, value2, "inventoryTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andReceivableTurnoverDaysIsNull() {
            addCriterion("receivable_turnover_days is null");
            return (Criteria) this;
        }

        public Criteria andReceivableTurnoverDaysIsNotNull() {
            addCriterion("receivable_turnover_days is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableTurnoverDaysEqualTo(String value) {
            addCriterion("receivable_turnover_days =", value, "receivableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andReceivableTurnoverDaysNotEqualTo(String value) {
            addCriterion("receivable_turnover_days <>", value, "receivableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andReceivableTurnoverDaysGreaterThan(String value) {
            addCriterion("receivable_turnover_days >", value, "receivableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andReceivableTurnoverDaysGreaterThanOrEqualTo(String value) {
            addCriterion("receivable_turnover_days >=", value, "receivableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andReceivableTurnoverDaysLessThan(String value) {
            addCriterion("receivable_turnover_days <", value, "receivableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andReceivableTurnoverDaysLessThanOrEqualTo(String value) {
            addCriterion("receivable_turnover_days <=", value, "receivableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andReceivableTurnoverDaysLike(String value) {
            addCriterion("receivable_turnover_days like", value, "receivableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andReceivableTurnoverDaysNotLike(String value) {
            addCriterion("receivable_turnover_days not like", value, "receivableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andReceivableTurnoverDaysIn(List<String> values) {
            addCriterion("receivable_turnover_days in", values, "receivableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andReceivableTurnoverDaysNotIn(List<String> values) {
            addCriterion("receivable_turnover_days not in", values, "receivableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andReceivableTurnoverDaysBetween(String value1, String value2) {
            addCriterion("receivable_turnover_days between", value1, value2, "receivableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andReceivableTurnoverDaysNotBetween(String value1, String value2) {
            addCriterion("receivable_turnover_days not between", value1, value2, "receivableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverDaysIsNull() {
            addCriterion("accounts_payable_turnover_days is null");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverDaysIsNotNull() {
            addCriterion("accounts_payable_turnover_days is not null");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverDaysEqualTo(String value) {
            addCriterion("accounts_payable_turnover_days =", value, "accountsPayableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverDaysNotEqualTo(String value) {
            addCriterion("accounts_payable_turnover_days <>", value, "accountsPayableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverDaysGreaterThan(String value) {
            addCriterion("accounts_payable_turnover_days >", value, "accountsPayableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverDaysGreaterThanOrEqualTo(String value) {
            addCriterion("accounts_payable_turnover_days >=", value, "accountsPayableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverDaysLessThan(String value) {
            addCriterion("accounts_payable_turnover_days <", value, "accountsPayableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverDaysLessThanOrEqualTo(String value) {
            addCriterion("accounts_payable_turnover_days <=", value, "accountsPayableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverDaysLike(String value) {
            addCriterion("accounts_payable_turnover_days like", value, "accountsPayableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverDaysNotLike(String value) {
            addCriterion("accounts_payable_turnover_days not like", value, "accountsPayableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverDaysIn(List<String> values) {
            addCriterion("accounts_payable_turnover_days in", values, "accountsPayableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverDaysNotIn(List<String> values) {
            addCriterion("accounts_payable_turnover_days not in", values, "accountsPayableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverDaysBetween(String value1, String value2) {
            addCriterion("accounts_payable_turnover_days between", value1, value2, "accountsPayableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverDaysNotBetween(String value1, String value2) {
            addCriterion("accounts_payable_turnover_days not between", value1, value2, "accountsPayableTurnoverDays");
            return (Criteria) this;
        }

        public Criteria andCashCycleIsNull() {
            addCriterion("cash_cycle is null");
            return (Criteria) this;
        }

        public Criteria andCashCycleIsNotNull() {
            addCriterion("cash_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andCashCycleEqualTo(String value) {
            addCriterion("cash_cycle =", value, "cashCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleNotEqualTo(String value) {
            addCriterion("cash_cycle <>", value, "cashCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleGreaterThan(String value) {
            addCriterion("cash_cycle >", value, "cashCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleGreaterThanOrEqualTo(String value) {
            addCriterion("cash_cycle >=", value, "cashCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleLessThan(String value) {
            addCriterion("cash_cycle <", value, "cashCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleLessThanOrEqualTo(String value) {
            addCriterion("cash_cycle <=", value, "cashCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleLike(String value) {
            addCriterion("cash_cycle like", value, "cashCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleNotLike(String value) {
            addCriterion("cash_cycle not like", value, "cashCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleIn(List<String> values) {
            addCriterion("cash_cycle in", values, "cashCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleNotIn(List<String> values) {
            addCriterion("cash_cycle not in", values, "cashCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleBetween(String value1, String value2) {
            addCriterion("cash_cycle between", value1, value2, "cashCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleNotBetween(String value1, String value2) {
            addCriterion("cash_cycle not between", value1, value2, "cashCycle");
            return (Criteria) this;
        }

        public Criteria andOperatingCycleIsNull() {
            addCriterion("operating_cycle is null");
            return (Criteria) this;
        }

        public Criteria andOperatingCycleIsNotNull() {
            addCriterion("operating_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingCycleEqualTo(String value) {
            addCriterion("operating_cycle =", value, "operatingCycle");
            return (Criteria) this;
        }

        public Criteria andOperatingCycleNotEqualTo(String value) {
            addCriterion("operating_cycle <>", value, "operatingCycle");
            return (Criteria) this;
        }

        public Criteria andOperatingCycleGreaterThan(String value) {
            addCriterion("operating_cycle >", value, "operatingCycle");
            return (Criteria) this;
        }

        public Criteria andOperatingCycleGreaterThanOrEqualTo(String value) {
            addCriterion("operating_cycle >=", value, "operatingCycle");
            return (Criteria) this;
        }

        public Criteria andOperatingCycleLessThan(String value) {
            addCriterion("operating_cycle <", value, "operatingCycle");
            return (Criteria) this;
        }

        public Criteria andOperatingCycleLessThanOrEqualTo(String value) {
            addCriterion("operating_cycle <=", value, "operatingCycle");
            return (Criteria) this;
        }

        public Criteria andOperatingCycleLike(String value) {
            addCriterion("operating_cycle like", value, "operatingCycle");
            return (Criteria) this;
        }

        public Criteria andOperatingCycleNotLike(String value) {
            addCriterion("operating_cycle not like", value, "operatingCycle");
            return (Criteria) this;
        }

        public Criteria andOperatingCycleIn(List<String> values) {
            addCriterion("operating_cycle in", values, "operatingCycle");
            return (Criteria) this;
        }

        public Criteria andOperatingCycleNotIn(List<String> values) {
            addCriterion("operating_cycle not in", values, "operatingCycle");
            return (Criteria) this;
        }

        public Criteria andOperatingCycleBetween(String value1, String value2) {
            addCriterion("operating_cycle between", value1, value2, "operatingCycle");
            return (Criteria) this;
        }

        public Criteria andOperatingCycleNotBetween(String value1, String value2) {
            addCriterion("operating_cycle not between", value1, value2, "operatingCycle");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalTurnoverIsNull() {
            addCriterion("total_capital_turnover is null");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalTurnoverIsNotNull() {
            addCriterion("total_capital_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalTurnoverEqualTo(String value) {
            addCriterion("total_capital_turnover =", value, "totalCapitalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalTurnoverNotEqualTo(String value) {
            addCriterion("total_capital_turnover <>", value, "totalCapitalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalTurnoverGreaterThan(String value) {
            addCriterion("total_capital_turnover >", value, "totalCapitalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalTurnoverGreaterThanOrEqualTo(String value) {
            addCriterion("total_capital_turnover >=", value, "totalCapitalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalTurnoverLessThan(String value) {
            addCriterion("total_capital_turnover <", value, "totalCapitalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalTurnoverLessThanOrEqualTo(String value) {
            addCriterion("total_capital_turnover <=", value, "totalCapitalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalTurnoverLike(String value) {
            addCriterion("total_capital_turnover like", value, "totalCapitalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalTurnoverNotLike(String value) {
            addCriterion("total_capital_turnover not like", value, "totalCapitalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalTurnoverIn(List<String> values) {
            addCriterion("total_capital_turnover in", values, "totalCapitalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalTurnoverNotIn(List<String> values) {
            addCriterion("total_capital_turnover not in", values, "totalCapitalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalTurnoverBetween(String value1, String value2) {
            addCriterion("total_capital_turnover between", value1, value2, "totalCapitalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalTurnoverNotBetween(String value1, String value2) {
            addCriterion("total_capital_turnover not between", value1, value2, "totalCapitalTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverIsNull() {
            addCriterion("inventory_turnover is null");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverIsNotNull() {
            addCriterion("inventory_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverEqualTo(String value) {
            addCriterion("inventory_turnover =", value, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverNotEqualTo(String value) {
            addCriterion("inventory_turnover <>", value, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverGreaterThan(String value) {
            addCriterion("inventory_turnover >", value, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverGreaterThanOrEqualTo(String value) {
            addCriterion("inventory_turnover >=", value, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverLessThan(String value) {
            addCriterion("inventory_turnover <", value, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverLessThanOrEqualTo(String value) {
            addCriterion("inventory_turnover <=", value, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverLike(String value) {
            addCriterion("inventory_turnover like", value, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverNotLike(String value) {
            addCriterion("inventory_turnover not like", value, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverIn(List<String> values) {
            addCriterion("inventory_turnover in", values, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverNotIn(List<String> values) {
            addCriterion("inventory_turnover not in", values, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverBetween(String value1, String value2) {
            addCriterion("inventory_turnover between", value1, value2, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverNotBetween(String value1, String value2) {
            addCriterion("inventory_turnover not between", value1, value2, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableTurnoverIsNull() {
            addCriterion("account_receivable_turnover is null");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableTurnoverIsNotNull() {
            addCriterion("account_receivable_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableTurnoverEqualTo(String value) {
            addCriterion("account_receivable_turnover =", value, "accountReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableTurnoverNotEqualTo(String value) {
            addCriterion("account_receivable_turnover <>", value, "accountReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableTurnoverGreaterThan(String value) {
            addCriterion("account_receivable_turnover >", value, "accountReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableTurnoverGreaterThanOrEqualTo(String value) {
            addCriterion("account_receivable_turnover >=", value, "accountReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableTurnoverLessThan(String value) {
            addCriterion("account_receivable_turnover <", value, "accountReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableTurnoverLessThanOrEqualTo(String value) {
            addCriterion("account_receivable_turnover <=", value, "accountReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableTurnoverLike(String value) {
            addCriterion("account_receivable_turnover like", value, "accountReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableTurnoverNotLike(String value) {
            addCriterion("account_receivable_turnover not like", value, "accountReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableTurnoverIn(List<String> values) {
            addCriterion("account_receivable_turnover in", values, "accountReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableTurnoverNotIn(List<String> values) {
            addCriterion("account_receivable_turnover not in", values, "accountReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableTurnoverBetween(String value1, String value2) {
            addCriterion("account_receivable_turnover between", value1, value2, "accountReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableTurnoverNotBetween(String value1, String value2) {
            addCriterion("account_receivable_turnover not between", value1, value2, "accountReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverIsNull() {
            addCriterion("accounts_payable_turnover is null");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverIsNotNull() {
            addCriterion("accounts_payable_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverEqualTo(String value) {
            addCriterion("accounts_payable_turnover =", value, "accountsPayableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverNotEqualTo(String value) {
            addCriterion("accounts_payable_turnover <>", value, "accountsPayableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverGreaterThan(String value) {
            addCriterion("accounts_payable_turnover >", value, "accountsPayableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverGreaterThanOrEqualTo(String value) {
            addCriterion("accounts_payable_turnover >=", value, "accountsPayableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverLessThan(String value) {
            addCriterion("accounts_payable_turnover <", value, "accountsPayableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverLessThanOrEqualTo(String value) {
            addCriterion("accounts_payable_turnover <=", value, "accountsPayableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverLike(String value) {
            addCriterion("accounts_payable_turnover like", value, "accountsPayableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverNotLike(String value) {
            addCriterion("accounts_payable_turnover not like", value, "accountsPayableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverIn(List<String> values) {
            addCriterion("accounts_payable_turnover in", values, "accountsPayableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverNotIn(List<String> values) {
            addCriterion("accounts_payable_turnover not in", values, "accountsPayableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverBetween(String value1, String value2) {
            addCriterion("accounts_payable_turnover between", value1, value2, "accountsPayableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableTurnoverNotBetween(String value1, String value2) {
            addCriterion("accounts_payable_turnover not between", value1, value2, "accountsPayableTurnover");
            return (Criteria) this;
        }

        public Criteria andCurrentAssetTurnoverRateIsNull() {
            addCriterion("current_asset_turnover_rate is null");
            return (Criteria) this;
        }

        public Criteria andCurrentAssetTurnoverRateIsNotNull() {
            addCriterion("current_asset_turnover_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentAssetTurnoverRateEqualTo(String value) {
            addCriterion("current_asset_turnover_rate =", value, "currentAssetTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andCurrentAssetTurnoverRateNotEqualTo(String value) {
            addCriterion("current_asset_turnover_rate <>", value, "currentAssetTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andCurrentAssetTurnoverRateGreaterThan(String value) {
            addCriterion("current_asset_turnover_rate >", value, "currentAssetTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andCurrentAssetTurnoverRateGreaterThanOrEqualTo(String value) {
            addCriterion("current_asset_turnover_rate >=", value, "currentAssetTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andCurrentAssetTurnoverRateLessThan(String value) {
            addCriterion("current_asset_turnover_rate <", value, "currentAssetTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andCurrentAssetTurnoverRateLessThanOrEqualTo(String value) {
            addCriterion("current_asset_turnover_rate <=", value, "currentAssetTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andCurrentAssetTurnoverRateLike(String value) {
            addCriterion("current_asset_turnover_rate like", value, "currentAssetTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andCurrentAssetTurnoverRateNotLike(String value) {
            addCriterion("current_asset_turnover_rate not like", value, "currentAssetTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andCurrentAssetTurnoverRateIn(List<String> values) {
            addCriterion("current_asset_turnover_rate in", values, "currentAssetTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andCurrentAssetTurnoverRateNotIn(List<String> values) {
            addCriterion("current_asset_turnover_rate not in", values, "currentAssetTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andCurrentAssetTurnoverRateBetween(String value1, String value2) {
            addCriterion("current_asset_turnover_rate between", value1, value2, "currentAssetTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andCurrentAssetTurnoverRateNotBetween(String value1, String value2) {
            addCriterion("current_asset_turnover_rate not between", value1, value2, "currentAssetTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andFixedAssetTurnoverRatioIsNull() {
            addCriterion("fixed_asset_turnover_ratio is null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetTurnoverRatioIsNotNull() {
            addCriterion("fixed_asset_turnover_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetTurnoverRatioEqualTo(String value) {
            addCriterion("fixed_asset_turnover_ratio =", value, "fixedAssetTurnoverRatio");
            return (Criteria) this;
        }

        public Criteria andFixedAssetTurnoverRatioNotEqualTo(String value) {
            addCriterion("fixed_asset_turnover_ratio <>", value, "fixedAssetTurnoverRatio");
            return (Criteria) this;
        }

        public Criteria andFixedAssetTurnoverRatioGreaterThan(String value) {
            addCriterion("fixed_asset_turnover_ratio >", value, "fixedAssetTurnoverRatio");
            return (Criteria) this;
        }

        public Criteria andFixedAssetTurnoverRatioGreaterThanOrEqualTo(String value) {
            addCriterion("fixed_asset_turnover_ratio >=", value, "fixedAssetTurnoverRatio");
            return (Criteria) this;
        }

        public Criteria andFixedAssetTurnoverRatioLessThan(String value) {
            addCriterion("fixed_asset_turnover_ratio <", value, "fixedAssetTurnoverRatio");
            return (Criteria) this;
        }

        public Criteria andFixedAssetTurnoverRatioLessThanOrEqualTo(String value) {
            addCriterion("fixed_asset_turnover_ratio <=", value, "fixedAssetTurnoverRatio");
            return (Criteria) this;
        }

        public Criteria andFixedAssetTurnoverRatioLike(String value) {
            addCriterion("fixed_asset_turnover_ratio like", value, "fixedAssetTurnoverRatio");
            return (Criteria) this;
        }

        public Criteria andFixedAssetTurnoverRatioNotLike(String value) {
            addCriterion("fixed_asset_turnover_ratio not like", value, "fixedAssetTurnoverRatio");
            return (Criteria) this;
        }

        public Criteria andFixedAssetTurnoverRatioIn(List<String> values) {
            addCriterion("fixed_asset_turnover_ratio in", values, "fixedAssetTurnoverRatio");
            return (Criteria) this;
        }

        public Criteria andFixedAssetTurnoverRatioNotIn(List<String> values) {
            addCriterion("fixed_asset_turnover_ratio not in", values, "fixedAssetTurnoverRatio");
            return (Criteria) this;
        }

        public Criteria andFixedAssetTurnoverRatioBetween(String value1, String value2) {
            addCriterion("fixed_asset_turnover_ratio between", value1, value2, "fixedAssetTurnoverRatio");
            return (Criteria) this;
        }

        public Criteria andFixedAssetTurnoverRatioNotBetween(String value1, String value2) {
            addCriterion("fixed_asset_turnover_ratio not between", value1, value2, "fixedAssetTurnoverRatio");
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