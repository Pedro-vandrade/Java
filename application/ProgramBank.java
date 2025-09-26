package application;
import entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank account;

        System.out.print("Informe o número da conta: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Informe o nome do titular: ");
        String holder = sc.nextLine();
        System.out.println("Is there an initial deposit ?");
        char resp = sc.next().charAt(0);
        if (resp == 'y') {
            System.out.print("Informe o valor do deposito inicial: ");
            double initialDeposit = sc.nextDouble();
            account = new Bank(accountNumber,holder,initialDeposit);
        }else {
            account = new Bank(accountNumber, holder);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println();



        System.out.println("Dados Bancários");
        System.out.println("Conta: " + account.getAccountNumber() + " Titular " + account.getName() + " Saldo: " + account.getBalance());


        sc.close();
    }
}
