package com.hackathon.tech_miners.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.tech_miners.beans.MerchantInfo;

@RestController
public class SendMerchantSelectionController {
	
	
	@RequestMapping("/sendMerchantInfo/{merchantName}")
    public MerchantInfo greeting(@PathVariable String merchantName) {
		//This hardcoded data is going to be replaced by actual data that the merchant/small business owner (that is using the app to get insurance coverage) enters in the app.
        return new MerchantInfo(merchantName, "Bakery", "AZ", 85027, 10, 100000, "03/01/2019", "Scottsdale");
    }

}
