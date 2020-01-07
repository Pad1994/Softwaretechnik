package Praktikum3.elegante_loesung;

public class Zeitschrift extends Medium {
	
	//Konstruktor
	public Zeitschrift(String titel) {
		super(titel);
	}

	@Override
	public String toString() {
		return "\n---\nZeitschrift \n"+ getTitel();
	}
}
