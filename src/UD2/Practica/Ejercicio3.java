package UD2.Practica;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la presión que tiene nuestra caldera de la calefacción: ");
        float presion = teclado.nextFloat();
        String nombre=null;
        if (presion>2){
            System.out.println("Abrir válvula de seguridad.");
            presion=presion-1;
        }else {
            System.out.print("Escribe tu nombre: ");
            nombre= teclado.next();
            System.out.println("Todo está bien "+nombre);
        }
    }
}
