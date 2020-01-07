package Praktikum3.elegante_loesung;

public class EZeitschrift extends Medium {
	
	//Konstruktor
	public EZeitschrift(String titel) {
		super(titel);
	}

	@Override
	public String toString() {
		return "\n---\nE-Zeitschrift \n"+ getTitel();
	}
}
