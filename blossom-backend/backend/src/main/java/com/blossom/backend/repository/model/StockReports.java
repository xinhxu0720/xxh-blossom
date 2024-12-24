package com.blossom.backend.repository.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class StockReports {
    private Integer id;

    private String code;

    private String name;

    private String url;

    private String reportDate;

    private String reportName;

    private String ctime;

    private String totalRevenue;

    private String avgRoe;

    private String npPerShare;

    private String grossSellingRate;

    private String netInterestOfTotalAssets;

    private String netSellingRate;

    private String operateCashFlowPs;

    private String basicEps;

    private String capitalReserve;

    private String undistriProfitPs;

    private String operatingIncomeYoy;

    private String netProfitAtsopc;

    private String netProfitAtsopcYoy;

    private String netProfitAfterNrgalAtsolc;

    private String npAtsopcNrgalYoy;

    private String oreDlt;

    private String rop;

    private String assetLiabRatio;

    private String currentRatio;

    private String quickRatio;

    private String equityMultiplier;

    private String equityRatio;

    private String holderEquity;

    private String ncfFromOaToTotalLiab;

    private String inventoryTurnoverDays;

    private String receivableTurnoverDays;

    private String accountsPayableTurnoverDays;

    private String cashCycle;

    private String operatingCycle;

    private String totalCapitalTurnover;

    private String inventoryTurnover;

    private String accountReceivableTurnover;

    private String accountsPayableTurnover;

    private String currentAssetTurnoverRate;

    private String fixedAssetTurnoverRatio;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName == null ? null : reportName.trim();
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime == null ? null : ctime.trim();
    }

    public String getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(String totalRevenue) {
        this.totalRevenue = totalRevenue == null ? null : totalRevenue.trim();
    }

    public String getAvgRoe() {
        return avgRoe;
    }

    public void setAvgRoe(String avgRoe) {
        this.avgRoe = avgRoe == null ? null : avgRoe.trim();
    }

    public String getNpPerShare() {
        return npPerShare;
    }

    public void setNpPerShare(String npPerShare) {
        this.npPerShare = npPerShare == null ? null : npPerShare.trim();
    }

    public String getGrossSellingRate() {
        return grossSellingRate;
    }

    public void setGrossSellingRate(String grossSellingRate) {
        this.grossSellingRate = grossSellingRate == null ? null : grossSellingRate.trim();
    }

    public String getNetInterestOfTotalAssets() {
        return netInterestOfTotalAssets;
    }

    public void setNetInterestOfTotalAssets(String netInterestOfTotalAssets) {
        this.netInterestOfTotalAssets = netInterestOfTotalAssets == null ? null : netInterestOfTotalAssets.trim();
    }

    public String getNetSellingRate() {
        return netSellingRate;
    }

    public void setNetSellingRate(String netSellingRate) {
        this.netSellingRate = netSellingRate == null ? null : netSellingRate.trim();
    }

    public String getOperateCashFlowPs() {
        return operateCashFlowPs;
    }

    public void setOperateCashFlowPs(String operateCashFlowPs) {
        this.operateCashFlowPs = operateCashFlowPs == null ? null : operateCashFlowPs.trim();
    }

    public String getBasicEps() {
        return basicEps;
    }

    public void setBasicEps(String basicEps) {
        this.basicEps = basicEps == null ? null : basicEps.trim();
    }

    public String getCapitalReserve() {
        return capitalReserve;
    }

    public void setCapitalReserve(String capitalReserve) {
        this.capitalReserve = capitalReserve == null ? null : capitalReserve.trim();
    }

    public String getUndistriProfitPs() {
        return undistriProfitPs;
    }

    public void setUndistriProfitPs(String undistriProfitPs) {
        this.undistriProfitPs = undistriProfitPs == null ? null : undistriProfitPs.trim();
    }

    public String getOperatingIncomeYoy() {
        return operatingIncomeYoy;
    }

    public void setOperatingIncomeYoy(String operatingIncomeYoy) {
        this.operatingIncomeYoy = operatingIncomeYoy == null ? null : operatingIncomeYoy.trim();
    }

    public String getNetProfitAtsopc() {
        return netProfitAtsopc;
    }

    public void setNetProfitAtsopc(String netProfitAtsopc) {
        this.netProfitAtsopc = netProfitAtsopc == null ? null : netProfitAtsopc.trim();
    }

    public String getNetProfitAtsopcYoy() {
        return netProfitAtsopcYoy;
    }

    public void setNetProfitAtsopcYoy(String netProfitAtsopcYoy) {
        this.netProfitAtsopcYoy = netProfitAtsopcYoy == null ? null : netProfitAtsopcYoy.trim();
    }

    public String getNetProfitAfterNrgalAtsolc() {
        return netProfitAfterNrgalAtsolc;
    }

    public void setNetProfitAfterNrgalAtsolc(String netProfitAfterNrgalAtsolc) {
        this.netProfitAfterNrgalAtsolc = netProfitAfterNrgalAtsolc == null ? null : netProfitAfterNrgalAtsolc.trim();
    }

    public String getNpAtsopcNrgalYoy() {
        return npAtsopcNrgalYoy;
    }

    public void setNpAtsopcNrgalYoy(String npAtsopcNrgalYoy) {
        this.npAtsopcNrgalYoy = npAtsopcNrgalYoy == null ? null : npAtsopcNrgalYoy.trim();
    }

    public String getOreDlt() {
        return oreDlt;
    }

    public void setOreDlt(String oreDlt) {
        this.oreDlt = oreDlt == null ? null : oreDlt.trim();
    }

    public String getRop() {
        return rop;
    }

    public void setRop(String rop) {
        this.rop = rop == null ? null : rop.trim();
    }

    public String getAssetLiabRatio() {
        return assetLiabRatio;
    }

    public void setAssetLiabRatio(String assetLiabRatio) {
        this.assetLiabRatio = assetLiabRatio == null ? null : assetLiabRatio.trim();
    }

    public String getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(String currentRatio) {
        this.currentRatio = currentRatio == null ? null : currentRatio.trim();
    }

    public String getQuickRatio() {
        return quickRatio;
    }

    public void setQuickRatio(String quickRatio) {
        this.quickRatio = quickRatio == null ? null : quickRatio.trim();
    }

    public String getEquityMultiplier() {
        return equityMultiplier;
    }

    public void setEquityMultiplier(String equityMultiplier) {
        this.equityMultiplier = equityMultiplier == null ? null : equityMultiplier.trim();
    }

    public String getEquityRatio() {
        return equityRatio;
    }

    public void setEquityRatio(String equityRatio) {
        this.equityRatio = equityRatio == null ? null : equityRatio.trim();
    }

    public String getHolderEquity() {
        return holderEquity;
    }

    public void setHolderEquity(String holderEquity) {
        this.holderEquity = holderEquity == null ? null : holderEquity.trim();
    }

    public String getNcfFromOaToTotalLiab() {
        return ncfFromOaToTotalLiab;
    }

    public void setNcfFromOaToTotalLiab(String ncfFromOaToTotalLiab) {
        this.ncfFromOaToTotalLiab = ncfFromOaToTotalLiab == null ? null : ncfFromOaToTotalLiab.trim();
    }

    public String getInventoryTurnoverDays() {
        return inventoryTurnoverDays;
    }

    public void setInventoryTurnoverDays(String inventoryTurnoverDays) {
        this.inventoryTurnoverDays = inventoryTurnoverDays == null ? null : inventoryTurnoverDays.trim();
    }

    public String getReceivableTurnoverDays() {
        return receivableTurnoverDays;
    }

    public void setReceivableTurnoverDays(String receivableTurnoverDays) {
        this.receivableTurnoverDays = receivableTurnoverDays == null ? null : receivableTurnoverDays.trim();
    }

    public String getAccountsPayableTurnoverDays() {
        return accountsPayableTurnoverDays;
    }

    public void setAccountsPayableTurnoverDays(String accountsPayableTurnoverDays) {
        this.accountsPayableTurnoverDays = accountsPayableTurnoverDays == null ? null : accountsPayableTurnoverDays.trim();
    }

    public String getCashCycle() {
        return cashCycle;
    }

    public void setCashCycle(String cashCycle) {
        this.cashCycle = cashCycle == null ? null : cashCycle.trim();
    }

    public String getOperatingCycle() {
        return operatingCycle;
    }

    public void setOperatingCycle(String operatingCycle) {
        this.operatingCycle = operatingCycle == null ? null : operatingCycle.trim();
    }

    public String getTotalCapitalTurnover() {
        return totalCapitalTurnover;
    }

    public void setTotalCapitalTurnover(String totalCapitalTurnover) {
        this.totalCapitalTurnover = totalCapitalTurnover == null ? null : totalCapitalTurnover.trim();
    }

    public String getInventoryTurnover() {
        return inventoryTurnover;
    }

    public void setInventoryTurnover(String inventoryTurnover) {
        this.inventoryTurnover = inventoryTurnover == null ? null : inventoryTurnover.trim();
    }

    public String getAccountReceivableTurnover() {
        return accountReceivableTurnover;
    }

    public void setAccountReceivableTurnover(String accountReceivableTurnover) {
        this.accountReceivableTurnover = accountReceivableTurnover == null ? null : accountReceivableTurnover.trim();
    }

    public String getAccountsPayableTurnover() {
        return accountsPayableTurnover;
    }

    public void setAccountsPayableTurnover(String accountsPayableTurnover) {
        this.accountsPayableTurnover = accountsPayableTurnover == null ? null : accountsPayableTurnover.trim();
    }

    public String getCurrentAssetTurnoverRate() {
        return currentAssetTurnoverRate;
    }

    public void setCurrentAssetTurnoverRate(String currentAssetTurnoverRate) {
        this.currentAssetTurnoverRate = currentAssetTurnoverRate == null ? null : currentAssetTurnoverRate.trim();
    }

    public String getFixedAssetTurnoverRatio() {
        return fixedAssetTurnoverRatio;
    }

    public void setFixedAssetTurnoverRatio(String fixedAssetTurnoverRatio) {
        this.fixedAssetTurnoverRatio = fixedAssetTurnoverRatio == null ? null : fixedAssetTurnoverRatio.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}