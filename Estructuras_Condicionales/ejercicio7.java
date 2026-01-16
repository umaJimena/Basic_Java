package Ejercicios_Condicionales;

import java.util.Scanner;

public class ejercicio7 {

    //Realiza el «juego de la suma» , que consiste en que aparezcan dos números
    //aleatorios (comprendidos entre 1 y 99) que el usuario tiene que sumar. 
    //La aplicación debe indicar si el resultado de la operación es correcto o incorrecto.

    public static void main(String[] args) {
        //Creamos dos variable que impriman un numero aleatorio con el metodo Math.random
        int numeroRandom1 = (int)(Math.random() * 100) ;
        int numeroRandom2 = (int)(Math.random() * 100) ;

        System.out.println("Realiza esta suma: " + numeroRandom1 + " + " + numeroRandom2);

        int resultado = (numeroRandom1 + numeroRandom2);

        System.out.println("Introduce el resultado: ");
        Scanner sc = new Scanner(System.in);
        int respuesta = sc.nextInt();

        if (respuesta==resultado) {
            System.out.println("Correcto");
            
        } else {
            System.out.println("Incorrecto. El resultado es: "+ resultado);
        }
    }

}