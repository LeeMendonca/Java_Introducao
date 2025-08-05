/* 8. Crie um programa que leia o nome e a idade de várias pessoas e 
exiba a média das idades. */

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Pressione Enter para sair.");
		
		int i=0;
		double soma=0; // É preciso declarar a soma como double para que a media não responda como int (arredondando o resultado).
		
		while (true) {
		    
		    System.out.print("Nome: ");
		    String nome = scanner.nextLine();
		    if (nome.isEmpty()) { // Verifica se o nome não foi digitado
		        break;
		    }
		    
		    System.out.print("Idade: ");
		    int idade = scanner.nextInt();
		    scanner.nextLine(); // Resolvendo um problema de buffer.
		    /* O nextInt não consome a quabre de linha, então a próxima leitura de nextLine pode capturar um valor vazio,
		    para corrigir adicionamos novo scanner.*/
		    
		    System.out.println();
		    
		    soma += idade;
		    i++;
		    
		}
		
		if (i>0) {
		    double media = soma/i;
		    System.out.printf("A média é: %.2f", media); //printf é saída formatada
		} else {
		    System.out.print("Digite ao menos um nome e uma idade!");
		}
		
		scanner.close();
	}
}
