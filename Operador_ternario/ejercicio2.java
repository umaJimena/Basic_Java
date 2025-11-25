package Operador_ternario;

import java.util.Scanner;

public class ejercicio2 {
    //Escribe un programa que solicite 3 números al usuario y utilice el operador ternario para encontrar el de menor valor.
    public static void main(String[] args) {
        System.out.println("<--------------Ejercicio 2-------------->");
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce tres numeros ");
        int a=sc.nextInt(); int b=sc.nextInt(); int c=sc.nextInt();

        String numeroMenor=(a<b)&(a<c)?"El numero" + a + " es el menor" : (b<a)&(b<c)? "El numero " + b + " es el menor" : "el numero " + c + " es el menor4";
        System.out.println(numeroMenor);

    }
}
