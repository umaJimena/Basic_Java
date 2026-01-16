package Ejercicios_Introduccion_Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio8 {
    //primero creamos la funcion/array 'rellenaPares'
     public static int[] rellenaPares(int longitud, int fin) {
        Random random = new Random(); //creamos el atributo random para que genere un numero par aleatorio
        int[] pares = new int[longitud]; //array que contiene numeros pares (longitud = cuantos numeros)

        for(int i = 0; i < longitud; i++) { //bucle para recorrer el array y que busque numeros pares aleatorios
            int numero = 2 + 2 * random.nextInt((fin - 2) / 2 + 1);
            pares[i] = numero;
        }
        return pares;
    } 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //introducimos los valores de longitud(cantidad) y fin (rango)
        System.out.println("Introduce un numero aleatorio (longitud)");
        int longitud = scanner.nextInt(); // Tamaño del array
        System.out.println("Introduce un numero par (fin)");
        int fin = scanner.nextInt(); // Valor máximo del rango

        // Llamada a la función rellenaPares
        int[] resultado = rellenaPares(longitud, fin);
        
        // Mostrar el array generado
        System.out.println("Array de números pares aleatorios:");
        for (int i : resultado) {//bucle para que imprima el array
            System.out.print(i + " ");
        }
    } 
}
