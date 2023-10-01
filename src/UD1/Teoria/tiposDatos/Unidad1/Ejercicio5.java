package UD1.Teoria.tiposDatos.Unidad1;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Declaramos y ponemos su tipo de datos en SHORT
        final byte edad_juan=20;
        byte edad_pedro= (byte) (edad_juan+1);
        short sueldo_juan=1980,sueldo_pedro=800;
        // Sacamos por pantalla
        System.out.println("Edad Juan: "+edad_juan+"\nEdad Pedro: "+edad_pedro);
        short sueldoTotal=(short) (sueldo_juan+sueldo_pedro);
        System.out.println("Ganan entre los 2: "+sueldoTotal);
    }
}
