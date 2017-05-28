package com.romankushmiruk.gof.blinnov.behavioral.strategy;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        URL fileUrl = new URL("image_file_url");
        Convert convertToJpg = new Convert(new ConversionJpg());
        convertToJpg.convert(fileUrl);
        Convert convertToGif = new Convert(new ConversionGif());
        convertToGif.convert(fileUrl);
        Convert convertToPng = new Convert(new ConversionPng());
        convertToPng.convert(fileUrl);
    }
}
