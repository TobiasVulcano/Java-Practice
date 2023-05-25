
package ejercicio13;

/* Dibujar un cuadrado de N elementos por lado utilizando el carácter “*” */

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de lados");
        int lados = leer.nextInt();
        for (int i = 0; i < lados ; i++){
            for (int j = 0; j < lados; j++){
                if (i == 0 || i == lados - 1 || j == 0 || j == lados - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                
            }
            System.out.println(" ");
        }
        
    }
    
}
