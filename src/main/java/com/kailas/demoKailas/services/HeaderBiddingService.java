package com.kailas.demoKailas.services;

import java.util.SortedSet;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

import com.kailas.demoKailas.dsp.RequestsToDSP;
import com.kailas.demoKailas.model.Bidder;

@Service
public class HeaderBiddingService {
    
    
public SortedSet<Bidder> getheringAllResponsesFromDSPs(){
    
    SortedSet<Bidder> resp = new TreeSet<>();
    RequestsToDSP req = new RequestsToDSP();
    resp.addAll(req.dspOne());
    resp.addAll(req.dspTwo());
    resp.addAll(req.dspThree());
    
    return resp;
}


public Bidder auction() {
    
    SortedSet<Bidder> result = getheringAllResponsesFromDSPs();
    return result.last();
}
}
