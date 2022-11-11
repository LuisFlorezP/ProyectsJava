import java.util.Scanner;

public class Informacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre="";
        double estatura=0;
        int edad=0, sexo=0, estC=0;
    
        for (int ct=1;ct<=20;ct++) {
            System.out.println("\nPERSONA N°"+ct+":");
            System.out.print(" - Ingresar nombre: ");
            nombre=sc.next();
            System.out.print(" - Ingresar edad: ");
            edad=sc.nextInt();
            System.out.print(" - Ingresar el número del sexo (1=Masculino,2=Femenino): ");
            sexo=sc.nextInt();
            System.out.print(" - Ingresar estatura: ");
            estatura=sc.nextDouble();
            System.out.print(" - Ingresar el número del estado civil (1=Casado,2=Soltero,3=Unión libre): ");
            estC=sc.nextInt();
            
            if (sexo==2&&estC==2&&edad>=18&&estatura>1.80) {
                System.out.println("\n - Nombre: "+nombre+".");
            }
        }
    } 
}
