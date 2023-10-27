package UD2.Practica.EstructurasDeControlVariadas;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        int sumaNatural=0,sumaPares=0,sumaImpares=0,sumaCuadrados=0;
        final int LIMITE=20;
        // Validar el valor entre 1 y 20
        do {
            System.out.print("Introduce un valor entre 1 y 20: ");
            n= teclado.nextInt();
            if (n>LIMITE||n<1){
                System.out.println("[ERROR] ¡El número debe ser entre 1 y 20!");
            }
        }while (n>LIMITE||n<1);

        // Resultado
        for (int i=1;i<=n;i++){
            sumaNatural=sumaNatural+i;
            if (i%2==0){
                sumaPares=sumaPares+i;
            }else {
                sumaImpares=sumaImpares+i;
            }
            sumaCuadrados=sumaCuadrados+(i*i); // sumaCuadrados+=i*i;
        }
        System.out.println("Suma de los numeros naturales: "+sumaNatural);
        System.out.println("Suma de los números pares: "+sumaPares);
        System.out.println("Suma de los números impares: "+sumaImpares);
        System.out.println("Suma de los cuadrados: "+sumaCuadrados);

    }
}
