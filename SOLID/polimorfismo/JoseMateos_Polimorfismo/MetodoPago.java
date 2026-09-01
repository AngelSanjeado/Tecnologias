package SOLID.polimorfismo.JoseMateos_Polimorfismo;

public interface MetodoPago {
    boolean validar();
    void pagar(double monto);
}
