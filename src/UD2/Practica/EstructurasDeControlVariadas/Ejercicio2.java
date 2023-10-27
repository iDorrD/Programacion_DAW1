package UD2.Practica.EstructurasDeControlVariadas;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero=0;
        final int LIMITE=7;
        do {
            System.out.print("Escribe un número positivo menor que 7: ");
            numero= teclado.nextInt();
            if (numero<=LIMITE&&numero>0){
                System.out.println("[ERROR] Escribe un valor entre 0 a 6.");
            }
        }while (numero>=LIMITE||numero<0);

        // Calcular el factorial
        // int resultado = 0;
        System.out.print(numero+" = ");
        int factorial=1;
        System.out.print("1*");
        for (int i=2;i<=numero;i++){
            factorial=factorial*i; // factorial *= i;
            if (i<numero){
                System.out.print(i+"*");
            }else {
                System.out.print(i);
            }
        }
        if (factorial!=0){
            System.out.println(" = "+factorial);
        }else {
            System.out.println(factorial);
        }

    }
}
