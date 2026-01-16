package Ejercicios_Introduccion_Arrays;

import java.util.Random;

public class ejercicio3 {
    public static void main(String[] args) {
        //Array de longitud 10 numeros enteros
        int[] numerosAleatorios = new int[10];

        //instancia de Random para generar números aleatorios
        Random random = new Random();

        //Variable para almacenar la suma de los numeros
        int suma = 0;

        System.out.println("Los números aleatorios generados son:");

        //bucle for para inizializar el array:
        //iniciando desde 0, mientras los numeros sean menor a la longitud del array, incrementando
        for (int i = 0; i < numerosAleatorios.length; i++) {
            // Generar un número aleatorio entre 1 y 100
            numerosAleatorios[i] = random.nextInt(100) + 1;
            // Mostrar el número generado
            System.out.print(numerosAleatorios[i] + " ");
            // Sumar el número a la variable suma
            suma += numerosAleatorios[i];
        }
        // Mostrar la suma total
        System.out.println("\nLa suma de los números aleatorios es: " + suma);
 
    }
    
}
