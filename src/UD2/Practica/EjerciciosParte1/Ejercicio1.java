package UD2.Practica.EjerciciosParte1;

import java.util.Scanner;

public class Ejercicio1 {
    static final double LIBRAS=0.87,DOLARES=1.11,YENES=120.63;
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        double euros=0;
        String moneda=null;
        double resultado;
        do {
            euros=introducirEuros();
            do {
                moneda=introducirMoneda();
                if (!(moneda.equalsIgnoreCase("libras")||moneda.equalsIgnoreCase("dolares")||moneda.equalsIgnoreCase("yenes")||(moneda.equalsIgnoreCase("fin")))){
                    System.out.println("\n[ERROR] Introduce una moneda válida o escribe 'Fin' para finalizar.\n");
                }
            }while (!(moneda.equalsIgnoreCase("libras")||moneda.equalsIgnoreCase("dolares")||moneda.equalsIgnoreCase("yenes")||moneda.equalsIgnoreCase("fin")));
            if (!moneda.equalsIgnoreCase("fin")){
                resultado=cambiarMoneda(moneda,euros);
                imprimir(resultado);
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

    // Convierte los euros introducidos, a la moneda concretamente.
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

    // Imprime el resultado, además de acompañarlo con su correcto símbolo de economía
    public static void imprimir(double resultado){
        System.out.println("\nResultado: "+String.format("%.2f",resultado));
    }
}
