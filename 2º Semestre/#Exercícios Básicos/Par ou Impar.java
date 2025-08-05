/* 5. Faça um programa que leia um número e exiba se ele é par ou ímpar */

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		System.out.print("Digite um número: ");
		n = scanner.nextInt();
		
		if (n%2==0) {
		    System.out.print("Par!");
		} else {
		    System.out.print("Ímpar");
		}
		
	}
}
