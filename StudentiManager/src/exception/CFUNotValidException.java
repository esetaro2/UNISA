package exception;

@SuppressWarnings("serial")
public class CFUNotValidException extends RuntimeException {

	public CFUNotValidException() {
		super("Numero di CFU non valido");
	}

	public CFUNotValidException(String message) {
		super(message);
	}

}
