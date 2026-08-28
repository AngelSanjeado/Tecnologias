class Guerrero : Personaje
{
    public Guerrero(string nombre) : base(nombre)
    {
    }

    public override void Ataque(Personaje objetivo)
    {
        System.Console.WriteLine($"{nombre} ataca con la espada a {objetivo.nombre} causando {danio} de daño.");
        int danio = 30;
        objetivo.RecibirDanio(danio);
    }
}