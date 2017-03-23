package implementacil;

import java.util.GregorianCalendar;

import interfejsi.MenjacnicaInterfejs;
import valuta.kurs.Kurs;

public class ImplementacijaMenjacnicaInterfejs implements MenjacnicaInterfejs {

	@Override
	public void dodavanjeKursaValuteZaDatum(GregorianCalendar datum, double prodajniKurs, double srednjiKurs,
			double kupovniKurs) {
		// TODO Auto-generated method stub

	}

	@Override
	public void brisanjeKursaValuteZaDatum(GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs vratiKursZaDatum(GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
