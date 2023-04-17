package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import core.LocaliManager;

@SuppressWarnings("serial")
public class MainGUI extends JFrame {

	private LocaliManager manager;
	
	public MainGUI(String title) {
		this.manager = LocaliManager.createManager();
		setTitle(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 100);
		setResizable(false);
		add(buildPanel());
	}
	
	public JPanel buildPanel() {
		JPanel mainPanel = new JPanel();
		
		JPanel panel1 = new JPanel();
		
		JLabel n = new JLabel("Nome pizza: ");
		JTextField nome = new JTextField("", 15);
		panel1.add(n);
		panel1.add(nome);
		
		JButton searchButton = new JButton("CERCA");
		searchButton.addActionListener(new SearchPIzzerie(nome, manager));
		panel1.add(searchButton);
		
		mainPanel.add(panel1);
		
		return mainPanel;
	}

	public LocaliManager getManager() {
		return manager;
	}

	public void setManager(LocaliManager manager) {
		this.manager = manager;
	}
	
}
