package UD2.Practica;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = teclado.nextInt();
        if (numero==1){
            System.out.println("El número es uno.");
        } else if (numero==2) {
            System.out.println("El número es dos.");
        }else {
            System.out.println("Es otro número distinto de uno y dos.");
        }
    }
}
