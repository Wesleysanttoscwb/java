package Exercicios;
import java.util.Scanner;

public class Exer03 {
	public static void main (String [] args) {
		Scanner Scanner= new Scanner(System.in);
		
		System.out.println("Digite um nuúmero de 1 a 7 para descobrir se o dia da semana é útil: ");
		
		int diaSemana = Scanner.nextInt();
		
		switch (diaSemana) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		System.out.println("Dia útil");
		break;
		
		case 6:
		case 7:
		System.out.println("Final de Semana");
		break;
		
		default:
		System.out.println("número inválido, por favor, digite outro.");	
		}
		Scanner.close();
	}

}
