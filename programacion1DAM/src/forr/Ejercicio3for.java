package forr;

import java.util.Scanner;

public class Ejercicio3for {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("introduce un número: ");
		
		int numero= sc.nextInt();
		
		for(int i=1; i<=50; i++) {
			System.out.println(numero + "x" + i + "=" + (numero * i) );
			
		}
		
		
		
	}

}
