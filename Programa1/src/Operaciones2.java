/* Este programa usa un switch-case para hacer un calculadora simple */
import java.util.Scanner;

public class Operaciones2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanne(System.in);
        int num_uno = 0, num_dos = 0, resultado = 0;
        int parametro = 0;

        System.out.println("Esta es una calculadora con Switch-Case\n Suma (1) \n Resta\n Multiplicacion (3)\n Division (4)\n");
        parametro = entrada.nextInt();
        
        System.out.println("Dame el primer numero: ");
        num_uno = entrada.nextInt();

        System.out.println("Dame el segundo numero: ");
        num_dos = entrada.nextInt();
        
        switch(parametro){
            case 1: resultado = num_dos + num_dos;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2: resultado = num_dos + num_dos;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 3: resultado = num_dos + num_dos;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 4: resultado = num_dos + num_dos;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            default: resultado = num_dos + num_dos;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
        }
    }
}
