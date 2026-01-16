package Ejercicios_switch;

import java.util.Scanner;

public class ejercicio5 {
    //Escribe un programa que solicite una medida en ‘metros’ y a continuación solicite a
    //qué unidad de medida se quiere convertir. Valores posibles : km, cm, mm. Los
    //literales de la medida a convertir no son sensibles a mayúscula/minúscula.
    //El programa devuelve el valor convertido. Muestra un mensaje de error si la opción
    //es inválida. Utiliza la estructura switch ‘nueva'
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una medida en metros");
        int m = sc.nextInt();

        System.out.println("A que medida quieres convertir (km, cm , mm)");
        String conversor = sc.next().toLowerCase();

        double res;

        switch (conversor) {
            case "km":
            res = m / 1000;
            System.out.println(res);
            break;

            case "cm":
            res = m * 100;
            System.out.println(res);
            break;

            case "mm":
            res = m * 1000;
            System.out.println(res);
            break;
        
            default:
            System.out.println("Error");
                break;
        }
    }
}
