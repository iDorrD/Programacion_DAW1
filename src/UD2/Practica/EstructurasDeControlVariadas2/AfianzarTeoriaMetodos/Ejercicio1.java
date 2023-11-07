package UD2.Practica.EstructurasDeControlVariadas2.AfianzarTeoriaMetodos;

import java.util.Scanner;

public class Ejercicio1 {

    // Constantes estáticos y para llamar a correspondientes clases.
    static Scanner teclado = new Scanner(System.in);
    static final double MIN=1.20;
    static final double MAX=1.30;

    // Interfaz. Controla el final del programa y llamará a métodos.
    public static void main(String[] args) {
        int contador=1;
        int piezas= ingresarNumero();
        System.out.println(piezas);
        boolean apto=false;
        int piezasAptas=0;
        for (int i = 0; i < piezas; i++) {
            /* [Opcional] *///System.out.print("Ingrese la longitud del perfil "+contador+" (metros): ");
            double longitud = ingresarLongitud(contador);
            apto=comprobarAptas(longitud);
            if (apto){
                piezasAptas++;
            }
            contador++;
        }
        imprimir(piezasAptas);
    }

    // Este método ingres el número de cantidades a procesar
    public static int ingresarNumero(){
        System.out.print("Ingresa la cantidad de piezas a procesar: ");
        return teclado.nextInt();
    }

    public static double ingresarLongitud(int contador){
        System.out.print("Ingrese la longitud del perfil "+contador+" (metros): ");
        return teclado.nextDouble();
    }

    public static boolean comprobarAptas(double longitud){
        if (longitud>=MIN&&longitud<=MAX){
            return true;
        }else {
            return false;
        }

    }

    public static void imprimir(int piezasAptas){
        System.out.println("Hay "+piezasAptas+" piezas aptas.");
    }
}
