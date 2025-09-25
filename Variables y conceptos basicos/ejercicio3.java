import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("------Ejercicio 3:------>");
        //Escribe un programa java que 
        //utilizando el método random() de la clase Math. 
        //Imprima en pantalla un número aleatorio.
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce dos numeros para restarlos");
        System.out.println("Introduce el primer número-->");
        int x = sc.nextInt();
        System.out.println("Introduce el segundo número-->");
        int y = sc.nextInt();
        System.out.println("El resltado de " + x + " - 984765" + y + " es " + Math.subtractExact(x, y));

    } 
}
