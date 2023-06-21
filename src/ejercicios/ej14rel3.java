package ejercicios;

import java.util.Scanner;

public class ej14rel3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Algoritmo que pida dos números naturales e imprimir su cociente entero por el \r\n"
				+ "método de las restas sucesivas.");
		System.out.println("Inserta el primer numero");
		int dividendo=teclado.nextInt();
		System.out.println("Inserta el segundo numero");
		int divisor=teclado.nextInt();
		
		int resto=dividendo;
		int cociente = 0;
		
		while (resto >= divisor) {
			resto = resto-divisor;
			cociente++;
		}
		System.out.println("El cociente es " + cociente + " y el resto es "+ resto);
		teclado.close();
	}

}
