package UD3.Teoria;

public class Principal {
    Rectangulo rect1;
    Rectangulo rect2;

    public Principal(){
        rect1=new Rectangulo();
        rect2=new Rectangulo(4,6);
    }

    public void run(){
        rect1.setBase(2);
        rect1.setAltura(8);

        System.out.println("El rectangulo 1 de base "+rect1.getBase()+" con su altura "+rect1.getAltura()+" su area es "+rect1.calcularArea());
        System.out.println("El rectangulo 1 de base "+rect2.getBase()+" con su altura "+rect2.getAltura()+" su area es "+rect2.calcularArea());

        Rectangulo.contarObjetos();
    }

    public static void main(String[] args) {
        Principal referencia=new Principal();
        referencia.run();
    }

}
