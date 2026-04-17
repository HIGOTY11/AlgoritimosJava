package Exercívios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\nMenu de opções");
			System.out.println("\n01-Olá");
			System.out.println("\n02-Data Atual");
			System.out.println("\n03-Sair");
			System.out.println("\nDigite qual opção: ");
			op = leia.nextInt();

			switch (op) {

			case 1:
				System.out.println("\nBoa noite!");
				break;

			case 2:
				System.out.println("\n16/04/2026");
				break;

			case 3:
				System.out.println("\nSaindo do Sistema");
				break;

			default:
				System.out.println("\nOpção inválida!");
				break;

			}

		} while (op != 3);

		leia.close();

	}

}
