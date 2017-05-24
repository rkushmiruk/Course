package com.romankushmiruk.controller;

import com.romankushmiruk.model.StudentQueue;
import com.romankushmiruk.model.entity.student.Student;
import com.romankushmiruk.model.entity.student.StudentGroup;
import com.romankushmiruk.util.GlobalConstants;
import com.romankushmiruk.view.View;

public class StudentProducer extends Thread {
    private StudentGroup students;
    private StudentQueue queue;
    private View view;

    public StudentProducer(StudentGroup students, StudentQueue queue, View view) {
        this.students = students;
        this.queue = queue;
        this.view = view;
    }

    @Override
    public void run() {
        while (!students.getStudents().isEmpty()) {
            if (queue.getQueue().size() < 25) {
                while (queue.getQueue().size() != 50) {
                    if (students.getStudents().isEmpty()) {
                        return;
                    }
                    Student student = students.getStudents().get(0);
                    queue.getQueue().add(student);
                    view.printMessage(GlobalConstants.STUDENT_ADD_TO_QUEUE + student);
                    students.getStudents().remove(student);
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}