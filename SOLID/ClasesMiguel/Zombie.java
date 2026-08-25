package SOLID.ClasesMiguel;

public class Zombie extends MobHostil{
    
    public Zombie(){
        super("Zombie", 20);
    }

    @Override
    public void atacar(){
        System.out.println("El zombie te golpeó");
    }
    
}
