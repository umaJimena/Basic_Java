package Ejercicios_switch;

import java.util.Scanner;

public class ejercicio2 {
    //Escribe un programa que reciba una calificación (A, B, C, D, F) e imprima el literal
    //correspondiente en texto

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una calificacion (A, B, C, D, F)");
        char calificacion = sc.next().charAt(0);

        switch (calificacion) {
            case 'A':
            System.out.println("Sobresaliente");
            break;

            case 'B':
            System.out.println("Notable");
            break;

            case 'C':
            System.out.println("Bien");
            break;

            case 'D':
            System.out.println("Suficiente");
            break;

            case 'F':
            System.out.println("Insuficiente");
            break;

            default:
            System.out.println("Error");
            break;
        }
        
    }
}
