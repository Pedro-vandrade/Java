import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Digite o número: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O número é par.");
		}else {
			System.out.println("O número é impar.");
		}
	}

}
