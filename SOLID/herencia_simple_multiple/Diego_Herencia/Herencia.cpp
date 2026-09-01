#include <iostream>

using namespace std;

class Animal {
    public:
        string nombre;

        Animal(string nombre):
            nombre(nombre){};

        virtual void andar(){
            cout << nombre << " está andando" << endl;
        }
};

class Perro : public Animal{
    public:
        Perro (string nombre) : Animal(nombre) {}

        void ladrar(){
            cout << nombre << " está ladrando" << endl;
        }

        void andar(){
            cout << nombre << " está corriendo" << endl;
        }
};

class Volador : public virtual Animal {
    public:
        Volador(string nombre) : Animal(nombre) {}

        void andar(){
            cout << nombre << " está volando" << endl;
        }
};

class Nadador : public virtual Animal {
    public:
        Nadador(string nombre) : Animal(nombre) {}

        void andar(){
            cout << nombre << " está nadando" << endl;
        }
};

class Pato : public Volador, public Nadador{
    public:
        Pato(string nombre) : Volador(nombre), Nadador(nombre), Animal(nombre) {}

        void graznar(){
            cout << nombre << "está graznando" << endl;
        }

        void andar(){
            cout << nombre << "está caminando" << endl;
        }
};

int main(){
    Perro perro1("Pako");
    perro1.ladrar();
    perro1.andar();
}