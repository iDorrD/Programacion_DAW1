package UD3.Practica.Ejercicio1;

public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    // Empleado · Carga 4 atributos con nombre, apellidos, edad y salario.
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado(){
        setNombre("Agustín");
        setApellido("Alvarado");
        setEdad(60);
        setSalario(1500);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void incrementarSalario(){
        if (getEdad()>=18&&getEdad()<=30){
            salario+=100;
        } else if (getEdad()>=31&&getEdad()<=50) {
            salario+=150;
        }else if (getEdad()>50){
            salario+=200;
        }
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+" · Apellido: "+getApellido()+" · Edad: "+getEdad()+" · Salario: "+getSalario();
    }
}
