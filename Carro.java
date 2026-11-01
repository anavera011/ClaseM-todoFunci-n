//'public' para que la clase sea accesible desde otros archivos
public class Carro {
    // 1. Atributos (Variables globales blindadas con 'private')
    private String marca;
    private int velocidad;

    // 2. Constructor (Usa 'this' para pasar el parámetro al atributo)
    public Carro(String marca) {
        this.marca = marca;
        this.velocidad = 0; // Todos los carros de la empresa arrancan en 0 km/h
    }

    // 3. Métodos (Las acciones que el carro debe realizar)
    
    public void encender() {
        System.out.println("El carro marca " + this.marca + " se ha encendido.");
    }

    // Método para acelerar (Recibe el parámetro 'incremento' y actualiza el estado)
    public void acelerar(int incremento) {
        this.velocidad += incremento; // Acumulador
        System.out.println(this.marca + " ha acelerado +" + incremento + " km/h.");
    }

    // Parte clave: Método que retorna un dato (Lleva 'int' porque devuelve un entero)
    public int obtenerVelocidad() {
        return this.velocidad; // El 'return' envía el valor hacia afuera de la clase
    }

    // Método de retorno extra para poder mostrar la marca en el archivo principal
    public String obtenerMarca() {
        return this.marca;
    }
}
