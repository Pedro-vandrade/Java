import java.util.Scanner;


public class idade_dias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos anos de vida você possui? ");
        int anos = scanner.nextInt();
        System.out.println("Quantos meses de vida você possui? ");
        int meses = scanner.nextInt();
        System.out.println("Quantos dias de vida você possui? ");
        int dias = scanner.nextInt();

        int totalDias = 0;
        totalDias += (anos * 365) + (meses * 30) + dias;
        System.out.println("Total de dias vividos: " + totalDias);









        scanner.close();
    }

    }
