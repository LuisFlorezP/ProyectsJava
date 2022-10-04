import java.util.Scanner;

public class Consecutivos {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int numero=1, contador=0;
        
        System.out.print("\nIngresa el límite de números consecutivos a partir de 1: ");
        contador=sc.nextInt();
        System.out.println("IMPRESIÓN NÚMEROS.\n");
        while (numero<=contador) {
            System.out.println("Numero: "+numero);
            ++numero;
        }
        System.out.println("");
    }
}
