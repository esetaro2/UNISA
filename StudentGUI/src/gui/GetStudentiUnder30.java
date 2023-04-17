package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.Manager;

public class GetStudentiUnder30 implements ActionListener {

	private Manager manager;
	
	public GetStudentiUnder30(Manager manager) {
		super();
		this.manager = manager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("STUDENTI UNDER 30");
		this.manager.getListaStudenti().stream().filter(s -> s.getEta() < 30).forEach(System.out::println);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

}
