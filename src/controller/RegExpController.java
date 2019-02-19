package controller;

import java.util.regex.Pattern;

public class RegExpController {
    public boolean checkPostalCode(String postalCode){
        String template = "^\\d{2}-\\d{3}$";
        return Pattern.matches(template, postalCode);
    }

    public static void main(String[] args) {
        RegExpController rec = new RegExpController();
        System.out.println(rec.checkPostalCode("82-932"));
        System.out.println(rec.checkPostalCode("82-x32"));
        System.out.println(rec.checkPostalCode("82-92"));
        System.out.println(rec.checkPostalCode("82x932"));

    }
}
