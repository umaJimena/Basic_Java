package Ejercicios_switch;

import java.util.Scanner;

public class ejercicio4 {
    //Crea un programa que reciba dos números y un operador (+, -, *, /). El programa
    //debe realizar la operación correspondiente e imprimir el resultado. Si el operador es
    //inválido, muestra un mensaje de error
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n1 = sc.nextInt();
        System.out.println("Introduce otro numero");
        int n2 = sc.nextInt();
        System.out.println("Introduce un operador (+, -, *, /)");
        char operador = sc.next().charAt(0);

        double res;

        switch (operador) {
            case '+':
            res = n1 + n2;
            System.out.println(res); 
            break;

            case '-':
            res = n1 - n2;
            System.out.println(res); 
            break;

            case '*':
            res = n1 * n2;
            System.out.println(res); 
            break;

            case '/':
            res = n1 / n2;
            System.out.println(res); 
            break;


            default:
            System.out.println("Error");
                break;
        }

    }
}
