package Aula03;
import java.util.Scanner;

public class Desafio02 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a sua nota:");
		int nota = scanner.nextInt();
		
		if(nota>=90) {
			System.out.println("PARABÉNS!");
		}
		
		if(nota>=70) {
			System.out.println("Aprovado");
		
		}
		else {
			System.out.println("reprovado");
		}
		
			
	scanner.close();	
	}

}
