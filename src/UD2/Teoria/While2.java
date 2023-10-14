package UD2.Teoria;

import java.util.Scanner;

public class While2 {
    /* Es un programa que nos permita meter una serie de números
    * hasta teclar el número 7. AL final menciona todos los números. */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero,suma=0,contador=0;
        boolean loop=true;
        while (loop){
            System.out.print("Introduce un numero: \n   (!) Recuerda introducir el '7' para detener.\n  > ");
            numero = teclado.nextInt();
            if (numero==7){
                loop=false;
            }else {
                suma+=numero;
                contador++;
            }
        }
        System.out.println("\nCantidad de número ingresados: "+contador);
        System.out.println("Suma total de los números: "+suma);
    }
}
