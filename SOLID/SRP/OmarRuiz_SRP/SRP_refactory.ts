type Plan = "Basico" | "Intermedio" | "Chipocludo";

class User {
    constructor(
        private nombre: string,
        private email: string,
        private edad: number,
        private plan: Plan
     ) {}

     getNombre(): string{
        return this.nombre;
     }

     getEmail(): string{
        return this.email;
     }

     getEdad(): number{
        return this.edad;
     }

     getPlan(): Plan{
        return this.plan;
     }
}

class Validar{
    validarUsuario(user: User){
        if(user.getNombre().length < 1){
            console.log(`Nombre ${user.getNombre()} es demasiado corto`);
            return false;
        }
        
        if(user.getEdad() < 16){
            console.log("Debes ser mayor de 16 años para entrar");
            return false;
        }
        
        if(!user.getEmail().includes('@')){
            console.log(`El email ${user.getEmail()} es no es válido`);
            return false;
        }

        return true;
    }
}

class Factura{
    calcularPrecio(user: User): number{
        const precios: Record<string, number> = {"Básico": 299, "Intermedio": 549, "Chipocludo": 999};
        const precio: number = precios[user.getPlan()];
        return precio;
    }

    generarFactura(user: User): string{
        const folio: string = `Club Deportivo - ${Date.toString}`;
        const total = this.calcularPrecio(user);
        const factura: string = `${folio} \n Cliente: ${user.getNombre()} | Plan: ${user.getPlan()} | Total: ${total}`;
        return factura;
    }
}

class ServicioCorreo{

    enviarBienvenida(user: User){
        console.log(`Email enviado al correo: ${user.getEmail()}`);
        console.log(`Bienvenido ${user.getNombre()}`);
    }
}

class RepositorioBD{
    guardarEnBD(user: User): boolean{
        console.log(`Insertando usuario dentro de la base de datos...`);
        console.log(`INSERT INTO clientes
            (nombre
                , email
                , edad
                , plan)
            VALUES
            (${user.getNombre()}
                , ${user.getEmail()}
                , ${user.getEdad()}
                , ${user.getPlan()})`);
        
        return true;
    }
}

class ServicioDeportivo{
    constructor(
        private validador: Validar,
        private facturadora: Factura,
        private servicioCorreo: ServicioCorreo,
        private repositorio: RepositorioBD
    ) {}

    registrarSuscripcion(user: User): boolean{
        if(this.validador.validarUsuario(user)){
            this.repositorio.guardarEnBD(user);
            this.servicioCorreo.enviarBienvenida(user);
            console.log(`Usuario registrado con éxito en el plan ${user.getPlan()}`);
            return true;
        }

        return false;
    }
}

const vaughan = new User('Vaughan', 'lobita@gmail.com', 23, "Chipocludo");
const britania = new ServicioDeportivo(new Validar(), new Factura(), new ServicioCorreo(), new RepositorioBD());

britania.registrarSuscripcion(vaughan);