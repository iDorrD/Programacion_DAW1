package UD2.Teoria;

import java.util.Scanner;

public class DoWhile_Clase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        // Se hace un bucle hasta que introduzcamos un valor de 1 a 10
        do {
            System.out.print("Introduce un número entre 1 y 10: ");
            numero= teclado.nextInt();
        }while (numero<1||numero>10);
        System.out.println("El número es: "+numero);
    }
}
