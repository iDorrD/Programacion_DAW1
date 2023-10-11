package UD2;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        final int VALOR=3;
        Scanner teclado = new Scanner(System.in);
        int numero=0,total=0;
        int limite=0;
        while (limite<6){
            System.out.print("Introduce el número "+(limite+1)+": ");
            numero= teclado.nextInt();
            total=total+numero;
            limite++;
        }
        System.out.println("Suma total: "+total);
    }
}
