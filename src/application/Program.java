package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account conta;
		
		double saldoInicial = 0.0;
		
		System.out.print("Digite o numero da conta: ");
		int numero = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o nome do titular da conta: ");
		String titular = sc.nextLine();
		
		
		System.out.print("Precisa fazer um deposito inicial (s/n)? ");
		String depositoInicial = sc.next();
		sc.nextLine();
				
		if (depositoInicial.equals("s")) {
			System.out.print("Digite o valor do deposito: ");
			saldoInicial = sc.nextDouble(); 
			conta = new Account(numero, titular, saldoInicial);
		} else {
			System.out.println();
			conta = new Account(numero, titular);
		}
		
		System.out.println();
		
		System.out.println("Dados da conta: " + conta);

		System.out.print("Digite um valor para deposito: ");
		double quantidade = sc.nextDouble();
		conta.depositar(quantidade);
		System.out.println();
		System.out.println("Conta atualizado: " + conta);
		
		System.out.print("Digite um valor para retirar: ");
		quantidade = sc.nextDouble();
		conta.retirar(quantidade);
		System.out.println();
		System.out.println("Conta atualizado: " + conta);
		
		sc.close();
	}

}
