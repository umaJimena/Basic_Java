package Ejercicios_switch;

import java.util.Scanner;

class ejercicio1 {
    //Escribe un programa que solicite un número del 1 al 7 e imprima el día de la semana
    //correspondiente (1 para lunes, 2 para martes, etc.). Si el número no está en el
    //rango, muestra un mensaje de error

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero del 1 al 7");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
            System.out.println("Lunes"); 
            break;

            case 2:
            System.out.println("Martes");      
            break;

            case 3:
            System.out.println("Miércoles");
            break;

            case 4:
            System.out.println("Jueves");
            break;

            case 5:
            System.out.println("Viernes");
            break;

            case 6:
            System.out.println("Sábado");
            break;

            case 7:
            System.out.println("Domingo");
            break;

        
            default:
            
            System.out.println("Error");
            break;
        }
    }
}