package Operador_Ternario;
import java.util.Scanner;

public class ejercicio9 {
    //Escribe un programa que solicite un carácter al usuario y que identifique si el
    //carácter es mayúscula o minúscula. Imprime por pantalla “Mayúscula” o ‘Minúscula”
    //en función del resultado del análisis.
    public static void main(String[] args) {
        System.out.println("<--------------Ejercicio 9-------------->");
        Scanner sc=new Scanner(System.in);
        System.out.println(" Introduce un caracter");
        char caracter=sc.next().charAt(0);
        //Para este ejercicio utilizamos la variable char

        String minusculaMayuscula=(Character.isUpperCase(caracter))? "El caracter es Mayuscula" : "El caracter es minuscula";
        //Si escribimos "Character." java nos dara una serie de opciones para una variable tipo

        System.out.println(minusculaMayuscula);

    }
}
