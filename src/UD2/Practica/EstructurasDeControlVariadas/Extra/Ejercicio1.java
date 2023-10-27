package UD2.Practica.EstructurasDeControlVariadas.Extra;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int NUMERO_A=2;
        final int NUMERO_B=5;
        int numero=0;
        int contadorA=0,contadorB=0;
        do {
            System.out.print("Escribe un número (Escribe 0 para salir): ");
            numero= teclado.nextInt();
            if (numero==NUMERO_A){
                contadorA++;
            } else if (numero==NUMERO_B) {
                contadorB++;
            }
        }while (numero!=0);
        System.out.println("Veces que has introducido el "+NUMERO_A+": "+contadorA+"" +
                "\nVeces que has introducido el "+NUMERO_B+": "+contadorB);
    }
}
