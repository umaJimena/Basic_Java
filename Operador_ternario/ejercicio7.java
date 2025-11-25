package Operador_Ternario;
import java.util.Scanner;

public class ejercicio7 {
    //Escribe un programa que compruebe si un número es múltiplo de 3, de 7, de ambos o de ninguno
    public static void main(String[] args) {
        System.out.println("<--------------Ejercicio 7-------------->");
        Scanner sc=new Scanner(System.in);
        System.out.println(" Introduce un numero entero  ");
        int numero=sc.nextInt();

        String resultado=(numero%3==0 & numero%7==0)? "El numero es multiplo 3 y de 7" : 
        (numero%3==0)&!(numero%7==0)? "El numero es multiplo de tres pero no de siete" : 
        (numero%7==0)&!(numero%3==0)? "El numero es multiplo de siete pero no de tres" : 
        "El numero no es multiplo ni de 3 ni de 7" ;

        System.out.println(resultado);

    }
}
