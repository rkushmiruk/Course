package com.romankushmiruk.controller;

import com.romankushmiruk.model.StudentQueue;
import com.romankushmiruk.model.entity.institute.BiologyInstitute;
import com.romankushmiruk.model.entity.institute.InstituteFactory;
import com.romankushmiruk.model.entity.institute.MathInstitute;
import com.romankushmiruk.model.entity.institute.RandomInstitute;
import com.romankushmiruk.util.GlobalConstants;
import com.romankushmiruk.view.View;

import java.util.concurrent.BlockingQueue;

public class StudentConsumer extends Thread {
    private BlockingQueue queue;
    private InstituteFactory mathInstituteStudents;
    private InstituteFactory biologyInstituteStudents;
    private InstituteFactory universalInstituteStudents;
    private View view;

    public StudentConsumer(StudentQueue studentQueue, View view) {
        this.queue = studentQueue.getQueue();
        this.view = view;
        mathInstituteStudents = new MathInstitute();
        biologyInstituteStudents = new BiologyInstitute();
        universalInstituteStudents = new RandomInstitute();
    }

    @Override
    public void run() {
        waitForFirstEntrants();

        while (!queue.isEmpty()) {
            try {
                mathInstituteStudents.applyStudent(queue);
                sleep(20);
                biologyInstituteStudents.applyStudent(queue);
                sleep(20);
                universalInstituteStudents.applyStudent(queue);
                sleep(20);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        view.printMessage(GlobalConstants.MATH_INSTITUTE + getMathInstituteStudents().getStudents().size());
        view.printMessage(GlobalConstants.BIOLOGY_INSTITUTE + getBiologyInstituteStudents().getStudents().size());
        view.printMessage(GlobalConstants.RANDOM_INSTITUTE + getUniversalInstituteStudents().getStudents().size());
        view.printMessage("sum " + (getMathInstituteStudents().getStudents().size() +
                getBiologyInstituteStudents().getStudents().size() +
                getUniversalInstituteStudents().getStudents().size()));
    }

    private void waitForFirstEntrants() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private InstituteFactory getMathInstituteStudents() {
        return mathInstituteStudents;
    }

    private InstituteFactory getBiologyInstituteStudents() {
        return biologyInstituteStudents;
    }

    private InstituteFactory getUniversalInstituteStudents() {
        return universalInstituteStudents;
    }
}