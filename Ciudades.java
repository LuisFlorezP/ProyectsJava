import java.text.MessageFormat;
import java.util.Scanner;

public class Ciudades {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String[] ciudades = new String[8];
        
        System.out.println();

        for (int i = 1; i <= 8; i++) {
            System.out.print(MessageFormat.format("Ingresar nombre de la ciudad N°{0}: ", i));
            ciudades[i - 1] = sc.next();
        }

        System.out.println("\nCiudades en orden inverso del ingresado:");

        for (int i = ciudades.length - 1; i >= 0; i--) {
            System.out.println(" - " + ciudades[i]);
        }

        System.out.println();
    }
}