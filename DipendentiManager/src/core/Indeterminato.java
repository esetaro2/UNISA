package core;

public class Indeterminato extends Dipendente {

	private String qualifica;
	private static final int bonus = 30;
	
	public Indeterminato(int id, String nome, String cognome, double salario, String qualifica) {
		super(id, nome, cognome, salario);
		this.qualifica = qualifica;
	}

	public static int getBonus() {
		return bonus;
	}

	public String getQualifica() {
		return qualifica;
	}

	public void setQualifica(String qualifica) {
		this.qualifica = qualifica;
	}

	@Override
	public String toString() {
		return super.toString() + " Indeterminato [qualifica=" + qualifica + "]";
	}

	@Override
	public double calcolaStipendioMensile() {
		return this.getSalario() + ((this.getSalario() * 30)/100);
	}
	
}
