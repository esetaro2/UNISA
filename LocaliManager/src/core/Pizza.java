package core;

import java.util.Objects;

public class Pizza {
	
	private String nome;
	private double prezzo;
	
	public Pizza(String nome, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, prezzo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizza other = (Pizza) obj;
		return Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(prezzo) == Double.doubleToLongBits(other.prezzo);
	}

	@Override
	public String toString() {
		return "Pizza [nome=" + nome + ", prezzo=" + prezzo + "]";
	}
	
}
