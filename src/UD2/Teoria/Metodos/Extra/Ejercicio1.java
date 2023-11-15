package UD2.Teoria.Metodos.Extra;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner teclado = new Scanner(System.in);
    final static int NUMERO_A=2,NUMERO_B=5;
    public static void main(String[] args) {
        System.out.print("Introduce un número (Escribe '0' para salir): ");
        int numero1=introducirNumero();
        int numero2=introducirNumero();
        imprimir(numero1,numero2);
    }

    public static int introducirNumero(){
        int numero=0;
        int contador=0;
        do {
            numero= teclado.nextInt();
            if (numero==NUMERO_A){
                contador++;
            } else if (numero==NUMERO_B) {
                contador++;
            }
        }while (numero!=0);
        return numero;
    }

    public static void imprimir(int numero1,int numero2){
        System.out.println("Sale "+numero1+" el valor "+NUMERO_A+"\nSale "+numero2+" el valor "+NUMERO_B);
    }
}
