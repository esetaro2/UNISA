package core;

public class Paninoteca extends Locale {

	private int numeroPanini, numeroBirre;
	
	public Paninoteca(String nome, String indirizzo, int posti, int numeroPanini, int numeroBirre) {
		super(nome, indirizzo, posti);
		this.numeroPanini = numeroPanini; 
		this.numeroBirre = numeroBirre;
	}

	public int getNumeroPanini() {
		return numeroPanini;
	}

	public void setNumeroPanini(int numeroPanini) {
		this.numeroPanini = numeroPanini;
	}

	public int getNumeroBirre() {
		return numeroBirre;
	}

	public void setNumeroBirre(int numeroBirre) {
		this.numeroBirre = numeroBirre;
	}

	@Override
	public String toString() {
		return super.toString() + " Paninoteca [numeroPanini=" + numeroPanini + ", numeroBirre=" + numeroBirre + "]";
	}
	
	public boolean prenotazione(int numeroPersone) {
		if(numeroPersone > super.getPosti() || numeroPersone > this.numeroPanini) return false;
		else {
			super.setPosti(super.getPosti() - numeroPersone);
			this.numeroPanini -= numeroPersone;
			return true;
		}
	}
	
}
