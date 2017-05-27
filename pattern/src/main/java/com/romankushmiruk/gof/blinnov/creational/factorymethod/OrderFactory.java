package com.romankushmiruk.gof.blinnov.creational.factorymethod;

public class OrderFactory {
    public static AbstractOrder createOrderFromFactory(String type) {
        TypeOrder sign = TypeOrder.valueOf(type.toUpperCase()); switch(sign) {
            case SIMPLE: return new SimpleOrder();
            case EXTENDED: return new ExtendedOrder();
            default : throw new EnumConstantNotPresentException(TypeOrder.class, sign.name());
        } }
}
