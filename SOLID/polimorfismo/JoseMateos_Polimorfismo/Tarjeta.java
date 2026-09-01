package SOLID.polimorfismo.JoseMateos_Polimorfismo;

public class Tarjeta implements MetodoPago {
    private String numero;

    public Tarjeta(String numero){
        this.numero = numero;
    }
    
    @Override
    public boolean validar(){
        return this.numero.length() == 16 ? true : false;
    }

    public void pagar(double monto){
        System.out.printf("Pago de %.2f realizado con la tarjeta: %s\n", monto, numero);
    }
}