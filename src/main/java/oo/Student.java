package oo;

public class Student extends Person {
    private Klass klass;


    public Student(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public String introduce() {
        if(this.klass == null)
            return super.introduce() + " I am a student. I am in class";
        return super.introduce() + " I am a student. I am in class " + this.klass.getNumber()+".";
    }

    public void join(Klass klass) {
        this.klass = klass;
    }

    public boolean isIn(Klass klass) {
        if(this.klass == null)
            return false;
        return this.klass.equals(klass);
    }
}
