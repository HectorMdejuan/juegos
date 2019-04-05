package version1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {
	static BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
	
	
	
	public static int menu() throws NumberFormatException, IOException {
		int opc;
		do {
			System.out.println("1.-Crear Arrays y rellenar");
			System.out.println("2.-Entregar videojuego o serie");
			System.out.println("3.-Contar Series y Juegos ");
			System.out.println("4.-Videojuegos con mas horas estimadas  y serie con mas temporadas. Con toda información.");
			System.out.println("5.-Salir");
			opc=Integer.parseInt(leer.readLine());
		}while(opc<1||opc>5);
		return opc;
	}
	
	public static void main(String [] args) throws NumberFormatException, IOException {
		
		int opc;
		do {
			opc=menu();
			switch(opc) {
			case 1: 
			}
		}while(opc!=5);
		
		
	}
}
