package vista;

import modelo.Calculadora;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadora = new Calculadora();
		int suma = calculadora.suma(3, -4);
		System.out.println(suma);
	}

}
