/* 6. Escreva um programa que calcule e exiba a média de três
notas informadas pelo usuário */

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	int n1, n2, n3, media;
	
	System.out.print("Digite a 1ª nota: ");
	n1 = scanner.nextInt();
	
	System.out.print("Digite a 2ª nota: ");
	n2 = scanner.nextInt();
	
	System.out.print("Digite a 3ª nota: ");
	n3 = scanner.nextInt();
	
	media = (n1+n2+n3)/3;
	System.out.print("A média das notas é "+media+"!");
	
	scanner.close();
		
	}
}
