package OCP.Justin_OCP.ocp_refactory;

public class Cerveza extends Bebida {
    private final double IEPS = 1.25;
    public Cerveza(String nombreBebida, double precioBase){
        super(nombreBebida, precioBase, Etiqueta.CON_IEPS);
    }
    
    @Override 
    public boolean requiereINE() {return true;}

    @Override 
    public double calcularTotal() {return getPrecioBase() * IVA * IEPS;}
}
