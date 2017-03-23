package valuta.kurs;

import java.util.GregorianCalendar;

public class Kurs {
	private GregorianCalendar datum;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) throws Exception {
		if(datum == null){
			throw new Exception("NULL vrednost");
		}
		this.datum = datum;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) throws Exception {
		if(prodajniKurs < 0)
			throw new Exception("Vrednost manja od 0.");
		this.prodajniKurs = prodajniKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) throws Exception {
		if(kupovniKurs < 0)
			throw new Exception("Vrednost manja od 0.");
		this.kupovniKurs = kupovniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) throws Exception {
		if(srednjiKurs < 0)
			throw new Exception("Vrednost manja od 0.");
		this.srednjiKurs = srednjiKurs;
	}
	
	
}
