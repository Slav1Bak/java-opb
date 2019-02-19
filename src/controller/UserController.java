package controller;

import model.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserController {
    User users[] = new User[100];
    int index;

    public void addUser(String name, String lastname, String login, String password, String email, String phone, LocalDate birth_day, LocalDateTime registration_date_time) {
        User u = new User(name, lastname, login, password, email, phone, birth_day, registration_date_time);
        u.setRegistration_date_time(u.getRegistration_date_time().plusHours(-1));
        users[index] = u;
        index++;
    }

    public void getAllUsers() {
        for (int i = 0; i < index; i++) {
            System.out.println(users[i]);
        }
    }

    // metoda porownujaca daty urodzenia 2 uzytkownikow
    // jezeli pierwsza < od drugiej to true i naczej false
    public boolean birthdateComparator(User u1, User u2) {
        return u1.getBirth_day().isBefore(u2.getBirth_day());
    }

    public boolean birthdateComparator(int index1, int index2) {
        return users[index1].getBirth_day().isBefore(users[index2].getBirth_day());

    }

    //sprtowanie po roku urodzenia
    //...
    public void sortByBirthdate() {
        for (int j = 0; j < index; j++) {
            for (int i = 1; i < index; i++) {
                //sprawdzenie czy pierwszy jest mlodszy od drugiego
                if (!birthdateComparator(i - 1, i)) {
                    //zamiana miejscami w komorkach tablicy
                    User u1 = users[i - 1];
                    //tymczasowy element oerwszy i drugi
                    User u2 = users[i];
                    //zamiana w tablicy
                    users[i - 1] = u2;
                    users[i] = u1;
                }
            }
        }
    }
}
