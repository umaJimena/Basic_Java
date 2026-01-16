package Ejercicios_Introduccion_Arrays;
import java.util.Scanner;

public class prueba {
  
    public static void main(String[] args) {
        int[] numeros = {2, 6, 7};  // Array con tres numeros para adivinar
        boolean[] adivinados = {false, false, false};  // boolean que inicia con los tres numeros 'falsos'
        int aciertos = 0;  // Para contar los aciertos
        int fallos = 0; // Para contar los fallos
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivina los tres números, (del 1 al 10)");
        System.out.println("Introduce 0 para salir.");
        // Bucle: Mientras no se hayan adivinado los tres números
        while (aciertos < 3) {  
            int numeroIntroducido = scanner.nextInt();
            if (numeroIntroducido == 0) {  // Si el usuario quiere salir
                System.out.println("Has decidido salir. ¡Hasta luego!");
                break;
            }
            //el 0 no es uno de los numeros por lo que lo especificamos en el boolean
            boolean acertado = false; 
            // Recorremos el array con un for. 
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == numeroIntroducido && !adivinados[i]) {
                    adivinados[i] = true;  // Marcamos el número como adivinando
                    aciertos++;
                    System.out.println("¡Has adivinado uno de los números!");
                    acertado = true;
                    break;  // Salimos del bucle, ya que se ha adivinado un número
                }
            }

            // Si no se ha adivinado el número, se da una pista
            if (!acertado) {
                System.out.println("Sigue intentándolo.");
                fallos++;

            // Si se han adivinado los tres números, finalizamos el juego
            if (aciertos == 3) {
                System.out.println("¡Enhorabuena! Has adivinado todos los números.");
                break;
            }
        }

       
    }
    if (fallos == 1) {
        System.out.println("Has fallado " + fallos + " vez.");
    } else if (fallos > 1) {
        System.out.println("Has fallado " + fallos + " veces.");
        
    } else {
        System.out.println("Increíble! Nos has fallado ni una.");
    }
  }
}

  

