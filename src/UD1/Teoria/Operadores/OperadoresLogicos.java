package UD1.Teoria.Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // a) Definir la variable frio inicializada a false.
        boolean frio = false;
        System.out.println("Variable frio: "+!frio);

        // b) Definir y declarar las variables bueno, bonito y barato e inicializarlas.
        boolean bueno=true,bonito=false,barato=true;
        boolean oportunidad=!(bueno&&bonito&&barato);
        System.out.println("Variable oportunidad: "+oportunidad);

        // c) Definir y declarar las variables llueve e inicializar riego a false.
        boolean llueve=false,riego=false;
        boolean mojado = llueve||riego;
        System.out.println("Variable mojado: "+mojado);
    }
}
