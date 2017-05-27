package com.romankushmiruk.gof.blinnov.behavioral.iterator;

import java.util.HashMap;

public class StudentSession implements Aggregate {
    private HashMap<String, Integer> exams = new HashMap<String, Integer>();

    @Override
    public CustomIterator createIterator() {
        CustomIterator iterator = new ExamIterator(this);
        iterator.first();
        return iterator;
    }

    public void addExam(String name, Integer mark) {
        exams.put(name, mark);
    }

    public Integer getMark(String name) {
        return exams.get(name);
    }

    public HashMap<String, Integer> getExams() {
        return exams;
    }

}
