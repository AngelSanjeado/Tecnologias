public class Fuego : IAllien
{
    public virtual string Nombre => "Fuego";
    public virtual string Descripcion => "Pyronita | Ser compuesto por plasma y rocas volcanicas";
    public void UsarHabilidad()
    {
        System.Console.WriteLine($"{Nombre} lanza bolas de fuego");
    }
}