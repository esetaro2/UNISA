package exception;

@SuppressWarnings("serial")
public class NumberNotValidException extends RuntimeException {

	public NumberNotValidException() {
		super("Il numero inserito non è valido");
	}

	public NumberNotValidException(String message) {
		super(message);
	}
	
}
