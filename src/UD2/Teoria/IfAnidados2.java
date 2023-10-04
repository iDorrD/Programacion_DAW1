package UD2.Teoria;

import java.util.Scanner;

public class IfAnidados2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número que represente un mes (1-4): ");
        int mes = teclado.nextInt();
        if(mes==1){
            System.out.println("Enero");
        } else if (mes==2) {
            System.out.println("Febrero");
        } else if (mes==3) {
            System.out.println("Marzo");
        } else if (mes==4) {
            System.out.println("Abril");
        }else {
            System.out.println("No es ninguno de los cuatro primeros meses.");
        }
    }
}
