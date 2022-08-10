package My_Java_OOP1.ChildrensGoods;

public class Diapers extends ChildrenGoods {

    private static String productName = "Подгузники";
    private int size;
    private int minWeight;
    private int maxWeight;
    private String type;
    
    public Diapers(String name, double price, String unit, int amount, int minAge, Boolean hypoAllergic,
         int size, int minWeight, int maxWeight, String type) {
        super(name, price, unit, amount, minAge, hypoAllergic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%d. %s %s, %s, size:%d, %d-%dкг", super.num, productName, this.type, super.toString(), this.size, this.minWeight, this.maxWeight);
        // , size d%, %d - %d кг
        //, this.size, this.minWeight, this.maxWeight);
        
    }
}
