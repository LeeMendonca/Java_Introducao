public class Main { //Online GDB não permite outro nome
	public static void main(String[] args) {
	    
		//Paulo
		Aluno x1 = new Aluno();
		
		x1.nome = "Paulo";
		x1.codmat = 55123;
		x1.cpf = "800912345-12";
		x1.sexo = 'M';
		x1.nota_P1 = 7.0;
		x1.nota_P2 = 6.0;
		x1.nota_P3 = 8.0;
		
		x1.ImprimeAluno();
		x1.ImprimeSexo();
		System.out.println("Média final: " + x1.MediaAluno());
		System.out.println("Resultado: " + x1.Resultado());
		
		System.out.println("");
		
		//Ana
		Aluno x2 = new Aluno();
		
		x2.nome = "Ana";
		x2.codmat = 991239;
		x2.cpf = "500876123-15";
		x2.sexo = 'F';
		x2.nota_P1 = 2.0;
		x2.nota_P2 = 6.0;
		x2.nota_P3 = 9.0;
		
		x2.ImprimeAluno();
		x2.ImprimeSexo();
		System.out.println("Média final: " + x2.MediaAluno());
		System.out.println("Resultado: " + x2.Resultado());
		
	}
}
