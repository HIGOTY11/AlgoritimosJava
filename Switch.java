package Atividades;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1, num2, res = 0;
		char operacao;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com o primeiro número: ");
		num1 = leia.nextFloat();
		System.out.println("\nEntre com o segundo número: ");
		num2 = leia.nextFloat();

		System.out.println("\nCalculadora");
		System.out.println("+ -- Soma");
		System.out.println("- -- Diferença");
		System.out.println("* -- Multiplicação");
		System.out.println("/ -- Divisão");
		System.out.println("\nEntre com a sua opção: ");
		operacao = leia.next().charAt(0);

		switch (operacao) {
		case '+':
			res = num1 + num2;
			break;

		case '-':
			res = num1 - num2;
			break;

		case '*':
			res = num1 * num2;
			break;

		case '/':
			if (num2 == 0) {
				System.out.println("\nNão existe divisão por zero...");
			} else {
				res = num1 / num2;
			}
			break;

		default:
			System.out.println("\nOperação não existe!!!");
		}
		System.out.println("\nResultado: " + res);
	}

}
