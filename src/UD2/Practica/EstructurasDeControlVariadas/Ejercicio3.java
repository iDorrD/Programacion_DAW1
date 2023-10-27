package UD2.Practica.EstructurasDeControlVariadas;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mes=0;
        int dias=0;
        do {
            System.out.print("Introduce el mes [1-12]: ");
            mes= teclado.nextInt();
        }while (mes<=0||mes>12);
        System.out.print("Introduce el año: ");
        int anio= teclado.nextInt();
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias=30;
                break;
            case 2:
                if ((anio%4==0&&anio%100!=0)||(anio %400==0)){ // anio%4==0
                    dias=29;
                }else {
                    dias=28;
                }
                break;
        }
        System.out.println("El mes "+mes+" tiene "+dias+" días, del año "+anio+".");
    }
}
