package Operador_Ternario;
import java.util.Scanner;

public class ejercicio8 {
    //Escribe un programa que transforme la calificación que indica el usuario por teclado
    //la calificación cualitativa teniendo en cuenta esta tabla de correspondencia: ()

    public static void main(String[] args) {
        System.out.println("<--------------Ejercicio 8-------------->");
        Scanner sc=new Scanner(System.in);
        System.out.println(" Introduce tu nota del 0 al 10");
        float nota=sc.nextFloat();

        String notaCualitativa= (nota < 0 || nota > 10) ? "Nota no válida. Introduce una nota entre 0 y 10" :(nota>=9 & nota<=10)? "Tu calificacion es A" :  (nota>=8)? "Tu calificacion es B" : (nota>=7)? "Tu calificacion es C" 
        : (nota>=6)? "Tu calificacion es D" : "Tu calificacion es F";
        System.out.println(notaCualitativa);

    }
}
