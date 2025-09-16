import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numInt;
		
		System.out.println("Digite o número :");
		numInt = sc.nextInt();
		
		if (numInt > 0 ) {
			System.out.println("o número " + numInt + " é positivo.");
		} else {
			System.out.println("O número " + numInt + " é negativo.");
		}

	}

}
