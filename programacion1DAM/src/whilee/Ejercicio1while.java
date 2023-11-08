package whilee;

import java.util.Scanner; 

public class Ejercicio1while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		
		int número = sc.nextInt();
		int i=1;
		
		while(i<=número) {
			System.out.println(i);
			i++;
		}
		
		
	}

}
