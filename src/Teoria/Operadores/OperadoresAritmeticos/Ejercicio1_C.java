package Teoria.Operadores.OperadoresAritmeticos;

public class Ejercicio1_C {
    public static void main(String[] args) {
        // Declaramos 2 variables cociente y resto
        byte cociente,resto;
        // Indicamos que el cociente es 16/3
        cociente=16/3;
        // Y el resto de 16 de 3
        resto=16%3;
        System.out.println("c) Resultado:\n    Cociente: "+cociente+"\n    Resto: "+resto);
        // Esta variable nos hace el resultado del cociente con decimal
        double cociente_decimal=(double) 16/3;
        System.out.print("    Cociente con decimal: ");
        // Aviso: Aqui indico un rango máximo de decimal
        System.out.printf("%.2f",cociente_decimal);
    }
}
