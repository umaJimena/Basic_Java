package Ejercicios_Introduccion_Arrays;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //creamos un array que almacene 4 numeros
        //y otro array para que almacene el valor mayor
        int numero[] = new int[4];
        int numeroMayor = numero[0];

         //Solicitar los 4 números  y almacenarlos en el array
        for (int i = 0; i < numero.length; i++) {
            System.out.print("Introduce un número entero " + (i + 1) + ": ");
            numero[i] = sc.nextInt();
        }
        
        //bucle for recorre el array para buscar el mayor
        for(int i = 1; i < numero.length; i++) {
            if (numero[i] > numeroMayor) {
            numeroMayor = numero[i];
            }
        }

        System.out.println("El numero mayor es: " + numeroMayor);

        sc.close();
    }
}
