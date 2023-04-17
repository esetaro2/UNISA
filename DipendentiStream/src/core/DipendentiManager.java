package core;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import interfaces.FileManager;

public class DipendentiManager implements FileManager {

	private List<Dipendente> dipendenti = new ArrayList<>();

	public List<Dipendente> getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(List<Dipendente> dipendenti) {
		this.dipendenti = dipendenti;
	}
	
	public List<Dipendente> getStagisti() {
		List<Dipendente> stagisti = new ArrayList<>();
		
		dipendenti.stream().filter(d -> d instanceof Stagista).forEach(stagisti::add);
		
		return stagisti;
	}
	
	public void printStipendiMensiliGreaterThanSomething(double soglia) {
		dipendenti.stream().filter(d -> d.getStipendioMensile() > soglia).forEach(System.out::println);
	}

	@Override
	public void readLavoratori(String fileName) {
		try {
			
			Stream<String> lines = Files.lines(Paths.get(fileName));
			
			lines.forEach(System.out::println);
			
			lines.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void saveLavoratori(String fileName) {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
			
			dipendenti.forEach(out::println);
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
