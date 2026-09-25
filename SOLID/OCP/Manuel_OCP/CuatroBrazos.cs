public class CuatroBrazos : IAllien
{
    public virtual string Nombre => "Cuatro Brazos";
    public virtual string Descripcion => "Tetramand | Posee super fuerza, piel blindada y cuatro brazos";
    public virtual void UsarHabilidad()
    {
        System.Console.WriteLine($"{Nombre} ataca con aplausos sonico");
    }
}