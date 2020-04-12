package Bucles;

import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		// Array de 5 elementos
		//SOlicitar los valores de los elementos
		//Multiplicarlos por 2
		//Mostrar Resultados
		//Mostrar la suma de todos por pares
		int Array []=new int[5];
		Scanner teclado= new Scanner(System.in);
		int i=0;
		int Suma=0;
		System.out.println("Introduzca los valores del Array");
        for(i=0;i<=4;i++) {
        	
            Array[i]=teclado.nextInt();
            
            System.out.println("Elemento: [ "+i +" ]="+"[ "+ Array[i]+" ]");
           
            }
        
        	 for(i=0;i<=4;i++) {
        		 Array[i]*=2;
        		 
        	 }
        	 for(i=0;i<=4;i++) {
        		 System.out.println("Elemento: [ "+i +" ]="+"[ "+ Array[i]+" ]");
        	 }
        	 for(i=1;i<=4;i+=2){
        		 
        		Suma =Array[i]+Suma;
        		System.out.println("Suma de los valores: "+Suma);
        	 }
        
        
        
        
        
        teclado.close();
	}

}
