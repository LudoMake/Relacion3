package ejercicios;

import java.util.Scanner;

public class ej10rel3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un número entero para generar su tabla de multiplicar: ");
        int numero = teclado.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");

        int i = 0;
        while (i <= 10) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;
        }
        teclado.close();
    }
}
		