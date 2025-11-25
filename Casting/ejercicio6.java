package Casting;

public class ejercicio6 {
    //Escribe un programa que reciba un número decimal float y lo convierta a byte usando casting explícito. 
    //Muestra los valores originales y convertidos, destacando la posible pérdida de precisión.

    public static void main(String[] args) {
        float myFloat = 7.78f; //recuerda poner la f al final o java lo interpretara como double automaticamnete
        byte myByte = (byte)myFloat;

        System.out.println( myFloat);
        System.out.println(myByte);
        
    }
}
