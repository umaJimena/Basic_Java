package Casting;

public class ejercicio7 {
    //Crea un programa que sume un número byte y un número short, 
    //usando el casting implícito para realizar la operación.
    public static void main(String[] args) {
        byte myByte = -127;
        short myShort = -32768;
        short conv = myByte;
        double res = (myByte + (-32768));
        System.out.println(res);


        
    }
}
