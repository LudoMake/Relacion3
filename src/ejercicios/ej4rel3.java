package ejercicios;

import java.util.Scanner;

public class ej4rel3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Algoritmo numeros impares");
		System.out.println("Inserta un numero");
		int num1=teclado.nextInt();
		System.out.println("Inserte otro numero");
		int num2=teclado.nextInt();
		
		if (num1 % 2 == 0) {
            num1++; // Si el primer número es par, se incrementa en 1 para asegurarse de que sea impar.
        }
        
        while (num1 <= num2) {
            System.out.println(num1);
            num1 =num1 + 2; // Se incrementa en 2 para pasar al siguiente número impar.
        }
        
        teclado.close();

	}

}
