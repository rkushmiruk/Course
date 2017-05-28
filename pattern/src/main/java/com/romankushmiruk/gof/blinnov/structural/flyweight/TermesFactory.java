package com.romankushmiruk.gof.blinnov.structural.flyweight;

import java.util.TreeMap;

public class TermesFactory {
    private static TreeMap<String, Termes> map = new TreeMap<>();

    public static Termes getClassFromFactory(String name) {
        if (map.containsKey(name)) {
            return map.get(name);
        } else {
            TermesType type = TermesType.valueOf(name.toUpperCase());

            switch (type) {
                case WORKER: {
                    Worker worker = new Worker();
                    map.put(name, worker);
                    return worker;
                }
                case WARRIOR: {
                    Warrior warrior = new Warrior();
                    map.put(name, warrior);
                    return warrior;
                }
                default:
                    throw new EnumConstantNotPresentException(TermesType.class, type.name());
            }
        }
    }
}