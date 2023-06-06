
package ejercicioextra9;

/*Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.*/

import java.util.Scanner;


class EjercicioExtra9 {
    

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese el dividendo y el divisor");
         int dividendo = leer.nextInt();
         int divisor = leer.nextInt();
         restasSucesivas(dividendo, divisor);
         

    }
    
    public static void restasSucesivas (int dividendo, int divisor){
        int auxDividendo = dividendo;
        int auxDivisor = divisor;
        int cociente = 0;
        while (auxDividendo >= auxDivisor){
            auxDividendo = (int) (auxDividendo - auxDivisor);
            cociente = cociente + 1;
        }
        
        System.out.println("El cociente de la division entre " +dividendo+ " y " +divisor+ " es: " +cociente+ " y el resto es: " +auxDividendo);
        
    }
    
    
}
