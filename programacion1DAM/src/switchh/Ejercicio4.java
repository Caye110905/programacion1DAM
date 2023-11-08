package switchh;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        

		int opcion;

		        do {
		            
		           
		// Mostrar el menú
		            System.out.println("=== Menú ===");
		            System.out.println("1. Mostrar información");
		            System.out.println("2. Editar perfil");
		            System.out.println("3. Salir");
		            System.out.print("Selecciona una opción (1-3): ");

		            

		           


		// Leer la opción del usuario
		            opcion = scanner.nextInt();

		            
		// Utilizar un switch para determinar la acción correspondiente
		            switch (opcion) {
		                case 1:
		                    System.out.println(
		                   
		"Mostrando información...");
		                    
		                   
		break;
		                
		               
		case 2:
		                    System.out.println("Editando perfil...");
		                    break;
		                
		               
		case 3:
		                    System.out.println("Saliendo...");
		                    
		                   
		break;
		                default:
		                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
		                    break;
		            }
		        }
		       

		           
		while (opcion != 3);

		        

		       
		// Cerrar el Scanner
		        scanner.close();
	}

}
