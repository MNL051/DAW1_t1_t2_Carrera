import modelo.Coche;

public class Main {
    public static void main (String[] args){
        //constructor de prueba
        Coche coche1 = new Coche("Corredor1","Peugeot",5555,500,70, 120,3000);
        Coche coche2 = new Coche("Corredor2","Ibiza",1234,102, 80, 120, 1200);

        //coche1.mostrarDatos();
        coche1.acelerar();
        coche2.acelerar();






    }
}
