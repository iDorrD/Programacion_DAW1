package UD2.Practica.EstructurasDeControlVariadas2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Math.sqrt(?) - Calcular la raiz cuadrada
        Scanner teclado = new Scanner(System.in);
        double a,b,c;

        // Realiza la convalidación de que el valor NO sea 0.

            System.out.print("Introduce un valor A: ");
            a= teclado.nextDouble();
            System.out.print("Introduce un valor B: ");
            b= teclado.nextDouble();
            System.out.print("Introduce un valor C: ");
            c= teclado.nextDouble();
            if (a!=0){
                double d=b*b-4*a*c;
                if (d<0){
                    System.out.println("La ecuación no tiene raíces reales.");
                } else if (d==0) {
                    double raiz=(-b/(2*a));
                    System.out.println("La ecuación tiene una raíz real: "+raiz);
                }else {
                    double raiz1=(-b+Math.sqrt(d))/(2*a);
                    double raiz2=(-b-Math.sqrt(d))/(2*a);
                    System.out.println("Las raices reales de la ecuacion son: "+raiz1+" y "+raiz2);
                }
            }
    }
}
