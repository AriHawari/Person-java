package PersonStudent;

public class Fulltime extends Teacher {
    int anualSalary;
    String unit;

    public int getAnualSalary() {
        return this.anualSalary;
    }

    public void setAnualSalary(int anualSalary) {
        this.anualSalary = anualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Fulltime() {
        super();
        anualSalary = 0;
        unit = "";

    }public Fulltime (String name, int age, String subject, int anualSalary,String unit) {
        super(name, subject, age);
        this.anualSalary = anualSalary;
        this.unit = unit;

    }public void print() {
        super.print();
        System.out.println("anualSalary : " +anualSalary);
        System.out.println("unit : " +unit);
    }

}
