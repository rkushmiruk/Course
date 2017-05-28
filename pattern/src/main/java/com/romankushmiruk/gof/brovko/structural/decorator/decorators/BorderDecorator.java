package com.romankushmiruk.gof.brovko.structural.decorator.decorators;

import com.romankushmiruk.gof.brovko.structural.decorator.objects.Component;

public class BorderDecorator extends Decorator {
    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("...added border");
    }
}
