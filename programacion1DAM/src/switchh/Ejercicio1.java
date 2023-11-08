package switchh;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número del 1 al 7
        System.out.print("Ingresa un número del 1 al 7: ");
        
       
		int dia = scanner.nextInt();
		
		
		// Utilizar un switch para determinar el día de la semana
		        
		       
		switch (dia) {
		            case 1:
		                System.out.println("Tu dia es Lunes");
		                break;
		            case 2:
		            	System.out.println("Tu dia es Martes");
		                break;
		            case 3:
		            	System.out.println("Tu dia es Lunes");    
		               break;
		            case 4:
		            	System.out.println("Tu dia es Jueves");
		                break;
		            case 5:
		            	System.out.println("Tu dia es Lunes");
		                break;           
	                case 6:
	                	System.out.println("Tu dia es Sabado");
		                break;
		            case 7:
		            	System.out.println("Tu dia es Lunes");
		                break;
		        }
		
        // Mostrar el día de la semana
        System.out.println("El día correspondiente es: " + dia);
	}

}
