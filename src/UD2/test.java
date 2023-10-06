package UD2;

public class test {
    public static void main(String[] args) {
        String patata="patataa",sol="patata";
        if (patata.compareTo(sol)==-3){
            System.out.println("test");
        } else if (patata.compareTo(sol)==0) {
            System.out.println("test1");
        }
        System.out.println(patata.compareTo("patataa"));
        System.out.println(patata.compareTo("pep"));
    }
}
