package implementacil;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejsi.MenjacnicaInterfejs;
import valuta.kurs.Kurs;

public class ImplementacijaMenjacnicaInterfejs implements MenjacnicaInterfejs {

	private LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
	@Override
	public void dodavanjeKursaValuteZaDatum(GregorianCalendar datum, double prodajniKurs, double srednjiKurs,
			double kupovniKurs) {
		Kurs novi = new Kurs();
		try {
			if(datum == null){}else
			novi.setDatum(datum);
			if(kupovniKurs < 0){}else
			novi.setKupovniKurs(kupovniKurs);
			if(prodajniKurs < 0){}else
			novi.setProdajniKurs(prodajniKurs);
			if(srednjiKurs < 0){}else
			novi.setSrednjiKurs(srednjiKurs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		kursevi.add(novi);

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
