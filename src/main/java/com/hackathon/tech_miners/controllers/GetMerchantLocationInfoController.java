package com.hackathon.tech_miners.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.tech_miners.beans.MerchantInfo;

@RestController
public class GetMerchantLocationInfoController {
	
	
	@RequestMapping("/getMerchantInfo/{merchantName}")
    public MerchantInfo greeting(@PathVariable String merchantName) {
		//This hardcoded data is going to be replaced by actual API calls to get this information from google location API(geo location) and paid API to get business details (including emp details)
        return new MerchantInfo(merchantName, "Bakery", "AZ", 85027, 10, 100000, "03/01/2019", "Scottsdale");
    }

}
