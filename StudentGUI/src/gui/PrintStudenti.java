package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import core.Manager;
import core.Studente;

public class PrintStudenti implements ActionListener {

	private Manager manager;
	
	public PrintStudenti(Manager manager) {
		this.manager = manager;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		List<Studente> studenti = this.manager.getListaStudenti();
		
		System.out.println("STUDENTI INSERITI: " + studenti.size());
		studenti.forEach(System.out::println);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
	}

}
