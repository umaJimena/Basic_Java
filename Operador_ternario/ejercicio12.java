package Operador_Ternario;
import java.util.Scanner;
public class ejercicio12 {
    //Modifica el programa anterior para que el color introducido sea no sensible a mayúsculas/minúsculas. 
    //Es decir, se identifican los colores tanto si se escriben con mayúsculas o sin ellas.
    public static void main(String[] args) {
        System.out.println("<--------------Ejercicio 12-------------->");
        Scanner sc=new Scanner(System.in);
        System.out.println(" Que color de cinturon tienes en judo?");
        String colorCinturon=sc.next();

        String nivelJudo=(colorCinturon.equalsIgnoreCase("amarillo"))? "Nivel iniciacion": (colorCinturon.equalsIgnoreCase("blanco"))? "Nivel iniciacion" : "Nivel avanzado";
        System.out.println(nivelJudo);
    }
    
}
