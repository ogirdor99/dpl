package DPL;

import java.util.Scanner;
public class volumencono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		
		final float pi= 3.1416f;
		float volumen;
		float altura;
		float radio;
		// aqui introducimos la altura
		System.out.println("Introduce la altura.");
		altura = key.nextFloat();
		// aqui introducimos el radio
		System.out.println("Introduce el radio. ");
		radio = key.nextFloat();
		// aqui hacemos la operacion para calcular el volumen del cono
		volumen = pi*radio*radio*altura/3;
		
		System.out.println("El volumen de este cono es " +volumen);
		
		
	}

}
