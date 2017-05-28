package com.romankushmiruk.gof.blinnov.structural.composite;

import java.util.ArrayList;

public class CompositeTool implements Component {
    private int id;
    private ArrayList<Component> channels;

    public CompositeTool(int toolId) {
        this.id = toolId;
        channels = new ArrayList<Component>();
    }

    public void add(Component channel) {
        channels.add(channel);
    }

    public void remove(Component channel) {
        channels.remove(channel);
    }

    public int countChannels() {
        int count = 0;
        for (Component channel : channels) {
            count += channel.countChannels();
        }
        return count;
    }

    @Override
    public void send() {
        System.out.println("\tComposite Tool #" + id + ", size tool: " + channels.size()
                + ", number channels: " + countChannels());
        for (Component channel : channels) {
            channel.send();
        }
    }

    @Override
    public void receive() {
        // some code here
    }
}
