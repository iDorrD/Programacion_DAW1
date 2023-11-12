package UD2.Practica.EjerciciosParte2;

import java.util.Scanner;

public class Ejercicio2 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int numero=0;
        do {
            numero=leerEntero();
            if (numero!=0){
                comprobarNumero(numero);
            }
        }while (numero!=0);

    }

    // Escribir un número valido de 4 digitos.
    public static int leerEntero(){
        int numero;
        do {
            System.out.print("\nIntroduce un valor de 4 dígitos (Escribe '0' para salir): ");
            numero= teclado.nextInt();
        }while (numero<0||(numero>9999));
        return numero;
    }

    // Muestra por pantalla si el número introducido es impar o par.
    public static void comprobarNumero(int numero){
        int digitoImpar=determinarParImpar(numero);
        if (digitoImpar==0){
            System.out.println("El número "+numero+" tiene todos los dígitos pares.");
        }else {
            System.out.println("El número "+numero+" tiene dígitos impares (el "+digitoImpar+").");
        }
    }

    // Busca y determina el dígito impar, y devuelve un número; si retorna el valor 0,
    // indica que no hay ningún impar. En caso de encontrar un número, indicará retornando otro valor distinto de 0.
    public static int determinarParImpar(int numero){
        int incorrecto=0;
        while (numero>0){
            int digito=numero%10;
            if (digito%2!=0){
                incorrecto=digito;
            }
            numero=numero/10;
        }
        return incorrecto;
    }
}
