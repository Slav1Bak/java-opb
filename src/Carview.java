import controller.Carcontroller;

import java.util.Scanner;

public class Carview {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Auto factory");
        boolean flag = true;
        //utworzenie obiebktu kontrolera
        Carcontroller cc = new Carcontroller();
        while (flag) {
            System.out.println("1. Zamowienie auta \n2. Lista zamowien \n0. Wyjscie");
            //odczyt wartosci ze skanera\
            int decision = scan.nextInt();
            //konsumpcja
            scan.nextLine();

            switch (decision) {
                case 1:
                    System.out.println("Podaj marke");
                    String brand = scan.nextLine();
                    System.out.println("Podaj model");
                    String model = scan.nextLine();
                    System.out.println("podaj cene");
                    double price = scan.nextDouble();
                    System.out.println("podaj rok");
                    int year = scan.nextInt();
                    //wczytanie brand, model, price, year ze skanerra
                    cc.purchaseCar(brand, model, price, year);
                    break;
                case 2:
                    System.out.println(Carcontroller.getIndex());
                    cc.getCars();
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("\n\t! ! ! Błedny wybor frajerze ! ! !\n");
            }

        }
    }
}