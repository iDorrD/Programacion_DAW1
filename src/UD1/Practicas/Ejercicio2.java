package UD1.Practicas;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Definir los precios
        double precioBolloDePan = 0.87; // En céntimos
        double precioKiloDeQueso = 13.10; // En euros

        // Peso del queso en gramos
        int pesoQuesoGramos = 150;

        // Convertir el precio del queso a céntimos
        double precioQuesoCentimos = precioKiloDeQueso * 100; // 1 euro = 100 céntimos

        // Calcular el costo del queso para 150 gramos
        double costoQueso = (precioQuesoCentimos / 1000) * pesoQuesoGramos;

        // Calcular el costo total del bocadillo sumando el costo del queso al costo del bollo de pan
        double costoTotal = costoQueso + precioBolloDePan;

        // Mostrar el resultado
        System.out.println("El costo total del bocadillo es: " + costoTotal + " céntimos");
    }
}
