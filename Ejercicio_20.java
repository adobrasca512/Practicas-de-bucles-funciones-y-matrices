package Bucles;

import java.util.Scanner;

public class Ejercicio_20 {

	public static void main(String[] args) {
		// Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar (fusionar) las dos tablas en
		//una tercera, de forma que sigan ordenados.
		int a[], b[], c[];
		 int i,j,k;
Scanner teclado=new Scanner(System.in);

		 a =new int[10];
		 b =new int[10];
		 // leemos a
		 System.out.println("Datos para a:");
		 for (i=0;i<10;i++){
		 System.out.print("Introduzca numero (orden creciente): ");
		 a[i]=teclado.nextInt();
		 }
		 // leemos b
		 System.out.println("\nDatos para b:");
		 for (i=0;i<10;i++){
		 System.out.print("Introduzca numero (orden creciente): ");
		 b[i]=teclado.nextInt();
		 }
		 System.out.println();
		 // creamos c
		 c = new int [20];
		 // comenzamos a fusionar a y b en c
		 i=0; // utilizaremos i como índice de a;
		 j=0; // utilizaremos j como índice de b;
		 k=0; // utilizaremos k como índice de c
		 while(i<10 && j<10)
		 {
		 if (a[i] < b[j]) // nos interesa el elemento de a
		 {
		 c[k] = a[i];
		 i++; // incrementamos i para tomar el siguiente elemento de a
		 }
		 else
		 {
		 c[k] = b[j];
		 j++; // incrementamos j para tomar el siguiente elemento de b
		 }
		 k++; // como hemos copiado a c[k], incrementamos k, para
		 // en la siguiente vuelta, utilizar el siguiente hueco de la tabla
		 }
		 // cuando salimos de while es por que alguna de las tablas (a o b) ha llegado al final
		 if(i==10) // hemos copiado toda la tabla a en c, queda por copiar un resto de b
		 while (j<10)
		 {
		 c[k] = b[j];
		 j++;
		 k++;
		 }
		 else // hay que copiar el resto de a en c
		 while (i<10)
		 {
			 c[k] = a[i];
			 i++;
			 k++;
			 }
			 System.out.println("Mostramos la tabla c:");
			 for (k=0;k<20;k++)
			 System.out.print(c[k] + " ");
			 System.out.println("");
			 teclado.close();
	}

}
