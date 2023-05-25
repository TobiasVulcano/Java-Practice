
package ejercicio11;

/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.*/

import java.util.Scanner;

public class Ejercicio11 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean menu = true;
        System.out.println("Ingrese dos numeros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        do {
        System.out.println("Menu");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija opcion:");
        int opcion = leer.nextInt();
        switch (opcion){
           case 1:
                caso1(num1, num2);
                break;
                case 2:
                   caso2(num1, num2);
                    break;
                    case 3:
                        caso3(num1, num2);
                        break;
                        case 4:
                            caso4(num1, num2);
                            break;
                            case 5:
                               menu = salirPrograma(menu);
                                break;
                                
        }}while (menu == true);
    
}
    public static void caso1 (int num1, int num2){
        System.out.println(num1+num2);

}
    
    public static void caso2 (int num1, int num2) {
        System.out.println(num1-num2);
    }

    public static void caso3 (int num1, int num2){
        System.out.println(num1*num2);
    }
    
    public static void caso4 (int num1, int num2){
        System.out.println(num1/num2);
    }
    
    
    public static boolean salirPrograma(boolean menu){
        Scanner leer = new Scanner(System.in);
        String salir = "S";
        System.out.println("¿Esta seguro que desea salir del programa? (S/N)");
        String eleccion = leer.nextLine();
        if (eleccion.equals(salir))
            menu = false;
        else
            menu = true;
        return menu;}

        














   }