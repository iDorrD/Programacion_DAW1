package UD2;

public class test {
    public static void main(String[] args) {
        String palabra1="abc",palabra2="abc";
        System.out.println(palabra1.compareTo(palabra2));
        if (palabra1.compareTo(palabra2)<0){
            System.out.println("No es igual");
        }else {
            System.out.println("Es igual");
        }
    }
}
