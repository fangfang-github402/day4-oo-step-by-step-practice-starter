package oo;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    List<Klass> techClasses = new ArrayList<>();

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return super.introduce()+" I am a teacher.";
    }

    public void assignTo(Klass klass){
        techClasses.add(klass);
    }

    public boolean belongsTo(Klass klass) {
        return techClasses.contains(klass);
    }
}
