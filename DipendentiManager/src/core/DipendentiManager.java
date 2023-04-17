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
import java.util.StringTokenizer;

import interfaces.FileManager;

public class DipendentiManager implements FileManager {

	private List<Dipendente> dipendenti;
	
	public DipendentiManager() {
		this.dipendenti = new ArrayList<>();
	}

	public List<Dipendente> getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(List<Dipendente> dipendenti) {
		this.dipendenti = dipendenti;
	}
	
	public boolean addDipendente(Dipendente dipendente) {
		if(this.dipendenti.contains(dipendente)) return false;
		else {
			if(this.dipendenti.stream().filter(d -> d.getId() == dipendente.getId()).findFirst().orElse(null) != null) return false;
			this.dipendenti.add(dipendente);
			return true;
		}
	}
	
	public boolean removeDipendente(Dipendente dipendente) {
		if(!this.dipendenti.contains(dipendente)) return false;
		else {
			this.dipendenti.remove(dipendente);
			return true;
		}
	}
	
	public List<Dipendente> getStagisti() {
		return this.dipendenti.stream().filter(d -> d instanceof Stagista).toList();
	}

	@Override
	public void saveLavoratori(String fileName) {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
			
			this.dipendenti.forEach(d -> out.println(d));
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void readLavoratori(String fileName) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;
			
			while((line = br.readLine()) != null) {
				if(line.contains("Indeterminato")) {
					line = line.replace("Dipendente [", "");
					line = line.replace("id=", "");
					line = line.replace("nome=", "");
					line = line.replace("surname=", "");
					line = line.replace("salario=", "");
					line = line.replace("]", "");
					line = line.replace(" Indeterminato [", "");
					line = line.replace("qualifica=", ", ");
					line = line.replace("]", "");
					
					StringTokenizer st = new StringTokenizer(line, ",");
					
					int id = Integer.parseInt(st.nextToken());
					String nome = st.nextToken();
					String cognome = st.nextToken();
					Double salario = Double.parseDouble(st.nextToken());
					String qualifica = st.nextToken();
					
					Indeterminato indeterminato = new Indeterminato(id, nome, cognome, salario, qualifica);
					addDipendente(indeterminato);
					
					System.out.println(indeterminato);
					
				} else if(line.contains("Determinato")) {
					line = line.replace("Dipendente [", "");
					line = line.replace("id=", "");
					line = line.replace("nome=", "");
					line = line.replace("surname=", "");
					line = line.replace("salario=", "");
					line = line.replace("]", "");
					line = line.replace(" Determinato [", ", ");
					line = line.replace("dataFineContratto=", "");
					
					StringTokenizer st = new StringTokenizer(line, ",");
					int id = Integer.parseInt(st.nextToken());
					String nome = st.nextToken();
					String cognome = st.nextToken();
					Double salario = Double.parseDouble(st.nextToken());
					String data = st.nextToken();
					
					Determinato determinato = new Determinato(id, nome, cognome, salario, data);
					addDipendente(determinato);
					
					System.out.println(determinato);
					
				} else if(line.contains("Stagista")) {
					line = line.replace("Dipendente [", "");
					line = line.replace("id=", "");
					line = line.replace("nome=", "");
					line = line.replace("surname=", "");
					line = line.replace("salario=", "");
					line = line.replace("]", "");
					line = line.replace(" Stagista [", ",");
					line = line.replace("idSupervisore=", "");
					
					StringTokenizer st = new StringTokenizer(line, ",");
					
					int id = Integer.parseInt(st.nextToken());
					String nome = st.nextToken();
					String cognome = st.nextToken();
					Double salario = Double.parseDouble(st.nextToken());
					int idSupervisore = Integer.parseInt(st.nextToken());
					
					Stagista stagista = new Stagista(id, nome, cognome, salario, idSupervisore);
					addDipendente(stagista);
					
					System.out.println(stagista);
				}
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void printDipendentiGreaterThanSoglia(double soglia) {
		this.dipendenti.stream().filter(d -> d.calcolaStipendioMensile() > soglia).forEach(d -> System.out.println(d + " con stipendio mensile: " + d.calcolaStipendioMensile()));
	}
	
	public void printDipendenti() {
		this.dipendenti.forEach(d -> System.out.println(d));
	}
	
}
