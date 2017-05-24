package com.romankushmiruk.model.entity.institute;

import com.romankushmiruk.model.entity.student.Student;

import java.util.ArrayList;
import java.util.List;


public abstract class InstituteBuilder {
    protected List<Student> students = new ArrayList<>();

    public List<Student> getStudents(){
        return students;
    }

    public abstract void takeStudents();

}
