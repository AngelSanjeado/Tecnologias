package SOLID.polimorfismo.JoseMateos_Polimorfismo;

public class Contado implements MetodoPago{
    private boolean estadoBilletes;

    public Contado(boolean estadoBilletes){
        this.estadoBilletes = estadoBilletes;
    }

    @Override
    public boolean validar(){
        return this.estadoBilletes;
    }

    public void pagar(double monto){
        System.out.printf("El billete esta en buen estado");
    }
}
