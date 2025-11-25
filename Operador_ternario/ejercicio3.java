package Operador_ternario;

import java.util.Scanner;

public class ejercicio3 {
    //Escribe un programa que pida una temperatura en grados Celsius. 
    //Si la temperatura es mayor o igual a 30°C, el programa debe imprimir "Hace calor", 
    //de lo contrario "Hace frío".
    public static void main(String[] args) {
        System.out.println("<--------------Ejercicio 3-------------->");
        Scanner sc=new Scanner(System.in);
        System.out.println("Que temperatura (grados) hace? ");
        int grados=sc.nextInt();

        String calor=(grados>=30)? "Hace calor" : "No hace calor";
        System.out.println(calor);   
    }
}
