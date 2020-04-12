package Matrices;

public class Ejercicio_8_M {

	public static void main(String[] args) {
		// Hacer lo mismo que el ejercicio anterior, pero con una matriz 9x9x9. Creamos un cubo con las caras
		//puestas a 1 y el interior a 0.
		int t[][][];
		 int i,j,k;
		 t = new int[9][9][9];
		 for (i=0;i<9;i++){
		 for (j=0;j<9;j++){
		 for (k=0;k<9;k++){
		 if(i==0 || i==8 || j==0 || j==8 || k==0 || k==8)
		 // si estamos en la primera o última columna, fila o capa de la matriz
		 t[i][j][k]=1;
		 }
		 }
		 }
		 // Mostramos la matriz capa a capa
		 System.out.println("Matriz: ");
		 for (i=0;i<9;i++)
		 {
		 System.out.println("Capa: " +i);
		 for (j=0;j<9;j++)
		 {
		 for (k=0;k<9;k++)
		 {
		 System.out.print(t[i][j][k] + " ");
		 }
		 System.out.println ();
		 }
		 System.out.println (" -------------- ");
		 }
	}

}
