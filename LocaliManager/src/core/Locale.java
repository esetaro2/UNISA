package core;

import java.util.Objects;

public abstract class Locale {

	private String nome, indirizzo;
	private int posti;
	
	public Locale(String nome, String indirizzo, int posti) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.posti = posti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getPosti() {
		return posti;
	}

	public void setPosti(int posti) {
		this.posti = posti;
	}

	@Override
	public int hashCode() {
		return Objects.hash(indirizzo, nome, posti);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Locale other = (Locale) obj;
		return Objects.equals(indirizzo, other.indirizzo) && Objects.equals(nome, other.nome) && posti == other.posti;
	}

	@Override
	public String toString() {
		return "Locale [nome=" + nome + ", indirizzo=" + indirizzo + ", posti=" + posti + "]";
	}

	public abstract boolean prenotazione(int numeroPersone);
	
}
