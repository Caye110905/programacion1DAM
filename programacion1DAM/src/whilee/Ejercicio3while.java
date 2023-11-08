package whilee;

import java.util.Scanner;

public class Ejercicio3while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        

		// Solicitar al usuario que ingrese un número entero
		        System.out.print("Ingresa un número entero: ");
		        
		       
		int numero = scanner.nextInt();

		        // Inicializar una variable para contar los dígitos
		        
		       
		int contador = 0;

		        // Usar un bucle while para contar los dígitos
		        while (numero != 0) {
		            // Dividir el número por 10 para eliminar el último dígito
		            numero = numero / 10;
		            // Incrementar el contador
		            contador++;
		        }

		        // Mostrar la cantidad de dígitos
		        System.out.println("El número tiene " + contador + " dígitos.");

		        // Cerrar el Scanner
		        scanner.close();
	}

}
