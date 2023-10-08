package UD2.Practica;
/**/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        boolean lluvia=false,sol=false;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la temperatura de ayer: ");
        int temperaturaAyer = teclado.nextInt() ;
        System.out.print("Introduce la temperatura de hoy: ");
        int temperaturaHoy = teclado.nextInt() ;
        teclado.nextLine();
        System.out.println("¿Hoy lluve o hace sol? Escribe 'llueve' o 'sol'.");
        String tiempo = teclado.nextLine();
        if (tiempo.equalsIgnoreCase("llueve")){
            lluvia=true;
        } else if (tiempo.equalsIgnoreCase("sol")) {
            sol=true;
        }
        // A
        if (temperaturaHoy>20&&lluvia){
            System.out.println("Hace calor pero está lloviendo.");
            System.out.println("Entre ayer y hoy la temperatura fue de: "+(temperaturaAyer+temperaturaHoy));
            System.out.println("Mañana habrá "+(temperaturaHoy+5));
        } else {
            System.out.print("Parece que llega el otoño ");
            if (sol){
                System.out.print("pero luce el sol.");
            }else {
                System.out.print("y llueve.");
            }
        }
    }
}
