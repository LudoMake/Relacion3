package ejercicios;

import java.util.Scanner;

public class ej6rel3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese un número entero: ");
        int numero = teclado.nextInt();
        
        int factorial = 1;
        
        if (numero >= 0) {
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            
            System.out.println("El factorial de " + numero + " es: " + factorial);
        } else {
            System.out.println("El número debe ser no negativo.");
        }
        
        teclado.close();

	}

}
