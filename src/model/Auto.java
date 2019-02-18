package model;

public class Auto {
    public String brand;
    public String model;
    public int year;
    public String color;
    public String fuel_type;
    public double price;
    public char segment;
    //alt+insert

    //konstruktor- zawsze nazwa jak nazwa klasy, wyjatkow METODA
    public Auto(String brand,
                String model,
                int year,
                String color,
                String fuel_type,
                double price,
                char segment) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.fuel_type = fuel_type;
        this.price = price;
        this.segment = segment;

    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", fuel_type='" + fuel_type + '\'' +
                ", price=" + price +
                ", segment=" + segment +
                '}';
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public double getPrice() {
        return this.price;
    }

    public double getPriceWithTax(int tax) {
        return this.price * (1 + ((double) tax / 100));
    }
}
