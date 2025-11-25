package Operador_Ternario;
import java.util.Scanner;
public class ejercicio11 {
    //Escribe un programa que solicite el color del cinturón de un judoka. 
    //Si el color introducido es ‘blanco’ o ‘amarillo’ el programa imprime “Nivel iniciación” en otro caso imprime “Nivel Avanzado”
    public static void main(String[] args) {
        System.out.println("<--------------Ejercicio 11-------------->");
        Scanner sc=new Scanner(System.in);
        System.out.println(" Que color de cinturon tienes en judo?");
        String colorCinturon=sc.next();

        String nivelJudo=(colorCinturon.equals("amarillo"))? "Nivel iniciacion": (colorCinturon.equals("blanco"))? "Nivel iniciacion" : "Nivel avanzado";
        System.out.println(nivelJudo);
    }
}
