package UD2.Practica.EjerciciosParte2;

import java.util.*;

public class Ejercicio2 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int numero=0;
        do {
            numero=leerEntero();
            if (numero!=0){
                comprobarNumero(numero);
            }
        }while (numero!=0);
    }

    // Escribir un número valido de 4 digitos.
    public static int leerEntero(){
        int numero;
        boolean valido;
        do {
            System.out.print("Introduce un valor de 4 dígitos (Escribe '0' para salir): ");
            numero= teclado.nextInt();
            valido=(numero==0);
            if (!(valido)&&(numero<1000)||(numero>9999)){
                System.out.println("[ERROR] ¡Tiene que ser un valor de 4 dígitos!");
            }
            System.out.println();
        }while (!(valido)&&(numero<1000)||(numero>9999));
        return numero;
    }

    // Muestra por pantalla si el número introducido es impar o par.
    public static void comprobarNumero(int numero){
        int digitoImpar=determinarParImpar(numero);
        if (digitoImpar==0){
            System.out.println("El número "+numero+" tiene todos los dígitos pares.");
        }else {
            System.out.println("El número "+numero+" tiene dígitos impares (el "+digitoImpar+").");
        }
    }

    // Busca y determina el dígito impar, y devuelve un número; si retorna el valor 0,
    // indica que no hay ningún impar. En caso de encontrar un número, indicará retornando otro valor distinto de 0.
    public static int determinarParImpar(int numero){
        int incorrecto=0; // Si devuelve el valor 0, es que no hay ningún impar.
        while (numero>0){ // Pasa por un bucle, hasta revisar los 4 dígitos. (En este caso)
            int digito=numero%10; // Realiza la operación, para sacer si es impar.
            if (digito%2!=0){ // Entra en este IF si detecta algún impar
                incorrecto=digito; // Cuando lo encuentre, en el valor 'incorrecto' se pondrá el dígito que es impar.
            }
            numero=numero/10;
        }
        return incorrecto; // Retorna el valor o el digito incorrecto.
    }
    // Eso sí, devuelve el primer dígito que encuentre. Si hay más impares, los ignora.

}
