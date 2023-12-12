package UD3.Practica.Ejercicio1;

import java.util.Scanner;

/**
 * Es un objeto de empleado, que nos interesa su nombre, apellido, edad y salario
 * @author Cristian
 */

public class Empleado {
    static Scanner teclado = new Scanner(System.in);
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    // Es un constructor de 4 parámetros, que se les dá valor según su correspondientes variables de la clase Principal.
    public Empleado(String nombre, String apellido, int edad, double salario) {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setSalario(salario);
    }

    // Es un constructor que dá los valores por defecto
    public Empleado(){
        this(null,null,0,0.0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre!=null&&(nombre.matches("[a-zA-Z]+"))){
            this.nombre=nombre;
        }else {
            this.nombre=null;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>0){
            this.edad = edad;
        }else {
            edad=0;
        }

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = Math.abs(salario);
    }

    // El método incremenarSalario incrementa según la edad del empleado
    public void incrementarSalario(){
        if (getEdad()>=18&&getEdad()<=30){
            setSalario(salario+100);
        } else if (getEdad()>=31&&getEdad()<=50) {
            setSalario(salario+150);
        }else if (getEdad()>50){
            setSalario(salario+200);
        }
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+" · Apellido: "+getApellido()+" · Edad: "+getEdad()+" · Salario: "+getSalario();
    }
}
