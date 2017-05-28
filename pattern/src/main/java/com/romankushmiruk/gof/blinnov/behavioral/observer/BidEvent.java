package com.romankushmiruk.gof.blinnov.behavioral.observer;

import java.util.EventObject;

public class BidEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public BidEvent(Bid source) {
        super(source);
    }

    @Override
    public Bid getSource() {
        return (Bid) super.getSource();
    }
}
