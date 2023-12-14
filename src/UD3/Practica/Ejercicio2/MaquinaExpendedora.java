package UD3.Practica.Ejercicio2;

import java.util.Scanner;

public class MaquinaExpendedora {
    static Scanner teclado = new Scanner(System.in);
    private String producto;
    private double monedero; // Cajetin que acumula las monedas introducidas
    private int existencias; // Capacidad de la máquina
    private double precio;
    private double gananciasAcumuladas; // Cajetin donde se va acumulando el dinero de los paquetes adquiridos

    public MaquinaExpendedora(int existencias) {
        setProducto("Pañuelos de papel");
        setMonedero(tragarMoneda());
        setExistencias(existencias);
        setPrecio(0.9);
        setGananciasAcumuladas(getMonedero());
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getMonedero() {
        return monedero;
    }

    public void setMonedero(double monedero) {
        this.monedero = monedero;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = Math.abs(existencias);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getGananciasAcumuladas() {
        return gananciasAcumuladas;
    }

    public void setGananciasAcumuladas(double gananciasAcumuladas) {
        this.gananciasAcumuladas = gananciasAcumuladas;
    }

    public double tragarMoneda(){
        int monedas=0;
        while (getMonedero()<getPrecio()){
            do {
                System.out.println("Introduce dinero a la máquina para obtener el paquete de pañuelos: ");
                System.out.print("Solo disponible ingresar:\n> 10\n> 20\n> 50\n> ");
                monedas= teclado.nextInt();
            }while (monedas!=50&&monedas!=20&&monedas!=10);
            switch (monedas){
                case 10:
                    setMonedero(getMonedero()+0.10);
                    break;
                case 20:
                    setMonedero(getMonedero()+0.20);
                    break;
                case 50:
                    setMonedero(getMonedero()+0.50);
                    break;
            }
            System.out.println("Dinero acumulado: "+getMonedero()+"\nTe falta: "+(getPrecio()-getMonedero()));
        }
        return getMonedero();
    }

    public void vender(){
        setExistencias(getExistencias()-1);
        setGananciasAcumuladas(getMonedero());
    }

    public double devolverMonedas(){ // Devuelve la vuelta del dinero
        return (getMonedero()-getPrecio());
    }

    @Override
    public String toString() {
        return "MaquinaExpendedora{" +
                "producto='" + getProducto() + '\'' +
                ", monedero=" + getMonedero() +
                ", existencias=" + getExistencias() +
                ", precio=" + getPrecio() +
                ", gananciasAcumuladas=" + getGananciasAcumuladas() +
                '}';
    }
}
