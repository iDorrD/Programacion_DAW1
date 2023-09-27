package Teoria.Operadores.OperadoresAritmeticos;

public class Ejercicio1_B {
    public static void main(String[] args) {
        // Declaramos la variable impuesto2 y dividimos 12x2.0(2)
        byte impuesto2 = (byte) (12/2);
        // Luego, restamos -8
        // Aviso: Realicé un cast por que el numero 8 es un entero (int), para que la operacion se haga correctamente hago un cast para su conversión completa.
        impuesto2=(byte)(impuesto2-8);
        System.out.println("b) Resultado: "+impuesto2);
    }
}
