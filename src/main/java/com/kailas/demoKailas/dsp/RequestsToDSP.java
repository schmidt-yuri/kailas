/*
 * In this class it is performed different requests to DSPs for getting adds offers from
 * them to take part in auction
 * В этом классе выполняются различные запросы к разным DSP для получения от них предложений 
 * для участия в аукционе
 */
package com.kailas.demoKailas.dsp;

import java.util.SortedSet;
import java.util.TreeSet;

import com.kailas.demoKailas.model.Bidder;

public class RequestsToDSP {
    
    public SortedSet<Bidder> dspOne(){
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Bidder b = new Bidder();
        b.setBidPrice(10.10);
        Bidder b1 = new Bidder();
        b1.setBidPrice(9.00);
        Bidder b2 = new Bidder(11.00);
        Bidder b3 = new Bidder(12.00);
        SortedSet<Bidder> s = new TreeSet<>();
        s.add(b);
        s.add(b1);
        s.add(b3);
        s.add(b2);

        return s;
    }
    
    public SortedSet<Bidder> dspTwo(){
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Bidder b = new Bidder();
        b.setBidPrice(9.50);
        Bidder b1 = new Bidder();
        b1.setBidPrice(8.50);
        Bidder b2 = new Bidder(7.50);
        Bidder b3 = new Bidder(13.50);
        SortedSet<Bidder> s = new TreeSet<>();
        s.add(b);
        s.add(b1);
        s.add(b3);
        s.add(b2);

        return s;
    }
    public SortedSet<Bidder> dspThree(){
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Bidder b = new Bidder();
        b.setBidPrice(10.25);
        Bidder b1 = new Bidder();
        b1.setBidPrice(7.15);
        Bidder b2 = new Bidder(14.10);
        Bidder b3 = new Bidder(6.30);
        SortedSet<Bidder> s = new TreeSet<>();
        s.add(b);
        s.add(b1);
        s.add(b3);
        s.add(b2);

        return s;
    }

    
}
