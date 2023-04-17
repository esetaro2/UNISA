package gui;

import java.awt.event.ActionEvent;	
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import core.LocaliManager;

public class SearchPIzzerie implements ActionListener {

	private JTextField nome;
	private LocaliManager manager;
	
	public SearchPIzzerie(JTextField nome, LocaliManager manager) {
		this.nome = nome;
		this.manager = manager;
	}

	public JTextField getNome() {
		return nome;
	}

	public void setNome(JTextField nome) {
		this.nome = nome;
	}

	public LocaliManager getManager() {
		return manager;
	}

	public void setManager(LocaliManager manager) {
		this.manager = manager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nome;
		if((nome = this.nome.getText()) == "") return;
		
		System.out.println("Stampo le pizzerie che hanno nel menù la " + nome + "\n");
		this.manager.printPizzeriaByPizza(nome);
	}

}
