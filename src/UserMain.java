import controller.UserController;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserMain {
    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.addUser("Mdddd",
                "lrgsfsf",
                "mdsgdasg",
                "k",
                "mk@mk.pl",
                "565656",
                LocalDate.of(2000, 03, 01),
                LocalDateTime.now());
        uc.addUser("Mfdsk",
                "lgfgssgd",
                "mdsfada",
                "k",
                "mk@mk.pl",
                "565656",
                LocalDate.of(1990, 01, 01),
                LocalDateTime.now());
        uc.addUser("Mfsdf",
                "ldsgadsg",
                "msfas",
                "k",
                "mk@mk.pl",
                "5656556456",
                LocalDate.of(1992, 01, 01),
                LocalDateTime.now());
        uc.addUser("Mfsdf",
                "ldsgadsg",
                "msfas",
                "k",
                "mk@mk.pl",
                "5656556456",
                LocalDate.of(1981, 01, 01),
                LocalDateTime.now());
        uc.addUser("Mfsdf",
                "ldsgadsg",
                "msfas",
                "k",
                "mk@mk.pl",
                "5656556456",
                LocalDate.of(1988, 01, 01),
                LocalDateTime.now());
        uc.addUser("Mfsdf",
                "ldsgadsg",
                "msfas",
                "k",
                "mk@mk.pl",
                "5656556456",
                LocalDate.of(1800, 01, 01),
                LocalDateTime.now());
        uc.addUser("Mf",
                "ldsgadsg",
                "msfas",
                "k",
                "mk@mk.pl",
                "5656556456",
                LocalDate.of(1951, 01, 01),
                LocalDateTime.now());
        uc.getAllUsers();
        System.out.println("Test dat");
        System.out.println("User pierwszy starszy od drugiego " + uc.birthdateComparator(0,1));
        System.out.println("User pierwszy starszy od drugiego " + uc.birthdateComparator(1,2));
        System.out.println("Posortowane po dacie: ASC");
        uc.sortByBirthdate();
        uc.getAllUsers();
    }


}
