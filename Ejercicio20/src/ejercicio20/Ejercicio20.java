
package ejercicio20;

/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/

import java.util.Scanner;


public class Ejercicio20 {

  
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int[][] matriz = new int [3][3];
         matriz = llenarMatriz();
         mostrarMatriz(matriz);
         analizarMatriz(matriz);
         
    }
    
     public static int[][] llenarMatriz(){
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
     
      public static void mostrarMatriz(int[][] matriz){
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }
      
      public static void analizarMatriz(int[][] matriz){
          boolean magica = true;
          boolean fila = true;
          boolean columna = true;
          boolean diagonal = true;
          int sumaFil = 0;
          int sumaDia = 0;
          int aux1 = 0;
          int aux2 = 0;
          int aux3 = 0;
          int auxFil = 0;
          int auxFil2 = 0;
          
          for (int i = 0; i<3; i++){
              auxFil = sumaFil;
              sumaFil = 0;
              for (int j = 0; j<3; j++){
                  if (i == j){
                      sumaDia = sumaDia + matriz[i][j];
                  }
                  switch (i){
                      case 0:
                          aux1 = aux1 + matriz[i][j];
                          break;
                      case 1:
                          aux2 = aux2 + matriz[i][j];
                          break;
                      case 2:
                          aux3 = aux3 + matriz[i][j];
                          break;
                  }
                         sumaFil = sumaFil + matriz[i][j]; 
                  }
                          if (fila = true){
                          if (i >= 1){
                              if (sumaFil != auxFil){
                                  fila = false;
                              }
                          }
              }
          }
          if (aux1 == aux2 && aux1 == aux3){
              columna = true;
          }else
              columna = false;
          
          if (columna == true && sumaDia == aux1){
              diagonal = true;
          }else
              diagonal = false;
          
          if (columna == true && diagonal == true && fila == true && aux1 == auxFil){
              System.out.println("La matriz es magica");
          }else
              System.out.println("La matriz no es magica");
          
      }
}
     

