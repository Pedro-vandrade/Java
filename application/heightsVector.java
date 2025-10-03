package application;

import java.util.Locale;
import java.util.Scanner;

public class heightsVector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Digite o número de pessoas:");
        n = sc.nextInt();

        String[] names = new String[n];
        int[] age = new int[n];
        double [] heights = new double[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            names[i] = sc.next();
            System.out.print("Idade: ");
            age[i] = sc.nextInt();
            System.out.print("Altura: ");
            heights[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (int i=0; i<n; i++) {
            sum += heights[i];
        }
        double avgHeights = sum / n;

        System.out.printf("Average Height :  %.2f%n", avgHeights);

        int count = 0;
        for (int i=0; i<n; i++) {
            if (age[i] < 16) {
                count += 1;
            }
        }

        double pctge = count * 100.0 / n;
        System.out.printf("%.2f%%n", pctge);
        sc.close();
    }
}


//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.