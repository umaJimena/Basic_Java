package Casting;

public class ejercicio8 {
    //Crea un programa que multiplique un número int y un double, 
    //mostrando cómo el int se convierte implícitamente a double durante la operación.

    public static void main(String[] args) {
        
        int myInt = 468;
        double myDouble = 244.26;
        double conv = myInt;
        double res = (conv * myDouble);
        System.out.println(res);
    }
}
