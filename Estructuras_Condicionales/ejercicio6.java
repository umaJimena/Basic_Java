package Ejercicios_Condicionales;

import java.util.Scanner;

public class ejercicio6 {
    //Utiliza el operador ternario para calcular el valor absoluto de un número que se
    //solicita al usuario por teclado.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para calcular su valor absoluto");
        int numero = sc.nextInt();

        //condición ? valor_si_verdadero : valor_si_falso;
        String valorAbsoluto = (numero<0)? "Su valor absoluto es " + ((numero)-numero) : "Su valor absoluluto es " + numero;
        System.out.println(valorAbsoluto);


 
    }
}
