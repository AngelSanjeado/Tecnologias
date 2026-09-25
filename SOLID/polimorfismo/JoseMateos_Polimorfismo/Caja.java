package polimorfismo.JoseMateos_Polimorfismo;

public class Caja{
    public void cobrar(MetodoPago metodo, double monto){
        if(metodo.validar()){
            metodo.pagar(monto);
        } else {
            System.out.println("No se pudo");
        }
    }
}