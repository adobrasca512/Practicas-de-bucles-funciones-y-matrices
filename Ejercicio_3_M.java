package Matrices;

import java.util.Scanner;

public class Ejercicio_3_M {

	public static void main(String[] args) {
		//Crear y cargar una tabla de tamaño 3x3, trasponerla y mostrarla.
		int t[][]=new int[3][3];
		Scanner teclado=new Scanner(System.in);
		int aux;
		 for (int i=0;i<3;i++){
		 for (int j=0;j<3;j++){
		 System.out.print("Introduzca elemento["+i+"]["+j+"]: ");
		 t[i][j]=teclado.nextInt();
		 }
		 }
		 // mostramos la matriz original
		 System.out.print ("Matriz original:");
		 for (int i=0;i<3;i++){
		 System.out.println();
		 for (int j=0;j<3;j++){
		 System.out.print(t[i][j]+" ");
		 }
		 }
		 // trasponemos la matriz
		 // no podemos transponer todos los elementos. Un ejemplo el elemento t[1][2]
		 // se convierte en el [2][1]... pero cuando transpongamos el elemento [2][1] se convierte
		 // en el [1][2]. Al intercambiar dos veces los elemento, la matriz se quedaría exactamente igual.
		 // solo traspondremos los elementos por debajo de la diagonal principal.
		 for (int i=1;i<3;i++){
		 for (int j=0;j<i;j++){
		 aux=t[i][j];
		 t[i][j]=t[j][i];
		 t[j][i]=aux;
		 }
		 }
		// mostramos la matriz transpuesta
		 System.out.println();
		 System.out.println("---------------------");
		 System.out.println ("Matriz transpuesta");
		 for (int i=2;i>=0;i--){
		 System.out.println();
		 for (int j=0;j<3;j++){
		 System.out.print(t[i][j]+" ");
		 }
		 }
		 teclado.close();
	}

}
