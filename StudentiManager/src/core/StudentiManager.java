package core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import exception.MatricolaNotAvaible;
import interfaces.EsamiManager;
import interfaces.FileManager;

public class StudentiManager implements EsamiManager, FileManager {

	private List<Studente> studenti;
	
	public StudentiManager() {
		this.studenti = new ArrayList<>();
	}

	public List<Studente> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<Studente> studenti) {
		this.studenti = studenti;
	}
	
	public boolean addStudente(Studente studente) throws MatricolaNotAvaible {
		if(studenti.contains(studente)) return false;
		else {
			//for(Studente s : this.studenti) if(s.getMatricola() == studente.getMatricola()) return false;
			if(this.studenti.stream().filter(s -> s.getMatricola() == studente.getMatricola()).findFirst().orElse(null) != null) throw new MatricolaNotAvaible();
			else {
				this.studenti.add(studente);
				this.studenti.remove(studente);
				this.studenti.add(studente);
				return true;
			}
		}
	}
	
	public boolean removeStudente(Studente s) {
		if(!studenti.contains(s)) return false;
		else {
			this.studenti.remove(s);
			return true;
		}
	}
	
	public List<Studente> getStudentiByEsame(Esame e) {
		return this.studenti.stream().filter(s -> s.getEsamiSuperati().contains(e)).toList();
	}
	
	public void printInfoDSA() {
		this.studenti.stream().filter(s -> s instanceof StudenteDSA).forEach(s -> System.out.println(s));
	}
	
	public List<Studente> getStudentiByDSA(String key) {
		return this.studenti.stream().filter(s -> s instanceof StudenteDSA).filter(s -> ((StudenteDSA)s).getPatologia().contains(key)).toList();
	}

	@Override
	public boolean addEsameSuperato(Esame e, Studente s) {
		if(!this.studenti.contains(s)) return false;
		else {
			if(s.getEsamiSuperati().contains(e)) return false;
			else if(e.getVoto() < 18) return false;
			else {
				s.getEsamiSuperati().add(e);
				return true;
			}
		}
	}
	
	public void printStudenti() {
		this.studenti.forEach(s -> System.out.println(s));
	}

	@Override
	public void saveStudenti(String fileName) {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
			
			this.studenti.stream().filter(s -> !(s instanceof StudenteDSA)).forEach(s -> out.println(s));
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void saveStudentiDSA(String fileName) {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
			
			this.studenti.stream().filter(s -> s instanceof StudenteDSA).forEach(s -> out.println(s));
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void readStudenti(String fileName) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));		
			String line;
	
			while((line = br.readLine()) != null) System.out.println(line);
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
