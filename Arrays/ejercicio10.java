package Ejercicios_Introduccion_Arrays;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array que almacena el número de días de cada mes en orden
        int[] dias = {31,28,31,30,31,31,30,31,30,31};
        // Array de 12 posiciones con los nombres de los meses
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        // Solicitar al usuario que ingrese el nombre del mes
        System.out.print("Introduce el nombre de un mes: ");
        String mes = sc.nextLine();
        int i = 0;
        boolean encontrado = false;
        while (i < meses.length && !encontrado) {
            if (meses[i].equalsIgnoreCase(mes)) {
                System.out.println( mes + " tiene " + dias[i] + " dias.");
                encontrado=true;
            }
            i++;
        }
        if (!encontrado) { System.out.println("El mes introducido no es valido.");}
        sc.close();;
    }
}
