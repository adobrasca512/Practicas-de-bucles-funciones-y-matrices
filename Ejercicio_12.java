package Bucles;

import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {
		//  Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media
		// de los negativos y contar el número de ceros.
    Scanner teclado=new Scanner (System.in);
    int Array[]= new int [5];
    int cont_positivos = 0;
    int cont_negativos = 0;
    int Sumar_Positivos=0;
    int Sumar_Negativos=0;
    int cont_cero=0;
    System.out.println("Elementos a introducir: ");
    for(int i=0;i<Array.length;i++) {
    	System.out.print("Introduzca elemento "+i +": ");
    	Array[i]=teclado.nextInt();
    
    	
    	
    }
    
	for(int i=0;i<Array.length;i++) {
		if(Array[i]==0) {
   		
   		 cont_cero++;
   	}
   	else if(Array[i]>0) {
	
	Sumar_Positivos+=Array[i];
	cont_positivos++;
}
else if(Array[i]<0) {
	
	Sumar_Negativos+=Array[i];
	cont_negativos++;
	
}

	}
	if (cont_positivos==0) {
    	System.out.println("No se puede realizar la suma");
    }
     else {
    	 System.out.println("El resultado de la media es: "+Sumar_Positivos/cont_positivos);
     }
    
	if(cont_negativos==0) {
    	 System.out.println("No se puede realizar la suma");
     }
     else {
    	 System.out.println("El resultado de la media es: "+Sumar_Negativos/cont_negativos);
     }
	System.out.println("La cantidad de cero es de: " + cont_cero);
	teclado.close();
	}
	

}
