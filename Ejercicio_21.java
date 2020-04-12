package Bucles;

import java.util.Scanner;

public class Ejercicio_21 {

	public static void main(String[] args) {
		//  Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se debe mostrar la posición en que
		//se encuentra. Si no está, indicarlo con un mensaje.
		int t[]=new int[10];
		Scanner teclado=new Scanner(System.in);
		 int num,j;
		 for (int i=0;i<10;i++){
		 System.out.print("Introduzca numero (orden creciente): ");
		 t[i]=teclado.nextInt();
		 }
		 System.out.println();
		 System.out.println("Introduzca numero a buscar: ");
		 num=teclado.nextInt();
		 j=0;
		 while(j<10 && t[j]<num){
		 j++;
		 }
		 // cuando me salgo del mientras puede ser por dos motivos:
		 // - que j llegue a 10 ó
		 // - que encuentre el donde iría num en la tabla
		 if(j==10) // hemos llegado al final y no hemos encontrado nada.
		 System.out.println("No encontrado");
		 else{
		 // si t[j] < num, hemos sobrepasado el lugar donde debería estar num, sin encontrarlo
		 if(t[j]==num) // num está en la posición i. Entonces si está ahí
		 System.out.println("Encontrado en la posición " + j);
		 else
		 System.out.println("No encontrado");
		 }
		 teclado.close();
	}

}
