package Exercicios;
import java.util.Scanner;

public class Exer01 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número:");
		int numero= scanner.nextInt();
		
		if(numero<0) {
			System.out.println("Este número " + numero + " é Negativo.");
		}
		
		else if(numero>0) {
			System.out.println("Este número " + numero + " é Positivo");
			
		}
		
		else {
			System.out.println("Este número " + numero + " é Zero");
		}
		
		
	}

}
