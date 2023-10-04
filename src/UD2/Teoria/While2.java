package UD2.Teoria;

import java.util.Scanner;

public class While2 {
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
        System.out.println();
        System.out.println("Cantidad de número ingresados: "+contador);
        System.out.println("Suma total de los números: "+suma);
    }
}
