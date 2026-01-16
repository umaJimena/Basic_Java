package Ejercicios_Condicionales;

import java.util.Scanner;

public class ejercicio8 {
    //Modifica el ejercio 7 para que, además de los dos números
    //aleatorios, también aparezca la operación que debe realizar el jugador: suma, resta
    //o multiplicación.
    public static void main(String[] args) {
        //Creamos dos variable que impriman un numero aleatorio con el metodo Math.random
        int numeroRandom1 = (int)(Math.random() * 100) ;
        int numeroRandom2 = (int)(Math.random() * 100) ;
        //Cramos una variables operador para que escoja un operador aleatorio (+ , - , *)
        int operador = (int)(Math.random()*3);

        int resultado = 0;  // Variable para almacenar el resultado de la operación
        String operacion = "";  // Variable para almacenar la operación

        //Debemos crear una operacion aleatoria (0=suma, 1=resta, 2=multiplicacion)
        switch (operador) {
            case 0: 
                resultado = numeroRandom1 + numeroRandom2;
                operacion = "+";
                break;
            case 1: 
                resultado = numeroRandom1 - numeroRandom2;
                operacion = "-";
                break;
            case 2:
                resultado = numeroRandom1 * numeroRandom2;
                operacion = "x";
                break;
        }
        //Scanner para introducir respuesta
        Scanner sc = new Scanner(System.in);
        System.out.println("Realiza esta operación: " + numeroRandom1 + " " + operacion + " " + numeroRandom2 + " : ");
        int respuesta = sc.nextInt();

        //Metodo para determinar si nuestra repuesta es correcta
        if (respuesta == resultado) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto. El resultado es: " + resultado);
        } 
    }
}
