package exception;

@SuppressWarnings("serial")
public class SquadraRegisteredException extends Exception {

	public SquadraRegisteredException() {
		super("La squadra è stata già registrata al campionato");
	}

	public SquadraRegisteredException(String message) {
		super(message);
	}
	
}
