package Ejercicios_Introduccion_Arrays;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // Array con 5 ciudades
        String[] ciudades = {"Madrid", "Buenos Aires", "Londres", "Berlin","Tokio"};
        String salir = "salir";
        int contadorAciertos = 0;
        int contadorFallos = 0;

        System.out.println("¡ADIVINA 5 CIUDADES ALEATORIAS!");
        System.out.println("[Escribe 'salir' cuando quieras dejar de jugar]");
        System.out.println("\nEscribe una ciudad: ");
        
        while (contadorAciertos < 5) {
          String escribir = sc.next();
          if (escribir.equalsIgnoreCase(salir)) {
            System.out.println("Hasta luego.");
            break;
          }
          for(int i=0; i<ciudades.length; i++) {
            if (!escribir.equals(ciudades)) {
            System.out.println("Sigue intentandolo.");
            contadorFallos++; 
          }
          
          if (escribir.equals(ciudades)) {
            System.out.println("Enhorabuena! Has adivinado una de las ciudades.");
            contadorAciertos++;
          }
          if (contadorAciertos==5) {
            System.out.println("¡Has adivinado todas las ciudades!");
            break;
          }
          }
        }  
        System.out.println("Número de fallos: " + contadorFallos);
        sc.close();
      }
  
}
