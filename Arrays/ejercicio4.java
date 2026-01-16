package Ejercicios_Introduccion_Arrays;

import java.util.Scanner;

public class ejercicio4 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //array que almacena 5 numeros decimales(double)
    double numeroDecimal[] = new double[5];

    // Solicitar los 5 números decimales y almacenarlos en el array
    for (int i = 0; i < numeroDecimal.length; i++) {
        System.out.print("Introduce el número decimal " + (i + 1) + ": ");
        numeroDecimal[i] = sc.nextDouble();
    }

    System.out.println("Los números introducidos son:");

    for (int i = 0; i < 5; i++) { System.out.print(" "+numeroDecimal[i]+" ");}

    sc.close();
   } 
}
