package UD2.Practica.EstructurasDeControlVariadas2;

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Math.sqrt(?) - Calcular la raiz cuadrada
        Scanner teclado = new Scanner(System.in);

        double a,b,c,discriminante;
        double raiz,raiz1,raiz2;

        System.out.print("Ingrese el valor de a (debe ser distinto de cero): ");
        a = teclado.nextDouble();

        // Comprueba si el valor A es 0
        if (a==0) {
            System.out.println("[ERROR] El valor de 'a' debe ser distinto de cero.");
        }else {
            System.out.print("Ingrese el valor de b: ");
            b=teclado.nextDouble();

            System.out.print("Ingrese el valor de c: ");
            c=teclado.nextDouble();

            // Se usa para determinar la cantidad y naturaleza de las raíces
            discriminante =b*b-4*a*c;

            if (discriminante<0) {
                // No existen raíces reales si el discriminante es menor que cero.
                System.out.println("No existen raíces reales.");
            } else if (discriminante == 0) {
                // Solo existe una raíz real si el discriminante es igual a cero.
                raiz = -b / (2 * a);
                System.out.println("Solo existe una raíz real: x= "+raiz);
            }
            else {
                // Existen dos raíces reales si el discriminante es mayor que cero.
                raiz1=(-b+Math.sqrt(discriminante))/(2*a);
                raiz2=(-b-Math.sqrt(discriminante)) /(2 * a);
                System.out.println("Existen dos raíces reales: x1 = "+raiz1+" y x2 = "+raiz2);
            }
        }
    }
}
