package Ejercicios_Introduccion_Arrays;

public class ejercicio2 {
    public static void main(String[] args) {
        //version 1: con operador new

       //crea las variables para referenciar los diferentes arrays
       int a1[], b1[], c1[];

       //crea un array de 10 enteros y los asignas a la variable 'a'
       a1 = new int[10];

       //asigna la referencia al array creado tambien por las variables 'b y 'c'
       b1 = a1;
       c1 = a1;

       System.out.println(a1);
       System.out.println(b1);
       System.out.println(c1);

       //version 2: sin operador new
       int a2[] = {1,2,3,4,5,6,7,8,9,10};

       int b2[] = a2;
       int c2[] = a2;

       System.out.println(a2);
       System.out.println(b2);
       System.out.println(c2);
    }
}
