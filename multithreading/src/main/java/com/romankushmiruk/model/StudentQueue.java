package com.romankushmiruk.model;

import com.romankushmiruk.model.entity.student.Student;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class StudentQueue {
    private BlockingQueue<Student> queue;

    public StudentQueue() {
        queue = new ArrayBlockingQueue<Student>(50);
    }

    public BlockingQueue<Student> getQueue() {
        return queue;
    }

}
