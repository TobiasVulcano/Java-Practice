
package ejercicioextra1;

/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/

import java.util.Scanner;


public class EjercicioExtra1 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los minutos");
        int min = leer.nextInt();
        calcularDias(min);
        
        
        
    }
    
    
    public static void calcularDias (int min){
        int dias = 0;
        int horas;
        int aux;
        horas = (int) (min / 60);
        while (horas >= 24){
            dias = dias + 1;
            horas = horas - 24;
        }
        
        System.out.println(min+ " minutos son: " +dias+ " dias y " +horas+ " horas");
    }
}
