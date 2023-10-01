package Teoria.Operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        // # A
        // Declaramos la variable impuesto y multiplicamos 2.2x1.0(1)
        float impuesto = (float) (2.2*1);
        // Luego indicamos que el valor impuesto, recoge el valor del impuesto mas 5
        impuesto=impuesto+5;
        System.out.println("a) Resultado: "+impuesto);

        // # B
        // Declaramos la variable impuesto2 y dividimos 12x2.0(2)
        byte impuesto2 = (byte) (12/2);
        // Luego, restamos -8
        // Aviso: Realicé un cast por que el numero 8 es un entero (int), para que la operacion se haga correctamente hago un cast para su conversión completa.
        impuesto2=(byte)(impuesto2-8);
        System.out.println("b) Resultado: "+impuesto2);

        // # C
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

        // # D
        // Declaramos la variable nueve, y lo inicializamos en 9
        int nueve=9;
        // Luego, incrementa el valor nueve, dejando el valor original en la variable postIncremento
        int postIncremento=nueve++;
        System.out.println("d) Resultado:\n    Valor de nueve: "+nueve+"\n    Valor post incrementado: "+postIncremento);

        // # E
        // Declaramos la variable nueve, y lo inicializamos en 9
        nueve=9;
        // Luego, incrementa el valor preIncremento
        int preIncremento=++nueve;
        System.out.println("e) Resultado:\n    Valor de pre incremento: "+preIncremento);

        // # F
        nueve = 9;
        // Realizar el post-decremento
        int postDecremento = nueve--;
        // Visualizar los resultados
        System.out.println("f) Resultado:\nValor de nueve: "+nueve+"\n   Valor de post decremento: "+postDecremento);

        // # G
        nueve = 9;
        // Realizar el pre-decremento
        int preDecremento = --nueve;
        System.out.println("f) Resultado:\nValor de nueve: "+nueve+"\n   Valor de pre decremento: "+preDecremento);
    }
}
