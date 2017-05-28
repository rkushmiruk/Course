package com.romankushmiruk.gof.blinnov.structural.composite;

public class TCPChannel extends ChannelLeaf {
    public TCPChannel(int id) {
        super(id);
    }

    @Override
    public void send() {
        System.out.println("tcp send " + getId());
    }

    @Override
    public void receive() {
        System.out.println("tcp receive");
    }
}
