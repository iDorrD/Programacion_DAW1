package UD2.Teoria;
import java.util.*;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre=null;
        int edad=0;
        nombre=teclado.nextLine();
        edad= teclado.nextInt();
        System.out.println("Edad: "+edad+"\nNombre: "+nombre);
    }
}
