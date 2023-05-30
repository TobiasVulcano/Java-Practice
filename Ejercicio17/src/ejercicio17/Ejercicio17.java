
package ejercicio17;

/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/

import java.util.Scanner;


public class Ejercicio17 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int lon = leer.nextInt();
        int[] vector = llenarVector(lon);
        analizarVector(vector, lon);
        
    }
    public static int[] llenarVector (int lon){
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[lon];
        int num;
        for (int i = 0; i < lon; i++){
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            vector[i] = num;
        }
        return vector;
    }
    
    public static void analizarVector(int[] vector, int lon){
        int onedigit = 0;
        int twodigit = 0;
        int threedigit = 0;
        int fourdigit = 0;
        int fivedigit = 0;
        for (int i = 0; i < lon; i++){
            if (vector[i] < 10 && vector[i] > 0){
                onedigit = onedigit + 1;
            }else if (vector[i] > 9 && vector[i] <100){
                twodigit = twodigit + 1;
            }else if (vector[i] > 99 && vector[i] < 1000){
                threedigit = threedigit + 1;
            }else if (vector[i] > 999 && vector[i] < 10000){
                fourdigit = fourdigit + 1;
            }else if (vector[i] > 9999 && vector[i] < 100000){
                fivedigit = fivedigit + 1;
            }
            
    }
        System.out.println("En el vector habian " +onedigit+ " numeros de un digito, " +twodigit+ " numeros de dos digitos, " +threedigit+ " numeros de tres digitos, " +fourdigit+ " numeros de cuatro digitos y " +fivedigit+ " numeros de cinco digitos");
        
}
}
