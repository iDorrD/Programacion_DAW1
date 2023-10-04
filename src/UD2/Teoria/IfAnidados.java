package UD2.Teoria;

import java.util.Scanner;

public class IfAnidados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = teclado.nextInt();
        System.out.println("Introduce un numero 2: ");
        int numero2 = teclado.nextInt();
        int resultado = numero+numero2;
        if (resultado>5){
            System.out.println(resultado+" suma mayor a 5");
        }else if (resultado<5){
            System.out.println(resultado+" suma es menor a 5");
        }else {
            System.out.println("Suma igual a 5.");
        }
        System.out.println("Fin de programa");
    }
}
