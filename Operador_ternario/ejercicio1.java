package Operador_ternario;

import java.util.Scanner;

public class ejercicio1 {
    //Escribe un programa que solicite al usuario un número entero e imprima como salida si es positivo, negativo o cero. 
    public static void main(String[] args) {
        System.out.println("<--------------Ejercicio 1-------------->");
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero entero ");
        int numeroEntero=sc.nextInt();

        String resultado= (numeroEntero>0)? "El numero es positivo" : (numeroEntero<0)? "El numero es negativo" : "El numero es 0";
        System.out.println(resultado);
        //Ternario de tres valores: ponemos dos condiciones y la tercera condicion se dara por defecto si no se cumple ninguna de las dos anteriores
    }
}
