package Matrices;

public class Ejercicio_7_M {

	public static void main(String[] args) {
		// Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0 salvo los de los bordes que
		//deben ser 1. Mostrarla.
		int i,j;
		 int t[][];

		 t = new int[8][6]; // se inicializa toda la tabla a 0.
		 // rellenamos la matriz marco
		 for (i=0;i<8;i++)
		 for (j=0;j<6;j++) {
		 if(i==0 || i==7) // si nos encontramos en la primera o última columna
		 t[i][j]=1;
		 if(j==0 || j==5) // si nos encontramos en la primera o última fila
		 t[i][j]=1;
		 }

		 System.out.print("Matriz marco: ");
		 for (i=0;i<8;i++){
		 System.out.println();
		 for (j=0;j<6;j++){
		 System.out.print (t[i][j]+" ");
		 }
		 }
		 System.out.println ();
	}

}
