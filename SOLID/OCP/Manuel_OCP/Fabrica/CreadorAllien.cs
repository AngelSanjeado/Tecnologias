public class CreadorAllien : IAllien
{
    public string Nombre {get;}
    public string Descripcion {get;}
    public readonly string _habilidad; 
    public CreadorAllien(string nombre, string descripcion, string habilidad)
    {
        Nombre = nombre;
        Descripcion = descripcion;
        _habilidad = habilidad;
    }

    public void UsarHabilidad()
    {
        System.Console.WriteLine($"{Nombre} : {_habilidad}");
    }
}