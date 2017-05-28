package com.romankushmiruk.gof.brovko.structural.decorator.objects;

public class TextView implements Component {
    @Override
    public void draw() {
        System.out.println("Draw textview");
    }
}
