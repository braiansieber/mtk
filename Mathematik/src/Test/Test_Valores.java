package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Code.Modelo;

public class Test_Valores {

	private Modelo	modelo;
	
	@Before
	public void antesTest(){
		
		modelo = new Modelo(4, "Jugador");
		modelo.HacerMazo();
	}
	
	@Test
	public void test_1Espada() {
		assertEquals(1, modelo.valorCarta(20)); //Verifica valor
	}
	
	@Test
	public void test_1Basto() {
		assertEquals(2, modelo.valorCarta(30)); //Verifica valor
	}
	
	@Test
	public void test_7Espada() {
		assertEquals(3, modelo.valorCarta(26)); //Verifica valor
	}
	
	@Test
	public void test_7Oro() {
		assertEquals(4, modelo.valorCarta(6)); //Verifica valor
	}
	
	@Test
	public void test_3Basto() {
		assertEquals(5, modelo.valorCarta(32)); //Verifica valor
	}
	
	@Test
	public void test_3Copa() {
		assertEquals(5, modelo.valorCarta(12)); //Verifica valor
	}
	
	@Test
	public void test_2Copa() {
		assertEquals(6, modelo.valorCarta(11)); //Verifica valor
	}
	
	@Test
	public void test_1Oro() {
		assertEquals(7, modelo.valorCarta(0)); //Verifica valor
	}
	
	@Test
	public void test_12Copa() {
		assertEquals(8, modelo.valorCarta(19)); //Verifica valor
	}
	
	@Test
	public void test_10Basto() {
		assertEquals(10, modelo.valorCarta(37)); //Verifica valor
	}
	
	@Test
	public void test_7Basto() {
		assertEquals(11, modelo.valorCarta(36)); //Verifica valor
	}
	
	@Test
	public void test_6Oro() {
		assertEquals(12, modelo.valorCarta(5)); //Verifica valor
	}
	
	@Test
	public void test_5Basto() {
		assertEquals(13, modelo.valorCarta(34)); //Verifica valor
	}
	
	@Test
	public void test_4Copa() {
		assertEquals(14, modelo.valorCarta(13)); //Verifica valor
	}
	
	@Test
	public void test_4Oro() {
		assertNotEquals(13, modelo.valorCarta(3)); //Verifica valor
	}
}