		package test;

import core.Determinato;
import core.DipendentiManager;
import core.Indeterminato;
import core.Stagista;

public class Test {

	public static void main(String[] args) {

		DipendentiManager manager = new DipendentiManager();
		
		Determinato d1 = new Determinato(01, "Giselmo", "Orsini", 1200, "22/02/2022");
		Determinato d2 = new Determinato(02, "Giacomo", "Cannavacciuolo", 2000, "12/11/2024");
		Indeterminato i1 = new Indeterminato(03, "Mattia", "Pescara", 1500, "Attaccatore di francobolli");
		Indeterminato i2 = new Indeterminato(04, "Elena", "Amato", 1300, "Informatica professionista");
		Stagista s1 = new Stagista(05, "Ermenegildo", "Pescijman", 700, i1.getId());
		Stagista s2 = new Stagista(06, "Minchia", "Enorme", 800, i2.getId());
		
		if(manager.addDipendente(d1)) System.out.println(d1 + " aggiunto con successo");
		else System.out.println("Impossibile aggiungere il dipendente " + d1);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.addDipendente(d2)) System.out.println(d2 + " aggiunto con successo");
		else System.out.println("Impossibile aggiungere il dipendente " + d2);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.addDipendente(i1)) System.out.println(i1 + " aggiunto con successo");
		else System.out.println("Impossibile aggiungere il dipendente " + i1);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.addDipendente(i2)) System.out.println(i2 + " aggiunto con successo");
		else System.out.println("Impossibile aggiungere il dipendente " + i2);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.addDipendente(s1)) System.out.println(s1 + " aggiunto con successo");
		else System.out.println("Impossibile aggiungere il dipendente " + s1);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.addDipendente(s2)) System.out.println(s2 + " aggiunto con successo");
		else System.out.println("Impossibile aggiungere il dipendente " + s2);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Stampo tutti i dipendenti stagisti\n");
		System.out.println(manager.getStagisti());
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Salvo i dipendenti su file Dipendenti.txt");
		manager.saveLavoratori("Dipendenti.txt");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Leggo i dipendenti dal file Dipendenti.txt\n");
		manager.readLavoratori("Dipendenti.txt");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Stampo i dipendenti con stipendio mensile maggiore di 1200 euro\n");
		manager.printDipendentiGreaterThanSoglia(1200);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
	}

}
