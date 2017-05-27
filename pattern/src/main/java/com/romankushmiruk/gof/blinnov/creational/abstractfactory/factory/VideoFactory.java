package com.romankushmiruk.gof.blinnov.creational.abstractfactory.factory;

import com.romankushmiruk.gof.blinnov.creational.abstractfactory.tcp.TCPMediaContent;
import com.romankushmiruk.gof.blinnov.creational.abstractfactory.tcp.TCPVideoContent;
import com.romankushmiruk.gof.blinnov.creational.abstractfactory.upd.UPDMediaContent;
import com.romankushmiruk.gof.blinnov.creational.abstractfactory.upd.UPDVideoContent;

public class VideoFactory extends AbstractMediaFactory {
    @Override
    public TCPMediaContent createTCPObject() {
        return new TCPVideoContent();
    }

    @Override
    public UPDMediaContent createUPDObject() {
        return new UPDVideoContent();
    }
}
