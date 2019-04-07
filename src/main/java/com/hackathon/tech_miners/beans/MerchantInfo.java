package com.hackathon.tech_miners.beans;

public class MerchantInfo {
	
	private String merchantName;
	private String industryType;
	private String state;
	private long zipCode;
	private long empCount;
	private long annualTurnover;
	private String estDate;
	private String locality;
	
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getIndustryType() {
		return industryType;
	}
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public long getEmpCount() {
		return empCount;
	}
	public void setEmpCount(long empCount) {
		this.empCount = empCount;
	}
	public long getAnnualTurnover() {
		return annualTurnover;
	}
	public void setAnnualTurnover(long annualTurnover) {
		this.annualTurnover = annualTurnover;
	}
	public String getEstDate() {
		return estDate;
	}
	public void setEstDate(String estDate) {
		this.estDate = estDate;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	
	public MerchantInfo(String merchantName, String industryType, String state, long zipCode, long empCount, long annualTurnover, String estDate, String locality) {
		this.merchantName = merchantName;
		this.industryType = industryType;
		this.state = state;
		this.zipCode = zipCode;
		this.empCount = empCount;
		this.annualTurnover = annualTurnover;
		this.estDate = estDate;
		this.locality = locality;
		
	}

}
