package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import modelo.Calculadora;

class OtrasPruebas {

	@Disabled("De esta forma podemos desabilitar un test temporalmente")
	@Test
	void testSuma() {
		Calculadora calculadora = new Calculadora();
		int suma = calculadora.suma(10, 15);
		int esperado = 25;
		assertEquals(esperado, suma);
	}
	
	// Tenemos anotaciones para ejecutar los test en base a una condicion:
	@Test
	@EnabledOnOs(OS.WINDOWS) //Ejecutamos si el siestema operativo es windows
	void testSuma2() {
		Calculadora calculadora = new Calculadora();
		int suma = calculadora.suma(10, 15);
		int esperado = 25;
		assertEquals(esperado, suma);
	}

	@Test
	@EnabledOnOs({OS.LINUX, OS.MAC})
	void testSuma3() {
		Calculadora calculadora = new Calculadora();
		int suma = calculadora.suma(10, 15);
		int esperado = 25;
		assertEquals(esperado, suma);
	}
	
	// Podemos habilitar o desabilitar en base al JRE, que sea uno concreto, un rango...
	@Test
	@EnabledForJreRange(min=JRE.JAVA_14) 
	void testSuma4() {
		Calculadora calculadora = new Calculadora();
		int suma = calculadora.suma(10, 15);
		int esperado = 25;
		assertEquals(esperado, suma);
	}
}
