package UD2.Practica.EjerciciosParte2;

import java.util.Scanner;

public class Ejercicio2 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int numero=0;
        do {
            numero=leerEntero();
            numero=comprobarNumero(numero);
        }while (numero!=0);

    }
    public static int leerEntero(){
        System.out.print("Introduce un valor de 4 dígitos (Escribe '0' para salir): ");
        int numero;
        do {
            System.out.print("Introduce un valor de 4 dígitos (Escribe '0' para salir): ");
            numero= teclado.nextInt();
        }while (numero<0||(numero>9999&&numero!=0));
        return teclado.nextInt();
    }
    public static void comprobarNumero(int numero){
        boolean esPar=determinarParImpar(numero);
        if (esPar){
            System.out.println("El número "+numero+" es par.");
        }else {
            System.out.println("El número es impar.");
        }
    }
}
