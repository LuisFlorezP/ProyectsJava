import java.util.Scanner;

public class Consecutivos {
    public static void main(String[] args ){
        // Crear scanner
        Scanner sc = new Scanner(System.in);
        // Definir variables
        int numero=1, contador=0;

        // Pedir el límite al usuario para la consecutividad
        System.out.print("\nIngresa el límite de números consecutivos a partir de 1: ");
        contador=sc.nextInt();
        System.out.println("IMPRESIÓN NÚMEROS.\n");
        // Imprimir los números de 1 en 1 hasta llegar al límite
        while (numero<=contador) {
            System.out.println("Numero: "+numero);
            ++numero;
        }
        System.out.println("");
    }
}
