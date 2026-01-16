import java.util.Scanner;

public class ejercicio4 {
    //Diseña un programa que solicite un número entero y que a continuación imprima
    //todos los números impares desde el 1 hasta el proporcionado por teclado.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){ //Iniciando con  1, mientras i sea < o = al numero introducido, incrementamos el numero
            if (i % 2 == 1) {//Si i / 2 da resto 1 entonces,
                System.out.println(i + " "); //imprimir i
            }
        }
        
    }
}
