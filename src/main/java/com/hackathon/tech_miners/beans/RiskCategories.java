package com.hackathon.tech_miners.beans;

import java.util.List;
import java.util.Map;

public class RiskCategories {
	
	private String industryType;
	private Map<String, List<CategoryRisk>> riskCategories;
	
	public String getIndustryType() {
		return industryType;
	}
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}
	public Map<String, List<CategoryRisk>> getRiskCategories() {
		return riskCategories;
	}
	public void setRiskCategories(Map<String, List<CategoryRisk>> riskCategories) {
		this.riskCategories = riskCategories;
	}
	
	public RiskCategories(String industryType, Map<String, List<CategoryRisk>> riskCategories){
		this.industryType = industryType;
		this.riskCategories = riskCategories;
	}

}
