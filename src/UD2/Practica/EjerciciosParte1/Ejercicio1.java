package UD2.Practica.EjerciciosParte1;

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
                if (!(moneda.equalsIgnoreCase("libras")||moneda.equalsIgnoreCase("dolares")||moneda.equalsIgnoreCase("yenes")||(moneda.equalsIgnoreCase("fin")))){
                    System.out.println("\n[ERROR] Introduce una moneda válida o escribe 'Fin' para finalizar.\n");
                }
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
        switch (tipoMoneda){
            case "libras":
                euros=euros*LIBRAS;
                break;
            case "dolares":
                euros*=DOLARES;
                break;
            case "yenes":
                euros*=YENES;
                break;
        }
        return euros;
    }

    public static void imprimir(double euros,double resultado,String moneda){
        String formato=null;
        switch (moneda){
            case "libras":
                formato="£";
                break;
            case "dolares":
                formato="$";
                break;
            case "yenes":
                formato="¥";
                break;
        }
        System.out.println("Resultado: "+String.format("%.2f",resultado)+formato);
    }

}
