package interfaces;

import core.Locale;

public interface LocaleOptions {

	boolean prenotazione(int numeroPersone, Locale locale);
	void printInfoLocali();
	boolean addLocale(Locale locale);
	boolean removeLocale(Locale locale);
}
