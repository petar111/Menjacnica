package valuta;

import java.util.LinkedList;

import valuta.kurs.Kurs;

public class Valuta {
	private String naziv;
	private String skraceniNaziv;
	private LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
	
	
	
	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}
	public void setKursevi(LinkedList<Kurs> kursevi) throws Exception {
		if(kursevi == null){
			throw new Exception("Prosledjen null pokazivac.");
		}
		if(kursevi.size() == 0){
			throw new Exception("Prosledjena lista je prazna.");
		}
		this.kursevi = kursevi;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) throws Exception {
		if( naziv == null){
			throw new Exception("Proslenjen null pokazivac");
		}
		if( naziv.length() == 0){
			throw new Exception("Proslenjen prazan string.");
		}
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) throws Exception {
		if( skraceniNaziv == null){
			throw new Exception("Proslenjen null pokazivac");
		}
		if( skraceniNaziv.length() == 0){
			throw new Exception("Proslenjen prazan string.");
		}
		this.skraceniNaziv = skraceniNaziv;
	}
	
	
	
	
}
