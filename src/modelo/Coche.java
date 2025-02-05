package modelo;

import java.util.Random;
import java.util.Scanner;

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
        //función para imprimir los datos en la consola

        System.out.println("nombre: " + nombre);
        System.out.println("marca = " + marca);
        System.out.println("matricula = " + matricula);
        System.out.println("cc = " + cc);
        System.out.println("cv = " + cv);
        System.out.println("velocidad = " + velocidad);
        System.out.println("kmRecorridos = " + kmRecorridos);
    }

    public void acelerar(){
        /*función para aumentar la velocidad del coche y actualizar los km recorrido, con un parámetro a escribir que no sea inferior a 10, a partir del cv del vehículo */

        Scanner scanner = new Scanner(System.in); //para ingresar datos con el teclado
        System.out.print("Ingrese la velocidad: "); //ingresar valor a subir la velocidad
        int incremento = scanner.nextInt(); //al inngresar el dato (como numero entero) se guarda en la variable incremento

        if (incremento < 10) {

            System.out.println("El incremento debe ser al menos 10.");
            return;
        }
            Random random = new Random(); //para generar números aleatorios

        // cv < 100 -> rango mínimo, rango máximo] [0, incremento]
        // cv > 100 -> rango mínimo, rango máximo [10, incremento]
            if(cv < 100){
                //variable random = random.nextInt(rango);

                incremento = random.nextInt(incremento + 1); //se incrementa la velocidad desde 0 hasta el valor añadido
            }
            else{
                incremento = 10 + random.nextInt(incremento - 9); //incrementa la velovidad desde 10 hasta el valor añadido, al restar -9 aseguro que el rango aleatorio empiece desde 10
            }

            this.velocidad += incremento;
            this.kmRecorridos += this.velocidad * 0.5; //incremento los km recorridos en un 50% de la velocidad actual
            System.out.println("La potencia actual del coche es de: " + cv + " CV. Nueva velocidad alcanzada: " + velocidad + " km/h");
            System.out.println("Kilometros recorridos hasta ahora: " + kmRecorridos + " km");
        }


    }


