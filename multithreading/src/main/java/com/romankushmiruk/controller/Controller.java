package com.romankushmiruk.controller;

import com.romankushmiruk.model.StudentQueue;
import com.romankushmiruk.model.entity.student.StudentGroup;
import com.romankushmiruk.view.View;

public class Controller {

    private View view;

    public Controller(View view) {
        this.view = view;
    }

    public void processUser() {
        view.printStartMessage();

        StudentGroup entrants = new StudentGroup();
        StudentQueue queue = new StudentQueue();

        StudentProducer producer = new StudentProducer(entrants, queue, view);
        StudentConsumer consumer = new StudentConsumer(queue, view);

        producer.start();
        consumer.start();

    }
}
