import java.util.Scanner;

public class Neto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre="", mensaje="";
        double salH=0, horas=0, salB=0, salN=0, bon=0, ded=0;
     
        for (int ct=1;ct<=10;ct++) {
            System.out.println("\nDatos trabajador N°"+ct+".");
            System.out.print("Ingresar nombre: ");
            nombre=sc.next();
            System.out.print("Ingresar salario básico hora: ");
            salH=sc.nextDouble();
            System.out.print("Ingresar horas trabajadas: ");
            horas=sc.nextDouble();
            System.out.print("Ingresar bonificaciones: ");
            bon=sc.nextDouble();
            System.out.print("Ingresar deducciones: ");
            ded=sc.nextDouble();
            
            salB=salH*horas;
            salN=salB+bon-ded;
            
            mensaje+="\n - Nombre: "+nombre+".\n - Salario bruto: "+salB+".\n - Salario neto: "+salN+".";
        }
        System.out.println(mensaje);
    }
}
