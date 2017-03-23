package implementacil;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejsi.MenjacnicaInterfejs;
import valuta.kurs.Kurs;

public class ImplementacijaMenjacnicaInterfejs implements MenjacnicaInterfejs {
	
	private String naziv;
	private String skraceniNaziv;
	private LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
	@Override
	public void dodavanjeKursaValuteZaDatum(GregorianCalendar datum, double prodajniKurs, double srednjiKurs,
			double kupovniKurs) {
		Kurs novi = new Kurs();
		try{
			novi.setDatum(datum);
			novi.setKupovniKurs(kupovniKurs);
			novi.setProdajniKurs(prodajniKurs);
			novi.setSrednjiKurs(srednjiKurs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		kursevi.add(novi);
	}

	@Override
	public void brisanjeKursaValuteZaDatum(GregorianCalendar datum) {
		for(int i = 0 ; i < kursevi.size() ; i++){
			if(kursevi.get(i).getDatum().equals(datum))
				kursevi.remove(i);
		}

	}

	@Override
	public Kurs vratiKursZaDatum(GregorianCalendar datum) {
		for(int i = 0 ; i < kursevi.size() ; i++){
			if(kursevi.get(i).getDatum().equals(datum))
				return kursevi.get(i);
		}
		return null;
	}

}
