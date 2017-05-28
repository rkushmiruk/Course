package com.romankushmiruk.gof.blinnov.behavioral.strategy;

import java.net.URL;

public class Convert {
    private IConversion conversion;

    public Convert(IConversion conversion) {
        this.conversion = conversion;
    }

    public void convert(URL fileImg) {
        conversion.convert(fileImg);
    }
}
