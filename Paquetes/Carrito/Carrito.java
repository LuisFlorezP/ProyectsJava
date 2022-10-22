public class Carrito {
    String marca;
    double peso;
    int cantGas;

    Carrito(String marca, double peso, int cantGas) {
        this.marca=marca;
        this.peso=peso;
        this.cantGas=cantGas;
    }

    void info() {
        System.out.println("\nMarca: "+marca+".");
        System.out.println("Peso: "+peso+" kg.");
        System.out.println("Cantidad de gasolina: "+cantGas+" galones.");
        if (cantGas>1) {
            System.out.println("Estado del vechículo: Arranca.\n");
        }
        else {
            System.out.println("Estado del vechículo: No arranca.\n");
        }
    }
}
