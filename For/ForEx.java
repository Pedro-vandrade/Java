package For;
import java.util.Scanner;

public class ForEx {
    public static void main(String[] args) {
        // for in java
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // vai re
        int soma = 0;
        for(int i =0; i<n; i++){ // i é igual a zero, enquanto i for menor que a variavel N, continuamos somando
            int x = sc.nextInt(); // Lê o numero x
            soma += x; // Acrescenta o número x na soma que se inicia em zero, isso enquanto o i for menor que n
        }
        System.out.println(soma);
        sc.close();
    }
}
