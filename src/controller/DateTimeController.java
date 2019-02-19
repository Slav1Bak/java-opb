package controller;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DateTimeController {
    public int getAgeFromStringDate(String date) {
        LocalDate birthdate = LocalDate.parse(date);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthdate, today);
        System.out.println("\n\t\tRoznica: " + age);

        // System.out.println(birthdate);
        return age.getYears();
    }

    public LocalDate dateComparator(String d1, String d2) {
        LocalDate date1 = LocalDate.parse(d1);
        LocalDate date2 = LocalDate.parse(d2);
        return date1.isBefore(date2) ? date1 : date2;
    }

    //ile poniedzialkow
    public int getMondaysBetweenDates(String d1, String d2) {
        LocalDate date1 = LocalDate.parse(d1);
        LocalDate date2 = LocalDate.parse(d2);
        //sprawdzam ktora data jest mniejsza, a ktora wieksza
        LocalDate lessDate = date1.isBefore(date2) ? date1 : date2;
        LocalDate greaterDate = date1.isAfter(date2) ? date1 : date2;
        //licznik poniedzialkow
        int mondayCounter = 0;
        //inicjalizujemy petle data mniejsza
        // warunkiem wykonania petli jesst sprawdzenie czy data mniejsza nie przekroczyla daty wiekszej
        // w kroku dodaje jeden dzien
        for (LocalDate ld = lessDate; ld.isBefore(greaterDate); ld = ld.plusDays(1)) {
            if (ld.getDayOfWeek() == DayOfWeek.MONDAY) {
                mondayCounter++;
            }
        }
        return mondayCounter;
    }

    public void myBirthday(String d) {
        LocalDate date = LocalDate.parse(d);
        DayOfWeek myDay = date.getDayOfWeek();
        for (LocalDate ld = date; ld.isBefore(LocalDate.now()); ld = ld.plusYears(1)) {
            if (ld.getDayOfWeek() == myDay) {
                System.out.println(ld);
            }
        }
    }

    public static void main(String[] args) {
        DateTimeController dtc = new DateTimeController();
        // dtc.getAgeFromStringDate("2000-10-01");
        System.out.println("\n\tTwoj wiek dokladny to: " + dtc.getAgeFromStringDate("2000-10-01") + "lat");
        // dtc.dateComparator("2000-02-20", "2001-05-05");
        System.out.println("Wczesniejsza data: " + dtc.dateComparator("2000-02-20", "2001-05-05"));
        System.out.println("Wczesniejsza data: " + dtc.dateComparator("2000-02-20", "1991-05-05"));
        System.out.println("Wczesniejsza data: " + dtc.dateComparator("0200-02-20", "1991-05-05"));
        System.out.println("Liczba poniedzialkow pomiedzy datami: " + dtc.getMondaysBetweenDates("2018-02-19", "2019-03-05"));
        System.out.println("\nMoje urodziny przypadly w dzien urodzin");
        dtc.myBirthday("1992-02-09");
    }
}