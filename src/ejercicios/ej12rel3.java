package ejercicios;

import java.util.Scanner;

public class ej12rel3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un número entero para saber si es perfecto: ");
		int num = teclado.nextInt();
		
		int suma = 0;
		for (int i=1; i<num; i++) {
			if(num%i==0) {
				suma=suma+i;
			}
		}
		if(suma==num) {
			System.out.println("El numero es perfecto");
		}
		else {
			System.out.println("No es un numero perfecto");
		        }
		teclado.close();
	}

}
