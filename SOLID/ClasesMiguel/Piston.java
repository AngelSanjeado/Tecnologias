package SOLID.ClasesMiguel;

public class Piston implements ActivablePorRedstone{
    
    @Override

    public void activar(){
        System.out.println("El pistón se activa y empuja un bloque");
    }
    
    public void desactivar(){
        System.out.println("El pistón se desactiva");
    }
}
