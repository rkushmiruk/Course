package com.romankushmiruk.gof.blinnov.structural.flyweight;

import java.util.ArrayList;

public class Main {
    private final static int SIZE = 4_000_000;

    public static void main(String[] args) {
        ArrayList<EuTermes> legion = new ArrayList<>();
        try {
            for (int i = 0; i < SIZE; i++) {
                legion.add(new EuTermes("Worker", 12.3f, 10.1f, 5.0f));
            }
        } catch (OutOfMemoryError e) {
            System.err.println("OutOfMemoryError for Termes Worker");
        } finally {
            System.out.println("Instance: " + legion.size());
        }
    }
}
