package UD2.Practica.EstructurasDeControlVariadas2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de piezas a procesar: ");
        int piezas= teclado.nextInt();
        int piezasAptas=0;
        double longitud=0;

        for (int i=1;i<=piezas;i++){
            System.out.print("Ingrese la longitud del perfil "+i+" (metros): ");
            longitud= teclado.nextDouble();
            if (longitud>=1.20&&longitud<=1.30){
                piezasAptas++;
            }
        }

        System.out.println("Hay "+piezasAptas+" piezas aptas.");
    }
}
