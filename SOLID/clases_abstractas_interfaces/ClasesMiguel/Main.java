package SOLID.clases_abstractas_interfaces.ClasesMiguel;

public class Main {
    public static void main(String[] args){

        Piston piston = new Piston();
        Puerta puerta = new Puerta();
        Lampara lampara = new Lampara();
        BloqueMusical bloqueMusical = new BloqueMusical();

        System.out.println("Se activa la palanca");
        piston.activar();
        puerta.activar();
        lampara.activar();
        bloqueMusical.activar();

        System.out.println("\nSe desactiva la palanca");
        piston.desactivar();
        puerta.desactivar();
        lampara.desactivar();
        bloqueMusical.desactivar();

        Zombie zombie = new Zombie();
        Esqueleto esqueleto = new Esqueleto();

        zombie.quemarEnLava();
        esqueleto.quemarEnLava();

        zombie.atacar();
        esqueleto.atacar();
    }
}
