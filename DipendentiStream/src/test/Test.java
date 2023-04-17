package test;

import java.util.ArrayList;

import core.Determinato;
import core.Dipendente;
import core.DipendentiManager;
import core.Indeterminato;
import core.Stagista;

public class Test {

	public static void main(String[] args) {

		Indeterminato d1 = new Indeterminato("Giovanni", "Zaccuri", 3000, "Informatico");
		Indeterminato d2 = new Indeterminato("Giorgio", "Vanni", 2500, "Cantante");
		Stagista d3 = new Stagista("Luca", "Messi", 900, d1);
		Stagista d4 = new Stagista("Elena", "Elefante", 800, d2);;
		Determinato d5 = new Determinato("Loredana", "Bertè", 1500, "28/08/2023");
		Determinato d6 = new Determinato("Carlo", "Infante", 2000, "25/12/3000");
		
		ArrayList<Dipendente> dipendenti = new ArrayList<>();
		
		dipendenti.add(d1);
		dipendenti.add(d2);
		dipendenti.add(d3);
		dipendenti.add(d4);
		dipendenti.add(d5);
		dipendenti.add(d6);
		
		DipendentiManager manager = new DipendentiManager();
		manager.setDipendenti(dipendenti);
		
		System.out.println("STAMPO I DIPENDENTI STAGISTI");
		System.out.println(manager.getStagisti());
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("STAMPO GLI STIPENDI MENSILI DEI DIPENDENTI");
		System.out.println("Stipendio mensile dipendente " + d1.getNome() + " " + d1.getCognome() + ": " + d1.getStipendioMensile());
		System.out.println("Stipendio mensile dipendente " + d2.getNome() + " " + d2.getCognome() + ": " + d2.getStipendioMensile());
		System.out.println("Stipendio mensile dipendente " + d3.getNome() + " " + d3.getCognome() + ": " + d3.getStipendioMensile());
		System.out.println("Stipendio mensile dipendente " + d4.getNome() + " " + d4.getCognome() + ": " + d4.getStipendioMensile());
		System.out.println("Stipendio mensile dipendente " + d5.getNome() + " " + d5.getCognome() + ": " + d5.getStipendioMensile());
		System.out.println("Stipendio mensile dipendente " + d6.getNome() + " " + d6.getCognome() + ": " + d6.getStipendioMensile());
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		
		double soglia = 2000;
		System.out.println("Stampo i dipendenti con stipendio mensile maggiore di " + soglia);
		manager.printStipendiMensiliGreaterThanSomething(soglia);
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		
		String fileName = "Dipendenti.txt";
		System.out.println("SALVO I DIPENDENTI SU FILE: " + fileName);
		manager.saveLavoratori(fileName);
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("LEGGO I DIPENDENTI APPENA SALVATI SUL FILE: " + fileName);
		manager.readLavoratori(fileName);
	}

}
