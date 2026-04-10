package AtividadeAP;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado, tab, x = 1;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com a primeira camada: ");
		tab = leia.nextInt();

		while (x <= 10) {
			resultado = tab * x;
			System.out.println("\n" + tab + " X " + x + " = " + resultado);
			x++;
		}
	}
}
