public class Aluno {

	private int ra;
	private String nome;
	private double notaVestibular;
	
	public int getRa() {
		return ra;
	}
	public String getNome() {
		return nome;
	}
	public double getNotaVestibular() {
		return notaVestibular;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNotaVestibular(double notaVestibular) {
		this.notaVestibular = notaVestibular;
	}
	public Aluno(int ra, String nome, double notaVestibular) {
		this.ra = ra;
		this.nome = nome;
		this.notaVestibular = notaVestibular;
	}
	
}