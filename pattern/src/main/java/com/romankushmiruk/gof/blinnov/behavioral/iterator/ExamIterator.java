package com.romankushmiruk.gof.blinnov.behavioral.iterator;

public class ExamIterator implements CustomIterator {
    private StudentSession session;
    private String current;
    private java.util.Iterator<String> iterator;
    private boolean done;


    public ExamIterator(StudentSession session) {
        this.session = session;
    }

    @Override
    public void first() {
        iterator = session.getExams().keySet().iterator();
        next();
    }

    @Override
    public void next() {
        if (iterator.hasNext()) {
            current = iterator.next();
        } else {
            done = true;
        }
    }

    @Override
    public boolean isDone() {
        return done;
    }

    @Override
    public Object currentItem() {
        return current;
    }
}
