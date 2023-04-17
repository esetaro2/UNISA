package core;

import java.util.HashMap;
import java.util.Map;

public class Pizzeria extends Locale {

	private Map<String, Double> menu;
	
	public Pizzeria(String nome, String indirizzo, int posti) {
		super(nome, indirizzo, posti);
		this.menu = new HashMap<>();
	}
	
	public boolean addPizza(Pizza pizza) {
		if(this.menu.putIfAbsent(pizza.getNome(), pizza.getPrezzo()) == null) return true;
		else return false;
	}
	
	public boolean removePizza(Pizza pizza) {
		if(!this.menu.containsKey(pizza.getNome())) return false;
		else {
			this.menu.remove(pizza.getNome(), pizza.getPrezzo());
			return true;
		}
	}

	public Map<String, Double> getMenu() {
		return menu;
	}

	public void setMenu(Map<String, Double> menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return super.toString() + " Pizzeria [menu=" + menu + "]";
	}
	
	public boolean prenotazione(int numeroPersone) {
		if(numeroPersone > super.getPosti()) return false;
		else {
			super.setPosti(super.getPosti() - numeroPersone);
			return true;
		}
	}
	
}
