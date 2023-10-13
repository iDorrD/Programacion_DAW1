package UD2.Teoria;

import java.util.Scanner;

public class While2_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean loop=true;
        int contador=0,suma=0,numero;
        while (loop){
            System.out.print("Introduce un número (introduce el valor 7 para salir): ");
            numero= teclado.nextInt();
            if (numero!=7){
                suma=suma+numero;
                contador++;
            }else {
                loop=false;
            }
        }
        System.out.println("Números que has escrito: "+contador);
        System.out.println("Total: "+suma);
    }
}
