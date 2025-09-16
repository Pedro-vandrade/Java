import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int numID, horas;
			double valorHora, salario;
			
			numID = sc.nextInt();
			horas = sc.nextInt();
			
			valorHora = sc.nextDouble();

			salario = valorHora * horas;

			System.out.println("O funcionário de id " + numID + " trabalha um total de " +horas+ " diarias e recebe um total de " + salario);
		}
		
	}

}
