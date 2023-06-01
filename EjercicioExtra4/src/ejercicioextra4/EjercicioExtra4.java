
package ejercicioextra4;

/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.*/

import java.util.Scanner;


public class EjercicioExtra4 {


    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         String numRom;
         System.out.println("Ingrese un numero");
         int num = leer.nextInt();
         numRom = numeroRomano(num);
         System.out.println("El numero romano correspondiente a " +num+ " es: " +numRom);
    }
    
    public static String numeroRomano(int num){
        String numRom;
        switch (num){
            case 1:
                numRom = "I";
                break;
            case 2:
                numRom = "II";
                break;
            case 3:
                numRom = "III";
                break;
            case 4:
                numRom = "IV";
                break;
            case 5:
                numRom = "V";
                break;
            case 6:
                numRom = "VI";
                break;
            case 7:
                numRom = "VII";
                break;
            case 8:
                numRom = "VIII";
                break;
            case 9:
                numRom = "IX";
                break;
            case 10:
                numRom = "X";
                break;
            default:
                numRom = "Error";
                break;
        }
        return numRom;
    }
}
