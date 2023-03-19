import java.text.MessageFormat;
import java.util.Scanner;

public class ArreglosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo1 = new int[10];
        int[] arreglo2 = new int[10];

        System.out.println();

        for (int i = 1; i <= 20; i++) {
            System.out.print(MessageFormat.format("Ingresar número N°{0}: ", i));
            
            if (i - 1 < 10) {
                arreglo1[i - 1] = sc.nextInt();
            } else {
                arreglo2[i - 11] = sc.nextInt();
            }
        }

        System.out.print("\nPrimer arreglo: ");
        for (int valor : arreglo1) {
            System.out.print(valor + " ");
        }

        System.out.print("\nSegundo arreglo: ");
        for (int valor : arreglo2) {
            System.out.print(valor + " ");
        }

        System.out.println("\n");
    }
}
