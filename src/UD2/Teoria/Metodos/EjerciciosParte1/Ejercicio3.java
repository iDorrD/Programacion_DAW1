package UD2.Teoria.Metodos.EjerciciosParte1;

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
    public static double calcularHipotenusa(double c1,double c2){
        return Math.sqrt(Math.pow(c1,2)+Math.pow(c2,2));
    }
    public static void empezar(){
        double c1=meterCateto();
        double c2=meterCateto();
        double hipotenusa=calcularHipotenusa(c1,c2);
        System.out.println("Resultado: "+String.format(("%.2f"),hipotenusa));
    }
}
