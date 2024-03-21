package Aula03;
import java.util.Scanner;

public class Desafio01 {
 public	static void main(String[] args ) {
	 Scanner imput = new Scanner(System.in);
	 
	 System.out.print("Digite o seu nome:");
	 String nome = imput.nextLine();
	 
	 System.out.print("Digite o seu signo:");
	 String signo = imput.nextLine();
	 
	 System.out.print("Digite a sua idade:");
	 int idade = imput.nextInt();
	 
	
	 
	 System.out.println("o" + nome + " tem " + idade + " anos" + " do signo " + signo);
	 
	 imput.close();
	 
	 
 }

}
