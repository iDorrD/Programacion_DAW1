package UD2.Practica.EjerciciosParte1;

import java.util.Scanner;

public class Ejercicio2 {
    static Scanner teclado=new Scanner(System.in);
    static final int IVA=21;
    public static void main(String[] args) {
        double precio=leerNumero();
        double resultado=calcularPrecio(precio);
        imprimir(precio,resultado);
    }
    public static double leerNumero(){
        System.out.print("Ingresa el precio del producto: ");
        return teclado.nextDouble();
    }
    public static double calcularPrecio(double precio){
        return precio+(precio*IVA/100);
    }
    public static void imprimir(double precio,double resultado){
        System.out.println("El precio "+precio+"€ con IVA ("+IVA+"%) son: "+String.format("%.2f",resultado)+"€");
    }
}
