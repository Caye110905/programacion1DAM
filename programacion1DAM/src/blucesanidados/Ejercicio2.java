package blucesanidados;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número N: ");
        int N = scanner.nextInt();
        
        for ( int i = 0; i <= N; i++ ) {
        	int numero = 1;
        	for( int j = 1; j <= i; j++) {
        		
        		System.out.print(numero);
        		numero++;
        	}
   
        	System.out.println("");
        }	
	}

}
