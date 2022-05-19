import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tabla de multiplicar");
		Scanner leer=new Scanner (System.in);
		int tabla=0;
		int err=0;
		int dato=0;
		int [] tablaAlumno=new int[10];
		System.out.println("Que tabla quieres estudiar");
		tabla=leer.nextInt();
		System.out.println("Introduzca la table del .."+tabla);
		
		for(int x=0;x<tablaAlumno.length;x++) {
			System.out.println(tabla+" x "+(x+1)+" =");
			dato=leer.nextInt();
			tablaAlumno[x]=dato;
			if(dato!=(tabla*(x+1)))
				err++;
		}
		System.out.println();
	}

}
