package ejercicios;

import java.util.Scanner;

public class ej7rel3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int numero1 = teclado.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int numero2 = teclado.nextInt();
        
        int contador = 0;
        
        // Asegurarse de que el primer número sea menor o igual al segundo número
        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }
        
        for (int i = numero1; i <= numero2; i++) {
            if (i % 7 == 0) {
                contador++;
            }
        }
        
        System.out.println("Cantidad de múltiplos de 7 entre " + numero1 + " y " + numero2 + ": " + contador);
        
        teclado.close();
    }

}
