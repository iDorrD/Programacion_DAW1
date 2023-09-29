package Teoria.Operadores;

public class OperadoresComparacion {
    public static void main(String[] args) {
        int edadJuan=6,edadPedro=6,edadJulio=21,contador=14;
        double hipotenusa=206.73,cateto1=13.2,cateto2=5.7;

        // a) Es true que Juan es menor de edad
        System.out.print("¿Juan es menor de edad? · "+(edadJuan<18)+"\n");

        // b) Es true que Juan tiene la misma edad que Pedro.
        System.out.print("¿Juan tiene la misma edad que Pedro? · "+(edadJuan==edadPedro)+"\n");

        // c) Es true que Julio tiene más edad que Pedro.
        System.out.print("¿Julio tiene mas edad que Pedro? · "+(edadJulio>edadPedro)+"\n");

        // d) Es false que la hipotenusa al cuadrado es igual a la suma de sus
        //catetos al cuadrado.
        System.out.print("¿La hipotenusa al cuadrado es igual a la suma de sus catetos al cuadrado? · "+(hipotenusa*hipotenusa!=(cateto1*cateto1+cateto2*cateto2))+"\n");

        // e) Es true que el cateto1 es mayor que el cateto2.
        System.out.print("¿Cateto1 es mayor que cateto2? · "+(cateto1>cateto2)+"\n");

        // f) Es false que contador es igual a 8.
        System.out.print("¿Contador es igual a 8? · "+(contador==8)+"\n");

        // g) Es true que contador es distinto a 8.
        System.out.print("¿Contador es distinto a 8? · "+(contador!=8)+"\n");
    }
}
