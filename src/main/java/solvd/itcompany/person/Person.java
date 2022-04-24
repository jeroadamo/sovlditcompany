package solvd.itcompany.person;

public abstract class Person {
    private String name;
    private int id;
    private int age;

    public Person() {
        this.name = "empty";
        this.id = 0;
        this.age = 0;
    }

    public Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "name='" + name + '\'' + ", id='" + id + '\'' + '\'' + "age=" + age;
    }
}