
package ejercicio12;

/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas.*/

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String frase = "A";
    String inicio = "X";
    String fin = "O";
    int lecturasCorrectas = 0;
    int lecturasIncorrectas = 0;
    do {
        System.out.println("Ingrese una cadena");
        frase = leer.nextLine();
        int longitud = frase.length();
        String primLetra = frase.substring(0,1);
        String ultLetra = frase.substring(longitud - 1);
        if (longitud == 5 && primLetra.equals(inicio) && ultLetra.equals(fin))
            lecturasCorrectas = lecturasCorrectas + 1;
            else
            lecturasIncorrectas = lecturasIncorrectas + 1;
        
         } while (!"&&&&&".equals(frase));
    
        System.out.println("La cantidad de veces que se ingreso una cadena correcta fue: " + lecturasCorrectas);
        System.out.println("La cantidad de veces que se ingreso una cadena incorrecta fue: " + lecturasIncorrectas);
    
    }
    
}
