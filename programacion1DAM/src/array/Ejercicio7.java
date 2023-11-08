package array;

import java.util.Arrays;
import java.util.HashSet;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = {3, 4, 1, 5, 2, 3, 8 , 8, 7 , 10};
		
		Arrays.sort(numeros);
		
       System.out.print("Este es el array con numeros repetidos: ");
       for ( int numero : numeros ) {
       	System.out.print(numero + " ");
       }
       HashSet<Integer> conjunto = new HashSet<>();
       for ( int numero : numeros ) {
           conjunto.add(numero);
       }
      
       Integer[] arraysinrepes = conjunto.toArray(new Integer[conjunto.size()]);
      
       System.out.print("\n" + "Este es el array con numeros sin repetir: ");
       for ( int numero : arraysinrepes ) {
           System.out.print(numero + " ");
       }


	}

}
