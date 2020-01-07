package Praktikum3.elegante_loesung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Praktikum3.elegante_loesung.Medium;

public class Verleihsystem {
	
	public Map<Entleiher, List<Medium>> entlieheneMedien = new HashMap<>();
	
	public String zeigeAusgelieheneMedien(Entleiher entleiher) {
		List <Medium> medien = entlieheneMedien.get(entleiher);
		
		if (medien == null || medien.size() == 0) {
			return entleiher.getName() + " hat keine Medien entliehen.";
		}
		
		String ausgabe = "Entliehene Medien von " + entleiher.getName()	+ " (" + medien.size() + "):\n";
		ausgabe += "---\n";
		for (Medium medium : medien) {
			ausgabe += medium;
			ausgabe += "\n---\n";
		}
		return ausgabe;
	}
	
	public static void main(String[] args) {

		Entleiher max = new Entleiher("Max");
		
		Medium buchCleanCode = new Buch("Clean Code", "Robert C. Martin");
		Medium blurayInterstellar = new Bluray("Interstellar");
		Medium ebookRefactoring = new Ebook("Refactoring","Martin Fowler");
		
		List<Medium> entlieheneMedienVonMax = new ArrayList<>();
		
		entlieheneMedienVonMax.add(buchCleanCode);

		Verleihsystem vs = new Verleihsystem();
		vs.entlieheneMedien.put(max, entlieheneMedienVonMax);
		
		System.out.println(vs.zeigeAusgelieheneMedien(max));

	}
}
