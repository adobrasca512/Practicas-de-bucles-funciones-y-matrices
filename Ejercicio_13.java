package Bucles;
import java.util.Scanner;
public class Ejercicio_13 {

	public static void main(String[] args) {
		//  Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el
		//penúltimo, el tercero, etc.
		 Scanner teclado = new Scanner (System.in);
		 int Array[]= new int [10];
		 System.out.println("Introduzca los valores");
	     for(int i=0;i<Array.length;i++) {
	    	 Array[i]=teclado.nextInt();
	     }
	     // 0 1 2 3 4 5 6 7 8 9 
	     // 0 9 1 8 2 7 3 6 4 5
	  
	    	 for(int x=0;x<Array.length;x++) {
		    	 System.out.print(Array[x]);
		    	 System.out.print(Array[9-x]);
	    		
	    	 }
	    	 System.out.println();
		     
		   teclado.close();
	    }
	  

}
