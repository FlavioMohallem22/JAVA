package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		double deposite = 0;
		System.out.print("Entre com os dados da conta: \n");
		System.out.print("Digite o numero da conta: ");
		int number = sc.nextInt();
		System.out.print("Digite o nome do titular da conta: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Voce vai fazer um deposito inicial (s/n) ? ");
		char aux = sc.next().charAt(0);
		if (aux == 's'){
		System.out.println("Digite o valor do deposito inicial ao abrir a conta: ");
		deposite = sc.nextDouble();
			account = new Account(number, name, deposite);
		}
		else{
			account = new Account(number, name);
		}
		
		System.out.println(account);
		System.out.print("\nDigite o valor do deposito: ");
		deposite = sc.nextDouble();
		account.deposite(deposite);
		System.out.println("\nDados atualizados: ");
		System.out.println(account);
		System.out.print("\nDigite o valor do saque: ");
		deposite = sc.nextDouble();
		account.saque(deposite);
		System.out.println("\nDados atualizados: ");
		System.out.println(account);
		
		sc.close();
		
	}

}
