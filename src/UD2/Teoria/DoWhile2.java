package UD2.Teoria;

import java.util.Scanner;

public class DoWhile2 {
    // Hacer un programa con una multiplicacion  de 4 números
    public static void main(String[] args) {
        final int NUMEROS_NATURALES=4; // Número de multiplicadores
        Scanner teclado = new Scanner(System.in);
        int numero=1,multiplicacion=1,contador=0;
        // No hacia falta meter por teclado el número
        do {
            numero++;
            multiplicacion=multiplicacion*numero;
            contador++;
        }while (contador<NUMEROS_NATURALES); // Indicamos que pare en el valor 4
        System.out.println("Resultado: "+multiplicacion);
    }
}
