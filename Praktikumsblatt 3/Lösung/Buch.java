package Praktikum3.elegante_loesung;

public class Buch extends Medium {
	
	private String autoren;
	
	
	//Konstruktor
	public Buch(String titel, String autoren) {
		super (titel);
		this.autoren = autoren;
	}
	
	public String getAutoren() {
		return autoren;
	}
	
	@Override
	public String toString() {
		return "---\nBuch\n" + autoren + ": " + getTitel();
	}
}
