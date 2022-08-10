package Sem1.Task2.Hygiene;

public class ToiletPaper extends Hygiene {

    private int layers;
    private static String productName = "Бумага туал.";

    public ToiletPaper(String name, double price, String unit, int amount, int amountInPack, int layers) {
        super(name, price, unit, amount, amountInPack);
        this.layers = layers;
        
    }
    @Override
    public String toString() {
        return String.format("%d. %15s, %s, %1d сл.", super.num, productName, super.toString(), this.layers);
    }

    
}
