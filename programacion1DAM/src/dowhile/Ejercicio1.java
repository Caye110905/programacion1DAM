package dowhile;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		// Pedir al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
		
	    int i = 1;

		// Usar un bucle do-while para imprimir la tabla de multiplicar
        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 10);

        // Cerrar el Scanner
        scanner.close();
	}

}
