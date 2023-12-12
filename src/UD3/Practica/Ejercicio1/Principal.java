package UD3.Practica.Ejercicio1;

import java.util.Scanner;

public class Principal {
    Empleado emp1; // Es un puntero, y el único punto que puede recoger es la direccion de memoria
    Empleado emp2;
    static Scanner teclado = new Scanner(System.in);
    public Principal(){
        emp1=crearEmpleado();
        emp1.incrementarSalario();
        emp2=new Empleado("Agustin","Alvarado",60,1500);
        emp2.incrementarSalario();
        System.out.println(emp1.toString()+"\n"+emp2.toString());
    }

    // Este método crea un empleado
    public Empleado crearEmpleado(){
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
