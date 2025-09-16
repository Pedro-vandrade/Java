import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite o primeiro número");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo número");
		num2 = sc.nextInt();
		
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("Os números são multiplos");
		}else {
			System.out.println("Os números não são multiplos.");

		}
		

	}

}
