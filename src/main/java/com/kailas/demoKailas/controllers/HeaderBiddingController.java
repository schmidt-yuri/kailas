package com.kailas.demoKailas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kailas.demoKailas.model.Bidder;
import com.kailas.demoKailas.services.HeaderBiddingService;

@RestController
public class HeaderBiddingController {
    
@Autowired
HeaderBiddingService service;

@GetMapping("/working")
public String testString() {
    return "This RESTful service is working";
}

@GetMapping("/bidding")
public Bidder bidder() {
return service.auction(); 
}
    
}
