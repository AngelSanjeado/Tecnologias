package OCP.Justin_OCP.ocp_refactory;

public class SinDescuento implements Descuento {
    @Override 
    public double aplicar(double total){
        return total;
    }

    @Override 
    public String getDescripcion(){
        return "Sin descuento";
    }
}
