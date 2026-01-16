package Ejercicios_Introduccion_Arrays;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //primero solicitamos la cantidad de numeros y los almacenamos en una variable
        System.out.println("¿Cuantos numeros deseas introducir?");

        //creamos un array para almacenar el valor:
        //la longitud del array sera igual a la cantidad introducida
        int cantidad[] = new int[sc.nextInt()];

        //bucle para que te solicite tantos numeros como hemos declarado en la cantidad
        for(int i = 0; i < cantidad.length; i++) {
            System.out.println("Introduce un numero " + (i + 1) + " :");
            cantidad[i] = sc.nextInt();
        }

        // Imprimir los números en orden inverso
        System.out.println("Los numeros introducidos en orden inverso:");
        
        //bucle con contador en incremento para que devuelva numeros inversos
        for (int i = cantidad.length - 1; i >= 0; i--) {
            System.out.println(cantidad[i]);
        }
        sc.close();
    }
    
}
