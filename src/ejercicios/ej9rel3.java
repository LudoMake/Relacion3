package ejercicios;

import java.util.Scanner;

public class ej9rel3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número entero para generar su tabla de multiplicar: ");
		int num = teclado.nextInt();

		System.out.println("Tabla de multiplicar del " + num + ":");

		for (int i = 0; i <= 10; i++) {
		            int resultado = num * i;
		            System.out.println(num + " x " + i + " = " + resultado);
		        }
		teclado.close();
		    }
		}
