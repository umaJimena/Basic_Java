import java.util.Scanner;

public class ejercicio11 {
    //Diseña un programa que solicite al usuario el nombre de colores. 
    //Dejará de solicitar nuevos colores cuando se introduzca ‘negro’ (NO sensible a mayúsculas).
    //Al finalizar imprime el número de colores total introducido, excluyendo el ‘negro’
    //Y el número de veces que se ha introducido ‘azul’ (sensible a mayúsculas)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombres de colores. Introduce negro para salir.");
        
        String colores;//Creamos la variable colores
        int contadorAzul = 0;//Creamos la variable que contador de la palabra azul iniciando desde 0

        while (true) {//creamos un bucle
            colores = sc.next();//Introducimos los colores
            if (colores.equals("azul")) {//Si el String "colores" es igual a la palabra azul
                contadorAzul++;//Se suma al contador
            }else if (colores.equalsIgnoreCase("negro")) {//Si la alabra introducida es igual a negro ignorando las mayusculas
                System.out.println("Fin del programa. Numero de veces que se ha introducido azul: " + contadorAzul);
                break;//Entonces termina el bucle   
            } 
        }
        sc.close();
    }
}
