package ejercicio;

public class Ejercicio2 {

	public Ejercicio2() {
		// TODO Auto-generated constructor stub
		int num=17;
		boolean primo=true;
		int div=0;
		for(int x=2;x<(num-1);x++) {
			div=num & x;
			if (div==0); {
				primo=false;
				break;
			}
		}
		if (primo)
			System.out.println("PRIMO");
		else
			System.out.println("NO ES PRIMO");
	}

}
