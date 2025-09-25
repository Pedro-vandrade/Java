package application;
import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Cost of the dolar today:");
        double dollarPrice = sc.nextDouble();
        System.out.println("Whats the amount you would like to buy of the US currency:");
        double amount = sc.nextDouble();
        double result = CurrencyConverter.dollarToReal(amount,dollarPrice); //
        System.out.printf("You will be paying a total of: R$ %.2f%n", result);
    }
}


// em result crio a variavel que dira o valor total, chamando as propriedades criadas na classse currencyconverter