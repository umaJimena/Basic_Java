package Casting;

public class ejercicio10 {
    //Escribe un programa que tome un número de tipo short y lo convierta explícitamente a int. 
    //Luego, realiza la conversión inversa (de int a short) y muestra ambos valores.
    public static void main(String[] args) {
        short s1 = -23583;
        int i1 = s1;

        int i2 = 3455;
        short s2 = (short)i2;

        System.out.println(i1);
        System.out.println(s2);


        
    }
}
