package UD2;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        final int VALOR=6;
        Scanner teclado = new Scanner(System.in);
        int total=0;
        int limite=0; // Indica el número de sumandos
        while (limite<VALOR){
            System.out.print("Introduce el número "+(limite+1)+": ");
            int numero= teclado.nextInt();
            total=total+numero;
            limite++;
        }
        System.out.println("Suma total: "+total);
    }
}
