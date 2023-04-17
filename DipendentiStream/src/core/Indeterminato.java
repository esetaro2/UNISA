package core;

public class Indeterminato extends Dipendente {

	private static final int bonus = 30;
	private String qualificaSettoriale;
	
	public Indeterminato(String nome, String cognome, double salario, String qualificaSettoriale) {
		super(nome, cognome, salario);
		this.qualificaSettoriale = qualificaSettoriale;
	}

	public static int getBonus() {
		return bonus;
	}

	public String getQualificaSettoriale() {
		return qualificaSettoriale;
	}

	public void setQualificaSettoriale(String qualificaSettoriale) {
		this.qualificaSettoriale = qualificaSettoriale;
	}

	@Override
	public String toString() {
		return super.toString() + " Indeterminato [qualificaSettoriale=" + qualificaSettoriale + "]";
	}

	@Override
	public double getStipendioMensile() {
		return this.getSalario() + ((this.getSalario() * bonus) / 100);
	}

	
}
