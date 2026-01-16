import java.util.Scanner;

public class ejercicio10 {
    //Diseña un programa que solicite números enteros que irán sumando (acumulando).
    //Cuando detecte que se ha introducido dos veces seguidas el mismo valor, imprimirá
    //el mensaje “Valor repetido. El total de la suma es: XXXX” 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int ultimoNumero = Integer.MIN_VALUE; // Valor inicial para el último número

        System.out.println("Introduce números enteros (introduce el mismo número dos veces seguidas para salir):");

        while (true) {
            int numero = sc.nextInt();
            suma += numero; // Acumula la suma

            // Verifica si se ha introducido el mismo número dos veces seguidas
            if (numero == ultimoNumero) {
                System.out.println("Valor repetido. El total de la suma es: " + suma);
                break; // Sale del bucle
            }

            ultimoNumero = numero; // Actualiza el último número
        }

        sc.close(); // Cerramos el scanner
  
    }
}
