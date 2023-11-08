package switchh;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que ingrese una cantidad de dinero
        System.out.print("Ingresa la cantidad de dinero: ");
        double cantidad = scanner.nextDouble();

        // Solicitar al usuario que ingrese la moneda (D para Dólares, E para Euros)
        System.out.print("Ingresa la moneda (D para Dólares, E para Euros): ");
        char moneda = Character.toUpperCase(scanner.next().charAt(0));
        double resultado;

	        

        // Utilizar un switch para realizar la conversión
	    switch (moneda) {
	            
	           
	case 'D':

	                resultado = cantidad * 0.85; // 1 Dólar = 0.85 Euros (valor aproximado)
	                System.out.println(cantidad + " Dólares equivalen a " + resultado + " Euros.");
	                break;
	            case 'E':
	                resultado = cantidad / 0.85; // 1 Euro = 1.18 Dólares (valor aproximado)
	                System.out.println(cantidad + " Euros equivalen a " + resultado + " Dólares.");
	                
	               
	break;
	            default:
	                System.out.println("Moneda no válida.");
	                
	               
	break;
	        }

	        
	        }
	        
	}


