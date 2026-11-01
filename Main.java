public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== SISTEMA DE CONTROL DE FLOTA (3 CARROS) ===\n");

        // Tres objetos diferentes usando el molde 'Carro'
        Carro carro1 = new Carro("Toyota");
        Carro carro2 = new Carro("Mazda");
        Carro carro3 = new Carro("Ford");

        // CONTROL DEL CARRO 1 (Toyota)
        carro1.encender();
        carro1.acelerar(40);
        carro1.acelerar(30); // 40 + 30 = 70
        // REQUISITO: Recibimos el dato retornado por el objeto y lo guardamos en una variable de Main
        int velocidadToyota = carro1.obtenerVelocidad(); 
        System.out.println(">> Reporte de la empresa: El " + carro1.obtenerMarca() + " va a " + velocidadToyota + " km/h.\n");


        // CONTROL DEL CARRO 2 (Mazda) 
        carro2.encender();
        carro2.acelerar(90);
        int velocidadMazda = carro2.obtenerVelocidad();
        System.out.println(">> Reporte de la empresa: El " + carro2.obtenerMarca() + " va a " + velocidadMazda + " km/h.\n");


        // CONTROL DEL CARRO 3 (Ford) 
        carro3.encender();
        // El Ford solo se encendió pero no aceleró, su velocidad retornada debe ser 0
        int velocidadFord = carro3.obtenerVelocidad();
        System.out.println(">> Reporte de la empresa: El " + carro3.obtenerMarca() + " va a " + velocidadFord + " km/h.\n");

        System.out.println("=== FIN DEL REPORTE ===");
    }
}
