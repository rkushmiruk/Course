package com.romankushmiruk.gof.blinnov.behavioral.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class AuctionObserver {
    private ArrayList<Bid> list = new ArrayList<Bid>();

    public void addObservable(Bid bid) {
        list.add(bid);
    }

    public void removeObservable(Bid bid) {
// удаление объекта из списка наблюдателя
    }

    public void handleEvent(BidEvent event) {
        double newPrice = event.getSource().getPrice();
        double price = 0;
        Iterator<Bid> iterator = list.iterator();
        boolean lead = true;
        while (iterator.hasNext()) {
            Bid bid = iterator.next();
            price = bid.getPrice();
            if (newPrice > price) {
                bid.setLeader(false);
            } else if (newPrice < price) {
                lead = false;
            }
        }
        if (lead) {
            event.getSource().setLeader(true);
            LeaderInfo.currentPrice = newPrice;
            System.out.println("Leading Price " + newPrice);
        }

    }
}
