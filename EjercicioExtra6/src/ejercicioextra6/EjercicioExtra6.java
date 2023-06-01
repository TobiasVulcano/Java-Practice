
package ejercicioextra6;

/*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.*/

import java.util.Scanner;


public class EjercicioExtra6 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cuantas personas va a ingresar");
        int cant = leer.nextInt();
        calcularProm(cant);
        
    }
    
    public static void calcularProm (int cant){
        Scanner leer = new Scanner(System.in);
        double prom = 0;
        double promBajo = 0;
        double estatura;
        int cont = 0;
        int cont2 = 0;
        for (int i = 1; i < cant + 1; i++){
            System.out.println("Ingrese la estatura de la persona numero " +i);
            estatura = leer.nextDouble();
            if (estatura < 1.60){
                cont = cont + 1;
                promBajo = promBajo + estatura;   
        }else{
                cont2 = cont2 + 1;
                prom = prom + estatura;
                }
        }
        promBajo = promBajo / cont;
        prom = prom / cont2;
        
        
        System.out.println("El promedio de la estatura es: " +prom+ " y el promedio de estatura menor a 1.60 es: " +promBajo);
    
}
} 
