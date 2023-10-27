package UD2.Teoria.Metodos.PracticaUno;

import java.util.Scanner;

public class Practica1_Con {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Practica1_Sin practica1Sin = new Practica1_Sin();

        int n1= teclado.nextInt();
        int n2= teclado.nextInt();
        int resultado = practica1Sin.sumarNumeros(n1,n2);
        System.out.println(resultado);
    }
}
