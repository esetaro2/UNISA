package core;

public class Stagista extends Dipendente {

	private Dipendente supervisore;
	
	public Stagista(String nome, String cognome, double salario, Dipendente supervisore) {
		super(nome, cognome, salario);
		this.supervisore = supervisore;
	}

	public Dipendente getSupervisore() {
		return supervisore;
	}

	public void setSupervisore(Dipendente supervisore) {
		this.supervisore = supervisore;
	}

	@Override
	public double getStipendioMensile() {
		return this.getSalario() - 300;
	}

	@Override
	public String toString() {
		return super.toString() + " Stagista [supervisore=" + supervisore + "]";
	}
	
	
}
