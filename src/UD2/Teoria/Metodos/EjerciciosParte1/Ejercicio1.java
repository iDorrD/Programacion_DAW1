package UD2.Teoria.Metodos.EjerciciosParte1;

import java.util.Scanner;

public class Ejercicio1 {
    static final double LIBRAS=0.87,DOLARES=1.11,YENES=120.63;
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        double euros=0;
        String moneda=null;
        double resultado;
        euros=introducirEuros();
        do {
            System.out.println("\nEuros introducidos: "+euros+"€");
            do {
                moneda=introducirMoneda();
            }while (!(moneda.equalsIgnoreCase("libras")||moneda.equalsIgnoreCase("dolares")||moneda.equalsIgnoreCase("yenes")||moneda.equalsIgnoreCase("fin")));
            if (!moneda.equalsIgnoreCase("fin")){
                resultado=cambiarMoneda(moneda,euros);
                imprimir(euros,resultado,moneda);
            }
        }while (!moneda.equalsIgnoreCase("fin"));


    }

    // Introducimos la cantidad de euros
    public static double introducirEuros(){
        System.out.print("Ingresa la cantidad de euros: ");
        return teclado.nextDouble();
    }

    // Introduciremos la moneda
    public static String introducirMoneda(){
        System.out.print("Ingresa la moneda (Escribe 'Fin' para salir):\n [Libras] [Dolares] [Yenes]\n > ");
        return teclado.next();
    }
    public static double cambiarMoneda(String tipoMoneda,double euros){
        // Libras
        if (tipoMoneda.equalsIgnoreCase("libras")){
            euros=euros*LIBRAS;
        }
        // Dolares
        else if (tipoMoneda.equalsIgnoreCase("dolares")){
            euros=euros*DOLARES;
        }
        // Yenes
        else {
            euros=euros*YENES;
        }
        return euros;
    }

    public static void imprimir(double euros,double resultado,String moneda){
        System.out.println("Has ingresado: "+euros+"€\n >>> "+moneda+" >>>\nResultado: "+resultado);
    }

}
