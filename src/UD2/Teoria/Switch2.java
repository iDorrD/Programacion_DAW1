package UD2.Teoria;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe 1 o 2: ");
        int numero= teclado.nextInt();
        switch (numero){
            case 1:
                System.out.println("Introduce dos numeros: ");
                int operador1 = teclado.nextInt();
                int operador2 = teclado.nextInt();
                System.out.println("introduce el caracter (+ - * /)");
                String caracterIntroducido = teclado.next();
                char caracter=caracterIntroducido.charAt(0);
                int resultado =0;
                if (caracter=='+'){
                    resultado=operador1+operador2;
                } else if (caracter=='-') {
                    resultado=operador1-operador2;
                } else if (caracter=='*') {
                    resultado=operador1*operador2;
                }else {
                    resultado=operador1/operador2;
                }
                System.out.println("Resultado: "+resultado);
                break;
            case 2:
                System.out.println("Introduce dos caracteres: ");
                String caracter1 = teclado.next();
                String caracter2 = teclado.next();
                char caracter_1 = caracter1.charAt(0);
                char caracter_2 = caracter2.charAt(0);
                System.out.println(caracter_1+" "+caracter_2);
                break;
        }
    }
}
