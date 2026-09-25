package OCP.Justin_OCP.ocp_refactory;

public class Refresco extends Bebida{
    public Refresco(String nombreBebida, double precioBase){
        super(nombreBebida, precioBase, Etiqueta.CON_IVA);
    }
    
    @Override 
    public boolean requiereINE() {return false;}

    @Override 
    public double calcularTotal() {return getPrecioBase();}
}
