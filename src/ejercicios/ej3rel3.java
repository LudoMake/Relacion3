package ejercicios;

import java.util.Scanner;

public class ej3rel3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Algoritmo imprimir tabla multiplicar usando do/while");
		System.out.println("Introduce un número entre uno y diez");
		int num= teclado.nextInt();

		int i=1;
		do
		{
			System.out.printf("%d*%d=%d\n", num, i,num*i);
			i++;
		}
		while ( i<=10);
		teclado.close();
		}
		
	}