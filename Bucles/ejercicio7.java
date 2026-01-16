public class ejercicio7 {
    //Diseña un programa que imprima los múltiplos de 3 comprendidos entre 5 y 50
    public static void main(String[] args) {
       
        for(int i = 5; i <= 50; i++) {//Iniciando el bucle desde 5, mientras sea < o = a 50, incrementamos su valor.
            if (i % 3 == 0) {//Si i / 3 da resto 0 entonces, 
                System.out.println(i + "");//Imprimimos i
            }
        }
    }
}
