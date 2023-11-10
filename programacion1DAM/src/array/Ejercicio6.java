package array;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		int tamaño = 10;
		int[] numerosramdom = new int [tamaño];
		
      Random aleatorio = new Random();
      for (int i = 0; i < tamaño; i++) {
          numerosramdom[i] = aleatorio.nextInt(20);
      }
  
      System.out.println("Array original:");
      for (int numeros : numerosramdom){
      	System.out.print(numeros + " ");
      }
		
      System.out.println("\n" + "Introduce la posicion del elemento del 0-9");
      Scanner sc1 = new Scanner(System.in);
      int n1 = sc1.nextInt();
     
      System.out.println("Introduce el elemento que quieres añadir");
      Scanner sc2 = new Scanner(System.in);
      int n2 = sc2.nextInt();
      if (n1 >= 0 && n1 < tamaño) {
          for (int i = tamaño - 1; i > n1; i--) {
              numerosramdom[i] = numerosramdom[i - 1];
          }
          numerosramdom[n1] = n2;
          System.out.println("Nuevo Array:");
          for (int i = 0; i < tamaño; i++) {
              System.out.print(numerosramdom[i] + " ");
          }
      } else {
          System.out.println("Posición fuera de rango. No se ha realizado la inserción.");
      }	

	}

}
