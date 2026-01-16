package Ejercicios_Introduccion_Arrays;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variables para almacenar los numeros positivos, negativos y 0.
        int contadorCeros = 0;
        int negativos = 0;
        int sumaNegativos = 0;
        int positivos = 0;
        int sumaPositivos = 0;

        // Solicitar la cantidad de números (n)
        System.out.println("Introduce la cantidad de números (n):");
        int n = sc.nextInt();

        // Crear el array para almacenar los números introducidos
        int[] numeros = new int[n];

         // Bucle para pedir los n números
         for (int i = 0; i < n; i++) {
            System.out.println("Introduce el número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();

            // Clasificar los números y acumular sumas y contadores
            if (numeros[i] == 0) {
                contadorCeros++;    
            } else if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                positivos++;
            } else {
                sumaNegativos += numeros[i];
                negativos++;
            }
        }

        // Mostrar resultados
        System.out.println("Número de ceros introducidos: " + contadorCeros);

        // Calcular y mostrar la media de los positivos
        System.out.println("Media de los números positivos: " + sumaPositivos / positivos);
       

        // Calcular y mostrar la media de los negativos
        System.out.println("Media de los números negativos: " + sumaNegativos / negativos);
        
        sc.close();
        
    }
}
