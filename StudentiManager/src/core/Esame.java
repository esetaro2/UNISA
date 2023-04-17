package core;

import exception.CFUNotValidException;
import exception.VoteNotValidException;

public class Esame {

	private int id, cfu, voto;
	private String nome;
	
	public Esame(int id, String nome, int cfu, int voto) {
		this.id = id;
		if(cfu < 0 || cfu > 12) throw new CFUNotValidException();
		this.cfu = cfu;
		if(voto < 0 || voto > 30) throw new VoteNotValidException();
		this.voto = voto;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCfu() {
		return cfu;
	}

	public void setCfu(int cfu) {
		if(cfu < 0 || cfu > 12) throw new CFUNotValidException();
		this.cfu = cfu;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		if(voto < 18 || voto > 30) throw new VoteNotValidException();
		this.voto = voto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Esame [id=" + id + ", nome=" + nome + ", cfu=" + cfu + ", voto=" + voto + "]";
	}
	
}
