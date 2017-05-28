package com.romankushmiruk.gof.brovko.structural.decorator.objects;

public class Window implements Component {
    @Override
    public void draw() {
        System.out.println("Draw window");
    }
}
