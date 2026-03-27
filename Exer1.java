package Atividades;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int valor;

		Scanner leia = new Scanner(System.in);

		for (valor = 1; valor <= 5; valor++) {
			System.out.println("\nEntre com o valor " + valor);
			num = leia.nextInt();

			if (num < 0) {
				System.out.println("\nValor é negativo!");
			} 
			else if (num == 0) {
				System.out.println("\nValor é neutro!");
			}
			else {
				System.out.println("\nValor é positivo!");
			}
			
		leia.close();
		
		}

	}

}
