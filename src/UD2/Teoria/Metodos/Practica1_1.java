package UD2.Teoria.Metodos;

import java.util.Scanner;

public class Practica1_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Meter número: ");
        int operador1= teclado.nextInt();
        System.out.print("Meter número: ");
        int operador2= teclado.nextInt();
        int resultado=sumarNumeros(operador1,operador2);
        sacarResultado(operador1,operador2,resultado);
    }

    public static int sumarNumeros(int n1,int n2){
        return n1+n2;
    }

    // Crear sacarResultado()
    public static void sacarResultado(int n1,int n2,int resultado){
        System.out.println("La suma de "+n1+"+"+n2+" es: "+resultado);
    }


}

