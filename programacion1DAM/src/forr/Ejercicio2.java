package forr;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero");
		
		int numero = sc.nextInt();
		int suma=0;
		
        for (int i=1; i<=numero; i++) {
        	if (i %2==0);{
        		suma = suma +i;
        	}
        }
		
		System.out.print(suma);
		

	}

}
