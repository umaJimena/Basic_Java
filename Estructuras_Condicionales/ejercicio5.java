package Ejercicios_Condicionales;

import java.util.Scanner;

public class ejercicio5 {
    //Escribe una aplicación que solicite por consola dos números reales que
    //corresponden a la base y la altura de un triángulo. Deberá mostrarse su área,
    //comprobando que los números introducidos por el usuario no son negativos, algo
    //que no tendría sentido.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros (base y altura)");
        float base = sc.nextFloat(), altura = sc.nextFloat();

        if (base<0 || altura<0) {
            System.out.println("Error, numero negativo");
        }

        double area = (base*altura)/2;
        System.out.println("Area del triangulo: " + area);

        
    }
}
