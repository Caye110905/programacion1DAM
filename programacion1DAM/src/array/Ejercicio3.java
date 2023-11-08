package array;

import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tamaño = 10;
		int[] numerosramdom = new int [tamaño];
		
		Random random = new Random();
	       for (int i = 0; i < tamaño; i++) {
	           numerosramdom[i] = random.nextInt(20);
	       }
	       
	       System.out.println("Numeros del array:");
	       for ( int numeros : numerosramdom ){
	       	System.out.println(numeros + " ");
	       }
	       for ( int i = 1; i < tamaño; i++ ) {
	           int numeroMasGrande = 0;
			if ( numerosramdom[i] > numeroMasGrande ) {
	               numeroMasGrande = numerosramdom[i];}
	       }

	}

}
