import java.util.Scanner;

public class ejercicio4 {

    public static boolean buscaSilaba(String cadena){
        String silaba = "ma";
        return cadena.contains(silaba);
        
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto");
        String cadena = sc.nextLine(); //Utilizamos nextLine para capturar los espacios

        System.out.println("Contiene el texto la silaba ma?");
        System.out.println(buscaSilaba(cadena));

        
    }
}
