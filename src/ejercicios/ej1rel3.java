package ejercicios;

import java.util.Scanner;

public class ej1rel3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Algoritmo imprimir tabla multiplicar usando for");
		System.out.println("Introduce un número entre uno y diez");
		int num= teclado.nextInt();
		
		for (int i=1; i<=10; i++)
		{
			System.out.printf("%d*%d=%d\n", num, i,num*i);
		}
		teclado.close();
	}
	
}
