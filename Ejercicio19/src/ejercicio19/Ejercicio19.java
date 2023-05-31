
package ejercicio19;

/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/

import java.util.Scanner;


public class Ejercicio19 {


   public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int[][] matriz = new int [4][4];
         matriz = llenarMatriz();
         mostrarMatriz(matriz);
         mostrarInversa(matriz);
         analizarSimetria(matriz);
         
    }
    
    
    public static int[][] llenarMatriz(){
        Scanner leer = new Scanner(System.in);
        int num;
        int[][] matriz = new int [4][4];
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                System.out.println("Ingrese el valor para: " +i +j);
                num = leer.nextInt();
                matriz[i][j] = num;
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
    
    public static void analizarSimetria(int[][] matriz){
        boolean antisimetria = true;
        
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                if (antisimetria = true){
                if (matriz[i][j] == -(matriz[j][i])){
                    antisimetria = true;
                }else
                    antisimetria = false;       
        }
    }
    }
        System.out.println("La matriz es antisimetrica? " +antisimetria);
}
}
