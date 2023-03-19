import java.text.MessageFormat;
import java.util.Scanner;

public class ArregloNumeros2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        int numero;

        System.out.println();

        for (int i = 1; i <= 20; i++) {
            System.out.print(MessageFormat.format("Ingresar número N°{0}: ", i));
            numeros[i - 1] = sc.nextInt();
        }

        System.out.print("\nNúmero a buscar: ");
        numero = sc.nextInt();

        for (int valor : numeros) {
            if (valor == numero) {
                System.out.println("\nEl resultado es exitodo!");
            }
        }

        System.out.println();
    }
}
