package UD2.Teoria;

public class For2 {
    public static void main(String[] args) {
        final int MULTIPLICADO = 7;
        System.out.println("TABLA MULTIPLICAR DEL "+MULTIPLICADO);
        for (int i=1;i<=10;i++){
            System.out.println(MULTIPLICADO+"x"+i+": "+(MULTIPLICADO*i));
        }
    }
}
