package com.romankushmiruk.model.entity.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroup {
    private static final int NUMBER_BIOLOGY_STUDENTS = 200;
    private static final int NUMBER_MATH_STUDENTS = 200;
    private List<Student> students;

    private void initStudents() {
        for (int i = 0; i < NUMBER_BIOLOGY_STUDENTS; i++) {
            students.add(new Student(StudentSpeciality.BIOLOGY));
        }
        for (int i = 0; i < NUMBER_MATH_STUDENTS; i++) {
            students.add(new Student(StudentSpeciality.MATH));
        }
        Collections.shuffle(students);
    }

    public StudentGroup() {
        students = new ArrayList<>();
        initStudents();
    }

    public List<Student> getStudents() {
        return students;
    }
}
