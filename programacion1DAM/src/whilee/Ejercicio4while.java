package whilee;

import java.util.Scanner;

public class Ejercicio4while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
		random random = new random();

        // Generar un número aleatorio entre 1 y 100
        int numeroAleatorio = random.nextInt(100) + 1;

        System.out.println("¡Adivina el número entre 1 y 100!");

        int intentos = 0;
        
       
        int intentoUsuario;

        // Bucle para permitir al usuario adivinar hasta que lo haga
        while (true) {
            System.out.print("Ingresa tu adivinanza: ");
            intentoUsuario = scanner.nextInt();
            intentos++;

            
            intentoUsuario = scanner.nextInt();

           
            if (intentoUsuario == numeroAleatorio) {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
                break;
            } else if (intentoUsuario < numeroAleatorio) {
                System.out.println("El número es mayor. ¡Sigue intentando!");
            } else {
                System.out.println("El número es menor. ¡Sigue intentando!");
            }
        }

        // Cerrar el Scanner
        scanner.close();
		
	}

}
