package AtividadeAP;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float num1, num2, res = 0;
		int op = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\nEntre com o primeiro numero: ");
			num1 = leia.nextFloat();
			System.out.println("\nEntre com o segundo numero: ");
			num2 = leia.nextFloat();
			System.out.println("\n=====Calculadora=====");
			System.out.println("\n1- Soma");
			System.out.println("\n2- Diferença");
			System.out.println("\n3- Multiplicação");
			System.out.println("\n4- Divisão");
			System.out.println("\n5- Sair");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt();

			switch (op) {
			case 1:
				res = num1 + num2;
				System.out.println("\nResultado: " + res);
				break;
			case 2:
				res = num1 - num2;
				System.out.println("\nResultado: " + res);
				break;
			case 3:
				res = num1 * num2;
				break;
			case 4:
				if (num2 == 0) {
					System.out.println("\nNão é possível realizar a divisão");
				} else {
					res = num1 / num2;
					System.out.println("\nResultado: " + res);
				}
				break;
			case 5:
				System.out.println("\nObrigado por utilizar nosso app!");
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;

			}

		} while (op != 5);

	}

}
