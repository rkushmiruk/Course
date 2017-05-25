package com.romankushmiruk.model.entity.student;

public class StudentFactory {
    public static Student createStudent(StudentSpeciality studentSpeciality){
        return new Student(studentSpeciality);
    }
}
