package SOLID.ClasesMiguel;

public class Esqueleto extends MobHostil {

    public Esqueleto(){
        super("Esqueleto", 20);
    }

    @Override

    public void atacar(){
        System.out.println("El esqueleto te disparó con el arco");
    }
    
}
