package Matrices;

public class Ejercicio_4_M {
	public static void main(String[] args) {
		//Crear una tabla de tamaño 7x7 y rellenarla de forma que los elementos de la diagonal principal sean
		//1 y el resto 0.
		 int t[][]=new int[7][7];
		 int i,j;
		 for (i=0;i<7;i++)
		 for (j=0;j<7;j++)
		 if (i==j)
		 t[i][j] = 1;
		 else
		 t[i][j] = 0; // en java, al crear una tabla de enteros, todos los elementos se
		// inicializan a 0. Por lo que esta instrucción no es necesaria. Se aña_
		 // de para que el código sea más comprensible.
		 // mostramos la matriz
		 // la forma de ver la matriz no es la típica que estamos acostumbrados en
		 // matemática... pero desde el punto de vista del algoritmo no es relevante.
		 System.out.println ("Matriz:");
		 for (i=0;i<7;i++)
		 {
		 for (j=0;j<7;j++)
		 System.out.print(t[i][j]+" ");
		 System.out.println ();
		 }
	}
}
