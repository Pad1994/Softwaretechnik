package Praktikum3.elegante_loesung;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class VerleihsystemTest {

	@Test
	void testZeigeAusgelieheneMedien() {
		Verleihsystem vs = new Verleihsystem();
		Entleiher Max = new Entleiher("Max");
		
		assertEquals("Max hat keine Medien entliehen.",vs.zeigeAusgelieheneMedien(Max));
	}

}
