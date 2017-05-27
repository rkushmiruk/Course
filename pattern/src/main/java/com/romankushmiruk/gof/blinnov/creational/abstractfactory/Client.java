package com.romankushmiruk.gof.blinnov.creational.abstractfactory;

import com.romankushmiruk.gof.blinnov.creational.abstractfactory.factory.AbstractMediaFactory;
import com.romankushmiruk.gof.blinnov.creational.abstractfactory.tcp.TCPMediaContent;
import com.romankushmiruk.gof.blinnov.creational.abstractfactory.upd.UPDMediaContent;

public class Client {
    private static UPDMediaContent contentUPD;
    private static TCPMediaContent contentTCP;

    public static void makeMediaFactory(AbstractMediaFactory factory){
        contentTCP = factory.createTCPObject();
        contentUPD = factory.createUPDObject();
    }

}
