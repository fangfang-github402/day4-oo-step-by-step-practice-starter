package oo;

import java.util.Objects;

public class Klass {
    private int number;

    private Student leader;

    private Teacher attach_teacher;

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
            System.out.println("I am " + this.attach_teacher.getName() + ", teacher of Class " + number + ". I know " + leader.getName() + " become Leader.");
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public void attach(Teacher teacher) {
        this.attach_teacher = teacher;
    }
}
