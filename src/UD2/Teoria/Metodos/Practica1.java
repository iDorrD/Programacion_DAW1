package UD2.Teoria.Metodos;

import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Meter número: ");
        int operador1= teclado.nextInt();
        System.out.print("Meter número: ");
        int operador2= teclado.nextInt();
        sacarResultado(operador1,operador2);
    }

    // Crear sacarResultado()
    public static void sacarResultado(int n1,int n2){
        System.out.println("La suma de "+n1+"+"+n2+" es: "+(n1+n2));
    }


}

