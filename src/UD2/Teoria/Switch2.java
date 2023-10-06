package UD2.Teoria;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("MENU\n1) Realizar operación\n2) Caracteres");
        int numero= teclado.nextInt();
        switch (numero){
            case 1:
                System.out.println("Introduce el numero 1: ");
                int operador1 = teclado.nextInt();
                System.out.println("Introduce el numero 2: ");
                int operador2 = teclado.nextInt();
                System.out.println("introduce el caracter (+ - * /)");
                String caracterIntroducido = teclado.next();
                char caracter=caracterIntroducido.charAt(0);
                int resultado =0;
                switch (caracter){
                    case '+':
                        resultado=operador1+operador2;
                        break;
                    case '-':
                        resultado=operador1-operador2;
                        break;
                    case '*':
                        resultado=operador1*operador2;
                        break;
                    case '/':
                        if (operador1==0&&operador2==0){
                            System.out.println("No es válido");
                        }else {
                            resultado=operador1/operador2;
                        }
                        break;
                }
                System.out.println("Resultado: "+resultado);
                break;
            case 2:
                System.out.println("Introduce el caracter Nº1: ");
                String caracter1 = teclado.next();
                char caracter_1 = caracter1.charAt(0);
                System.out.println("Introduce el caracter Nº2: ");
                caracter1 = teclado.next();
                char caracter_2 = caracter1.charAt(0);
                System.out.println(caracter_1+" "+caracter_2);
                break;
        }
    }
}
