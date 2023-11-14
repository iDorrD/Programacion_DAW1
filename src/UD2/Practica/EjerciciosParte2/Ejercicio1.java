package UD2.Practica.EjerciciosParte2;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner teclado = new Scanner(System.in);
    // Realiza la llamada a los métodos
    public static void main(String[] args) {
        int numero=meterPosicion();
        calcularNumero(numero);
    }
    // Introduce un valor, y el programa valida si es superior a 0
    public static int meterPosicion(){
        int numero=0;
        do {
            System.out.print("Escribe un valor (Debe ser superior a 0): ");
            numero= teclado.nextInt();
        }while (numero<=0);
        return numero;
    }
    // Se declaran 2 variables locales en el método, y se va incremementando, hasta que el valor sea igual del incrementado.
    public static void calcularNumero(int numero){
        // Numero = Posición
        int numeroA=0,numeroB=1;
        if(numero==1){
            System.out.println("La posición "+numero+" de la serie es 0");
        }else if(numero==2){
            System.out.println("La posición "+numero+" de la serie es 1");
        }else {
            for (int i=0;i<numero;i++){
                int numeroC=numeroA+numeroB;
                numeroA=numeroB;
                numeroB=numeroC;
            }
            System.out.println("La posición "+numero+" de la serie es "+numeroB);
        }
    }
}
