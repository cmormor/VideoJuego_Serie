package es.iessoterohernandez.daw.endes.Serie_Videojuego;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestVideojuegoSerie {

	private Videojuego v;
	private Serie s;

	@BeforeEach
	public void init() {
		v = new Videojuego("Warzone", 200, "Batle Royale", "Activision");
		s = new Serie("Vis a Vis", 5, "Dramatico", "Iván Escobar");
	}

	@Test
	public void isEntregadoTest() {

		v.entregar();
		assertTrue(v.isEntregado());

		v.devolver();
		assertFalse(v.isEntregado());

		s.entregar();
		assertTrue(s.isEntregado());

		s.devolver();
		assertFalse(s.isEntregado());

	}

	@Test
	public void compareToIgualesTest() {

		Videojuego v2 = new Videojuego("Warzone", 200, "Batle Royale", "Activision");
		assertEquals(0, v.compareTo(v2));

		Serie s2 = new Serie("Vis a Vis", 5, "Dramatico", "Iván Escobar");
		assertEquals(0, s.compareTo(s2));
	}

	@Test
	public void compareToMayorTest() {

		Videojuego v2 = new Videojuego("Warzone", 500, "Batle Royale", "Activision");
		assertEquals(-1, v.compareTo(v2));

		Serie s2 = new Serie("Vis a Vis", 7, "Dramatico", "Iván Escobar");
		assertEquals(-1, s.compareTo(s2));
	}

	@Test
	public void compareToMenorTest() {

		Videojuego v2 = new Videojuego("Warzone", 100, "Batle Royale", "Activision");
		assertEquals(1, v.compareTo(v2));

		Serie s2 = new Serie("Vis a Vis", 4, "Dramatico", "Iván Escobar");
		assertEquals(1, s.compareTo(s2));
	}

	@Test
	public void equalsTest() {

		Videojuego v2 = new Videojuego("Warzone", 200, "Batle Royale", "Activision");
		assertTrue(v.equals(v2));

		Videojuego v3 = new Videojuego("Valorant", 200, "Batle Royale", "Riot Games");
		assertFalse(v.equals(v3));

		Serie s2 = new Serie("Vis a Vis", 5, "Dramatico", "Iván Escobar");
		assertTrue(s.equals(s2));

		Serie s3 = new Serie("Blacklist", 5, "Dramatico", "Jon Bokenkamp");
		assertFalse(s.equals(s3));
	}
}
