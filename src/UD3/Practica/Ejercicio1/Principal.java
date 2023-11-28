package UD3.Practica.Ejercicio1;

import java.util.Scanner;

public class Principal {
    private Empleado emp1;
    private Empleado emp2;
    static Scanner teclado = new Scanner(System.in);
    public Principal(){
        emp1=crearEmpleado();
        emp1.incrementarSalario();
        emp2=new Empleado();
        emp2.incrementarSalario();
        System.out.println(emp1.toString()+"\n"+emp2.toString());
    }

    public static Empleado crearEmpleado(){
        System.out.print("Escribe el nombre del empleado: ");
        String nombre = teclado.nextLine();
        System.out.print("Escribe el apellido: ");
        String apellido = teclado.nextLine();
        System.out.print("Escribe la edad: ");
        int edad = teclado.nextInt();
        System.out.print("Escribe el salario: ");
        double salario = teclado.nextDouble();
        return new Empleado(nombre,apellido,edad,salario);
    }

    public static void main(String[] args) {
        new Principal();
    }
}
