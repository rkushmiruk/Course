package com.romankushmiruk.model.entity.institute;

import com.romankushmiruk.model.entity.student.Student;

import java.util.Iterator;
import java.util.Queue;

public class RandomInstitute extends InstituteBuilder {
    private static final int MIN_APPLY_STUDENTS = 1;
    private static final int MAX_APPLY_STUDENTS = 5;

    @Override
    public void applyStudents(Queue<Student> queue) {
        int count = 0;
        Iterator<Student> iterator = queue.iterator();
        Student student;
        while (iterator.hasNext()) {
            if (count != rand(MIN_APPLY_STUDENTS, MAX_APPLY_STUDENTS)) {
                student = iterator.next();
                getStudents().add(student);
                System.out.println("Universal institute applied new entrant: " + student);
                count++;
                iterator.remove();
            } else {
                return;
            }
        }
    }

    private int rand(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }
}
