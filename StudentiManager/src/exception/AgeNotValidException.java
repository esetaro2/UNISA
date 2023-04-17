package exception;

@SuppressWarnings("serial")
public class AgeNotValidException extends RuntimeException {

	public AgeNotValidException() {
		super("Età minore di 18 anni");
	}

	public AgeNotValidException(String message) {
		super(message);
	}
	
}
