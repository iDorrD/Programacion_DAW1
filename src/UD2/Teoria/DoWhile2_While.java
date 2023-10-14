package UD2.Teoria;

import java.util.Scanner;

public class DoWhile2_While {
    // Hacer un programa con una multiplicacion  de 4 números
    public static void main(String[] args) {
        final int NUMEROS_NATURALES=4; // Número de multiplicadores
        Scanner teclado = new Scanner(System.in);
        int numero=0,multiplicacion=1,contador=0;
        while (contador!=NUMEROS_NATURALES){
            System.out.println("Introduce un número: ");
            numero= teclado.nextInt();
            multiplicacion=multiplicacion*numero;
            contador++;
        }
        System.out.println("Resultado: "+multiplicacion);
    }
}
