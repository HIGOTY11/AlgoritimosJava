package Exercívios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, soma = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite um número (ou 0 para sair): ");
		num = leia.nextInt();

		while (num != 0) {

			soma += num;

			System.out.println("\nDigite o próximo número (ou 0 para terminar): ");
			num = leia.nextInt();
		}

		System.out.println("\nA soma total de todos os números digitados é: " + soma);

	}

}
