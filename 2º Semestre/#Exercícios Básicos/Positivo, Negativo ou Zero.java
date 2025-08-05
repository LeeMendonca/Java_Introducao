// 2. Faça um programa que leia um número inteiro exiba se ele é positivo, negativo ou igual a zero.

import java.util.Scanner; // Importa o pacote java.util

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n=0;
		
		System.out.print("Digite um número: ");
		n = scanner.nextInt();
		
		if (n==0) {
		    System.out.print("Zero!");
		} else if (n>0) {
		    System.out.print("Positivo!");
		} else {
		    System.out.print("Negativo!");
		}
		
		scanner.close();
	}
}
