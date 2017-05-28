package com.romankushmiruk.gof.brovko.structural.decorator.decorators;

import com.romankushmiruk.gof.brovko.structural.decorator.objects.Component;
import com.romankushmiruk.gof.brovko.structural.decorator.objects.Window;

public class Main {
    public static void main(String[] args) {
        Component window = new Window();
        window.draw();
        Component windowWithBorder = new ColorDecorator(new BorderDecorator(new Window()));
        windowWithBorder.draw();
    }
}
