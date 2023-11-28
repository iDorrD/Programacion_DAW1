/*
IES MONTE NARANCO
24 de Noviembre de 2023
 */
package UD3.Teoria;

/**
 * Esta clase define un rectangulo
 * @author Cristian
 */
public class Rectangulo {
    private static int contador=0; // Atributo de clase
    private int base; // Atributos de instancia
    private int altura;

    // Los constructores pueden tener parametros o no


    public Rectangulo() {
        base=0;
        altura=0;
        contador++;
    }

    // Esto es con parámetros
    /**
     * Constructor para crear un objeto rectángulo
     * @param base define la base del rectángulo
     * @param alt define la altura del rectángulo
     */
    public Rectangulo(int base,int alt){
        setBase(base);
        setAltura(alt);
        contador++;
    }

    /**
     * Calcula el área de un rectangulo
     * @return devuelve el área
     */
    public int calcularArea(){
        return getBase()*getAltura();
    }

    public int getBase(){
        return base;
    }

    public int getAltura(){
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
        // THIS es de los atributos
    }

    public void setAltura(int alt) {
        altura=Math.abs(alt);
        // Math.abs - Hace que el valor sea positivo (evita el número negativo)
    }

    public static void contarObjetos(){ // Metodo de clase
        System.out.println("Creamos "+Rectangulo.contador+" objetos.");
    }

    @Override
    public String toString() {
        return "Base: "+getBase()+" Altura: "+getAltura();
    }
}
