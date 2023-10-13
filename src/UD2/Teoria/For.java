package UD2.Teoria;

public class For {
    public static void main(String[] args) {
        int valor;
        final int MULTIPLICADOR=7;
        System.out.println("------------------- "+"TABLA MULTIPLICAR DE "+MULTIPLICADOR+" -------------------");
        for (int i=0;i<=10;i++){
            valor = MULTIPLICADOR*i;
            System.out.println(MULTIPLICADOR+"x"+i+": "+valor);
        }
    }
}
