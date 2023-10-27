package UD2.Practica.EstructurasDeControlVariadas.Extra;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1,numero2;
        int producto=0;

        // Hace la validación de que los números sean positivos
        do {
            System.out.println("Introduce dos números enteros positivos: ");
            numero1= teclado.nextInt();
            numero2= teclado.nextInt();
        }while (numero1<0||numero2<0);

        // Obtener el producto
        for (int i=1;i<=numero1;i++){
            producto=producto+numero1;
        }

        // Imprimir por pantalla
        System.out.println("El producto de "+numero1+" y "+numero2+" es "+producto);
    }
}
