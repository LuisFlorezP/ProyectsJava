import java.util.Scanner;

public class Velocidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double velocidad=0;
        
        System.out.print("\nIngresar el número de usuarios que ingresaran información: ");
        int usuarios=sc.nextInt();
        System.out.print("Ingresar la distancia en kilometros: ");
        double distancia=sc.nextDouble();
        System.out.print("Ingresar el tiempo en horas: ");
        double tiempo=sc.nextDouble();
        System.out.print("Ingresar el transporte usado: ");
        String transporte=sc.next();
        
        velocidad=distancia/tiempo;
         
        System.out.println("\nLa cantidad de usuarios que ingresaron información fue: "+usuarios);
        System.out.print("La velocidad utilizada es: "+velocidad+" Km/h. ");
        System.out.print("La distancia utilizada es: "+distancia+" kilometros. ");
        System.out.println("El tiempo utilizado es: "+tiempo+" horas.\n");
    }
}
