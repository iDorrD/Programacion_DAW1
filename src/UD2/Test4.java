package UD2;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //Multiplicar 2 numeros (int positivos) mediante sumas sucesivas
        final int VALOR=4; // ¿Cuantas veces queremos multiplicar el número?
        Scanner teclado = new Scanner(System.in);
        int resultado=1; // Inicializamos resultado en 1 para la multiplicación
        int contador=0; // Iniciamos el contador
        do {
            System.out.print("Ingresa un número: ");
            int numero = teclado.nextInt();
            if (numero>0){
                resultado=resultado*numero;
                contador++;
            }else {
                System.out.println("¡El número debe ser positivo y mayor que 0!");
            }
        } while (contador<VALOR);
        System.out.println("El resultado de la multiplicación es: "+resultado);
        int suma = 0;
        contador = 0; // Se reinicia el contador
        do {
            suma=suma+resultado;
            contador++;
        } while (contador<resultado);
        System.out.println("El resultado de la suma de "+resultado+" veces "+resultado+" es: "+suma);
    }
}
