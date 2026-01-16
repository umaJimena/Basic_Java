import java.util.Scanner;

public class ejercicio2{
    // Función que busca un carácter en una cadena y devuelve si lo encontró
    public static boolean buscaChar(String cadena, char caracter) {
        return cadena.indexOf(caracter) != -1; // Si el índice es -1, no se encuentra el carácter
    }

    // Función que cuenta las vocales en una cadena
    public static int contarVocales(String cadena) {
        int contador = 0;
        cadena = cadena.toLowerCase(); // Convertir a minúsculas para simplificar la comparación
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    // Función que muestra el menú de opciones
    public static void mostrarMenu() {
        System.out.println("\nMenú de opciones:");
        System.out.println("1. Buscar carácter en una cadena");
        System.out.println("2. Contar vocales en una cadena");
        System.out.println("3. Salir");
    }

    // Función principal que ejecuta el menú y las operaciones
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Bucle principal que ejecuta el menú hasta que el usuario selecciona "Salir"
        do {
            mostrarMenu(); // Mostrar el menú
            System.out.print("Selecciona una opción (1-3): ");
            opcion = scanner.nextInt(); // Leer la opción seleccionada

            // Ejecutar según la opción seleccionada
            switch (opcion) {
                case 1: // Buscar carácter en una cadena
                    System.out.print("Introduce la cadena: ");
                    scanner.nextLine();  // Limpiar el buffer
                    String cadena1 = scanner.nextLine();
                    System.out.print("Introduce el carácter a buscar: ");
                    char caracter = scanner.next().charAt(0);
                    if (buscaChar(cadena1, caracter)) {
                        System.out.println("Se ha encontrado el carácter buscado.");
                    } else {
                        System.out.println("No se ha encontrado el carácter buscado.");
                    }
                    break;
                case 2: // Contar vocales en una cadena
                    System.out.print("Introduce la cadena: ");
                    scanner.nextLine();  // Limpiar el buffer
                    String cadena2 = scanner.nextLine();
                    int vocales = contarVocales(cadena2);
                    System.out.println("La cadena tiene " + vocales + " vocales.");
                    break;
                case 3: // Salir
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción entre 1 y 3.");
            }

        } while (opcion != 3); // El bucle sigue hasta que el usuario selecciona la opción 3 (salir)

        scanner.close(); // Cerrar el scanner para evitar fugas de memoria
    }
}


