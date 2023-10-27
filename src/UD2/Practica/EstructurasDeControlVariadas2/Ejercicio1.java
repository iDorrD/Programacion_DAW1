package UD2.Practica.EstructurasDeControlVariadas2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de piezas a procesar: ");
        int piezas= teclado.nextInt();

        double longitud_perfil;
        do {
            System.out.print("ingrese la longitud de cada perfil: ");
            longitud_perfil= teclado.nextDouble();
        }while (longitud_perfil<1.20||longitud_perfil>1.30);

        System.out.println("Hay "+piezas+" con "+longitud_perfil);
    }
}
