package UD2;

import java.util.Scanner;

public class TestValidacion {
    public static void main(String[] args) {
        /*Scanner teclado= new Scanner(System.in);
        byte numero;
        boolean loop=true;
        do {
            System.out.print("Introduce el valor 1 para continuar: ");
            numero= teclado.nextByte();
            if (numero!=1){
                System.out.println("No es válido.");
            }else {
                System.out.println("Es válido.");
                loop=false;
            }
        }while (loop);*/
        for (int i=1;i<21;i++){ // Sale el valor 20 (tenia razon)
            System.out.println(i);
        }
    }
}
