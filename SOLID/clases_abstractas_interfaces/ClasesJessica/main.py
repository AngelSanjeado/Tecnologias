from abc import ABC, abstractmethod

class Personaje(ABC):

    def __init__(self, nombre, vida):
        self.nombre = nombre
        self.vida = vida

    def recibir_danio(self, danio):
        self.vida -= danio
        print(f"{self.nombre} recibe {danio} de daño")    
        print(f"Vida restante: {self.vida}")    

    @abstractmethod
    def atacar(self):
        pass


class ICurable(ABC):
    @abstractmethod
    def curar(self, objetivo):
        pass


class Guerrero(Personaje):
    def atacar(self):
        print(f"{self.nombre} ataca con su espada")


class Mago(Personaje):
    def atacar(self):
        print(f"{self.nombre} ataca con bola de fuego")

    def curar(self, objetivo):
        objetivo.vida += 20
        print(f"{self.nombre} curó a {objetivo.nombre} +20 HP")

class Soporte(Personaje):
    def atacar(self):
        print(f"{self.nombre} ataca con bastón")

    def curar(self, objetivo):
        objetivo.vida += 20
        print(f"{self.nombre} curó a {objetivo.nombre} +20 HP")


guerrero = Guerrero("Juanito", 100)
mago = Mago("Pedro", 80)
soporte = Soporte("Miguelin", 70)

guerrero.atacar()
mago.atacar()
soporte.atacar()

guerrero.recibir_danio(30)
mago.curar(guerrero)
soporte.curar(guerrero)

print(f"Vida final de {guerrero.nombre}: {guerrero.vida} HP")