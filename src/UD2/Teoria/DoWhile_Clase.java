package UD2.Teoria;

import java.util.Scanner;

public class DoWhile_Clase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        // Se hace un bucle hasta que introduzcamos un valor de 1 a 10
        for (int i=1;i<3;i++){
            for (int j=0;j<2;j++){
                System.out.println(i+" "+j);
            }
        }
    }
}
