package gui;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import core.DipendentiManager;

public class MainGUI extends JFrame {

	private static final long serialVersionUID = -6508626185123863757L;
	
	private DipendentiManager manager;
	
	public MainGUI(String title) {
		manager = new DipendentiManager();
		setTitle(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 100);
		add(buildPanel());
	}
	
	public JPanel buildPanel() {
		JPanel panel = new JPanel();
		
		JLabel n = new JLabel("Nome: ");
		JTextField nome = new JTextField("", 10);
		panel.add(n);
		panel.add(nome);
		
		JLabel c = new JLabel("Cognome: ");
		JTextField cognome = new JTextField("", 10);
		panel.add(c);
		panel.add(cognome);
		
		JLabel s = new JLabel("Salario: ");
		JTextField salario = new JTextField("", 10);
		panel.add(s);
		panel.add(salario);
		
		JButton addBtn = new JButton("AGGIUNGI DIPENDENTE");
		addBtn.addActionListener(new AddDipendente(manager, nome, cognome, salario));
		panel.add(addBtn);
		
		JButton loadButton = new JButton("CARICA FILE");
		loadButton.addActionListener(new LoadData(this.manager));
		panel.add(loadButton);
		
		return panel;
	}

	public DipendentiManager getManager() {
		return manager;
	}

	public void setManager(DipendentiManager manager) {
		this.manager = manager;
	}

}
