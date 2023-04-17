package core;

public abstract class Dipendente {
	
	private int id;
	private String nome, surname;
	private double salario;
	
	public Dipendente(int id, String nome, String cognome, double salario) {
		this.id = id;
		this.nome = nome;
		this.surname = cognome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return surname;
	}

	public void setCognome(String cognome) {
		this.surname = cognome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dipendente other = (Dipendente) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Dipendente [id=" + id + ", nome=" + nome + ", surname=" + surname + ", salario=" + salario + "]";
	}
	
	public abstract double calcolaStipendioMensile();
	
}
