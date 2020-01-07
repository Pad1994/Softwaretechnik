package Praktikum3.elegante_loesung;

public class Bluray extends Medium {
	
	private String titel;
	
	//Konstruktor
	public Bluray(String titel) {
		super(titel);
		this.titel = titel;
	}
	
	public String getTitel() {
		return titel;
	}
	
	@Override
	public String toString() {
		return "\n---\nBlu-ray Film \n"+ titel;
	}
}
