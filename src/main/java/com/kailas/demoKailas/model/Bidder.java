package com.kailas.demoKailas.model;

import java.math.BigDecimal;

public class Bidder implements Comparable<Bidder>{
    
    private double bidPrice;
    public String adSize = "300x250";
//    private SeatBid seat;
//    private String bidfloorCurrency;
//    private BigDecimal bidfloor;
//    private String dealId;
//    private Supplier supplier;
//    private String currency;

    public double getBidPrice() {
        return bidPrice;
    }
    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }
    public Bidder() {}
    public Bidder(double d) {
        this.bidPrice = d;
    }
    
    

    @Override
    public String toString() {
        return "bidPrice=" + getBidPrice();
    }

    @Override
    public int compareTo(Bidder o) {
        return Double.valueOf(bidPrice).compareTo(Double.valueOf(o.getBidPrice()));
        
    }
    
}
