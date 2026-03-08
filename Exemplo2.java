package Projectjava;

import java.util.Scanner;

//Exercicio 2

public class Exemplo2 {
	public static void main(String[] args) {
	float d, r, s, a, b, c;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nDigite o valor do a ");
	a = leia.nextFloat();
	
	System.out.println("\nDigite o valor do b ");
	b = leia.nextFloat();
	
	System.out.println("\nDigite o valor do c ");
	c = leia.nextFloat();
	
	r = (float) Math.pow((a+b),2);
	
	s = (float) Math.pow((b+c),2);
	
	d = (float) (r + s) / 2;
	
	System.out.println("\nResultado da primeira conta: "+d);
	
	System.out.printf("\nResultado da primeira conta: %.2f",d);
	
	}
	
}