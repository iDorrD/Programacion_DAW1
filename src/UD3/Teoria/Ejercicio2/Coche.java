package UD3.Teoria.Ejercicio2;

public class Coche {
    private String marca;
    private double precio;

    public Coche(String marca, double precio) {
        setMarca(marca);
        setPrecio(precio);
    }

    public Coche() {
        setMarca(null);
        setPrecio(0);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.isEmpty()){
            throw new IllegalArgumentException();
        }else {
            this.marca=marca;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularPrecioIVA(){
        return getPrecio()+(getPrecio()*0.21);
    }

    public static void empezarConducir(){
        System.out.println("Arrancar coche.");
        System.out.println("Meter marcha.");
        System.out.println("Acelerar coche.");
    }

    @Override
    public String toString() {
        return "Marca: "+getMarca()+" Precio: "+getPrecio();
    }
}
