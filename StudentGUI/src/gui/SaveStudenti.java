package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Manager;

public class SaveStudenti implements ActionListener {

	private Manager manager;

	public SaveStudenti(Manager manager) {
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
		this.manager.saveToFile("Studenti.txt");
		System.out.println("STUDENTI SALVATI SU FILE");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
	}

}
