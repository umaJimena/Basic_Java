package Ejercicios_Introduccion_Arrays;

import java.util.Scanner;

public class ejercicio9 {
    // Función que realiza la búsqueda secuencial
    public static int buscar(int[] t, int clave) {
        // Recorremos el array t buscando la clave
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                return i;  // Si encontramos la clave, devolvemos la posición
            }
        }
        return -1;  // Si no se encuentra la clave, devolvemos -1
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejemplo de array
        int[] t = {10, 20, 30, 40, 50, 60, 70, 1 , 2, 3, 4, 15, 16, 17,28,29,21,22,23,31,32,33,34,35,45,46,47,48,49,51,61,62,63,64,79,78,76,75};
        System.out.println("Introduce un numero aleatorio entre 1 y 70");
        int clave = sc.nextInt();  // Valor a buscar en el array

        // Llamada a la función buscar
        int resultado = buscar(t, clave);

        // Imprimir el resultado
        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }
    
}
