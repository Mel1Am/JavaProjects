/* Operaciones
    Programa basico de calculadora.
    Condiciones If y Else If
    Entrada de Usuario.
*/

import java.util.Scanner;

public class Calculadora{
    public static void main (String arg[]){

        /* Valores de Entrada */
        int num_uno = 0, num_dos = 0, resultado = 0;

        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        System.out.println("¿Qué operación quieres realizar?\n Suma (1)\n Resta (2)\n Multiplicacion (3)\n Division (4)\n");
        
        opcion = entrada.nextInt();

        System.out.println("Dame el primer valor: ");
        num_uno = entrada.nextInt();

        System.out.println("Dame el segundo valor: ");
        num_dos = entrada.nextInt();

        if(opcion == 1 ){
            resultado = num_uno + num_dos;
            System.out.println("El resultado de la Suma es: " + resultado);

        } else if (opcion == 2 ){
            resultado = num_uno - num_dos;
            System.out.println("El resultado de la Resta es: " + resultado);
        } else if (opcion == 3 ){
            resultado = num_uno *num_dos;
            System.out.println("El resultado de la Multiplicacion es: " + resultado);
        } else if (opcion == 4 ){
            resultado = num_uno/num_dos;
            System.out.println("El resultado de la Division es: " + resultado);
        } else {
            System.out.println("La opción no existe");
        }
    


    }
}