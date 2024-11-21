package oo;

public class Person {
    private  Integer id;
    private  String name;
    private  Integer age;

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce(){
        return "My name is " + name + ". I am " + age +" years old.";
    }
}
