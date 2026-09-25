package OCP.Justin_OCP.ocp_bad;

public class Main {
    public static void main(String[] args) {
        Caja caja = new Caja();
        VerificadorEdad edad = new VerificadorEdad();
        GeneradorEtiqueta etiqueta = new GeneradorEtiqueta();
        CalculadoraDescuento descuento = new CalculadoraDescuento();

        String[] bebidas = {"agua", "refresco", "tepache", "cerveza"};
        double subtotal = 0;

        for (String bebida: bebidas){
            double precioBebida = caja.calcularPrecio(bebida, 25);
            System.out.printf("%s -> $ %.2f | Requiere INE: %b\n", etiqueta.generarEtiqueta(bebida), precioBebida, edad.requiereINE(bebida));
            subtotal += precioBebida;
        }

        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.println("Descuento de navidad");
        System.out.printf("Total: %.2f", descuento.aplicarDescuento("descuentoNavidad", subtotal));
    }
}
