package OCP.Justin_OCP.ocp_bad;

public class CalculadoraDescuento {
    public double aplicarDescuento(String tipoDescuento, double subtotal){
        if (tipoDescuento.equals("descuentoNavidad")) {
            return subtotal * 0.90;
        }
        else if (tipoDescuento.equals("sinDescuento")){
            return subtotal;
        }
        else {
            throw new IllegalArgumentException("Descuento no válido");
        }
    }
}
