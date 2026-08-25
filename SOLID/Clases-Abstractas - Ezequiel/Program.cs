Guerrero guerrero1 = new Guerrero("Justin");
Mago mago1 = new Mago("Christoper");

System.Console.WriteLine("Duelo");
System.Console.WriteLine($"{mago1.nombre} vs {guerrero1.nombre}");

while (mago1.estadoVida && guerrero1.estadoVida){
    System.Console.WriteLine($"1. Guerrero ataca a Mago");
    System.Console.WriteLine($"1. Mago ataca a Guerrero");
    System.Console.WriteLine($"1. Mago usa habilidad");

    string? opcion = Console.ReadLine();

    switch (opcion)
    {
        case 1:
            guerrero1.Ataque();
            break;

        case 2:
            mago1.Ataque();
            break;

        case 3:
            mago1.UsarHabilidad();
            break;
        
        default: 
            System.Console.WriteLine("Opcion no valida");
            break;
    }
}

if (mago1.estadoVida)
{
    System.Console.WriteLine("Gana Mago");
}
else
{
    System.Console.WriteLine("Gana Guerrero");
}