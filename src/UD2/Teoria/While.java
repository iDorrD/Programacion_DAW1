package UD2.Teoria;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = teclado.nextInt(); // Ingresas un número
        if (numero>1){
            while (numero>0){ // Un bucle hasta que llegue a 0
                System.out.println(numero+" ");
                numero--;
            }
        }else {
            while (numero<0) {
                System.out.println(numero+" ");
                numero++;
            }
        }
    }
}