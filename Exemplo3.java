package Projectjava;

import java.util.Scanner;

//Exercicio 3

public class Exemplo3 {
	public static void main(String[] args) {
		
		int anos, meses, dias, totalDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade");
		anos = leia.nextInt();
		System.out.println("\nDigite com os meses");
		meses = leia.nextInt();
		System.out.println("\nDigite com os dias");
		dias = leia.nextInt();
		
		totalDias = anos*365+meses*30+dias;
		
		System.out.println("\nVocê viveu "+totalDias+" dias de Vida...");
		
	}
	
}