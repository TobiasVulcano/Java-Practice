
package ejercicio10;

/*10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int suma = 0;
        System.out.println("Ingrese un valor limite");
        int limite = leer.nextInt();
        while (suma < limite){
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            suma = suma + num;
            System.out.println("La suma actual es: " + suma);
    }
        
}
}
