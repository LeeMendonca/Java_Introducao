public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Scanner: classe que lê entrada.
		// scanner: variável que armazena o objeto do tipo Scanner; usamos esse nome por convenção, pode-se usar outro.
        // new Scanner: cria o objeto da classe Scanner.
        // System.in: diz ao Scanner que ele deve ler dados de entrada.
		
		System.out.print("Digite o primeiro número: ");
		int num1 = scanner.nextInt();
		// next: método para ler a entrada do usuário, mas sozinho lê apenas uma palavra.
		// nextLine: lê uma linha inteira.
		// nextInt: lê um número inteiro.
		// nextDouble: lê um número decimal.
		
		System.out.print("Digite o segundo número: ");
		int num2 = scanner.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("A soma dos números é: " + soma);
		
		scanner.close();
	}
}
