package OCP.Justin_OCP.ocp_refactory;

public enum Etiqueta {
    SIN_IVA("(Libre de impuesto"),
    CON_IVA("(IVA incluido)"),
    CON_IEPS("(IVA + IEPS incluido)");

    private final String descripcion;

    Etiqueta(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }
}
