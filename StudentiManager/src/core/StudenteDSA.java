package core;

public class StudenteDSA extends Studente {

	private String patologia;
	
	public StudenteDSA(String nome, String cognome, String matricola, int anni, String patologia) {
		super(nome, cognome, matricola, anni);
		this.patologia = patologia;
	}

	public String getPatologia() {
		return patologia;
	}

	public void setPatologia(String patologia) {
		this.patologia = patologia;
	}

	@Override
	public String toString() {
		return super.toString() + " StudenteDSA [patologia=" + patologia + "]";
	}
	
}
