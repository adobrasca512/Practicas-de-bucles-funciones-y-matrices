package Matrices;

import java.util.Scanner;

public class Ejercicio_10_M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Se pretende realizar un programa para gestionar la lista de participaciones en una competición de
salto de longitud. El número de plazas disponible es de 10. Sus datos se irán introduciendo en el
mismo orden que vayan inscribiéndose los atletas. Diseñar el programa que muestre las siguientes
opciones
 */
		Scanner teclado=new Scanner(System.in);
		final int TAM=10,D=0,M0=1,M1=2,M2=3;
		 // TAM: Número máximo de participantes
		 // D: número de dorsal
		 // M0, M1, M2: Marca del 2000, 2001, y 2002

		 int opc,numc,dorsal,i,aux;
		 boolean d_rep,inter;
		 int part[][]=new int[TAM][4];
		 numc=0;
		 opc=0;
		 do{
			 System.out.println();
			 System.out.println("--------------------------------");
			 System.out.println("1. Inscribir participantes");
			 System.out.println("2. Mostrar listado por datos");
			 System.out.println("3. Mostrar listado por marcas");
			 System.out.println("4. Salir");
			 System.out.println("--------------------------------");
			 System.out.print("Por favor, introduzca una opción: ");
			 opc=teclado.nextInt();
			 System.out.println();
			 switch(opc){
			 case 1:
			 if(numc==20)
			 System.out.println("Listado completo");
			 else{
			 do{
			 System.out.print("Introduzca dorsal: ");
			 dorsal=teclado.nextInt();
			 d_rep=false;
			 i=0;
			 while(i<numc && d_rep==false){
			 if(part[i][D]==dorsal){
			 System.out.print("Dorsal registrado.");
			 System.out.println("Por favor intente de nuevo");
			 d_rep=true;
			 }
			 i++;
			 }
			 }while(d_rep==true);
			 if(d_rep==false){
			 part[numc][D]=dorsal;
			 System.out.print("Introduzca marca del 2000: ");
			 part[numc][M0]=teclado.nextInt();
			 System.out.print("Introduzca marca del 2001: ");
			 part[numc][M1]=teclado.nextInt();
			 System.out.print("Introduzca marca del 2002: ");
			 part[numc][M2]=teclado.nextInt();
			 System.out.println();
			 numc++;
			 }
			 }
			 break;
			 case 2: // método de ordenación por burbuja, controlado por intercambio
			 inter=true;
			 while(inter==true){
			 inter=false;
			 for (int j=0;j<=numc-1-1;j++){
			 if(part[j][D]>part[j+1][D]){
			 for (int k=0;k<4;k++){
			 aux=part[j][k];
			 part[j][k]=part[j+1][k];
			 part[j+1][k]=aux;
			 }
			 inter=true;
			 }
			 }
			 }
			 System.out.println("LISTADO DE DATOS,SEGUN DORSAL:");
			 System.out.println ("dorsal - marcas");
			 for (int j=0;j<numc;j++){
			 System.out.println();
			 for (int k=0;k<4;k++){
			 System.out.print(part[j][k]+" ");
			 }
			 }
			 break;
			 case 3:
				 inter=true;
				 while(inter==true){
				 inter=false;
				 for (int j=0;j<=numc-1-1;j++){
				 if(part[j][M2]>part[j+1][M2]){
				 for (int k=0;k<4;k++){
				 aux=part[j][k];
				 part[j][k]=part[j+1][k];
				 part[j+1][k]=aux;
				 }
				 inter=true;
				 }
				 }
				 }
				 System.out.println("LISTADO POR MARCAS :");
				 System.out.println ("dorsal - marcas");
				 for (int j=0;j<numc;j++){
				 System.out.println();
				 for (int k=0;k<4;k++){
				 System.out.print(part[j][k]+" ");
				 }
				 }
				 break;
				 }
				 }
				 while(opc!=4);
		 teclado.close();
				 
	}

}
