package OCP.Justin_OCP.ocp_refactory;

public class Agua extends Bebida{

    public Agua(String nombreBebida, double precioBase){
        super(nombreBebida, precioBase, Etiqueta.SIN_IVA);
    }
    
    @Override 
    public boolean requiereINE() {return false;}

    @Override 
    public double calcularTotal() {return getPrecioBase();}
}
