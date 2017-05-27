package com.romankushmiruk.gof.blinnov.creational.abstractfactory.factory;

import com.romankushmiruk.gof.blinnov.creational.abstractfactory.tcp.TCPAudioContent;
import com.romankushmiruk.gof.blinnov.creational.abstractfactory.tcp.TCPMediaContent;
import com.romankushmiruk.gof.blinnov.creational.abstractfactory.upd.UPDAudioContent;
import com.romankushmiruk.gof.blinnov.creational.abstractfactory.upd.UPDMediaContent;

public class AudioFactory extends AbstractMediaFactory {
    @Override
    public TCPMediaContent createTCPObject() {
        return new TCPAudioContent();
    }

    @Override
    public UPDMediaContent createUPDObject() {
        return new UPDAudioContent();
    }
}
