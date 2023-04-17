package core;

import java.util.HashMap;	
import java.util.Map;

import interfaces.LocaleOptions;

public class LocaliManager implements LocaleOptions {
	
	private Map<Integer, Locale> locali;
	
	public LocaliManager() {
		this.locali = new HashMap<>();
	}

	@Override
	public boolean prenotazione(int numeroPersone, Locale locale) {
		if(locale.prenotazione(numeroPersone)) return true;
		else return false;
	}

	@Override
	public void printInfoLocali() {
		locali.forEach((k, v) -> System.out.println("ID: " + k + "Locale:\n" + v));
	}

	@Override
	public boolean addLocale(Locale locale) {
		if(this.locali.putIfAbsent(locale.hashCode(), locale) == null) return true;
		else return false;
	}
	
	@Override
	public boolean removeLocale(Locale locale) {
		if(!this.locali.containsKey(locale.hashCode())) return false;
		else {
			this.locali.remove(locale.hashCode(), locale);
			return true;
		}
	}

	public Map<Integer, Locale> getLocali() {
		return locali;
	}

	public void setLocali(Map<Integer, Locale> locali) {
		this.locali = locali;
	}
	
	public static LocaliManager createManager() {
		LocaliManager manager = new LocaliManager();
		
		Pizzeria p1 = new Pizzeria("Da Giacomino Il Bucchino", "Via Giorgio Armani 153", 20);
		Pizzeria p2 = new Pizzeria("Calimero", "Via Oppiacea 25", 15);
		Pizzeria p3 = new Pizzeria("Zeus", "Via Dell'Olimpo 69", 50);
		
		Pizza pizza1 = new Pizza("Diavola", 8);
		Pizza pizza2 = new Pizza("Capricciosa", 6);
		Pizza pizza3 = new Pizza("Mimosa", 5.50);
		Pizza pizza4 = new Pizza("Margherita", 4);
		
		if(p1.addPizza(pizza1)) System.out.println(pizza1 + " aggiunta con successo al menù del locale:\n" + p1);
		else System.out.println("Impossibile aggiungere la " + pizza1 + " al menu del locale:\n" + p1);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(p1.addPizza(pizza3)) System.out.println(pizza3 + " aggiunta con successo al menù del locale:\n" + p1);
		else System.out.println("Impossibile aggiungere la " + pizza3 + " al menu del locale:\n" + p1);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(p1.addPizza(pizza4)) System.out.println(pizza4 + " aggiunta con successo al menù del locale \n" + p1);
		else System.out.println("Impossibile aggiungere la " + pizza4 + " al menu del locale:\n" + p1);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(p2.addPizza(pizza3)) System.out.println(pizza3 + " aggiunta con successo al menù del locale:\n" + p2);
		else System.out.println("Impossibile aggiungere la " + pizza3 + " al menu del locale:\n" + p2);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(p2.addPizza(pizza1)) System.out.println(pizza1 + " aggiunta con successo al menù del locale:\n" + p2);
		else System.out.println("Impossibile aggiungere la " + pizza1 + " al menu del locale:\n" + p2);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(p2.addPizza(pizza4)) System.out.println(pizza4 + " aggiunta con successo al menù del locale:\n" + p2);
		else System.out.println("Impossibile aggiungere la " + pizza4 + " al menu del locale:\n" + p2);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(p3.addPizza(pizza1)) System.out.println(pizza1 + " aggiunta con successo al menù del locale:\n" + p3);
		else System.out.println("Impossibile aggiungere la " + pizza1 + " al menu del locale:\n" + p3);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(p3.addPizza(pizza2)) System.out.println(pizza2 + " aggiunta con successo al menù del locale:\n" + p3);
		else System.out.println("Impossibile aggiungere la " + pizza2 + " al menu del locale:\n" + p3);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(p3.addPizza(pizza4)) System.out.println(pizza4 + " aggiunta con successo al menù del locale:\n" + p3);
		else System.out.println("Impossibile aggiungere la " + pizza4 + " al menu del locale:\n" + p3);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(p3.addPizza(pizza4)) System.out.println(pizza4 + " aggiunta con successo al menù del locale:\n" + p3);
		else System.out.println("Impossibile aggiungere la " + pizza4 + " al menu del locale:\n" + p3);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.addLocale(p1)) System.out.println(p1 + " aggiunto con successo");
		else System.out.println("Impossibile aggiungere il " + p1);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.addLocale(p2)) System.out.println(p2 + " aggiunto con successo");
		else System.out.println("Impossibile aggiungere il " + p2);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.addLocale(p3)) System.out.println(p3 + " aggiunto con successo");
		else System.out.println("Impossibile aggiungere il " + p3);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.removeLocale(p1)) System.out.println(p1 + " rimosso con successo");
		else System.out.println("Impossibile aggiungere il " + p1);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.addLocale(p1)) System.out.println(p1 + " aggiunto con successo");
		else System.out.println("Impossibile aggiungere il " + p1);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		Paninoteca pa1 = new Paninoteca("O'Paninozzo", "Via Giovanni XXIII 23", 12, 24, 24);
		Paninoteca pa2 = new Paninoteca("Paniniamoci", "Via Dei Panini 69", 69, 125, 70);
		Paninoteca pa3 = new Paninoteca("Il Re Dei Panini", "Via Dei Re 100", 100, 129, 200);
		
		if(manager.addLocale(pa1)) System.out.println(pa1 + " aggiunto con successo");
		else System.out.println("Impossibile aggiungere il " + pa1);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.addLocale(pa2)) System.out.println(pa2 + " aggiunto con successo");
		else System.out.println("Impossibile aggiungere il " + pa2);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.addLocale(pa3)) System.out.println(pa3 + " aggiunto con successo");
		else System.out.println("Impossibile aggiungere il " + pa3);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.prenotazione(5, p1)) System.out.println("Prenotazione effettuata per il locale:\n" + p1);
		else System.out.println("Impossibile effettuare la prenotazione per il locale:\n" + p1);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.prenotazione(5, p1)) System.out.println("Prenotazione effettuata per il locale:\n" + p1);
		else System.out.println("Impossibile effettuare la prenotazione per il locale:\n" + p1);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.prenotazione(12, pa1)) System.out.println("Prenotazione effettuata per il locale:\n" + pa1);
		else System.out.println("Impossibile effettuare la prenotazione per il locale:\n" + pa1);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.prenotazione(10, pa3)) System.out.println("Prenotazione effettuata per il locale:\n" + pa3);
		else System.out.println("Impossibile effettuare la prenotazione per il locale:\n" + pa3);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		if(manager.prenotazione(92, pa2)) System.out.println("Prenotazione effettuata per il locale:\n" + pa2);
		else System.out.println("Impossibile effettuare la prenotazione per il locale:\n" + pa2);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		return manager;
	}
	
	public void printPizzeriaByPizza(String pizza) {
		this.locali.forEach((k, v) -> {
			if(this.locali.get(k) instanceof Pizzeria) {
				if(((Pizzeria)v).getMenu().containsKey(pizza)) {
					System.out.println(this.locali.get(k));
					System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
				}
			}
		});
	}
	
}
