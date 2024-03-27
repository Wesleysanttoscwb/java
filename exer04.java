package Exercicios;
import java.util.Scanner;

public class Exer04 {
	public static void main(System[] args) {
		Scanner scanner = new Scanner(System.in);
	
	System.out.print("Digite um número inteiro positivo: ");

    int numero = scanner.nextInt();

    if (numero < 0) {
        System.out.println("O número deve ser positivo.");
    } else {
        int fatorial = 1;
        int contador = 1;

        while (contador <= numero) {
            fatorial *= contador;
            contador++;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
    scanner.close();
}


}
