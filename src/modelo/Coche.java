package modelo;

public class Coche {

    private String nombre, marca;
    private int matricula, cc, cv, velocidad, kmRecorridos;

    //constructor del vehiculo
    public Coche(String nombre, String marca, int matricula, int cc, int cv, int velocidad, int kmRecorridos){
        this.nombre = nombre;
        this.marca = marca;
        this.matricula = matricula;
        this.cc = cc;
        this.cv = cv;
        this.velocidad = velocidad;
        this.kmRecorridos = kmRecorridos;
    }

    public void mostrarDatos(){
        System.out.println("nombre: " + nombre);
        System.out.println("marca = " + marca);
        System.out.println("matricula = " + matricula);
        System.out.println("cc = " + cc);
        System.out.println("cv = " + cv);
        System.out.println("velocidad = " + velocidad);
        System.out.println("kmRecorridos = " + kmRecorridos);
    }
}
