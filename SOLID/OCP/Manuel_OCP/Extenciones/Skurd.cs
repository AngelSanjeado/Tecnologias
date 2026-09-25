public class Skurd
{
    private readonly IAllien _alienBase;
    private readonly IAllien _alienDonador;

    public Skurd(IAllien alienBase, IAllien alienDonador)
    {
        _alienBase = alienBase;
        _alienDonador = alienDonador;
    }

    public string Nombre => $"{_alienBase.Nombre} + Skurd({_alienDonador.Nombre})";
    public string Descripcion => $"{_alienBase.Descripcion} con las habilidades de {_alienDonador.Descripcion}";

    public void UsarHabilidad()
    {
        _alienBase.UsarHabilidad();
        System.Console.WriteLine("Skurd presta las habilidades de: ");
        _alienDonador.UsarHabilidad();
    }
}