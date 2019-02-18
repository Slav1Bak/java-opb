package controller;

import model.Employee;

public class Company {
    Employee employees[] = new Employee[10];
    int index = 0;

    public void addEmployee(String name,
                            String lastname,
                            String pesel,
                            String birth_date,
                            String empl_date,
                            double salary_net) {
        // utworzenie obiektu pracowanika
        Employee e = new Employee(
                name,
                lastname,
                pesel,
                birth_date,
                empl_date,
               salary_net);


        //zapisanie pracownika do listy pracownikow


        employees[index] = e;

        //wyswietlenie danych zapisaego pracownika

        System.out.println("Dodano pracownika: " + e);

    }

    public static void main(String[] args) {
        Company c = new Company();
        c.addEmployee("Adam","Kowalski","92090910201","1992-09-09","2017-11-12",2100);
        c.addEmployee("Albert","Kowalewski","92090910201","1992-09-09","2017-11-12",2400);
        c.addEmployee("Zenobiusz","Kowalkiewicz","92090910201","1992-09-09","2017-11-12",20100);
    }
}
