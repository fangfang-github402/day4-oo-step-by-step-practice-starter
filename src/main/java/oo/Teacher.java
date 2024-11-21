package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private List<Klass> techClasses;

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
        this.techClasses = new ArrayList<>();
    }

    public String introduce() {
        String classes = techClasses.stream().map(techClass -> String.valueOf(techClass.getNumber())).collect(Collectors.joining(", "));
        return super.introduce() + " I am a teacher. " + "I teach Class " + classes + ".";
    }

    public void assignTo(Klass klass){
        techClasses.add(klass);
    }

    public boolean belongsTo(Klass klass) {
        return techClasses.contains(klass);
    }

    public boolean isTeaching(Student student) {
        return !techClasses.stream().filter(techClass ->student.isIn(techClass)).collect(Collectors.toList()).isEmpty();
    }
}
