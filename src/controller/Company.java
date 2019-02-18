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
        //inkrementacja indexu
        index++;

        //wyswietlenie danych zapisaego pracownika

        System.out.println("Dodano pracownika: " + e);

    }

    public void getAllEmployess() {
        System.out.println("lista pracownikow");
        for (int i = 0; i < index; i++) {
            System.out.println(employees[i]);
        }

    }

    public Employee getEmployeeByPesel(String Pesel_search) {
        for (int i = 0; i < index; i++) {
            if (employees[i].Pesel.equals(Pesel_search)) {
                return employees[i];
            }
        }
        return null;
    }

    public void setSalary(String Pesel_search, double newSalary) {

        for (int i = 0; i < index; i++) {
            if (employees[i].Pesel.equals(Pesel_search)) {
                employees[i].salary_net = newSalary;
            }
        }
    }
    public static void main(String[] args) {
        Company c = new Company();
        //wywolanie metody
        c.addEmployee("Adam", "Kowalski", "92090910201", "1992-09-09", "2017-11-12", 2100);
        c.addEmployee("Albert", "Kowalewski", "92090910221", "1992-09-09", "2017-11-12", 2400);
        c.addEmployee("Zenobiusz", "Kowalkiewicz", "92090910201", "1992-09-09", "2017-11-12", 20100);
        c.getAllEmployess();
        System.out.println("szukani po pesel");
        System.out.println(c.getEmployeeByPesel("333"));
        System.out.println(c.getEmployeeByPesel("92090910221"));
        c.setSalary("92090910221", 10000);
        System.out.println();
        c.getAllEmployess();
    }
}
