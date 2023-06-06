
package ejercicioextra14;

/*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.*/

import java.util.Scanner;


public class EjercicioExtra14 {
    

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese la cantidad de familias que va a ser parte del programa");
         int familias = leer.nextInt();
         estudio(familias);
    }
    
    public static void estudio(int familias){
        Scanner leer = new Scanner(System.in);
        int hijos;
        int edad;
        int prom = 1;
        int suma = 0;
        int aux = 0;
        for (int i = 0; i < familias; i++){
            System.out.println("cuantos hijos tiene?");
            hijos = leer.nextInt();
            aux = aux + hijos;
            for (int j = 1; j < hijos + 1; j++){
                System.out.println("Ingrese la edad del hijo numero " +j);
                edad = leer.nextInt();
                suma = suma + edad;
               
            }  
        }
        prom = (int) (suma / aux);
        System.out.println("El promedio de edad de los hijos es: " +prom);
    }
}
