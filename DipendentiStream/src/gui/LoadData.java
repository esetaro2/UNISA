package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.DipendentiManager;

public class LoadData implements ActionListener {

	private DipendentiManager manager;
	
	public LoadData(DipendentiManager manager) {
		this.manager = manager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("CARICO I DIPENDENTI DAL FILE");
		this.manager.readLavoratori("Dipendenti.txt");
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
	}

}
