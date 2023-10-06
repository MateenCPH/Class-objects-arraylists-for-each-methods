package Task5;

public class Product {

    private String name;
    private double price;
    private int quantity;

    Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return "Product name: " + name + ". Product price: " + price + ". Product quantity: " + quantity;
    }
}
