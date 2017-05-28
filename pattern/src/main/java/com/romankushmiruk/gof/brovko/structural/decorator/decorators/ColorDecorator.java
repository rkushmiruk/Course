package com.romankushmiruk.gof.brovko.structural.decorator.decorators;

import com.romankushmiruk.gof.brovko.structural.decorator.objects.Component;

public class ColorDecorator extends Decorator {

    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("...added color");
    }
}
