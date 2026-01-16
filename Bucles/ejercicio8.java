import java.util.Scanner;

public class ejrercicio8 {
    //Diseña un programa que solicite un número entero ‘N’. A continuación, solicitará al
    //usuario N números y finalizará imprimiendo la media de todos los valores.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero ");    
        int N = sc.nextInt();
        System.out.println("Introduce " + N + " numeros");
        int numeros[] = new int[N];//Creamos un array que guarde la cantidad de numeros introducidos
        int suma = 0;//Creamos la variable operacion suma
        
        for(int i = 0; i < N; i++) {//Creamos un bucle que nos pedira la cantidad de numeros en base al primer numero introducido
            numeros[i] = sc.nextInt();//Introducimos los numeros
            suma += numeros[i];//suma es = a la suma de todos los numero introducidos
        }

        double media = (double) suma / N; // Creamos la operacion que realiza la media
        System.out.println("La media es: " + media);
    }
}
