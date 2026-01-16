
import java.util.Scanner;

public class ejercicio1 {
    // Función que realiza la operación matemática solicitada
    public static double calculadora(double num1, double num2, int operacion) {
        switch (operacion) {
            case 1:
                return num1 + num2; // Sumar
            case 2:
                return num1 - num2; // Restar
            case 3:
                return num1 * num2; // Multiplicar
            case 4:
                return num1/num2;
            default:
                System.out.println("Operación no válida");
                return Double.NaN; //NaN = Not a Number
        }
    }

    // Función para mostrar el menú
    public static void mostrarMenu() {
        System.out.println("Menú de operaciones:");
        System.out.println("1. Sumar dos números");
        System.out.println("2. Restar dos números");
        System.out.println("3. Multiplicar dos números");
        System.out.println("4. Dividir dos números");
        System.out.println("5. Salir");
    }

    // Función principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion; //Variable con la opcion que escogemos
        
        do {
            mostrarMenu(); // Mostrar el menú de opciones
            System.out.print("Selecciona una opción (1-5): ");
            
            // Verificamos que la entrada sea un número entero
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                
                if (opcion == 5) { // Salir
                    System.out.println("Saliendo del programa.");
                    break; //break para romper el bucle
                }
                
                if (opcion >= 1 && opcion <= 4) { // Si la opción es válida
                    System.out.print("Introduce el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    double num2 = scanner.nextDouble();
                    
                    double resultado = calculadora(num1, num2, opcion);
                    if (!Double.isNaN(resultado)) {
                        System.out.println("El resultado es: " + resultado);
                    }
                } else {
                    System.out.println("Opción no válida. Por favor, selecciona una opción entre 1 y 5.");
                }
            } else {
                System.out.println("Por favor, ingresa un número entero para seleccionar una opción.");
                scanner.next(); // Limpiar el buffer
            }
        } while (true);
        
        scanner.close();
    }
}

