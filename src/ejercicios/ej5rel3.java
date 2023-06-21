package ejercicios;

import java.util.Scanner;

public class ej5rel3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero");
		int n = teclado.nextInt();
		
		int suma = 0;
		int contador = 1;
		
		while (contador <= n) {
			suma += contador;
			contador++;
		}
		System.out.println("La suma de los primeros " + n + " números enteros es: " + suma);
	teclado.close();
	}

}
