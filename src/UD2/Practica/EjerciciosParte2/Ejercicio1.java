package UD2.Practica.EjerciciosParte2;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int numero=meterPosicion();
        calcularNumero(numero);
    }
    public static int meterPosicion(){
        int numero=0;
        do {
            System.out.print("Escribe un valor (Debe ser superior a 0): ");
            numero= teclado.nextInt();
        }while (numero<=0);
        return numero;
    }
    public static void calcularNumero(int numero){
        // Numero = Posición
        int numeroA=0,numeroB=1;
        for (int i=0;i<numero;i++){
            int numeroC=numeroA+numeroB;
            numeroA=numeroB;
            numeroB=numeroC;
        }
        System.out.println("La posición "+numero+" de la serie es "+numeroB);
    }
}
