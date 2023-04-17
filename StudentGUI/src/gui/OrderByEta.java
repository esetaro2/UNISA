package gui;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;
import core.Studente;

public class OrderByEta implements ActionListener {

	private List<Studente> studenti;
	
	public OrderByEta(List<Studente> studenti) {
		this.studenti = studenti;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Collections.sort(this.studenti, (s1, s2) -> {
			return Studente.compareByEta(s1, s2);
		});

		System.out.println("STUDENTI ORDINATI PER ETA'");
		System.out.println("STUDENTI INSERITI: " + this.studenti.size());
		this.studenti.forEach(System.out::println);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
	}

	public List<Studente> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<Studente> studenti) {
		this.studenti = studenti;
	}

}
