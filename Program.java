package Sem1.Task2;

import Sem1.Task2.Food.*;
import Sem1.Task2.Hygiene.*;
import Sem1.Task2.Beverages.*;
import Sem1.Task2.ChildrensGoods.*;

public class Program {

    static void printProduct (Goods item){
        System.out.println(item.toString());
    }

    public static void main(String[] args) {
        Bread bread1 = new Bread ("Бородинский", 34.50, "шт.", 500, 2022, 8, 25, "ржаная");
        Food eggs1 = new Eggs ("Cеляночка", 74, "конт.", 100, 2022,9,20,10);
        Milk milk1 = new Milk ("Домик в деревне",69,"шт.", 500, 1.5, 2.5, 2022, 8, 20);
        Lemonade baykal = new Lemonade("Baykal", 79, "бут.", 1000, 0.50);
        Mask mask1 = new Mask("Алина210", 49, "шт.", 100, 10);
        ToiletPaper tp1 = new ToiletPaper("Papia", 300, "уп.", 500, 8, 3);
        ToiletPaper tp2 = new ToiletPaper("Zewa Delux", 399, "уп.", 600, 4, 3);
        ToiletPaper tp3 = new ToiletPaper("Zewa Delux", 699, "уп.", 400, 8, 3);
        Pasifier pas1 = new Pasifier("NUK Happy kids", 259, "шт.", 300, 0, true);
        Diapers huggies1 = new Diapers("Pampers Baby-Dry", 1289, "уп.", 100, 0, 
                        true, 2, 4, 8, "однораз.");
           
        printProduct(bread1);
        printProduct(eggs1);
        printProduct(milk1);
        printProduct(baykal);
        printProduct(mask1);
        printProduct(tp1);
        printProduct(tp2);
        printProduct(tp3);
        printProduct(pas1);
        printProduct(huggies1);

        // System.out.println("-------------------");
        // Hygiene.printList();
    }
}
    

