package com.romankushmiruk.gof.blinnov.creational.abstractfactory.upd;

public class UPDAudioContent extends UPDMediaContent {
    @Override
    void play() {
        System.out.println("UpdAudio play");
    }

    @Override
    void transform() {
        System.out.println("UpdAudio transform");
    }
}
