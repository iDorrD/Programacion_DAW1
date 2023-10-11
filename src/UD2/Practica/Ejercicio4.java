package UD2.Practica;
/**/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        final int VALOR=20;
        boolean lluvia=false,sol=false; // Se declaró booleans para el IF
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la temperatura de ayer: ");
        int temperaturaAyer = teclado.nextInt() ;
        System.out.print("Introduce la temperatura de hoy: ");
        int temperaturaHoy = teclado.nextInt() ;
        teclado.nextLine();
        System.out.println("¿Hoy lluve o hace sol? Escribe 'llueve' o 'sol'.");
        String tiempo = teclado.nextLine();
        if (temperaturaHoy>VALOR&&tiempo.equals("llueve")){
            System.out.println("Hace calor pero está lloviendo");
            System.out.println("Entre ayer y hoy la temperatura fue de "+(temperaturaHoy+temperaturaAyer));
            System.out.println("Mañana habrá "+(temperaturaHoy+5));
        }else{
            System.out.print("Parece que llega el otoño ");
            if (tiempo.equals("sol")){
                System.out.println("y luce sol.");
            }else {
                System.out.println("y llueve.");
            }
        }
    }
}
