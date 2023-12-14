package UD3.Practica.Ejercicio2;

import java.util.Scanner;

public class Principal {
    static Scanner teclado = new Scanner(System.in);
    public Principal(){
        System.out.print("Introduce las existencias: ");
        int existencias= teclado.nextInt();
        MaquinaExpendedora maquinaExpendedora = new MaquinaExpendedora(existencias);
        while (true){
            maquinaExpendedora.setMonedero(maquinaExpendedora.tragarMoneda());
            maquinaExpendedora.vender();
            maquinaExpendedora.setMonedero(maquinaExpendedora.devolverMonedas());
            System.out.println(maquinaExpendedora.toString());
        }

    }
    public static void main(String[] args) {
        Principal principal = new Principal();
    }
}
