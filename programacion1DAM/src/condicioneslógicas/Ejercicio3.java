package condicioneslógicas;

import java.util.Scanner;

public class Ejercicio3 {
	
	
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Pedir al usuario que ingrese tres números
    System.out.println("Ingrese el primer número:");
    int num1 = scanner.nextInt();

    System.out.println("Ingrese el segundo número:");
    int num2 = scanner.nextInt();

    System.out.println("Ingrese el tercer número:");
    int num3 = scanner.nextInt();

    

    // Comprobar si están en orden creciente o decreciente
    if ((num1 < num2 && num2 < num3) || (num1 > num2 && num2 > num3)) {
        System.out.println("Están en orden creciente.");
    } 
   
    else if ((num1 > num2 && num2 > num3) || (num1 < num2 && num2 < num3)) {
        System.out.println("Están en orden decreciente.");
    } else {
        System.out.println("No están en orden creciente ni decreciente.");
        }
    }
}
    

	
		
	


