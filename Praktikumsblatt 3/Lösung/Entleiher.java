package Praktikum3.elegante_loesung;

public class Entleiher {
	  public String name;

	  public Entleiher(String name) {
	    this.name = name;
	  }

	  public  String getName() {
	    return name;
	  }
	  
		@Override
		public String toString() {
			return "Entliehene Medien von " + name;
		}
	}

