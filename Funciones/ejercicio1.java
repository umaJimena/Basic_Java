package Funciones;
import java.util.Scanner;

public class ejercicio1 {
//Escribe un programa que solicite la nota de las diferentes asignaturas del ciclo
//(BBDD, PROG, F.BBDD, ENT, ITPE, LM, SSII) y con una función con 2 parámetros
//calcule la media del curso y la devuelva con un valor double.
//El programa finaliza imprimiendo el resultado en pantalla
//AMPLIACION: Añade un control para validar los datos de entrada, la nota tiene que estar comprendida entre 0 y 10.
//Si el usuario introduce una nota incorrecta da error y el programa le da otra oportunidad.
//Si vuelve a introducir una nota incorrecta se acaba el rpograma

    // Función para calcular la media
    public static double solicitaNota( double totalNotas, double resultadoMedia) {
        resultadoMedia = (totalNotas/7);
        return resultadoMedia;
         // La media es la suma dividida entre el número de asignaturas
    }
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        //*Ampliacion:  */
        int intentos = 0;
        while (intentos < 2) {
            System.out.println("Introduce tu nota en BBDD");
            float BBDD = sc.nextFloat();
            System.out.println("Introduce tu nota en PROG");
            float PROG = sc.nextFloat();
            System.out.println("Introduce tu nota en F.BBDD");
            float FBBDD = sc.nextFloat();
            System.out.println("Introduce tu nota en ENT");
            float ENT = sc.nextFloat();
            System.out.println("Introduce tu nota en ITP");
            float ITP = sc.nextFloat();
            System.out.println("Introduce tu nota en LM");
            float LM = sc.nextFloat();
            System.out.println("Introduce tu nota en SSII");
            float SSII = sc.nextFloat();

            if (BBDD < 0 || BBDD > 10 || PROG < 0 || PROG > 10 || FBBDD < 0 || FBBDD > 10 ||
            ENT < 0 || ENT > 10 || ITP < 0 || ITP > 10 || LM < 0 || LM > 10 || SSII < 0 || SSII > 10) {
            System.out.println("Error. Tus notas tiene que estar comprendida entre 0 y 10");
            intentos++;
        }else {
            double totalNotas = (BBDD +SSII+ PROG+LM+FBBDD+ITP+ENT);
            System.out.println("Tu nota media es " + solicitaNota(totalNotas, totalNotas));
        }
            
        } System.out.println("Error otra vez. Fin del programa");
        sc.close();
    }
}
