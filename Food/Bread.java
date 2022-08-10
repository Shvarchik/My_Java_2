package My_Java_OOP1.Food;

public class Bread extends Food {

    private String typeOfFlour;
    private static String productName = "Хлеб";

    public Bread(String name, double price, String unit, int amount, int year, int month, int day, String Flour) {
        super(name, price, unit, amount, year, month, day);
        this.typeOfFlour = Flour;
    }

    @Override
    public String toString() {
        return String.format("%d. %15s, %s, %-10s", super.num, productName, super.toString(), this.typeOfFlour);
    }

}
