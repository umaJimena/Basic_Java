public class ejercicio5 {
    //Diseña un programa que imprima los números del 1 al 100 exceptuando los múltiplos de 3
    public static void main(String[] args) {
        for(int i = 0; i <=100; i++){ //Iniciando con 0, mientras i sea menor o igual a 100, incrementando su valor
            if (i % 3 != 0){//Si el resto de i / 3 NO es 0 entonces, 
                System.out.println(i + " ");//imprimir el numero
            }
        }

        
    }
}
