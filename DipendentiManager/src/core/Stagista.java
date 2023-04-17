package core;

public class Stagista extends Dipendente {

	private int idSupervisore;
	
	public Stagista(int id, String nome, String cognome, double salario, int idSupervisore) {
		super(id, nome, cognome, salario);
		this.idSupervisore = idSupervisore;
	}

	public int getSupervisore() {
		return idSupervisore;
	}

	public void setSupervisore(int idSupervisore) {
		this.idSupervisore = idSupervisore;
	}

	@Override
	public String toString() {
		return super.toString() + " Stagista [idSupervisore=" + idSupervisore + "]";
	}

	@Override
	public double calcolaStipendioMensile() {
		return this.getSalario() - 300;
	}
	
}
