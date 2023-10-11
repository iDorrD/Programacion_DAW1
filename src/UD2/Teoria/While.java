package UD2.Teoria;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numero = teclado.nextInt();
        while (numero >1) {
            numero--;
            System.out.println(numero);
        }/*
        while (numero>=1) {
            System.out.println(numero);
            numero--;
        }*/
    }
}
