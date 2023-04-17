package core;

import java.util.ArrayList;
import java.util.List;

import exception.AgeNotValidException;

public class Studente {

	private String nome, cognome, matricola;
	private int anni;
	private List<Esame> esamiSuperati;
	
	public Studente(String nome, String cognome, String matricola, int anni) {
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
		if(anni < 18) throw new AgeNotValidException();
		this.anni = anni;
		this.esamiSuperati = new ArrayList<>();
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

	public int getAnni() {
		return anni;
	}

	public void setAnni(int anni) {
		if(anni < 18) throw new AgeNotValidException();
		this.anni = anni;
	}

	public List<Esame> getEsamiSuperati() {
		return esamiSuperati;
	}

	public void setEsamiSuperati(List<Esame> esamiSuperati) {
		this.esamiSuperati = esamiSuperati;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + ", anni=" + anni + "]";
	}
	
}
