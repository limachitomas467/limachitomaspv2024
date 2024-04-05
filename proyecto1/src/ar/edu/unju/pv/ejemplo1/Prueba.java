package ar.edu.unju.pv.ejemplo1;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anio=2024;
		String saludo="hola programa visual";
     System.out.println(saludo + anio);
     
     if  (anio<=2024)
     {
    	 System.out.println("año correcto ");
    	 
     }
     else
     {System.out.println("año incorrecto");
     }
      int tamanio =saludo.length();
      
     for (int i=0; i<tamanio;i++)
     {
     System.out.println(saludo.charAt(i));
     }
     int indice = 0;
     while (indice < tamanio)
     {
     System.out.println(saludo.charAt(indice));
     indice++;
     }
     
     Scanner teclado = new Scanner(System.in);
     System.out.println("ingrese nombre");
     String nombre = teclado.next();
     System.out.println("hola"+ nombre);
     
    }

	

}
