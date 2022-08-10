package Sem1.Task2.Beverages;

import java.time.LocalDate;

public class Milk extends Beverage{

    private LocalDate expirationDate;
    private double fatContent;
    private static String productName = "Молоко";

    public Milk(String name, double price, String unit, int amount, double volume, double fatContent, int year,int month, int day) {
        super(name, price, unit, amount, volume);
        this.expirationDate = LocalDate.of(year, month, day);
        this.fatContent = fatContent;
    }

    @Override
    public String toString() {
        return String.format("%d. %15s, %s, %.1f%%, %s", super.num, productName, super.toString(), this.fatContent, this.expirationDate);
    }
    
}
