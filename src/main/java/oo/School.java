package oo;

import java.util.ArrayList;
import java.util.List;

public class School {
    public List<Teacher> teachers;
    public List<Student> students;

    public School() {
        teachers = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void startSchool() {
        teachers.stream().forEach(teacher -> System.out.println(teacher.introduce()));
        students.stream().forEach(student -> System.out.println(student.introduce()));
    }
}
