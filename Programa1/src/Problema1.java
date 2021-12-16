/* Problema 1, control Vacacional de empleados */

import java.util.Scanner;


public class Problema1 {
    public static void main(String args[]){

        String clave1 = "Departamento de Atención a Cliente";
        String clave2 = "Departamento de Logística";
        String clave3 = "Gerencia";

        Scanner entrada = new Scanner(System.in);
        int clave = 0;
        int años = 0;
        String nombre = "";

        System.out.println("¿Cuál es el nombre del empleado?");
        nombre = entrada.nextLine();

        System.out.println("¿En qué departamento está?");
        clave = entrada.nextLine();

        System.out.println("¿Cuántos años lleva trabajando en la empresa?");
        años = entrada.nextLine();

        if (clave == 1){
            if (años == 1){
                System.out.println("El empleado "+nombre+" tiene derecho ");
            }
        } else if (clave == 2){

        } else if (clave == 3){

        } else{
            System.out.println("No existe ese departamento.");
        }

    }
}
