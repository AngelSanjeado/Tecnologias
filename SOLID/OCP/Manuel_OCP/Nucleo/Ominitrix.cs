public class Ominitrix
{
    public IAllien? AlienActual {get; private set;}
    public bool EstaTransformado => AlienActual != null;

    public void Transformar(IAllien alien)
    {
        AlienActual = alien;
        System.Console.WriteLine($"Transformación completa. Ahora eres {AlienActual.Nombre}");
    }

    public void Destransformar(IAllien alien)
    {
        if (AlienActual != null)
        {
            System.Console.WriteLine($"Timeout. {AlienActual.Nombre} ahora es Ben.");
            AlienActual = null;
        }
    }
}