package UD2.Practica.EstructurasDeControlVariadas2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        final double MIN=1.20;
        final double MAX=1.30;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de piezas a procesar: ");
        int piezas= teclado.nextInt();
        int piezasAptas=0;
        double longitud=0;

        for (int i=1;i<=piezas;i++){
            System.out.print("Ingrese la longitud del perfil "+i+" (metros): ");
            longitud= teclado.nextDouble();
            if (longitud>=MIN&&longitud<=MAX){
                piezasAptas++;
            }
        }

        System.out.println("Hay "+piezasAptas+" piezas aptas.");
    }
}
