import java.util.Scanner;

public class Exercício1 {
	
	public static void main(String[] args) {
		float nota1, nota2, media;
		int frequencia;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("\nEntre com a nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("\nDigite a frequência em porcentagem: ");
		frequencia = leia.nextInt();
		
		media = (nota1 * 4 + nota2 * 6)/10;
		
		if(frequencia < 75) {
			System.out.println("\nReprovado pela frequência");
		}
		else if(media >= 7 && frequencia >= 75) {
			
			char Classificacao;

			if (media >= 9) {
				Classificacao = 'A';
			} 
			else if (media >= 8) {
				Classificacao = 'B';
			} 
			else if (media >= 7) {
				Classificacao = 'C';
			} 
			else {
				Classificacao = 'D';
			}

			switch (Classificacao) {
			    case 'A':
			        System.out.println("\nSua classificação é: A. Sua média final é: " + media);
			        break;

			    case 'B':
			        System.out.println("\nSua classificação é: B. Sua média final é: " + media);
			        break;

			    case 'C':
			        System.out.println("\nSua classificação é: C. Sua média final é: " + media);
			        break;

			    case 'D':
			        System.out.println("\nSua classificação é: D. Sua média final é: " + media);
			        break;
			}
			
			
		}
		else if (media >= 5 && media <= 6.9 && frequencia >= 75) {
			
			System.out.println("\nRecuperação, sua nota foi: " + media);
			
			
			float notaRecuperacao;
			float novaMedia;
			
			System.out.println("\nDigite a nova : ");
			notaRecuperacao = leia.nextFloat();
			
			novaMedia = (media * 6 + notaRecuperacao * 4)/10;
			
			if(novaMedia >= 6) {
				System.out.println("\nAprovado");
				
				char ClassificacaoRecuperacao;

				if (novaMedia >= 9) {
				    ClassificacaoRecuperacao = 'A';
				} 
				else if (novaMedia >= 8) {
				    ClassificacaoRecuperacao = 'B';
				} 
				else if (novaMedia >= 7) {
				    ClassificacaoRecuperacao = 'C';
				} 
				else {
				    ClassificacaoRecuperacao = 'D';
				}

				switch (ClassificacaoRecuperacao) {
				    case 'A':
				        System.out.println("\nSua classificação é: A. Sua média final é: " + novaMedia);
				        break;

				    case 'B':
				        System.out.println("\nSua classificação é: B. Sua média final é: " + novaMedia);
				        break;

				    case 'C':
				        System.out.println("\nSua classificação é: C. Sua média final é: " + novaMedia);
				        break;

				    case 'D':
				        System.out.println("\nSua classificação é: D. Sua média final é: " + novaMedia);
				        break;
				}
				
			}
			else {
				System.out.println("\nReprovado");
			}
		}
		else if (media < 5) {
			System.out.println("\nReprovado por nota");
		}
		
	}
	
}
