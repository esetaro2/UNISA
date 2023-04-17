package exception;

@SuppressWarnings("serial")
public class NumberNotAvailableException extends RuntimeException {

	public NumberNotAvailableException() {
		super("Il numero non è disponibile");
	}

	public NumberNotAvailableException(String message) {
		super(message);
	}
	
}
