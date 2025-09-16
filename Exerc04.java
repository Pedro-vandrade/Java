import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicJogo, fimJogo, duracao;

        System.out.println("Digite a hora de inicio do jogo: ");
        inicJogo = sc.nextInt();
        System.out.println("Digite a hora de término do jogo.");
        fimJogo = sc.nextInt();

        if (inicJogo >= 0 && fimJogo <= 24) {
            duracao =  fimJogo - inicJogo ;
            System.out.println("A duração do jogo foi de: " + duracao + " hora(s).");
        }else {
            System.out.println("Dados de inicio e término invalidos.");
        }

        sc.close();

    }
}
