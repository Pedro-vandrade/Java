package ifelse;

import java.util.Scanner;


public class Exerc09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double imposto;
        System.out.println("Digite o Salario: ");
        double salario = sc.nextDouble();
// 2500
        if (salario <= 2000.00 && salario <= 2999.99) {
            System.out.printf("Sem taxa de imposto.");
        } else if (salario >= 3000.00 && salario <= 4499.99) {
            imposto = ((salario - 2000) * 8) / 100;
            System.out.printf("Imposto a ser pago R$ %.2f%n: ", imposto);
        } else if (salario >= 4500.00) {
            imposto = ((salario - 2000) * 18) / 100;
            System.out.printf("Imposto a ser pago R$ %.2f%n: ", imposto);
            {

            }
        }
    }
}


