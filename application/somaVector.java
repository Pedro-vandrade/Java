package application;

import java.util.Locale;
import java.util.Scanner;

public class somaVector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double sum = 0.0;
        double media;

        System.out.println("How many numbers: ");
        n = sc.nextInt();

        int nums[] = new int[n];

        for(int i=0; i<n;i++) {
            System.out.println("Type a number:");
            nums[i] = sc.nextInt();
        }
        for (int i=0; i<nums.length;i++) {
            sum += nums[i];
        }
        System.out.printf("The sum of the numbers is: %.2f%n", sum);
        sc.nextLine();
        media = sum/n;
        System.out.printf("The media of the numbers is: %.2f%n", media);


        sc.close();
    }
}


//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor