import java.util.concurrent.ThreadLocalRandom;

public class ejercicio6 {
    public static void main(String[] args) {
        System.out.println("-----Ejercicio 6----->");
        //Escribe un programa java que devuelva un número aleatorio entero entre 0 y 100
        int numeroRandom = ThreadLocalRandom.current().nextInt(0, 100);
        System.out.println(numeroRandom);
    }
    
}
