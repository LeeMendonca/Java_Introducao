/* 10. Faça um programa que leia um número e exiba a tabuada desse
número até o valor 10. */

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
    		
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Digite um número: ");
	    int n = scanner.nextInt();
	    
	    for (int i=0; i<=10; i++) {
	        
	        int temp = n * i;
	        System.out.println(i+"*"+ n +" = "+temp);
	    }
	    
	    scanner.close();
	}
}
