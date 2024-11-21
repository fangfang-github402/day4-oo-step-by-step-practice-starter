package oo;

import java.util.Objects;

public class Klass {
    private int number;

    private Student leader;

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
        if(leader == null)
            return false;
        return leader.equals(student);
    }

    public void assignLeader(Student student) {
        this.leader = student;
    }
}
