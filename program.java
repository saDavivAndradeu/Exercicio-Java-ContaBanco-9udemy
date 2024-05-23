package entities;

import java.util.Locale;
import java.util.Scanner;

import curso_programacao.Account;

public class Program {
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Account account;
		
		System.out.print ("Insira o numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Insira o nome da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Deseja fazer um deposito inicial? (s/n)? ");
		char response = sc.next().charAt(0);
		if (response == 's') {
			System.out.print("Insira o valor do deposito: ");
			double ValorInicial = sc.nextDouble();
			account = new Account( numero,  nome,  ValorInicial);
		}
		else {
			account =  new Account (numero, nome);
		}
		System.out.println();
		System.out.println("Account dat:");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Insira um deposito: ");
		
		double ValorDeposito = sc.nextDouble();	
		account.deposit(ValorDeposito);
		System.out.println("Updated account data");
		System.out.println(account);
		
		sc.close();
	}
		
}
