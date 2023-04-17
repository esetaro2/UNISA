package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import core.Manager;
import core.Studente;

public class MainGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private Manager manager;
	
	public MainGUI(String title) {
		manager = new Manager();
		
		setTitle(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 300);
		setResizable(false);
		add(buildPanel());
	}
	
	public JPanel buildPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		JButton saveButton = new JButton("SALVA SU FILE");
		saveButton.addActionListener(new SaveStudenti(manager));
		
		JPanel panel1 = new JPanel();
		
		JLabel n = new JLabel("Nome:");
		JTextField nome = new JTextField("", 15);
		
		JLabel c = new JLabel("Cognome:");
		JTextField cognome = new JTextField("", 15);
		
		JLabel m = new JLabel("Matricola:");
		JTextField matricola = new JTextField("", 15);
		
		JLabel e = new JLabel("Età:");
		JTextField eta = new JTextField("", 15);
		
		JLabel t = new JLabel("Tipologia:");
		String[] s = {"IN CORSO", "FUORI CORSO"};
		JComboBox<String> tipo = new JComboBox<String>(s);
		
		JButton addButton = new JButton("AGGIUNGI");
		addButton.addActionListener(new AddStudente(manager, nome, cognome, matricola, eta, tipo));
		
		JButton printButton = new JButton("STAMPA STUDENTI");
		printButton.addActionListener(new PrintStudenti(manager));
		
		panel1.add(n);
		panel1.add(nome);
		panel1.add(c);
		panel1.add(cognome);
		panel1.add(m);
		panel1.add(matricola);
		panel1.add(e);
		panel1.add(eta);
		panel1.add(t);
		panel1.add(tipo);
		panel1.add(addButton);
		panel1.add(printButton);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2, 2));
		
		JButton orderByEta = new JButton("STUDENTI PER ETÀ");
		orderByEta.addActionListener(new OrderByEta(this.manager.getListaStudenti()));
		orderByEta.addActionListener(new PrintStudenti(manager));
		
		JButton outButton = new JButton("STUDENTI FUORI CORSO");
		outButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("STUDENTI FUORI CORSO");
				manager.getListaStudenti().stream().filter(s -> s.getTipo() == Studente.fuoriCorso).forEach(System.out::println);
				System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
			}
		});
		
		JButton over30Button = new JButton("STUDENTI OVER 30");
		over30Button.addActionListener(new GetStudentiOver30(this.manager));
		
		JButton under30Button = new JButton("STUDENTI UNDER 30");
		under30Button.addActionListener(new GetStudentiUnder30(this.manager));
		
		panel2.add(orderByEta);
		panel2.add(outButton);
		panel2.add(over30Button);
		panel2.add(under30Button);

		panel.add(saveButton, BorderLayout.NORTH);
		panel.add(panel1, BorderLayout.CENTER);
		panel.add(panel2, BorderLayout.SOUTH);
		
		return panel;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

}
