package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        double avg = sum / n;
        System.out.printf("Valor do deposito:  %.2f%n", avg);

        sc.close();
    }
}
// var i começa valendo 0, então será vect na pos 0, recebdo o que o usuario digita
// recebendo o i como double (1.70, 1.80) até o I chegar o valor de n, que será digitado pelo usuario