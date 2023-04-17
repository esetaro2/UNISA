package core;

public class Dipendente {
	
	private static int idI = 0;
	
	private String nome, cognome;
	private int id;
	private double salario;
	
	public Dipendente(String nome, String cognome, double salario) {
		this.id = idI++;
		this.nome = nome;
		this.cognome = cognome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", cognome=" + cognome + ", id=" + id + ", salario=" + salario + "]";
	}

	public double getStipendioMensile() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
