package core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import exception.NumberNotAvailableException;
import exception.SquadraRegisteredException;

public class CalcioManager 
{
	private List<Squadra> campionato;
	private String nomeCampionato;
	
	public CalcioManager(String nomeCampionato) 
	{
		this.campionato = new ArrayList<Squadra>();
		this.nomeCampionato = nomeCampionato;
	}

	public List<Squadra> getCampionato() {
		return campionato;
	}

	public void setCampionato(List<Squadra> campionato) {
		this.campionato = campionato;
	}

	public String getNomeCampionato() {
		return nomeCampionato;
	}

	public void setNomeCampionato(String nomeCampionato) {
		this.nomeCampionato = nomeCampionato;
	}
	
	
	public void printAllPlayerByCondition(Predicate<Calciatore> pred,Consumer<Calciatore> cons)
	{
		this.campionato.stream().forEach(s -> s.printPlayerByNum(pred, cons));
	}
	
	public boolean addPlayer(Calciatore c, Squadra s) {
		if(s.getRosa().contains(c)) return false;
		else {
			for(Calciatore calciatore : s.getRosa()) if(c.getNumMaglia() == calciatore.getNumMaglia()) throw new NumberNotAvailableException();
			s.getRosa().add(c);
			return true;
		}
	}
	
	public boolean squadraSubscription(Squadra s) throws SquadraRegisteredException {
		if(this.campionato.contains(s)) throw new SquadraRegisteredException();
		else {
			this.campionato.add(s);
			return true;
		}
	}
	
	public Squadra searchBySquadra(String nomeSquadra) {
		return this.campionato.stream().filter(s -> s.getNomeSquadra().equals(nomeSquadra)).findFirst().orElse(null);
	}
	
	public void printSquadraByScudetti() {
		this.campionato.stream().sorted(Comparator.comparing(Squadra::getNumScudetti).reversed()).forEach(s -> System.out.println(s));
	}
}
