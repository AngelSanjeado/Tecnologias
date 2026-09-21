type Plan = "Basico" | "Intermedio" | "Pro"

class Cliente{
    constructor(
        public nombre: string,
        public email: string,
        public edad: number,
        public plan: Plan
    ) {}

    validarUsuario(): boolean{
        if(this.nombre.length < 2){
            console.log("Nombre invalido");
            return false;
        }

        if(this.edad < 16){
            console.log("Debes ser mayor de edad");
            return false;
        }

        if(!this.email.includes('@')){
            console.log(`El correo ${this.email} no es correcto válido`)
            return false;
        }

        return true;
    }

    guardarEnBD(): void{
        if (this.validarUsuario()) {
            console.log(`Insertando ${this.nombre}`);
            console.log(`INSERT INTO clientes
            (nombre
                , email
                , edad
                , plan)
            VALUES
            (${this.nombre}
                , ${this.email}
                , ${this.edad}
                , ${this.plan})`)
        }
    }

    calcularPrecio(): number {
        const precios: Record<string, number> = {"Básico": 299, "Intermedio": 499, "Pro": 999};
        const precio = precios[this.plan];
        return precio;
    }

    generarFactura(): string {
        const folio = `Britania - ${Date.now()}`;
        const total = this.calcularPrecio();
        const factura = `${folio} \n Cliente: ${this.nombre} | Plan: ${this.plan} | Total: ${total}`;
        return factura;
    }

    enviarCorreo(){
        console.log(`Bienvenido ${this.nombre} has sido registrado con el plan ${this.plan}`);
        console.log(this.generarFactura());
    }

    registrarSuscripcion(): boolean{
        if(this.validarUsuario()){
            this.guardarEnBD();
            this.enviarCorreo();
            return true;
        }

        return false;
    }
}

const angel = new Cliente('Angel Rojas', 'angel@gmail.com', 35, "Intermedio");
angel.registrarSuscripcion();
export {};