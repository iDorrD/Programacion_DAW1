package UD2.Teoria;

import java.util.Scanner;

public class MesesDelAño {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número que represente un mes (1-4): ");
        int mes = teclado.nextInt();
        switch (mes){
            case 1 -> System.out.println("Enero");
            case 2 -> System.out.println("Febrero");
            case 3 -> System.out.println("Marzo");
            case 4 -> System.out.println("Abril");
            default -> System.out.println("No es ninguno de los cuatro primeros meses.");
        }
    }
}
