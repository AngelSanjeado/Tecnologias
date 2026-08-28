class Mago : Personaje 
{
    public Mago(string nombre) : base(nombre)
    {
    }

    public override void Ataque(Personaje objetivo)
    {
        System.Console.WriteLine($"{nombre} lanza una bola de fuego a {objetivo.nombre} causando {danio} de daño.");
        int danio = 30;
        objetivo.RecibirDanio(danio);
    }

    public void UsarHabilidad()
    {
        puntosVida += 30;

        if (puntosVida > 100) puntosVida = 100;
        System.Console.WriteLine($"El mago {nombre} regenero 30 puntos de vida. Vida actual {puntosVida}");
    }
}