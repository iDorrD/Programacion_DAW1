package UD2.Practica.EjerciciosParte1;

import java.util.Scanner;

public class Ejercicio3_2 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        empezar();
    }
    public static double meterCateto(){
        System.out.print("Introduce el valor del cateto: ");
        return teclado.nextDouble();
    }
    public static double calcularHipotenusa(double c){
        return Math.sqrt(Math.pow(c,2)+Math.pow(c,2));
    }
    public static void empezar(){
        double c=meterCateto();
        double resultado=calcularHipotenusa(c);
        System.out.println("La hipotenusa de "+c+" es "+resultado);
    }
}
