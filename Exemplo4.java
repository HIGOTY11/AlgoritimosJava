package Projectjava;

import java.util.Scanner;

//Exercicio 4

public class Exemplo4 {

	public static void main(String[] args) {
		
		int anos, meses, dias, totalDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o total de dias: ");
		totalDias = leia.nextInt();
		
		anos = totalDias / 365;
		meses = (totalDias % 365) / 30;
		dias = (totalDias % 365) % 30;
		
		System.out.println("\nVocê viveu "+anos+" ano(s), "+meses+" mes(es), "+dias+" dia(s)");
		
	}
}
