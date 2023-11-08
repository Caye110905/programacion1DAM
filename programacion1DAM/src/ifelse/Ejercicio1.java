package ifelse;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		        

		// Pedir al usuario que ingrese su calificación
		        System.out.print("Ingresa tu calificación (un número entre 0 y 100): ");
		        int calificacion = scanner.nextInt();

		        // Verificar si la calificación es igual o mayor a 60
		        
		       
		if (calificacion >= 60) {
		            System.out.println("Aprobado");
		        } else {
		            System.out.println("Suspenso");
		        }

		        // Cerrar el Scanner
		        scanner.close();
	}

}
