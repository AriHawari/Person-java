package PersonStudent;

public class Teacher extends Person {
    String subject;

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher() {
        super();
        subject = "";
    }
    public Teacher(String name, String subject, int age) {
        super(name, age);
        this.subject = subject;
    }public void print() {
        super.print();
        System.out.println("Subject: "+subject);
    }

}
