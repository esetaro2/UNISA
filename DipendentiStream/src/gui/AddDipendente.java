package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import core.Dipendente;
import core.DipendentiManager;

public class AddDipendente implements ActionListener {

	private DipendentiManager manager;
	private JTextField nome, cognome, salario;
	
	public AddDipendente(DipendentiManager manager, JTextField nome, JTextField cognome, JTextField salario) {
		this.manager = manager;
		this.nome = nome;
		this.cognome = cognome;
		this.salario = salario;
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

	public JTextField getSalario() {
		return salario;
	}

	public void setSalario(JTextField salario) {
		this.salario = salario;
	}

	public DipendentiManager getManager() {
		return manager;
	}

	public void setManager(DipendentiManager manager) {
		this.manager = manager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nome, cognome;
		String salario;
		double s;
		
		nome = this.nome.getText();
		if(nome.equals("")) return;
		
		cognome = this.cognome.getText();
		if(cognome.equals("")) return;
		
		salario = this.salario.getText();
		if(salario.equals("")) return;
		s = Double.parseDouble(salario);
		
		Dipendente d = new Dipendente(nome, cognome, s);
		
		System.out.println("DIPENDENTE AGGIUNTO ALLA LISTA DI DIPENDENTI");
		this.manager.getDipendenti().add(d);
		this.manager.setDipendenti(this.manager.getDipendenti());
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("DIPENDENTI INSERITI: " + this.manager.getDipendenti().size());
		System.out.println(this.manager.getDipendenti());
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
	}

}
