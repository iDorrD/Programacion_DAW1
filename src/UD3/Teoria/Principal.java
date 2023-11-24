package UD3.Teoria;

public class Principal {

    public Principal(){
        // rect1 sería una dirección de memoria
        // Se llamaría puntero o referencia.
        Rectangulo rect1; // rect1 es un puntero
        // new - es crear un objeto o instanciar.
        rect1 = new Rectangulo();
        // Rectangulo() - Es el constrcutor
        // Base 2 y Altura 8
        rect1.setBase(2);
        rect1.setAltura(8);
        System.out.println(rect1.toString());

        Rectangulo rect2 = new Rectangulo(4,6);
        System.out.println("El rectangulo 1 de base "+rect1.getBase()+" y altura "+rect1.getAltura()+" tiene una área de "+rect1.calcularArea());
        System.out.println("El rectangulo 2 de base "+rect2.getBase()+" y altura "+rect2.getAltura()+" tiene una área de "+rect2.calcularArea());

        Rectangulo.contarObjetos();
    }

    public static void main(String[] args) {
        Principal referencia=new Principal();
        //
    }

}
