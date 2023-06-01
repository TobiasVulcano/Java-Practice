
package ejercicioextra8;

/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse.*/

import java.util.Scanner;


public class EjercicioExtra8 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int newnum;
        int i = 0;
        int pares = 0;
        int impares = 0;
        do{
            do {
                System.out.println("Ingrese un numero entero");
                newnum = leer.nextInt();
            }while(newnum < 0);
            if (newnum % 2 == 0){
                pares = pares + 1;
            }else{
                impares = impares + 1;
            }
            i++;
            
        }while(newnum % 5 != 0);
        
        System.out.println("La cantidad de numeros leidos es: " +i+ ", la cantidad de numeros pares es: " +pares+ " y la de impares es: " +impares);
        
    }
    
}
