package UD3.Practica.Ejercicio2;

import java.util.Scanner;

public class Principal {
    static Scanner teclado = new Scanner(System.in);
    public Principal(){
        System.out.print("Introduce las existencias: ");
        int existencias= teclado.nextInt();
        MaquinaExpendedora maquinaExpendedora = new MaquinaExpendedora("Pañuelos de papel",5,0.90);
        while (true){
            maquinaExpendedora.tragarMoneda();
            maquinaExpendedora.vender();
            maquinaExpendedora.devolverMonedas();
            System.out.println(maquinaExpendedora.toString());
        }

    }
    public static void main(String[] args) {
        Principal principal = new Principal();
    }
}
