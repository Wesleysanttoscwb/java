package Aula04;
import java.util.Scanner;
// dia 22-03-24
public class Desafio1 {
	public static void main (String[] args) {
	    Scanner scanner = new Scanner(System.in);
	
	System.out.println("Qual a sua idade?");
	int idade = scanner.nextInt();
	
	System.out.println("Qual o seu batimento cardíaco?");
	int batimento = scanner.nextInt();
	
	if(idade>60 && batimento>150) {
		System.out.println("URGENTE");
	}
	
	if(idade>60 && batimento<=150) {
		System.out.println("Urgência moderada");
	}
	
	if(idade<=60 && batimento>150) {
		System.out.println("Urgência moderada");
	}
	
	if(idade<=60 && batimento<=150) {
		System.out.println("Não urgente");
	}
	
	}

}
