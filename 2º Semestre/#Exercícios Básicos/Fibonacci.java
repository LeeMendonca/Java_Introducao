/* 7. Faça um programa que leia um número inteiro n e exiba a sequência de
Fibonacci até o n-ésimo termo. */

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = scanner.nextInt();
		
		int a=0, b=1, temp;
		for (int i=0; i<n; i++) {
		    System.out.print(a+" ");
		    temp = a+b;
		    a = b;
		    b = temp;
		}
		
		scanner.close();
	}
}
