package SOLID.polimorfismo.JoseMateos_Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Caja caja = new Caja();

        Tarjeta tarjeta = new Tarjeta("1234567890123456");
        PayPal paypal = new PayPal("paypal@gmail.com");
        Contado contado = new Contado(true);
        
        caja.cobrar(tarjeta, 500);
        caja.cobrar(paypal, 1000);
        caja.cobrar(contado, 200);
    }
    
}