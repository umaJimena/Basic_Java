package Operador_Ternario;
import java.util.Scanner;
public class ejercicio10 {
    //Escribe un programa que solicite al usuario dos cadenas de texto e identifique si las cadenas son iguales. 
    //Imprime por pantalla “Las cadenas son iguales” o “Las cadenas son diferentes”.
    public static void main(String[] args) {
        System.out.println("<--------------Ejercicio 10-------------->");
        Scanner sc=new Scanner(System.in);
        System.out.println(" Introduce dos cadena de texto");
        String cadena1=sc.nextLine() ; String cadena2=sc.nextLine();

        String comparacion=(cadena1.equals(cadena2))? "Son iguales" : "Son diferentes";
        System.out.println(comparacion);

        //Para comparar el contenido de las cadenas, se debe usar el método .equals().
    }
}
