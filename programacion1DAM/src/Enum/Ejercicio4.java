package Enum;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		enum ColorArcoiris{
			rojo, naranja, amarillo, verde, azul, violeta} 
		
		ColorArcoiris[] n = new ColorArcoiris[7];
		
		 n[0] = ColorArcoiris.rojo;
		 n[1] = ColorArcoiris.naranja;
		 n[2] = ColorArcoiris.amarillo;
		 n[3] = ColorArcoiris.verde;
		 n[4] = ColorArcoiris.azul;
		 n[5] = ColorArcoiris.violeta;
		
		 System.out.println(n[0] + " " + n[1] + " " + n[2] + " " + n[3] + " " + n[4] + " " + n[5]);

	}

}
