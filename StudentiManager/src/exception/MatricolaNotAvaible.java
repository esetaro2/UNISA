package exception;

@SuppressWarnings("serial")
public class MatricolaNotAvaible extends Exception {

	public MatricolaNotAvaible() {
		super("La matricola non è disponibile");
	}

	public MatricolaNotAvaible(String message) {
		super(message);
	}

	
}
