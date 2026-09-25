package OCP.Justin_OCP.ocp_refactory;

public class Main {
    public static void main(String[] args) {
        Bebida[] bebidas = {new Agua("CIEL", 20),
                            new Refresco("Fanta", 25),
                            new Cerveza("Coronita", 30)
                        };
        
        Caja caja = new Caja();
        caja.cobrar(bebidas, new DescuentoNavidad(), 100);
    }
}
