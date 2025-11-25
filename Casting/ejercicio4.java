package Casting;
import java.util.Scanner;

public class ejercicio4 {
    //Crea un programa que tome un número long y lo convierta explícitamente a int.
    //Asegúrate de manejar la pérdida de precisión si el número es demasiado grande
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero long ");
        long numeroLong = sc.nextLong();

        int numeroInt = (int)numeroLong;
        System.out.println(numeroInt);

    }
}
