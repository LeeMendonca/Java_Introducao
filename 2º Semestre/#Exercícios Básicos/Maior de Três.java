/*4. Crie um programa que receba três números e exiba o maior deles. */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.print("Digite o 1º número: ");
		n1 = scanner.nextInt();
		
		System.out.print("Digite o 2º número: ");
		n2 = scanner.nextInt();
		
		System.out.print("Digite o 3º número: ");
		n3 = scanner.nextInt();
		
		if (n1>n2 && n1>n3) {
		    System.out.print(n1 + " é maior");
		} else if (n2>n1 && n2>n3) {
		    System.out.print(n2 + " é maior");
		} else {
		    System.out.print(n3 + " é maior");
		}
		
		scanner.close();
	}
}
