package com.romankushmiruk.gof.blinnov.creational.abstractfactory.factory;

import com.romankushmiruk.gof.blinnov.creational.abstractfactory.tcp.TCPMediaContent;
import com.romankushmiruk.gof.blinnov.creational.abstractfactory.upd.UPDMediaContent;

public abstract class AbstractMediaFactory {
    public abstract TCPMediaContent createTCPObject();
    public abstract UPDMediaContent createUPDObject();
}
