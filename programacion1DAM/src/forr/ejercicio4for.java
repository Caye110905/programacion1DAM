package forr;

import java.util.Scanner;

public class ejercicio4for {
	
	public static void main (String[] args) {
		

		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero positivo: ");
        int num = scanner.nextInt();
        
        if (num < 0) {
        	System.out.println("El número debe ser positivo.");
        } else {
        	long factorial = 1;
            for (int i = 1; i <= num; i++) {
            	factorial *= i;
            }
            System.out.println("El factorial de " + num + " es: " + factorial);
        }
	}
}
	
