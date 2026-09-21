class Jugador
  attr_accessor :nombre, :puntos, :vidas, :estado

  def initialize(nombre)
    @nombre = nombre
    @puntos = 0
    @vidas = 3
    @estado = :pequeno
  end
end

class Moneda 
  def valor_puntos; 100; end
end

class Goomba 
  def dano_ataque; 1; end
end

class Hongo
  def poder; crecer; end
end

class Bowser 
  def dano_ataque; 2; end
end

class SistemaAudio 
  def reproducir(evento)
    sonidos = {
      moneda: "'ding.mp3'",
      dano: "'auch.mp3'",
      game_over: "'game_over.mp3'",
      poder: "'power_up.mp3'",
      pierde_poder: "'power_down.mp3",
      bowser: "'bowser.mp3'"
    }
    puts sonidos[evento]
  end
end

class SistemaPoderes
  def consumir_hongo(jugador)
    jugador.estado = :grande
    puts "[Mario cambio de tamaño!]"
  end
end

class SistemaPuntuacion
  def sumar_puntos(jugador, cantidad)
    jugador.puntos += cantidad
    puts "[+#{cantidad} puntos Marcador: #{jugador.puntos}]"
  end
end

class SistemaSalud 
  def recibir_dano(jugador, cantidad)
    return if cantidad <= 0

    if jugador.estado == :grande 
      jugador.estado = :pequeno
      cantidad -= 1
      puts "[ESTADO] El golpe le quito el poder a Mario. Se hizo pequeño otra vez."
    end

    if cantidad > 0
      jugador.vidas -= cantidad 
      jugador.vidas = 0 if jugador.vidas < 0
      puts "Daño recibido: #{cantidad}. Vidas restantes: #{jugador.vidas}"
    end
  end
end

mario = Jugador.new("Mario")
audio = SistemaAudio.new 
marcador = SistemaPuntuacion.new
salud = SistemaSalud.new
moneda = Moneda.new
goomba = Goomba.new
poder = SistemaPoderes.new
hongo = Hongo.new
bowser = Bowser.new

puts "--- INICIA NIVEL 1 ---"
puts "Mario tiene #{mario.vidas} vidas y estado: #{mario.estado}"

puts "\n--- Escenario 1: El hongo y la emboscada ---"
poder.consumir_hongo(mario)
audio.reproducir(:poder)

print "¿Cuántos Goombas emboscan a Mario de golpe?: "
cantidad_goombas = gets.chomp.to_i
cantidad_goombas = 0 if cantidad_goombas < 0

if cantidad_goombas > 0 
  dano_goombas = goomba.dano_ataque * cantidad_goombas
  puts "Mario recibió un total de #{dano_goombas} puntos de daño."
  audio.reproducir(:dano)
  salud.recibir_dano(mario, dano_goombas)
end

puts "\n--- Escenario 2: La llegada de Bowser ---"
if mario.vidas > 0
  puts "Mario encuentra otro hongo antes del jefe final..."
  poder.consumir_hongo(mario)
  audio.reproducir(:poder)

  print "¿Cuántas veces golpea Bowser a Mario?: "
  golpes_bowser = gets.chomp.to_i
  golpes_bowser = 0 if golpes_bowser < 0

  if golpes_bowser > 0
    dano_bowser = bowser.dano_ataque * golpes_bowser
    puts "Bowser conecta #{golpes_bowser} golpes! (Daño total: #{dano_bowser})"
    audio.reproducir(:bowser)
    salud.recibir_dano(mario, dano_bowser)
  end
end

puts "\n--- Resultado Final ---"
if mario.vidas <= 0
  audio.reproducir(:game_over)
  puts "GG EZ... Mario fue aplastado"
else 
  puts "Mario sobrevivió y rescato a la princesa con #{mario.vidas} vidas."
end