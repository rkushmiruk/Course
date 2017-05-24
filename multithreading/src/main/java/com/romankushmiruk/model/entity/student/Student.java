package com.romankushmiruk.model.entity.student;


public class Student {
    private StudentSpeciality studentSpeciality;

    public Student(StudentSpeciality studentSpeciality) {
        this.studentSpeciality = studentSpeciality;
    }

    public StudentSpeciality getStudentSpeciality() {
        return studentSpeciality;
    }

    @Override
    public String toString() {
        return "Student {speciality "+studentSpeciality+"}";
    }
}
