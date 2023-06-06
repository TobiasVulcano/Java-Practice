
package ejercicioextra15;

/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.*/

import java.util.Scanner;


public class EjercicioExtra15 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int resultado = 0;
        boolean error = false;
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("Que operacion quiere realizar? (S/R/M/D)");
        String operacion = leer.next();
        if(operacion.equalsIgnoreCase("S")){
            resultado = suma(num1, num2);
        }else if (operacion.equalsIgnoreCase("R")){
            resultado = resta(num1, num2);
        }else if (operacion.equalsIgnoreCase("M")){
            resultado = multiplicacion(num1, num2);
        }else if (operacion.equalsIgnoreCase("D")){
            resultado = division(num1, num2);
        }else {
            System.out.println("Error en la operacion seleccionada");
            error = true;
        }
        
        if (error == false){
            System.out.println("El resultado de la operacion es: " +resultado);
        }
    }
    
    public static int suma (int num1, int num2){
        int resultado;
        resultado = (int) (num1 + num2);
        return resultado;
    }
    
    public static int resta (int num1, int num2){
        int resultado;
        resultado = (int) (num1 - num2);
        return resultado;
    }
    
    public static int multiplicacion (int num1, int num2){
        int resultado;
        resultado = (int) (num1 * num2);
        return resultado;
    }
    
    public static int division (int num1, int num2){
        int resultado;
        resultado = (int) (num1 / num2);
        return resultado;
    }
    
}
