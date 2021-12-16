public class Promedio{
    public static void main (String arg[]){
        double materia1 = 5; /* matematicas */
        double materia2 = 8; /* biologia*/
        double materia3 = 7; /* quimica */

        double promedio = 0;

        promedio = (materia1 + materia2 + materia3)/3;

        System.out.println("El promedio es: " + promedio);

        if(promedio >= 6){
            System.out.println("El alumno aprobó con: " + promedio);

        } else {
            System.out.println("El alumno reprobó con: " + promedio);
        }


    }
}