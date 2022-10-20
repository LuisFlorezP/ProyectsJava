import java.util.Scanner;

public class Constructor {
    public static void main(String args[]) {
        String codigoA2, nomAsig2, nomProg2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresar código de la asignatura: ");
        codigoA2=sc.nextLine();
        System.out.print("Ingresar código de la asignatura: ");
        nomAsig2=sc.next();
        System.out.print("Ingresar código de la asignatura: ");
        nomProg2=sc.next();
        Matricula materia = new Matricula(codigoA2,nomAsig2,nomProg2);
        materia.informacion();
    }
}
