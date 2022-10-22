import java.util.Scanner;

public class ConsC {
    public static void main(String[] args) {
        String marca;
        double peso;
        int cantGas;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngresar marca del vehículo: ");
        marca=sc.next();
        System.out.print("Ingresar peso del vehículo: ");
        peso=sc.nextDouble();
        System.out.print("Ingresar cantidad de galones de gasolina: ");
        cantGas=sc.nextInt();

        Carrito valor = new Carrito(marca, peso, cantGas);
        valor.info();
    }

}
