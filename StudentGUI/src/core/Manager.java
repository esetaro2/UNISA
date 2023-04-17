package core;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import interfaces.StudentiOperations;

public class Manager implements StudentiOperations {

	private List<Studente> listaStudenti = new ArrayList<>();
	
	public List<Studente> getListaStudenti() {
		return listaStudenti;
	}

	public void setListaStudenti(List<Studente> listaStudenti) {
		this.listaStudenti = listaStudenti;
	}

	public boolean addStudente(Studente s) {
		if(listaStudenti.contains(s)) return false;
		else {
			listaStudenti.add(s);
			return true;
		}
	}
	
	public boolean removeStudente(Studente s) {
		if(listaStudenti.contains(s)) return false;
		else {
			listaStudenti.remove(s);
			return true;
		}
	}
	
	public void saveToFile(String fileName) {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
			
			listaStudenti.forEach(out::println);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
