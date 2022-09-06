package ExercicioDois;

import java.util.Locale;
import java.util.Scanner;

import ExercicioDois.entities.Account;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		Account account;
        
		System.out.println("SISTEMA CRIAÇÃO DE CONTA ....");
		System.out.print("Enter account number: ");
		int number = entradaDados.nextInt();
		System.out.print("Enter account holder: ");
		entradaDados.nextLine();
		String holder = entradaDados.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = entradaDados.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = entradaDados.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = entradaDados.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = entradaDados.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);

		entradaDados.close();
	}
}
