/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracursoopenwebinars;

import java.util.Scanner;

/**
 *
 * @author Morad
 */
public class Calculadora {

	public static void main(String[] args) {
		
		int opcion = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			//imprimimos por consola el menu
			
			System.out.println("\n"); //caracter para  linea en blanco.
			System.out.println("*********CALCULADORA MORAD**********");
			System.out.println("1.Sumar");
			System.out.println("2.Restar");
			System.out.println("3.Multiplicar");
			System.out.println("4.Dividir");
			System.out.println("5.Resto");
			System.out.println("0.Salir del programa");
			System.out.println("Introduzca opcion valida");
			
			opcion= sc.nextInt();
			
			//si la opcion es menor que 0 o mayor que 5 no es una opcion valida.
			
			if(opcion  < 0 || opcion >5 ) {
				System.out.println("Opcion no valida, vuelva a escoger");
				//si la opcion es diferente a cero, solicitamons dos operaciones.
				
			}else if(opcion!=0) {
				System.out.println("\n");
				float operando1, operando2;
				
				System.out.println("Introduzca el primer operando: ");
				operando1= sc.nextFloat();
				
				System.out.println("Introduzca el segundo operando: ");
				operando2= sc.nextFloat();
				
				switch(opcion){
				
				case 1: //suma
					System.out.println("El resultado de la suma es "+ (operando1+ operando2));
					break;
					
				
				case 2: //resta
					System.out.println("El resultado de la suma es "+ (operando1 - operando2));
					break;
				
				case 3: //Multiplicacion
					System.out.println("El resultado de la multiplicacion "+ (operando1 * operando2));
					break;
					
					
				case 4: //division
					System.out.println("El resultado de la suma es "+ (operando1 / operando2));
					break;
					
				case 5: //Resta
					System.out.println("El resto de dividir " + operando1 + " entre " + operando2 + " es " + operando1%operando2);
					break;
				
				
				}
				
				
				
				
			}
			
		}while(opcion!=0);
		
		sc.close();
		
		System.out.println("Finalizacion la ejecucion de la calculadora");
		
		

	}

}
