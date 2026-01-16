package Actividades_Libro;

import java.util.Scanner;

public class ejercicio19 {
     //Crea una aplicación que solicite al usuario cuántos grados tiene un ángulo y muestre el equivalente en radianes. 
     //Si el ángulo introducido por el usuario no se encuentra en el rango de 0° a 360°, hay que transformarlo a dicho rango.
     //Nota: El operador módulo puede ayudarnos a convertir un ángulo a su equivalente en el rango comprendido de 0° a 360°
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduce los grados de un angulo");
       float n=sc.nextFloat();

       double radianes=(Math.PI/180); //formula radianes: pi/180
       double equivalente= (n*radianes); //pasar de grados a radianes: grados*radian
       double grado_mayor_de_360 = (n%360);//reduccion de angulo mayor a 360
       double grado_menor_a_0 = (360-(n/360));//reduccion de angulo menor a 0
       double equivalente_angulo_mayor = (grado_mayor_de_360*radianes);//calcular la conversion del angulo reducido a radiantes
       double equivalente_angulo_menor = (grado_menor_a_0*radianes);//calcular la conversion del angulo reducido a radiantes
       
       //Creamos un if-else en caso de que el angulo sea menor a 0 o mayor a 360.
       if(n<0){
        System.out.println(n + "° " + " reducido es = " + grado_menor_a_0 + " que es = " + equivalente_angulo_menor + "r.");
        
       }else if (n>360) {
        System.out.println(n + "° " + " = " + equivalente_angulo_mayor + "r.");
        
       } else { System.out.println(n + "° " + " = " + equivalente + "r."); }

    }
}
