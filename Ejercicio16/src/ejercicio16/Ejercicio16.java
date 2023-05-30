
package ejercicio16;

/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/

import java.util.Scanner;


public class Ejercicio16 {


    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int[] vector;
        System.out.println("Ingrese el tamaño del vector");
       int lon = leer.nextInt();
       vector = llenarVector(lon);
       analizarVector(vector, lon);
       mostrarVector(vector, lon);
    }
    
    public static int[] llenarVector(int lon) {
        int [] vector = new int [lon];
        for (int i = 0; i < lon; i++){
            vector[i] = (int)(Math.random()*10);
        }
         return vector;
}
    
    public static void analizarVector(int[] vector, int lon){
        Scanner leer = new Scanner(System.in);
        boolean rep = false;
        boolean rep2 = false;
        int found = 0;
        System.out.println("Ingrese el numero a buscar");
        int num = leer.nextInt();
        
        for (int i = 0; i < lon; i++){
            if (rep == false){
            if (vector[i] == num){
                rep = true;
                found = i ;
            }}
            if (rep == true && vector[i] == num){
                rep2 = true;
            }}
        if (rep == true && rep2 == true){
            System.out.println("El numero esta en el vector y se encuentra en la posicion: " +found+ " Tambien se encuentra repetido");
        }else if(rep == true && rep2 == false){
            System.out.println("El numero esta en el vector y se encuentra en la posicion: " +found+ " No se encuentra repetido");
        }else
            System.out.println("El numero no se encuentra en el vector");
    }
    
    public static void mostrarVector (int[] vector, int lon){
        for (int i = 0; i < lon; i++){
            System.out.print(vector[i]+ ",");
        }
    
}
}
