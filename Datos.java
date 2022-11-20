import java.util.Scanner;

public class Datos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre="";
        int edad=0, sexo=0, deporte=0, reg=0, valor=1, natacion=0, op2=0, op3=0, op4=0;
        double estatura=0, futbol=0, ciclismo=0, otro=0;

        System.out.print("\nIngresar cantidad de registros: ");
        reg=sc.nextInt();

        while (reg!=0) {
            System.out.println("\nRegistro N°"+valor+":");
            System.out.print(" - Ingresar nombre: ");
            nombre=sc.next();
            System.out.print(" - Ingresar edad: ");
            edad=sc.nextInt();
            System.out.print(" - Ingresar estatura: ");
            estatura=sc.nextDouble();
            System.out.print(" - Ingresar sexo (1=Hombre, 2=Mujer): ");
            sexo=sc.nextInt();
            System.out.print(" - Ingresar deporte (1=Natación, 2=Fútbol, 3=Ciclismo, 4=Otro): ");
            deporte=sc.nextInt();

            if (deporte==1&&estatura>1.8) {
                natacion++;
            }
            else if (deporte==2) {
                futbol+=edad;
                op2++;
            }
            else if (deporte==3) {
                if (sexo==2) {
                    ciclismo++;
                }
                op3++;
            }
            else if (deporte==4) {
                otro+=estatura;
                op4++;
                
            }
            valor++;
            reg--;
        }
        if (op2==0) {
            op2++;
        }
        if (op3==0) {
            op3++;
        }
        if (op4==0) {
            op4++;
        }
        futbol/=op2;
        ciclismo*=100/op3;
        otro/=op4;
        System.out.println("\nResultados:");
        System.out.println(" - Estaturas mayor a 1.8 (Natación): "+natacion+".");
        System.out.println(" - Promedio edad de personas (Fútbol): "+futbol+".");
        System.out.println(" - Porcentaje mujeres (Ciclismo): "+ciclismo+".");
        System.out.println(" - Promedio estatura (Otro): "+otro+".\n");
    }
}
