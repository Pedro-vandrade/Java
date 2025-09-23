package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStock {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();


        System.out.println("Product Data: " + product);
        System.out.println("Enter how much items will be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated product data: " + product);

        System.out.println("Enter how much items will be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated product data after removal: " + product);

        sc.close();
    }
}
