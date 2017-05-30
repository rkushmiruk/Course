package com.romankushmiruk;

public class Main {
    public static void main(String[] args) {
        ImmutableArrayList<Integer> list = new ImmutableArrayList<>();
        list.add(23);
        list.add(23);
        System.out.println(list);
        try {
            list.remove(0);
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }
}
