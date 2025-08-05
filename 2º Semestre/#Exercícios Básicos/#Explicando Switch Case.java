public class Main
{
	public static void main(String[] args) throws java.io.IOException {
	    System.out.println("Conconda ou não? (s/n)")
	    /* throws java.io.IOException indica que o método pode gerar uma exceção
	    do tipo IOException, essa exceção é verificada e ocorre em operações
	    de entrada e saída. */
		char c = (char) System.in.read();
		switch(c) {
		    // switch (condicional) compara o valor de uma variável com um valor exato.
		    case 's':
		        System.out.println("Concorda");
		        break;
		    case 'n':
		        System.out.println("Não concorda");
		        break;
		    default: System.out.println("Resposta inválida");
		    // default é padrão de switch; funciona como o else para if.
		        break;
		}
	}
}