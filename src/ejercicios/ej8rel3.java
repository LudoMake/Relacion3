package ejercicios;

import java.util.Scanner;

public class ej8rel3 {

			public static void main(String[] args) {
				Scanner teclado = new Scanner(System.in);
		        
		        System.out.print("Ingrese un número: ");
		        int num = teclado.nextInt();
		        
		        System.out.println("Los divisores de " + num + " son:");
		        
		        for (int i = 1; i <= num; i++) {
		        	if (num % i == 0) {
		        		System.out.println(i);
		        	}
		        }
		        teclado.close();
			}

		}