package com.romankushmiruk.gof.blinnov.structural.composite;

public abstract class ChannelLeaf implements Component {
    private int id;

    public ChannelLeaf(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }
    public int countChannels() {
        return 1;
    }
}
