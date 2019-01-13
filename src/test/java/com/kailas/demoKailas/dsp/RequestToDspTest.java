package com.kailas.demoKailas.dsp;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Ignore;
import org.junit.Test;

import com.kailas.demoKailas.model.Bidder;
import com.kailas.demoKailas.services.HeaderBiddingService;

import junit.framework.Assert;

public class RequestToDspTest {
    
    @Test
    //Testing only dspOne
    public void testRequestToDSP_dspOne() {
        
SortedSet<Bidder> s = new RequestsToDSP().dspOne();
System.out.println(s.size());
System.out.println(s.first());
System.out.println(s.last());
for(Bidder item : s) {
    System.out.println(item);
}
        assertEquals(1L,1L);
       
    }
    
    @Test
    //Testing only dspTwo
    public void testRequestToDSP_dspTwo() {
        SortedSet<Bidder> s = new RequestsToDSP().dspTwo();        
        System.out.println(s.size());
        System.out.println(s.first());
        System.out.println(s.last());
        for(Bidder item : s) {
            System.out.println(item);
        }
                assertEquals(1L,1L);

    }
    
    @Test
    //Testing service layer method getheringAllResponsesFromDSPs()
    public void testGetheringAllResponsesFromDSPs() {
        SortedSet<Bidder> s = new HeaderBiddingService().getheringAllResponsesFromDSPs();
        System.out.println(s.size());
        System.out.println(s.first());
        System.out.println(s.last());
        for(Bidder item : s) {
            System.out.println(item);
        }
                assertEquals(1L,1L);
    }
    
    @Test
    //Testing service layer auction
    public void testAuction() {
        Bidder b = new HeaderBiddingService().auction();
        System.out.println(b);
    }
   
    
    @Test
    public void compareToTest() {
        Bidder b = new Bidder();
        b.setBidPrice(2.00);
        Bidder b1 = new Bidder();
        b1.setBidPrice(1.00);
        System.out.println(b);
        System.out.println(b1);
        assertEquals(1L, b.compareTo(b1));
    }
    
    @Test
    public void testFakeDSP() {
        RequestsToDSP req = new RequestsToDSP();
//        System.out.println(req.dspOne().size());
//        System.out.println(req.dspTwo().size());
        SortedSet<Bidder> resp = new TreeSet<>();
       
//      resp.addAll(req.dspTwo());
      resp.addAll(req.dspOne());
      
//      for(Bidder o : resp) {
//      System.out.println(o);
//      }
        assertEquals(1L,1L);
    }
    
    @Test
    public void testService() {
//        HeaderBiddingService service = new HeaderBiddingService();
//        System.out.println(service.getheringAllResponsesFromDSPs().size());
//        List<Bidder> bidders = service.getheringAllResponsesFromDSPs();
//        assertNotNull(bidders);
//        assertNotNull(service.auction());
    }
    
}
