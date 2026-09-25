package OCP.Justin_OCP.ocp_refactory;

public abstract class Bebida {
    protected static final double IVA = 0.16;
    private final String nombreBebida;
    private double precioBase;
    private Etiqueta etiqueta;

    protected Bebida(String nombreBebida, double precioBase, Etiqueta etiqueta){
        if (precioBase <= 0) throw new IllegalArgumentException("Precio invalido");
        this.nombreBebida = nombreBebida;
        this.precioBase = precioBase;
        this.etiqueta = etiqueta;
    }

    public abstract boolean requiereINE();
    public abstract double calcularTotal();

    public double getPrecioBase(){
        return precioBase;
    }

    public String getNombreBebida(){
        return nombreBebida;
    }

    public String getEtiqueta(){
        return nombreBebida + " " + etiqueta;
    }
}
