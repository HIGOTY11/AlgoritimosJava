package Projectjava;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {		
		float n1,n2,n3,media;
		
		Scanner leia = new Scanner(System.in);
		n1 = leia.nextFloat();
		
		System.out.println("\nEntre com a nota 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("\nEntre com a nota 3: ");
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		
		System.out.println("\nSua média foi de: "+media);
		System.out.printf("\nSua média foi de: %.2f",media);
		
		n1 = (float) Math.pow(n2,3);
		System.out.println("\nA potência é: "+n1);
	}

}
