package application;

import java.util.Locale;
import java.util.Scanner;

public class negativosVector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n; // vai guardar a quantidade de números que o usuário deseja digitar

        System.out.println("How many numbers will you type:");
        n = sc.nextInt();

        int[] numeros = new int[n]; // Cria um vetor de inteiros chamado - numeros -
        // vetor com n posições. Ou seja, se n = 5, o vetor terá espaço para armazenar 5 números.

        for (int i=0; i<n; i++) { // vai de  i =0 até i menor que n
            System.out.print("Type a number: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Negative numbers:");

        for (int i=0; i<n; i++) {
            if (numeros[i] < 0) {
                System.out.printf("%d\n", numeros[i]); // o i será o indice dos vetores
            }
        }



        sc.close();
    }
}
