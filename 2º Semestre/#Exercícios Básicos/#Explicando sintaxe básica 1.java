public class Main { //Main é o nome do arquivo em que será armazenada
	public static void main(String[] args) {
	    // public torna o método acessível de qualquer parte do programa
	    // static simplifica a programa para não instanciar objetos
	    // void não retorna valor
		
		int idade = 20;
		String sexo = "M"; //fortemente tipada
		
		if (idade < 18){
		    System.out.println("Menor de 18.");
		} else if(sexo == "F") {
		    System.out.println("Sexo feminino.");
		} else {
		    System.out.println("Maior de 18 e masculino.");
		}
	}
}
