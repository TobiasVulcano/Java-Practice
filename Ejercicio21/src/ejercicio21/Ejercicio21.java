
package ejercicio21;

/*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.*/

import java.util.Scanner;


public class Ejercicio21 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz10 = new int [10][10];
        int[][] matriz3 = new int [3][3];
        matriz10 = llenarMatriz10();
        matriz3 = llenarMatriz3();
        mostrarMatriz10(matriz10);
        mostrarMatriz3(matriz3);
        analizarMatriz(matriz10,matriz3);
        
    }
    
     public static int[][] llenarMatriz10(){
        Scanner leer = new Scanner(System.in);
        int num;
        int[][] matriz = new int [10][10];
        for (int i = 0; i<10; i++){
            for (int j = 0; j<10; j++){
                do{
                System.out.println("Ingrese un valor entre 1 y 9 para la posicion: " +i +j);
                num = leer.nextInt();
                }while (num < 0 || num > 9);
                matriz[i][j] = num;
            }
        }
        return matriz;
    }
     
      public static int[][] llenarMatriz3(){
        Scanner leer = new Scanner(System.in);
        int num;
        int[][] matriz = new int [3][3];
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                do{
                System.out.println("Ingrese un valor entre 1 y 9 para la posicion: " +i +j);
                num = leer.nextInt();
                }while (num < 0 || num > 9);
                matriz[i][j] = num;
            }
        }
        return matriz;
    }
    
    public static void mostrarMatriz10(int[][] matriz10){
        for (int i = 0; i<10; i++){
            for (int j = 0; j<10; j++){
                System.out.print(matriz10[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    
    public static void mostrarMatriz3(int[][] matriz3){
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print(matriz3[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    
    public static void analizarMatriz(int[][] matriz10, int[][] matriz3){
        boolean contiene = false;
        int contienei = 0;
        int contienej = 0;
        for (int i = 0; i<10; i++){
            for (int j = 0; j<10; j++){
                if (contiene == false){
                    if (i<8 && j<8){
                    if (matriz10[i][j] == matriz3[0][0]){
                        if (matriz10[i+1][j] == matriz3[1][0]){
                            if (matriz10[i+2][j] == matriz3[2][0]){
                                if (matriz10[i][j+1] == matriz3[0][1]){
                                    if (matriz10[i][j+2] == matriz3[0][2]){
                                        if (matriz10[i+1][j+1] == matriz3[1][1]){
                                            if (matriz10[i+1][j+2] == matriz3[1][2]){
                                                if (matriz10[i+2][j+1] == matriz3[2][1]){
                                                        contiene = true;
                                                        contienei = i;
                                                        contienej = j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        if (contiene == true){
            System.out.println("La matriz 10x10 contiene la matriz 3x3 a partir de: " +contienei+ "," +contienej);
        }else
            System.out.println("La matriz 10x10 no contiene la matriz 3x3");
    }
}
