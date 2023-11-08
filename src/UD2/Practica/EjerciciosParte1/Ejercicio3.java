package UD2.Practica.EjerciciosParte1;

import java.util.Scanner;

public class Ejercicio3 {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
        empezar();
    }
    public static double meterCateto(){
        System.out.print("Introduce el valor del cateto: ");
        return teclado.nextDouble();
    }
    public static double calcularHipotenusa(double c){
        return Math.sqrt(c*c+c*c);
    }
    public static void empezar(){
        double c=meterCateto();
        double hipotenusa=calcularHipotenusa(c);
        System.out.println("La hipotenusa del triángulo rectángulo es: "+String.format(("%.2f"),hipotenusa));
    }
}
