package UD2.Teoria;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número que represente un mes (1-4): ");
        int mes = teclado.nextInt();
        String nombreMes;
        switch (mes){
            case 1:
                nombreMes="Enero";
                break;
            case 2:
                nombreMes="Febrero";
                break;
            case 3:
                nombreMes="Marzo";
                break;
            case 4:
                nombreMes="Abril";
                break;
            default:
                nombreMes="no válido.";
                break;
        }
        if (mes<4||mes>0){
            System.out.println("Mes: "+nombreMes);
        }else {
            System.out.println("Mes: no valido");
        }

    }
}
