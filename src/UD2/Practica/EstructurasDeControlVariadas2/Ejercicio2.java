package UD2.Practica.EstructurasDeControlVariadas2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int DOBLE=2;
        final int TRIPLE=3;
        int numero;
        do {
            System.out.print("Introduce un número (Escribe 0 para salir): ");
            numero= teclado.nextInt();
            System.out.println();
            if (numero==0){
                System.out.println("Fin");
            }else if (numero>8){
                System.out.println("¡Es mayor que 8! El doble de "+numero+" es "+(numero*DOBLE));
            }else {
                System.out.println("¡Es menor que 8! El triple de "+numero+" es "+(numero*TRIPLE));
            }
        }while (numero!=0);
    }
}
