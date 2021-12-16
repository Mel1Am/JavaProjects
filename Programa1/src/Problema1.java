/* Problema 1, control Vacacional de empleados */

import java.util.Scanner;


public class Problema1 {
    public static void main(String args[]){

        /*
        String clave1 = "Departamento de Atención a Cliente";
        String clave2 = "Departamento de Logística";
        String clave3 = "Gerencia";
        */

        Scanner entrada = new Scanner(System.in);
        int clave = 0;
        int años = 0;
        String nombre = "";

        System.out.println("******************************************************\n Bienvenido al Sistema de Asignación de Vacaciones de Coca-Cola\n ********************************\n");

        System.out.println("¿Cuál es el nombre del empleado?");
        nombre = entrada.nextLine();

        System.out.println("¿En qué departamento está?\n Departamento de Atención a Cliente (1)\n Departamento de Logística (2)\n Gerencia (3)\n");
        clave = entrada.nextInt();

        System.out.println("¿Cuántos años lleva trabajando en la empresa?");
        años = entrada.nextInt();

        if (clave == 1){
            if (años == 1){
                System.out.println("El empleado "+nombre+" tiene derecho a 6 días de vacaciones.");
            }
            else if (años >= 2 && años <= 6){
                System.out.println("El empleado "+nombre+" tiene derecho a 14 días de vacaciones.");
            }
            else if (años >= 7){
                System.out.println("El empleado "+nombre+" tiene derecho a 20 días de vacaciones.");
            } else {
                System.out.println("El empleado "+nombre+" no tiene derecho a días de vacaciones.");
            }
        } else if (clave == 2){
            if (años == 1){
                System.out.println("El empleado "+nombre+" tiene derecho a 7 días de vacaciones.");
            }
            else if (años >= 2 && años <= 6){
                System.out.println("El empleado "+nombre+" tiene derecho a 15 días de vacaciones.");
            }
            else if (años >= 7){
                System.out.println("El empleado "+nombre+" tiene derecho a 22 días de vacaciones.");
            } else {
                System.out.println("El empleado "+nombre+" no tiene derecho a días de vacaciones.");
            }

        } else if (clave == 3){
            if (años == 1){
                System.out.println("El empleado "+nombre+" tiene derecho a 10 días de vacaciones.");
            }
            else if (años >= 2 && años <= 6){
                System.out.println("El empleado "+nombre+" tiene derecho a 20 días de vacaciones.");
            }
            else if (años >= 7){
                System.out.println("El empleado "+nombre+" tiene derecho a 30 días de vacaciones.");
            } else {
                System.out.println("El empleado "+nombre+" no tiene derecho a días de vacaciones.");
            }
        } else{
            System.out.println("No existe ese departamento.");
        }

    }
}
