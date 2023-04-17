package core;

public class Determinato extends Dipendente {

	private String dataFineContratto;
	
	public Determinato(int id, String nome, String cognome, double salario, String dataFineContratto) {
		super(id, nome, cognome, salario);
		this.dataFineContratto = dataFineContratto;
	}

	public String getDataFinecontratto() {
		return dataFineContratto;
	}

	public void setDataFinecontratto(String dataFineContratto) {
		this.dataFineContratto = dataFineContratto;
	}

	@Override
	public String toString() {
		return super.toString() + " Determinato [dataFineContratto=" + dataFineContratto + "]";
	}

	@Override
	public double calcolaStipendioMensile() {
		return this.getSalario();
	}
	
}
