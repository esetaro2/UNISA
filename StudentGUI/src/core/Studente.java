package core;
import java.util.List;
import java.util.Objects;

public class Studente {

	public static final int inCorso = 0, fuoriCorso = 1;
	
	private String nome, cognome, matricola;
	private int eta, tipo;
	
	public Studente(String nome, String cognome, String matricola, int eta, int tipo) {
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
		this.eta = eta;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + ", eta=" + eta
				+ ", tipo=" + tipo + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cognome, eta, matricola, nome, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studente other = (Studente) obj;
		return Objects.equals(cognome, other.cognome) && eta == other.eta && Objects.equals(matricola, other.matricola)
				&& Objects.equals(nome, other.nome) && tipo == other.tipo;
	}

	public static int compareByEta(Studente s1, Studente s2) {
		if(s1.getEta() >= s2.getEta()) return 1;
		else return -1;
	}
	
	public static List<Studente> getOver30(List<Studente> studenti) {
		studenti.stream().filter(s -> s.getEta() > 30).forEach(studenti::add);
		
		return studenti;
	}
}
