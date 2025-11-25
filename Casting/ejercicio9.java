package Casting;

public class ejercicio9 {
    //Crea un programa que tome un número double y lo convierta explícitamente a long,
    //observando el truncamiento de la parte decimal.
    public static void main(String[] args) {
        double myDouble = 9823.45;
        long myLong = (long) myDouble;
        System.out.println(myLong);
    }  
}
