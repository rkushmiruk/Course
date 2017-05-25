package com.romankushmiruk.model.entity.institute;


import com.romankushmiruk.model.entity.student.Student;
import com.romankushmiruk.model.entity.student.StudentSpeciality;

import java.util.Iterator;
import java.util.Queue;

public class MathInstitute extends InstituteFactory {
    @Override
    public void applyStudent(Queue<Student> queue) {
        Iterator<Student> iterator = queue.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getSpeciality() == StudentSpeciality.MATH) {
                getStudents().add(student);
                System.out.println("Math institute applied new entrant: " + student);
                iterator.remove();
            } else {
                return;
            }
        }
    }
}
