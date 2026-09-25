public class Fusion<TAlienA, TAlienB> : IAllien 
    where TAlienA : IAllien, new()
    where TAlienB : IAllien, new()
{
    private readonly TAlienA _alienA = new();
    private readonly TAlienB _alienB = new();

    public string Nombre => $"Fusión {_alienA.Nombre} + {_alienB.Nombre}";
    public string Descripcion => $"Fusión combinadas de {_alienA.Nombre} y {_alienB.Nombre}";

    public void UsarHabilidad()
    {
        System.Console.WriteLine($" activas ambas mitades de la fusión");
        _alienA.UsarHabilidad();
        _alienB.UsarHabilidad();
    }
} 