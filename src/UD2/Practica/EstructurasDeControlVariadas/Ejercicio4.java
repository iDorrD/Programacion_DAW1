package UD2.Practica.EstructurasDeControlVariadas;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un numero: ");
        int numero= teclado.nextInt();
        int contador=0;

        System.out.println("Los divisores de "+numero+" son: ");
        for (int i=1;i<=numero;i++){
            if (numero%i==0){
                System.out.print(i+" ");
                contador++;
            }
        }
        System.out.println();
        if (contador==2){
            System.out.println("El número "+numero+" es un número primo.");
        }else {
            System.out.println("El número "+numero+" no es un número primo.");
        }
    }
}
