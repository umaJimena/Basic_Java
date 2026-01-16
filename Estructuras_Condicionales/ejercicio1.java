package Ejercicios_Condicionales;
import java.util.Scanner;

public class ejercicio1 {
    //Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. 
    //La aplicación tendrá que indicar si el número introducido es capicúa.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero entre 0 y 9999");
        int n = sc.nextInt();

        if (n < 0 || n > 9999) {
            System.out.println("Error. Numero invalido.");
        } else {
            // Convertimos el numero "int" a String
            String numeroString = Integer.toString(n);
            // Invertimos la cadena String utilizando el parametro "reverse"
            String reverse = new StringBuilder(numeroString).reverse().toString();
           
            // Comprobamos si es capicúa
            if (numeroString.equals(reverse)) {//Comparamos los dos String ("numeroString" y "reverse") con .equals
               System.out.println("El número introducido es capicúa");
           } else {
               System.out.println("El número introducido no es capicúa");
           }
       }
       
       sc.close();
        

    }
}
