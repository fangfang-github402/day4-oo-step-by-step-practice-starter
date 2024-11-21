package oo;

import java.util.Objects;

public class Klass {
    public static final String IS_NOT_ONE_OF_US = "It is not one of us.";
    private int number;

    private Student leader;

    private Teacher attach_teacher;

    private Student attach_student;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public boolean isLeader(Student student) {
        if (leader == null)
            return false;
        return leader.equals(student);
    }

    public void assignLeader(Student student) {
        if (student.isIn(this)) {
            this.leader = student;
            if (attach_teacher != null) {
                System.out.println("I am " + this.attach_teacher.getName() + ", teacher of Class " + number + ". I know " + leader.getName() + " become Leader.");
            }
            if (attach_student != null) {
                System.out.println("I am " + this.attach_student.getName() + ", student of Class " + number + ". I know " + leader.getName() + " become Leader.");
            }
        } else {
            System.out.println(IS_NOT_ONE_OF_US);
        }
    }

    public void attach(Teacher teacher) {
        this.attach_teacher = teacher;
    }

    public void attach(Student student) {
        this.attach_student = student;
    }
}
