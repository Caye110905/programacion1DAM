package dowhile;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número N
        System.out.print("Ingresa un número N: ");
        
       
int N = scanner.nextInt();

        

       
int numero = 2; // Empezamos desde 2 porque es el primer número par
        int suma = 0;

        // Bucle do-while para sumar números pares hasta N
        do {
            suma += numero;
            numero += 
            suma += numero; 
            
            2; // Incrementamos en 2 para obtener el siguiente número par
        } 
        }
while (numero <= N);

        

// Mostrar la suma de números pares
        System.out.println("La suma de los números pares desde 2 hasta " + N + " es: " + suma);

        

// Cerrar el Scanner
        scanner.close();
	}

}
