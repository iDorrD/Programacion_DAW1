package UD1.Teoria.tiposDatos.Unidad1;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Declaramos el precio del pan y el kilo de queso
        final float PRECIO_PAN=0.87f;
        final float KILO_QUESO=13.1f;
        final float GRAMOS=0.15f;
        float bocadillo=PRECIO_PAN+KILO_QUESO*GRAMOS;
        // Sacamos por pantalla con su formula correspondiente
        System.out.println(String.format("El bocadillo nos cuesta: %.2f",bocadillo)+"€");
        System.out.printf("%.2f",bocadillo);
        //System.out.println("Debo pagar por un bocadillo "+(precio_pan+kilo_queso*150/1000));
    }
}
