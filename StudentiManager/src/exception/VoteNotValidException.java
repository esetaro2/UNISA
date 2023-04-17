package exception;

@SuppressWarnings("serial")
public class VoteNotValidException extends RuntimeException {

	public VoteNotValidException() {
		super("Il voto deve essere compreso tra 18 e 30");
	}

	public VoteNotValidException(String message) {
		super(message);
	}
	
}
