package Operador_Ternario;

import java.util.Scanner;

public class ejercicio5 {
    //Escribe un programa que determine si un número está entre 100 y 200 inclusive. 
    //Si se encuentra en el rango se imprime “Dentro del rango”, en otro caso “Fuera del rango”

    public static void main(String[] args) {
        System.out.println("<--------------Ejercicio 5-------------->");
        Scanner sc=new Scanner(System.in);
        System.out.println(" Introduce un numero entero  ");
        int numero=sc.nextInt();

        String resultado= (100<=numero & numero <=200)? "Dentro del rango" : "Fuera del rango";
        System.out.println(resultado);
    }
}
