package UD2.Teoria;

import java.util.Scanner;

public class IfSimple {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = teclado.nextInt();
        System.out.println("Introduce un numero 2: ");
        int numero2 = teclado.nextInt();
        int resultado = numero+numero2;
        if (resultado>5){
            System.out.println(resultado+" suma mayor a 5");
        }
        System.out.println("Fin de programa");
    }
}
