package UD2.Teoria.Metodos.Extra;

import java.util.*;

public class Ejercicio2 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int numero1=meterNumero();
        int numero2=meterNumero();
        int resultado=obtenerProducto(numero1,numero2);
        imprimir(numero1,numero2,resultado);
    }

    public static int meterNumero(){
        int numero;
        do {
            System.out.print("Introduce el valor del número: ");
            numero= teclado.nextInt();
            if (numero<0){
                System.out.println("ERROR: El valor debe ser positivo.");
            }
        }while (numero<0);
        return numero;
    }

    public static int obtenerProducto(int numero1,int numero2){
        int producto=0;
        for (int i=0;i<numero2;i++){
            producto=producto+numero1;
        }
        return producto;
    }

    public static void imprimir(int numero1,int numero2, int resultado){
        System.out.print("El "+numero1+" con "+numero2+" su producto es "+resultado);
    }
}
