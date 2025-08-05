/* 3. Escreva um programa que leia um valor inteiro n e exiba 
todos os números de 1 a n. */

import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Digite um número inteiro: ");
    	int n = scanner.nextInt();
    		
    	for (int i=1; i<=n; i++) {
    	    System.out.println(i);
    	}
    	
    	scanner.close(); //fechando o Scanner (boa prática)
	
	}
}
