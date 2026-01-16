import java.util.Scanner;
public class ejercicio13 {
    //Implementa la aplicación Eco, que pide al usuario un número y
    //Se muestre «Eco...» tantas veces como indique el número introducido. 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1; // Inicializamos n con un valor inválido

        // Este bucle se repetirá hasta que se ingrese un número válido
        while (n < 0) {
            System.out.println("Introduce un número entero positivo:");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n < 0) {
                    System.out.println("Error.");
                }
            } else {
                System.out.println("Error. ");
                sc.next(); // Limpiamos el buffer
            }
        }

        // Imprimir "Eco..." n veces
        for (int i = 0; i < n; i++) {
            System.out.println("Eco...");
        }

        sc.close(); // Cerramos el scanner
        
    }
}
