package array;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int número[];
		int par=0;
		int impar=0;
		número = new int[6];
		
		for (int i=0; i<número.length; i++) { 
			  if (i%2==0) {
				  par++; 
			  } else {
				  impar++;
			  }
			}  
		
		System.out.println("Hay " + par + " numeros pares" );
		System.out.println("Y hay " + impar + " numeros impares");
		
	}

}
