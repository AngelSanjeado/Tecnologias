abstract class Personaje
{

    public string nombre { get; private set; }

    public int puntosVida { get; protected set; }

    public bool estadoVida {get { return puntosVida > 0; } }

    public Personaje(string nombre)
    {
        this.nombre = nombre;
        puntosVida = 100;
    }

    public void RecibirDanio(int danio)
    {
        puntosVida -= danio;

        if (puntosVida <= 0) puntosVida = 0;

        System.Console.WriteLine($"{nombre} ha recibido {danio} de daño. Puntos de vida restantes: {puntosVida}");
    }

    public abstract void Ataque(Personaje objetivo);
}