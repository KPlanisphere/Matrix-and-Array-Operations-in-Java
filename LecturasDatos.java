//------------> LecturasDatos

import java.util.Scanner;

class LecturasDatos{
	
	public static void main(String[] args){
		Scanner sc1 = new Scanner(System.in); //SCANNER EXCLUSIVO PARA NUMEROS
		Scanner sc2 = new Scanner(System.in); //SCANNER EXCLUSIVO PARA CADENAS
		String cadena;
		
		int n1;
		double n2;
		
		System.out.println("Programa de prueba");
		System.out.print("Dame una cadena: ");
		
		cadena = sc2.nextLine();
		System.out.print("Dame un dato de tipo entero: ");
		n1 = sc1.nextInt();
		System.out.print("Dame un dato de tipo double: ");
		n2 = sc1.nextDouble();
		
		System.out.println("\nLos datos ingresados son: ");
		System.out.println(cadena + "\n" + n1 + "\n" + n2);
		
	}//FIN MAIN
	
}//FIN CLASE LecturaDatos
