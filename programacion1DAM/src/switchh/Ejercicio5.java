package switchh;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        

		// Solicitar al usuario que ingrese una calificación del 1 al 5
		        System.out.print("Ingresa una calificación del 1 al 5: ");
		        int calificacion = scanner.nextInt();

		        String mensaje;

		// Utilizar un switch para determinar la calificación en palabras
		        
		       
		switch (calificacion) {
		            
		           
		case 1:
		                mensaje = "Insuficiente";
		                break;
		            
		           
		case 2:
		                mensaje = "Suficiente";
		                break;
		            case 3:
		                mensaje = "Aprobado";
		                
		               
		break;
		            
		           
		case 4:
		                mensaje = "Notable";
		                
		               
		break;
		            
		           
		case 5:
		                mensaje = "Sobresaliente";
		                break;
		            default:
		                mensaje = "Calificación no válida";
		                break;
		        }

		        
		        }

		// Mostrar la calificación en palabras
		        System.out.println("La calificación en palabras es: " + mensaje);

		        

		// Cerrar el Scanner
		        scanner.close();
	}


