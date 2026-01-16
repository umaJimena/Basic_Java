import java.util.Scanner;

public class ejercicio1 {
    //Diseña un programa que solicite un número entre 0 y 10 y a continuación imprima la
    //tabla de multiplicar de dicho número. Implementa la validación del dato de entrada.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int numero = -1; // Inicializar con un valor fuera del rango

       //El primer bucle solicitara continuamente un numero mientras que el numero no este dentro del rango
        while (numero < 0 || numero > 10) { //Mientras que numero es menor a 0 o mayor 10 = TRUE, por lo que el bucle terminara cuando introduzcas un numero entre el 0 y 10.
            System.out.print("Introduce un número entre 0 y 10: ");
            if (scanner.hasNextInt()) {//Usamos el metodo if-else para los dos posibles caso: numero dentro del rango y/o numero fuera del rango
                numero = scanner.nextInt();
            } else {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                scanner.next(); // Limpiar el buffer
            }
        }
        int i = 1; // Inicializar el multiplicador, el numero empezara a multiplicarse x1
        //El segundo bucle es para que el numero se multiplique continuamente hasta llegar a 10
        while (i <= 10) {//Mientras i (el numero por el que multiplica) sea menor o igual a 10 continuar multiplicando
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++; // Incrementar el multiplicador, i incrementara +1
        }

        scanner.close(); // Cerrar el scanner 
    }
}