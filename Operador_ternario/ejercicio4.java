package Operador_Ternario;

import java.util.Scanner;

public class ejercicio4 {
    //Escribe un programa que determine si un número es par o divisible por 5
    public static void main(String[] args) {
        System.out.println("<--------------Ejercicio 5-------------->");
        Scanner sc=new Scanner(System.in);
        System.out.println(" Introduce un numero entero ");
        int numero=sc.nextInt();

        String resultado=(numero%2==0)?"El numero es par" : (numero%5==0)? "El numero es divisible por 5" : "El numero no es para y no es divisible por 5";
        System.out.println(resultado);
        
    }
}
