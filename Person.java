package PersonStudent;

public class Person {
    String name;
    int age;

    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getage() {
        return this.age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public Person() {
        name = "";
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }





}
