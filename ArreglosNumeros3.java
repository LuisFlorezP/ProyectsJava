import java.util.Scanner;
import java.text.MessageFormat;

public class ArreglosNumeros3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        int numero, posicion;

        System.out.println();

        for (int i = 1; i <= 20; i++) {
            System.out.print(MessageFormat.format("Ingresar número N°{0}: ", i));
            numeros[i - 1] = sc.nextInt();
        }

        System.out.print("\nNúmero a buscar: ");
        numero = sc.nextInt();

        for (int i = 0; i < 20; i++) {
            if (numeros[i] == numero) {
                posicion = i;
                System.out.println(MessageFormat.format("\nEl resultado es exitodo! Se encuentra en la posición: {0}", posicion));
            }
        }

        System.out.println();
    }
}
