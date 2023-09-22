package Teoria.Unidad1;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Declaramos y ponemos su tipo de datos en SHORT
        short edad_juan=20,edad_pedro= (short) (edad_juan+1);
        double sueldo_juan=1980,sueldo_pedro=800;
        // Sacamos por pantalla
        System.out.println("Edad Juan: "+edad_juan+"\nEdad Pedro: "+edad_pedro);
        double sueldoTotal=sueldo_juan+sueldo_pedro;
        System.out.println("Ganan entre los 2: "+sueldoTotal);
    }
}
