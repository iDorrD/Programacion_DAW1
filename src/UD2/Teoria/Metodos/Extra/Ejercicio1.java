package UD2.Teoria.Metodos.Extra;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int numero=introducirNumero();
    }

    public static int introducirNumero(){
        int numero=0;
        do {
            System.out.print("Introduce un número (Escribe '0' para salir): ");
            numero= teclado.nextInt();
            if (numero==2){

            }
        }while (numero!=0);
        return numero;
    }
}
