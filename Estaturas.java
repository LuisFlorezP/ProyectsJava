import java.util.Scanner;

public class Estaturas {
    public static void main(String[] args) {
        // Crear scanner
        Scanner sc = new Scanner(System.in);
        // Definir variables
        double a=0, b=0, c=0, resul=0;
        
        // Pedir primer estatura
        System.out.print("\nIngresar primera estatura: ");
        double est1=sc.nextDouble();
        // Pedir segunda estatura
        System.out.print("Ingresar segunda estatura: ");
        double est2=sc.nextDouble();
        // Pedir tercera estatura
        System.out.print("Ingresar tercera estatura: ");
        double est3=sc.nextDouble();
        
        // Pasar valores a variables mas cortas y así facilitar la comprensión del operador ternario
        a=est1;
        b=est2;
        c=est3;
        
        // Operador ternario para verificar la estatura más alta de las tres
        resul+=(a>b&&a>c)?a:(b>c)?b:c;
        
        // Imprimir resultado
        System.out.println("\nLa estatura más alta fue: "+resul+"\n");
    }
}
