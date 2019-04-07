package com.hackathon.tech_miners.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.tech_miners.beans.CategoryRisk;
import com.hackathon.tech_miners.beans.RiskCategories;

@RestController
public class GetRiskCategoriesController {
	
	private Map<String, List<CategoryRisk>> categories = new HashMap<String, List<CategoryRisk>>();
	
	GetRiskCategoriesController(){
		//This hardcoded code is going to be replaced with an actual API integration when this is implemented. The risk score is calculated based on ML algorithms written after collecting answers from the small business owner
		List<CategoryRisk> risk1 = new ArrayList<CategoryRisk>();
		List<CategoryRisk> risk2 = new ArrayList<CategoryRisk>();
		
		CategoryRisk empLiability = new CategoryRisk();
		empLiability.setCategory("employee liability");
		empLiability.setRiskScore(4);
		
		CategoryRisk theft = new CategoryRisk();
		theft.setCategory("theft/damage");
		theft.setRiskScore(3);
		
		CategoryRisk naturalDisaster = new CategoryRisk();
		naturalDisaster.setCategory("Natural Catastrophe");
		naturalDisaster.setRiskScore(3);
		
		CategoryRisk propLiability = new CategoryRisk();
		propLiability.setCategory("Property Liability");
		propLiability.setRiskScore(5);
		
		CategoryRisk damagedStock = new CategoryRisk();
		damagedStock.setCategory("Damaged stock");
		damagedStock.setRiskScore(7);
		
		CategoryRisk foodPoisioning = new CategoryRisk();
		foodPoisioning.setCategory("Food Poisioning");
		foodPoisioning.setRiskScore(8);
		
		risk1.add(empLiability);
		risk1.add(theft);
		risk1.add(naturalDisaster);
		risk1.add(propLiability);
		risk1.add(damagedStock);
		risk1.add(foodPoisioning);
		
		risk2.add(empLiability);
		risk2.add(theft);
		risk2.add(naturalDisaster);
		risk2.add(propLiability);
		risk2.add(damagedStock);
		
		categories.put("food", risk1);
		categories.put("hardware", risk2);
	}
	
	@RequestMapping("/showRiskCategories/{industryType}")
    public RiskCategories greeting(@PathVariable String industryType) {
        return new RiskCategories(industryType,categories);
    }

}
