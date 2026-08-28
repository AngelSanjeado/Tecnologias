package SOLID.clases_abstractas_interfaces.ClasesMiguel;

public class BloqueMusical implements ActivablePorRedstone {

    @Override
    
    public void activar(){
        System.out.println("El bloque reproduce música");
    }

    public void desactivar(){
        System.out.println("El bloque deja de reproducir música");
    }
    
}
