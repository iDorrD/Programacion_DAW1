package UD2.Practica.EstructurasDeControlVariadas2.AfianzarTeoriaMetodos;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner teclado = new Scanner(System.in);
    static final double MIN=1.20;
    static final double MAX=1.30;

    public static void main(String[] args) {
        int contador=1;
        int piezas= ingresarNumero();
        int piezasAptas=0;
        for (int i = 0; i < piezas; i++) {
            double longitud = ingresarLongitud(contador);
            piezasAptas=piezasAptas+comprobarAptas(longitud);
            contador++;
        }
        imprimir(piezasAptas);
    }

    public static int ingresarNumero(){
        System.out.print("Ingresa la cantidad de piezas a procesar: ");
        return teclado.nextInt();
    }

    public static double ingresarLongitud(int contador){
        System.out.print("Ingrese la longitud del perfil "+contador+" (metros): ");
        return teclado.nextDouble();
    }

    public static int comprobarAptas(double longitud){
        int resultado=0;
        if (longitud>=MIN&&longitud<=MAX){
            resultado=1;
        }
        return resultado;
    }

    public static void imprimir(int piezasAptas){
        System.out.println("Hay "+piezasAptas+" piezas aptas.");
    }
}
