package com.romankushmiruk.controller;

import com.romankushmiruk.model.StudentQueue;
import com.romankushmiruk.model.entity.institute.*;
import com.romankushmiruk.util.GlobalConstants;
import com.romankushmiruk.view.View;

import java.util.concurrent.BlockingQueue;

public class StudentConsumer extends Thread {
    private BlockingQueue queue;
    private Institute mathInstitute;
    private Institute biologyInstitute;
    private Institute randomInstitute;
    private View view;

    public StudentConsumer(StudentQueue studentQueue, View view) {
        this.queue = studentQueue.getQueue();
        this.view = view;
        mathInstitute = InstituteFactory.createMathInstitute();
        biologyInstitute = InstituteFactory.createBiologyInstitute();
        randomInstitute = InstituteFactory.createRandomInstitute();
    }

    @Override
    public void run() {
        waitForFirstEntrants();

        while (!queue.isEmpty()) {
            try {
                mathInstitute.applyStudent(queue);
                sleep(25);
                biologyInstitute.applyStudent(queue);
                sleep(25);
                randomInstitute.applyStudent(queue);
                sleep(25);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        view.printMessage(GlobalConstants.MATH_INSTITUTE + getMathInstitute().getStudents().size());
        view.printMessage(GlobalConstants.BIOLOGY_INSTITUTE + getBiologyInstitute().getStudents().size());
        view.printMessage(GlobalConstants.RANDOM_INSTITUTE + getRandomInstitute().getStudents().size());
        view.printMessage("sum " + (getMathInstitute().getStudents().size() +
                getBiologyInstitute().getStudents().size() +
                getRandomInstitute().getStudents().size()));
    }

    private void waitForFirstEntrants() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Institute getMathInstitute() {
        return mathInstitute;
    }

    private Institute getBiologyInstitute() {
        return biologyInstitute;
    }

    private Institute getRandomInstitute() {
        return randomInstitute;
    }
}