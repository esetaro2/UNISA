package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import core.DipendentiManager;

@SuppressWarnings("serial")
public class MainGUI extends JFrame {

	private DipendentiManager manager;
	
	public MainGUI(String title) {
		this.manager = new DipendentiManager();
		
		setTitle(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 150);
		setResizable(false);
		add(buildPanel());
	}
	
	public JPanel buildPanel() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		
		JButton loadButton = new JButton("CARICA DIPENDENTI");
		loadButton.addActionListener(e -> {
			System.out.println("Carico i dipendenti da file Dipendenti.txt\n");
			this.manager.readLavoratori("Dipendenti.txt");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
		});
		panel1.add(loadButton);
		
		JPanel panel2 = new JPanel();
		
		JLabel s = new JLabel("Soglia: ");
		JTextField soglia = new JTextField("", 5);
		panel2.add(s);
		panel2.add(soglia);
		
		JButton searchButton = new JButton("VAI");
		searchButton.addActionListener(e -> {
			String so = soglia.getText();
			
			if(so == "") return;
			Double sogliaDouble = Double.parseDouble(so);
			
			System.out.println("Stampo dipendenti con stipendio mensile maggiore di " + sogliaDouble + "\n");
			this.manager.printDipendentiGreaterThanSoglia(sogliaDouble);
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
		});
		panel2.add(searchButton);
		
		JPanel panel3 = new JPanel();
		
		JButton printStagisti = new JButton("STAMPA STAGISTI");
		printStagisti.addActionListener(e -> {
			System.out.println("Stampo i dipendenti stagisti\n");
			System.out.println(this.manager.getStagisti());
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
		});
		panel3.add(printStagisti);
		
		mainPanel.add(panel1, BorderLayout.NORTH);
		mainPanel.add(panel2, BorderLayout.CENTER);
		mainPanel.add(panel3, BorderLayout.SOUTH);
		
		return mainPanel;
	}

	public DipendentiManager getManager() {
		return manager;
	}

	public void setManager(DipendentiManager manager) {
		this.manager = manager;
	}
	
}
