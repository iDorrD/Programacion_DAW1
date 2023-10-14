package UD2;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //Multiplicar 2 numeros (int positivos) mediante sumas sucesivas
        Scanner teclado = new Scanner(System.in);
        int numero1=0;
        int numero2=0;
        int multiplicacion=0;
        int division=0;
        int contador=numero2; // Contador = número de veces para la suma
        do {
            System.out.print("Escribe el valor N1: ");
            numero1= teclado.nextInt();
            System.out.print("Escribe el valor N2: ");
            numero2= teclado.nextInt();
            if (numero2>0){
                contador++;
            }
        }while (numero1<0||numero2<0);
        System.out.println("Veces multiplicado "+contador);
        //multiplicacion=;
        //division=multiplicacion/numero2;


    }
}
