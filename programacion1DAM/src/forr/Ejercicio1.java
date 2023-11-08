package forr;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número N: ");
        int N = scanner.nextInt();	
        
        for (int i = 1; i <= N; i++) {
        	System.out.println(i);
        }
	}

}
