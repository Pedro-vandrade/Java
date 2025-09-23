package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueinStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
}
// this : palavra reservada que é uma auto referência ao objeto (no caso será quantity)