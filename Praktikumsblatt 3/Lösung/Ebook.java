package Praktikum3.elegante_loesung;

public class Ebook extends Medium {
	
	private String autoren;
	
	//Konstruktor
	public Ebook(String titel, String autoren) {
		super(titel);
		this.autoren = autoren;
	}
	
	@Override
	public String toString() {
		return "\n---\nEbook \n" + autoren + ": " + getTitel();
	}
}
