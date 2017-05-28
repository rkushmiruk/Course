package com.romankushmiruk.gof.blinnov.behavioral.strategy;

import java.net.URL;

public class ConversionJpg implements IConversion {
    @Override
    public void convert(URL urlFileImg) {
        System.out.println("Jpg Conversion");
    }
}
