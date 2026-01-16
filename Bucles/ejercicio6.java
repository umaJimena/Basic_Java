import java.util.Scanner;

public class ejercicio6 {
    //Diseña un programa que solicite 10 números y devuelva el resultado de multiplicar todos ellos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];//Creamos un array que almacene 10 numeros
        int res = 0;//Creamos la variable res (resultado)
        
        System.out.println("Introduce 10 numeros");

        for(int i = 0; i < 10; i++) {//Iniciamos el valor desde 0, mientras sea menor a 10, aumentamos el valor
            numeros[i] = sc.nextInt();//Introducimos numeros que almacenan valor i
            res *= numeros[1];// Realizamos multiplicacion de los numeros almacenados
            
        }
        System.out.println(res);
        sc.close(); 
    }
}
