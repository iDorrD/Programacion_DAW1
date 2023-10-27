package UD2.Practica.EstructurasDeControlVariadas;

import java.util.Scanner;

public class Ejercicio3_v2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mes,dias;
        do {
            System.out.print("Introduce el mes [1-12]: ");
            mes= teclado.nextInt();
        }while (mes<=0||mes>12);
        System.out.print("Introduce el año: ");
        int anio= teclado.nextInt();

            if (mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
                dias=31;
            } else if (mes==2) {
                if ((anio%4==0&&anio%100!=0)||(anio %400==0)){ // anio%4==0
                    dias=29;
                }else {
                    dias=28;
                }
            } else {
                dias=30;
            }
        System.out.println("El mes "+mes+" tiene "+dias+" días, del año "+anio+".");
    }
}
