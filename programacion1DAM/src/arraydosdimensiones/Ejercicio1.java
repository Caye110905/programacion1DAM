package arraydosdimensiones;

public class Ejercicio1 {

	public static void main(String[] args) {

		int matriz1[][] = {
				{1, 10, 3},
				{4, 5, 66},
				{72, 8, 9}
				};
		int matriz2[][] = {
				{99, 8, 7},
				{6, 50, 4},
				{3, 23, 1}
				};
		int matriz3[][] = {
				
		};
		
		System.out.print("Matriz 1");
		for (int i = 0; i < matriz1.length; i++) {
			System.out.print("\n");
			for (int h = 0; h < matriz1[i].length; h++) {
				System.out.print(matriz1[i][h] + " ");
			}
		}
		
		System.out.print("\n");
		System.out.print("Matriz 2");
		for (int i = 0; i < matriz1.length; i++) {
			System.out.print("\n");
			for (int h = 0; h < matriz1[i].length; h++) {
				System.out.print(matriz2[i][h] + " ");
			}
		}
		
		System.out.print("\n");
		System.out.print("Resultado");
		for (int i = 0; i < matriz1.length; i++) {
			System.out.print("\n");
			for (int h = 0; h < matriz1[i].length; h++) {
				System.out.print(matriz1[i][h] + matriz2[i][h] + " ");
			}
		}

	}

}
