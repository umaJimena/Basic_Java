package Ejercicios_Introduccion_Arrays;
public class ejercicio1 {
    public static void main(String[] args) {
        //version 1: sin operador new
        int entero1[] = {1, 2, 3, 4, 5};
        double double1[] = {1111, 2222, 3333, 4444, 5555};
        boolean boolean1[] = {true, false, true, false, true};

        System.out.println(entero1);
        System.out.println(double1);
        System.out.println(boolean1);

        //version 2: con operador new
        int entero2[];
        entero2 = new int[5];
        double double2[];
        double2 = new double[5];
        boolean boolean2[];
        boolean2 = new boolean[5];

        System.out.println(entero2);
        System.out.println(double2);
        System.out.println(boolean2);
    }
    
}

