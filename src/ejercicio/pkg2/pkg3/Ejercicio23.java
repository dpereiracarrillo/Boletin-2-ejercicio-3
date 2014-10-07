
package ejercicio.pkg2.pkg3;

import java.util.Scanner;


public class Ejercicio23 {

  
    public static void main(String[] args) {
        
      double euros, cambio;
      System.out.println("Introducir cantidad euros:");
         Scanner dato = new Scanner(System.in);
         euros=(int) dato.nextDouble();
        
        System.out.println("Introducir cambio euros/dolar 1:");
        cambio= dato.nextDouble();
        
        System.out.println("Usted tendria:" + euros*cambio + " dolares");
    
    }
    
}
