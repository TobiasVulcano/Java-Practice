
package ejercicioextra10;

/*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente.*/

import java.util.Scanner;


public class EjercicioExtra10 {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int intento;
        int uno = (int) (Math.random()*10);
        int dos = (int) (Math.random()*10);
        int respuesta = (int) (uno * dos);
        intento = ingresarPrimerRespuesta();
        while (intento != respuesta){
            intento = nuevoIntento();
        }
        if (intento == respuesta){
            System.out.println("Felicidades, acertaste el numero");
        }
    }
    
    public static int ingresarPrimerRespuesta(){
        Scanner leer = new Scanner(System.in);
        int intento;
        System.out.println("Ingrese su primer intento!");
        intento = leer.nextInt();
        return intento;
    }
    
    public static int nuevoIntento(){
         Scanner leer = new Scanner(System.in);
         int intento;
         System.out.println("Fallaste, intenta de nuevo");
         intento = leer.nextInt();
         return intento;
    }
}
