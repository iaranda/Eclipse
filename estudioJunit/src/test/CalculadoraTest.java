package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import modelo.Calculadora;

class CalculadoraTest {
	
	//@Disabled
	@Test
	void testSumaAssert() {
		//fail("Not yet implemented");
		Calculadora calculadora = new Calculadora();
		int actual = calculadora.suma(15, 10);
		int esperado = 25;
		assertEquals(esperado, actual);
		 actual = calculadora.suma(-15, 10);
		 esperado = -5;
		assertEquals(esperado, actual);
		actual = calculadora.suma(-15, -10);
		 esperado = -25;
		assertEquals(esperado, actual);
		actual = calculadora.suma(15, -10);
		 esperado = 5;
		assertEquals(esperado, actual);	
	}
	
	@Disabled
	@Test
	void testEstudioAssert2() {
		Calculadora calculadora = new Calculadora();
		int suma = calculadora.suma(10, 15);
		//Valoramos el resultado de una condicion
		assertTrue(suma > 10);
		calculadora = null;
		//Valoramos si un objeto es null o notnull
		assertNotNull(calculadora, "La calculadora no esta instanciada");
	}

	@Disabled
	@Test
	public void testSumaDouble() {
		Calculadora calc = new Calculadora();
		System.out.println("SumaDouble()");
		double resultado = calc.suma(3.501, 1.0);
		double esperado = 4.5;
		
		//assertEquals (esperado, resultado);
		assertEquals(esperado, resultado, 0.001);
		//assertEquals(esperado, resultado, 0.0001,"Error de precision");
	}
	
	@Disabled
	@Test
	void assertAllSumaTest() {
		Calculadora calc = new Calculadora();
		int suma = calc.suma(3, 12);
		int esperado = 6;
		assertAll(
				() -> assertEquals(esperado, suma, "Error en la suma"),
				
				() -> assertTrue(suma>10,"Fallo la condicion")
				
				);
	}
	
	@Test
	
	//Excepciones controladas
		//En determinados casos que se lance una excepcion es lo correcto, esto hay que comprobarlo
	
	void testDivisionPorCero( ) {
		Calculadora calc = new Calculadora();
		assertThrows(ArithmeticException.class, () -> calc.div(10, 0),"Se esperaba que se lanzara AritmeticException");
	}
//end class
}
