package UD2.Teoria.Metodos.Extra.Parte3;
import java.util.*;
public class Ejercicio1 {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce el número de filas: ");
        int filas=introducirNumero();
        System.out.print("Introduce el número de columnas: ");
        int columnas=introducirNumero();
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static int introducirNumero(){
        return teclado.nextInt();
    }
}
