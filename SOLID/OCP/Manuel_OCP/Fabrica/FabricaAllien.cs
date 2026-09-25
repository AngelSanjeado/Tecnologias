public static class FabricaAllien
{
    public static IAllien CrearDesdeMuestra(MuestraADN muestra)
    {
        return new CreadorAllien(muestra.Nombre, muestra.Descripcion, muestra.Habilidad);
    }
}