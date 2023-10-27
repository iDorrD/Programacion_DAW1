package UD2.Practica.EstructurasDeControlVariadas2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Introduce un número (Escribe 0 para salir): ");
            numero= teclado.nextInt();
            System.out.println(numero);
            if (numero>8){
                System.out.println("¡Es mayor que 8! El doble es "+(numero*2));
            }else {
                System.out.println("¡Es menor que 8! El doble es "+(numero*3));
            }
        }while (numero!=0);
        System.out.println("Fin");
    }
}
