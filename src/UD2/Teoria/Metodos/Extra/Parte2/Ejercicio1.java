package UD2.Teoria.Metodos.Extra.Parte2;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int numero=meterNumero();
        String binario=convertirDecimal(numero);
        imprimir(binario);
    }
    public static int meterNumero(){
        int numero;
        do {
            System.out.print("Introduce un número positivo (El '0' está permitido): ");
            numero= teclado.nextInt();
        }while (numero<0);
        return numero;
    }

    public static String convertirDecimal(int numero){
        String binario="";
        while (numero>0){
            int residuo=numero%2;
            binario=residuo+binario;
            numero=numero/2;
        }
        return binario;
    }

    public static void imprimir(String binario){
        System.out.println("Resultado: "+binario);
    }
}
