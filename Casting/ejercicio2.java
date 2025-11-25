package Casting;
import java.util.Scanner;

public class ejercicio2 {
    //Escribe un programa que reciba un número de tipo double y lo convierta explícitamente a int. 
    //Muestra ambos valores por pantalla.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número double");
        double numero = sc.nextDouble();
        int numeroInt = (int) numero;

        System.out.println("número int: " + numeroInt + " número double:" + numero);
    }
}
