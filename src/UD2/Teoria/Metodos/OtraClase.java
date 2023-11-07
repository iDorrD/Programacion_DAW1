package UD2.Teoria.Metodos;

import java.util.Scanner;

public class OtraClase {
    static Scanner teclado = new Scanner(System.in);
    public static int sumarNumeros(int num1,int num2){
        return num1+num2;
    }

    // Crear sacarResultado()
    public static void sacarResultado(int n1,int n2,int suma){
        System.out.println("La suma de "+n1+"+"+n2+" es: "+suma);
    }

    // Crear meterNumeros, se crearon 2 métodos.
    public static int meterNumero(){
        int operador;
        System.out.print("Mete operador 1: ");
        operador=teclado.nextInt();
        return operador;
    }
}
