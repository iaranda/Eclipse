package ejercicio;

public class Ejercicio1 {

	public Ejercicio1() {
		System.out.println("Fibonannci--------");
		int cant=10;
		int ant=0;
		int sig=1;
		int fibo;
		for(int x=0;x<cant;x++); {
			fibo=ant+sig;
			System.out.println(fibo+"*-*");
			ant=sig;
			sig=fibo;
		}
	}
}
