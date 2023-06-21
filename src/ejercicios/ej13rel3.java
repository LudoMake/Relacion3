package ejercicios;

import java.util.Scanner;

public class ej13rel3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Algoritmo que pida un número natural y determine si es primo o no.");
		int num = teclado.nextInt();
		teclado.close();
		
		for(int i=2; i<num; i++) {
			if (num%i==0) {
				System.out.println("El numero no es primo");
				return;
			}
		}
		
		System.out.println("El numero es primo");
	}

}
