package switchh;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que ingrese dos números
        System.out.print("Ingresa el primer número: ");
		
		double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

		// Solicitar al usuario que ingrese un operador (+, -, *, /)
        System.out.print("Ingresa un operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado = 0;
        
        // Utilizar un switch para realizar la operación seleccionada
        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Error: No es posible dividir entre cero.");
                    return;
		                }
		                
		                }
        	break;
        	System.out.println("Operador no válido.");
	                return;
		        }
	System.out.println("El resultado de la operación es: " + resultado)
	
	scanner.close();

	
	}


