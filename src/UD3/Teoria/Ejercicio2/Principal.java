package UD3.Teoria.Ejercicio2;

import java.util.Scanner;

public class Principal {
    static Scanner teclado = new Scanner(System.in);
    public Principal(){
        System.out.print("Escribe la marca: ");
        String marca = teclado.nextLine();
        System.out.print("Escribe el precio (sin IVA): ");
        double precio = teclado.nextDouble();
        Coche coche = new Coche(marca,precio);
        System.out.println("La marca del coche "+coche.getMarca()+" con su precio "+coche.calcularPrecioIVA());
        Coche.empezarConducir();
    }

    public static void main(String[] args) {
        new UD3.Teoria.Ejercicio2.Principal();
    }
}
