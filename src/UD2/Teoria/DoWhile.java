package UD2.Teoria;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduce un numero del 1 al 10: ");
            numero = teclado.nextInt();
        }while (!(numero>0&&numero<=10));
        System.out.println("El numero es: "+numero);
    }
}
