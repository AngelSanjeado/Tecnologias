public class Humungusaurio
{
    public virtual string Nombre => "Humongusaurio";
    public virtual string Descripcion => "Vaxasaurio | Posee fuerza y puede crecer hasta 20 metros";
    public void UsarHabilidad()
    {
        System.Console.WriteLine($"{Nombre} golpea el suelo y crea un pequeño terremoto");
    }
}