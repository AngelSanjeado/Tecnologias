package SOLID.polimorfismo.JoseMateos_Polimorfismo;

public class PayPal implements MetodoPago{
    private String correo;

    public PayPal(String correo){
        this.correo = correo;
    }

    @Override
    public boolean validar(){
        return this.correo.contains("@") ? true : false;
    }

    public void pagar(double monto){
        System.out.printf("Pago de %.2f enviado a la cuenta de PayPal: %s\n", monto, correo);
    }
    
}
