public class Main {

	public static void main(String args[]) {

		Aluno aluno1 = new Aluno(789456, "Roberval Nicácio", 89.75);
		System.out.println("RA: " + aluno1.getRa() + "\nNome: " + aluno1.getNome() + "\nNota do Vestibular: "
				+ aluno1.getNotaVestibular());

	}

}