package com.romankushmiruk.gof.blinnov.behavioral.strategy;

import java.net.URL;

public class ConversionPng implements IConversion {
    @Override
    public void convert(URL urlFileImg) {
        System.out.println("PNG Conversion");
    }
}
