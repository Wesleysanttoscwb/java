package Exercicios;
import java.util.Scanner;

public class Exer06 {
	public static void main (String [] args) {
		Scanner Scanner= new Scanner(System.in);
		
		System.out.println("Digite um número 1 a 12 correspondente ao mês do ano e descubra a estação do ano: ");
		
		int estacao = Scanner.nextInt();
		
		switch (estacao) {
		
		case 1:
		case 2:
		case 3:
		System.out.println("VERÃO");
		break;
		
		case 4:
		case 5:
		System.out.println("OUTONO");
		break;
			
		case 6:
		case 7:
		case 8:
		case 9:
		System.out.println("IVERNO");
		break;
		
		case 10:
		case 11:
		case 12:
			
		System.out.println("PRIMAVERA");
		break;
		

		
		default:
		System.out.println("número inválido, por favor, digite outro.");	
		}
		Scanner.close();
	}

}

