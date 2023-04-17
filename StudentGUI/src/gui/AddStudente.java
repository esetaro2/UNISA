package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import core.Manager;
import core.Studente;

public class AddStudente implements ActionListener {
	
	private Manager manager;
	private JTextField nome, cognome, matricola, eta;
	private JComboBox<String> tipo = new JComboBox<>();
	
	public AddStudente(Manager manager, JTextField nome, JTextField cognome, JTextField matricola, JTextField eta,
			JComboBox<String> tipo) {
		this.manager = manager;
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
		this.eta = eta;
		this.tipo = tipo;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public JTextField getNome() {
		return nome;
	}

	public void setNome(JTextField nome) {
		this.nome = nome;
	}

	public JTextField getCognome() {
		return cognome;
	}

	public void setCognome(JTextField cognome) {
		this.cognome = cognome;
	}

	public JTextField getMatricola() {
		return matricola;
	}

	public void setMatricola(JTextField matricola) {
		this.matricola = matricola;
	}

	public JTextField getEta() {
		return eta;
	}

	public void setEta(JTextField eta) {
		this.eta = eta;
	}

	public JComboBox<String> getTipo() {
		return tipo;
	}

	public void setTipo(JComboBox<String> tipo) {
		this.tipo = tipo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nome, cognome, eta, matricola;
		int tipologia = 0, anni = 0;
		
		nome = this.nome.getText();
		if(nome.equals("")) return;
		
		cognome = this.cognome.getText();
		if(cognome.equals("")) return;
		
		eta = this.eta.getText();
		if(eta.equals("")) return;
		anni = Integer.parseInt(eta);
		
		matricola = this.matricola.getText();
		if(matricola.equals("")) return;
		
		if(this.tipo.getSelectedItem().equals("IN CORSO")) tipologia = Studente.inCorso;
		else if(this.tipo.getSelectedItem().equals("FUORI CORSO")) tipologia = Studente.fuoriCorso;
		
		Studente s = new Studente(nome, cognome, matricola, anni, tipologia);
		if(this.manager.addStudente(s)) System.out.println(s.toString() + " AGGIUNTO CON SUCCESSO");
		else System.out.println("IMPOSSIBILE AGGIUNGERE LO STUDENTE");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
	}

}
