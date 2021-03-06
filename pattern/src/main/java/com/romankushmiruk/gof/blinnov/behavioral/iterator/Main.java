package com.romankushmiruk.gof.blinnov.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        StudentSession session = new StudentSession();

        session.addExam("MA", 9);
        session.addExam("TFCV", 10);
        session.addExam("DS", 8);

        System.out.println("The list of exams: ");

        CustomIterator iterator = session.createIterator();

        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
