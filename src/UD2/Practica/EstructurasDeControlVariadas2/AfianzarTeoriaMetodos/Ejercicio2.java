package UD2.Practica.EstructurasDeControlVariadas2.AfianzarTeoriaMetodos;

import java.util.Scanner;

public class Ejercicio2 {
    static Scanner teclado = new Scanner(System.in);
    static final int DOBLE=2;
    static final int TRIPLE=3;
    public static void main(String[] args) {
        int numero;
        do {
            System.out.print("Introduce un número (Escribe 0 para salir): ");
            numero=leerNumero();
            System.out.println();
            comprobarNumero(numero);
        }while (numero!=0);
    }

    public static int leerNumero(){
        return teclado.nextInt();
    }

    public static void comprobarNumero(int numero){
        if (numero==0){
            System.out.println("Fin");
        }else if (numero>8){
            visualizarDoble(numero);
        }else {
            visualizarTriple(numero);
        }
    }

    public static void visualizarDoble(int numero){
        System.out.println("¡Es mayor que 8! El doble de "+numero+" es "+(numero*DOBLE));
    }
    public static void visualizarTriple(int numero){
        System.out.println("¡Es menor que 8! El triple de "+numero+" es "+(numero*TRIPLE));
    }
}
