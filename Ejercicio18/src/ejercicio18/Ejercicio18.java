
package ejercicio18;

/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).*/

import java.util.Scanner;


public class Ejercicio18 {


    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int[][] matriz = new int [4][4];
         matriz = llenarMatriz();
         mostrarMatriz(matriz);
         mostrarInversa(matriz);
         
         
    }
    
    
    public static int[][] llenarMatriz(){
        int[][] matriz = new int [4][4];
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                matriz[i][j] = (int) (Math.random()* 10);
            }
        }
        return matriz;
    }
    
    public static void mostrarMatriz(int[][] matriz){
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    
    public static void mostrarInversa(int[][] matriz){
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                System.out.print(matriz[j][i]+ " ");
            }
            System.out.println("");
        }
        
    }
} 

