using System.Reflection.Metadata;

public class GestorDeAliens
{
    private List<(string Nombre, Func<IAllien> Crear, bool Desbloqueado)> _catalogo = new()
    {
        ("Fuego", () => new Fuego(), true),
        ("Humungosaurio", () => new Humungusaurio(), true),
        ("Cuatro Brazos", () => new CuatroBreazos(), true)
    };

    private readonly List<(string Nombre, Func<IAllien> Crear)> _escanearADN = new()
    {
        _escanearADN = new()
    };
    
    private readonly Dictionary<Type, Func<IAllien>> _supremos = new()
    {
        {typeof(HumungosaurioSupremo), () => new HumungosaurioSupremo()}
    };

    private readonly List<(string Nombre, Func<IAllien> Crear)> _fusiones = new()
    {
        ("Humungosaurio + Cuatro Brazos", () => new Fuison<Humungosaurio, CuatroBrazos> ()),
        ("Fuego + Cuatro Brazos", () => new Fuison<Fuego, CuatroBrazos> ()),
        ("Fuego + Humungosaurio", () => new Fuison<Fuego, Humungosaurio> ())
    };

    public List<(string Nombre, Func<IAllien> Crear)> ObtenerDesbloqueados()
    {
        var lista = _catalogo
            .Where(a => a.Desbloqueado)
            .Select(async => (a.Nombre, a.Crear))
            .Tolist();
        lista.AddRange(_escanearADN);
        return lista;
    }

    public List<string> ObtenerDesbloqueado() => _catalogo.Where(a => a.Desbloqueado).Select(a => a.Nombre);
    public bool TieneSupremo(IAllien allien) => _supremos.ContainsKey(allien, GetType());
}