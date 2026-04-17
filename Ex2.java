package Exercívios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, soma = 0, x = 1;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com o primeiro numero: ");
		num = leia.nextInt();

		while (x <= num) {
			soma += x; // soma = soma + x
			x++;

		}
		System.out.println("\nSomatório : " + soma);
		
		leia.close();

	}
	
}
