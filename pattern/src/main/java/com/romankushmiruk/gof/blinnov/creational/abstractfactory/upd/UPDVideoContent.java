package com.romankushmiruk.gof.blinnov.creational.abstractfactory.upd;

public class UPDVideoContent extends UPDMediaContent {
    @Override
    void play() {
        System.out.println("UpdVideo play");
    }

    @Override
    void transform() {
        System.out.println("UpdVideo transform");
    }
}
