package SOLID.ClasesMiguel;

public abstract class MobHostil{
    private String nombre;
    private int salud;

    public MobHostil(String nombre, int salud){
        this.nombre = nombre;
        this.salud = salud;
    }

    public void quemarEnLava(){
        salud -= 5;
        System.out.printf("%s se quema en la lava. Salud restante: %d HP\n", nombre, salud);
    }

    public abstract void atacar();

}
