package UD2.Practica;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe tu edad por teclado: ");
        int edadPropia = teclado.nextInt();
        System.out.print("Escribe la edad de tu compañero: ");
        int edadCompa = teclado.nextInt();
        if (edadPropia<edadCompa){
            System.out.println("Soy más joven que mi compañero.");
        }else if(edadPropia>edadCompa) {
            System.out.println("Mi compañero es más joven que yo");
        } else if (edadPropia==edadCompa) {
            System.out.println("Somos de la misma edad.");
        }
    }
}
