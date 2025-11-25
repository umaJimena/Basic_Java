package Operador_Ternario;
import java.util.Scanner;
public class ejercicio6 {
    //Escribe un programa que determine si un número está entre 100 y 200, 
    //ambos inclusive, o entre 300 y 350, ambos inclusive. 
    //Si se encuentra en el rango se imprime “Dentro del rango”, en otro caso “Fuera del rango”

    public static void main(String[] args) {
        System.out.println("<--------------Ejercicio 6-------------->");
        Scanner sc=new Scanner(System.in);
        System.out.println(" Introduce un numero entero  ");
        int numero=sc.nextInt();

        String resultado= (100<=numero & numero <=200 | 300<=numero & numero <=350  )? "Dentro del rango" : "Fuera del rango";
        System.out.println(resultado);
    }
}
