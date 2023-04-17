package test;

import core.Esame;
import core.Studente;
import core.StudenteDSA;
import core.StudentiManager;
import exception.AgeNotValidException;
import exception.MatricolaNotAvaible;

public class Test {

	public static void main(String[] args) {

		StudentiManager manager = new StudentiManager();
		
		Studente s1 = null;
		Studente s2 = null;
		Studente s3 = null;
		Studente s4 = null;
		
		try {
			s1 = new Studente("Giovanni", "Muchacha", "123545", 20);
			System.out.println(s1 + "creato con successo");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
			
			if(manager.addStudente(s1)) System.out.println(s1 + " aggiunto con successo");
			else System.out.println("Impossibile aggiungere lo studente " + s1);
			
		} catch(AgeNotValidException e) {
			System.out.println(e.getMessage());
			
		} catch (MatricolaNotAvaible e) {
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		}
		
		try {
			s2 = new Studente("Mario", "Rossi", "0231321313", 18);
			System.out.println(s2 + " creato con successo");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
			
			if(manager.addStudente(s2)) System.out.println(s2 + " aggiunto con successo");
			else System.out.println("Impossibile aggiungere lo studente " + s2);
			
		} catch(AgeNotValidException e) {
			System.out.println(e.getMessage());
			
		} catch (MatricolaNotAvaible e) {
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		}
		
		try {
			s3 = new Studente("Giacomo", "Leopardi", "0231321313", 20);
			System.out.println(s3 + " creato con successo");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
			
			if(manager.addStudente(s3)) System.out.println(s3 + " aggiunto con successo");
			else System.out.println("Impossibile aggiungere lo studente " + s3);
			
		} catch(AgeNotValidException e) {
			System.out.println(e.getMessage());
			
		} catch (MatricolaNotAvaible e) {
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		}
		
		try {
			s4 = new Studente("Dario", "Moccia", "023164851231", 25);
			System.out.println(s4 + " creato con successo");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
			
			if(manager.addStudente(s4)) System.out.println(s4 + " aggiunto con successo");
			else System.out.println("Impossibile aggiungere lo studente " + s4);
			
		} catch(AgeNotValidException e) {
			System.out.println(e.getMessage());
			
		} catch (MatricolaNotAvaible e) {
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		}
		
		StudenteDSA s5 = null;
		StudenteDSA s6 = null;
		StudenteDSA s7 = null;
		
		try {
			s5 = new StudenteDSA("Giorgio", "Coglione", "0231321321", 19, "Dislessia");
			System.out.println(s5 + " creato con successo");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
			
			if(manager.addStudente(s5)) System.out.println(s5 + " aggiunto con successo");
			else System.out.println("Impossibile aggiungere lo studente " + s5);
			
		} catch(AgeNotValidException e) {
			System.out.println(e.getMessage());
			
		} catch (MatricolaNotAvaible e) {
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		}
		
		try {
			s6 = new StudenteDSA("Giovanni", "Zaccuri", "2313241564", 22, "Segaiolaggine acuta");
			System.out.println(s6 + " creato con successo");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
			
			if(manager.addStudente(s6)) System.out.println(s6 + " aggiunto con successo");
			else System.out.println("Impossibile aggiungere lo studente " + s6);
			
		} catch(AgeNotValidException e) {
			System.out.println(e.getMessage());
			
		} catch (MatricolaNotAvaible e) {
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		}
		
		try {
			s7 = new StudenteDSA("Marco", "Segaro", "012369", 24, "Segaiolaggine suprema");
			System.out.println(s7 + " creato con successo");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
			
			if(manager.addStudente(s7)) System.out.println(s7 + " aggiunto con successo");
			else System.out.println("Impossibile aggiungere lo studente " + s7);
			
		} catch(AgeNotValidException e) {
			System.out.println(e.getMessage());
			
		} catch (MatricolaNotAvaible e) {
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		}
		
		System.out.println("Stampo le informazioni di tutti gli studenti\n");
		manager.printStudenti();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		
		//DOVREI USARE I TRY CATCH COME PER GLI STUDENTI E GLI STUDENTIDSA
		Esame e1 = new Esame(05121, "Programmazione Ad Oggetti", 9, 19);
		Esame e2 = new Esame(0215, "Programmazione E Strutture Dati", 9, 26);
		Esame e3 = new Esame(0515, "Architettura Degli Elaboratori", 9, 27);
		Esame e4 = new Esame(02154, "Reti Di Calcolatori", 6, 18);
		
		if(manager.addEsameSuperato(e1, s1)) System.out.println(e1 + " aggiunto con successo allo " + s1);
		else System.out.println("Impossibile aggiungere l'" + e1 + " allo " + s1);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.addEsameSuperato(e2, s1)) System.out.println(e2 + " aggiunto con successo allo " + s1);
		else System.out.println("Impossibile aggiungere l'" + e2 + " allo " + s1);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.addEsameSuperato(e1, s2)) System.out.println(e3 + " aggiunto con successo allo " + s3);
		else System.out.println("Impossibile aggiungere l'" + e3 + " allo " + s3);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.addEsameSuperato(e4, s5)) System.out.println(e4 + " aggiunto con successo allo " + s5);
		else System.out.println("Impossibile aggiungere l'" + e4 + " allo " + s5);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Stampo gli studenti che hanno superato l'" + e1);
		System.out.println(manager.getStudentiByEsame(e1));
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Stampo gli studenti DSA con patologia SEGAIOLAGGINE");
		System.out.println(manager.getStudentiByDSA("Segaiolaggine"));
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Salvo gli studenti non DSA su file");
		manager.saveStudenti("StudentiNonDSA.txt");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Salvo gli studenti DSA su file");
		manager.saveStudentiDSA("StudentiDSA.txt");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Leggo gli studenti non DSA da file StudentiNonDSA.txt\n");
		manager.readStudenti("StudentiNonDSA.txt");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
	}

}
