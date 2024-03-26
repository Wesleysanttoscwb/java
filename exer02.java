package Exercicios;
import java.util.Scanner;

public class Exer02 {
	public static void main(System[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int numero = scanner.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Este número " + numero + "é par" );
			
	}
	
	    else{
		    System.out.println("Este número é ímpar");
		
	}

		scanner.close();
}
}
