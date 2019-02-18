package model;

public class Employee {
    public String Name;
    public String lastname;
    public String Pesel;
    public String birth_date;
    public String empl_date;
    public double salary_net;

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", Pesel='" + Pesel + '\'' +
                ", birth_date='" + birth_date + '\'' +
                ", empl_date='" + empl_date + '\'' +
                ", salary_net=" + salary_net +
                '}';
    }

    public Employee(String name, String lastname, String pesel, String birth_date, String empl_date, double salary_net) {
        Name = name;
        this.lastname = lastname;
        Pesel = pesel;
        this.birth_date = birth_date;
        this.empl_date = empl_date;
        this.salary_net = salary_net;
    }
}
