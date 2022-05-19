package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import modelo.Calculadora;

public class CalculadoraTest2 {
		static Calculadora calculadora=null;
		//Mejorar la legitibilidad de nuestro test con @DisplayName
		
		@Test
		@DisplayName("Probamos el metodo suma de la calculadora")
		void testSuma() {
			System.out.println("testSuma()");
			//Calculadora calculadora=new Calculadora();
			int suma = calculadora.suma(10, 15);
			int esperado = 25;
			assertEquals(esperado, suma);	
		}
		
		@Test
		@DisplayName("Probamos el metodo resta de la calculadora")
		void testResta() {
			System.out.println("testResta()");
			//Calculadora calculadora=new Calculadora();
			int resta = calculadora.resta(10, 15);
			int esperado = -5;
			assertEquals(esperado, resta);	
		}
		
	@BeforeEach
	public void setUp() {
		System.out.println("@BeforeEach se ejecuta antes de cada test");
	}

	@AfterEach
	public void tearDown() {
		System.out.println("@AfterEach se ejecuta despues de cada test");
	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calculadora = new Calculadora();
		System.out.println("@BeforeAll() se ejecuta antes de todos los test");
	}
	
	@AfterAll
	static void tearDownAfterClass()throws Exception {
		calculadora = null;
		System.out.println("@AfterAll se ejecuta despues de todos los test");
	}
}
