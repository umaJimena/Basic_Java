import java.util.Scanner;

public class ejercicio12 {
    //Diseña una aplicación que muestre la edad máxima y mínima de un grupo de alumnos. 
    //El usuario introducirá las edades y terminará escribiendo un −1.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las edades de los alumnos, para terminar introduce '-1'");
        
       
        int edad;
        int edadMinima = Integer.MAX_VALUE;
        int edadMaxima = Integer.MIN_VALUE;

        while (true) {
            edad = sc.nextInt();

            if (edad == -1) {
                break; // Sale del bucle si se introduce -1
            }

            // Verifica si la edad es válida
            if (edad < 0) {
                System.out.println("Error. Introduce una edad válida o -1 para salir.");
                continue; // Vuelve al inicio del bucle
            }

            // Actualiza la edad mínima y máxima
            if (edad < edadMinima) {
                edadMinima = edad;
            }
            if (edad > edadMaxima) {
                edadMaxima = edad;
            }
        }
         // Comprobar si se introdujeron edades válidas
         if (edadMinima == Integer.MAX_VALUE && edadMaxima == Integer.MIN_VALUE) {
            System.out.println("No se introdujeron edades válidas.");
        } else {
            System.out.println("La edad mínima es: " + edadMinima);
            System.out.println("La edad máxima es: " + edadMaxima);
        }
        

    }
}
