package core;

public class Determinato extends Dipendente {

	private String dataFineContratto;

	public Determinato(String nome, String cognome, double salario, String dataFineContratto) {
		super(nome, cognome, salario);
		this.dataFineContratto = dataFineContratto;
	}

	public String getDataFineContratto() {
		return dataFineContratto;
	}

	public void setDataFineContratto(String dataFineContratto) {
		this.dataFineContratto = dataFineContratto;
	}

	@Override
	public String toString() {
		return super.toString() + " Determinato [dataFineContratto=" + dataFineContratto + "]";
	}

	@Override
	public double getStipendioMensile() {
		return this.getSalario();
	}
	
	
}
