package Task5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> inventoryList = new ArrayList<>();
        Product product1 = new Product("Apple", 4.95, 20);
        Product product2 = new Product("Banana", 2.49, 50);     //vi initialiserer objekter
        Product product3 = new Product("Carrot", 1.49, 120);

        addProducts(inventoryList, product1);
        addProducts(inventoryList, product2);       //Vi tilføjer objekter til vores Array vha. metoden 'addProducts'
        addProducts(inventoryList, product3);

        double totalValue = calculateInventoryValue(inventoryList); //vi deklarerer et ny double som holder værdien af
        System.out.println(totalValue);                             //metoden 'calculateInventoryValue'

    }

    public static void addProducts(ArrayList<Product> inventoryList, Product product) {
        inventoryList.add(product);     //denne funktion tilføjer objekter til vores array
    }

    public static double calculateInventoryValue(ArrayList<Product> inventoryList) {    //denne funktion kalkulerer den
        double totalValue = 0.0;            //sammenlagte værdi af alle vores Product's, som befinder sig i vores
        for (Product product : inventoryList) {     //arrayliste 'inventoryList
            totalValue += product.getPrice() * product.getQuantity();
        }
        return totalValue;
    }
}


