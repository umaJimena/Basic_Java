import java.util.Scanner;

public class ejercicio9 {
    //Diseña un programa que solicite palabras en minúscula al usuario y las imprima en
    //mayúsculas, finalizará cuando el usuario teclee la palabra ‘fin’

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce palabras y teclea 'fin' para salir");
        String fin = "fin"; 
        String palabra;

        while  (!(palabra = sc.nextLine()).equals(fin)) { //Mientras que las palabras introducidas sean distintas de la palabra 'fin',
            
            System.out.println(palabra.toUpperCase());//imprimimos las palabras en mayuscula
            
        }
        sc.close();
        
    }
}
