package SOLID.ClasesMiguel;

public class Lampara implements ActivablePorRedstone {
    
    @Override

    public void activar(){
        System.out.println("Lampara encendida");
    }

    public void desactivar(){
        System.out.println("Lampara apagada");
    }
}
