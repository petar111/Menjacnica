package interfejsi;

import java.util.GregorianCalendar;

import valuta.kurs.Kurs;

public interface MenjacnicaInterfejs {
	
	public void dodavanjeKursaValuteZaDatum(GregorianCalendar datum, double prodajniKurs, double srednjiKurs, double kupovniKurs);
	public void brisanjeKursaValuteZaDatum(GregorianCalendar datum);
	public Kurs vratiKursZaDatum(GregorianCalendar datum);
	

}
