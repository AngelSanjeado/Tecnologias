package SOLID.ClasesMiguel;

public class Puerta implements ActivablePorRedstone {
    
    @Override

    public void activar(){
        System.out.println("La puerta se abre");
    }

    public void desactivar(){
        System.out.println("La puerta se cierra");
    }
}
