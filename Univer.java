import java.util.Scanner;

public class Univer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nom, est;
        int cred;
        double valCred, valBru, valDes, valRec, valNet;

        System.out.print("\nIngresar nombre del estudiante: ");
        nom=sc.nextLine();
        System.out.print("Ingresar estrato del estudiante: ");
        est=sc.next();
        System.out.print("Ingresar cantidad de créditos del estudiante: ");
        cred=sc.nextInt();
        System.out.print("Ingresar valor del crédito: ");
        valCred=sc.nextDouble();

        valBru=cred*valCred;

        if (est.equals("1")) {
            valDes=valBru*0.40;
            valRec=valBru*0;
        }
        else if (est.equals("2")) {
            valDes=valBru*0.30;
            valRec=valBru*0;
        }
        else if (est.equals("3")) {
            valDes=valBru*0.10;
            valRec=valBru*0;
        }
        else if (est.equals("4")) {
            valDes=valBru*0.10;
            valRec=valBru*0;
        }
        else if (est.equals("5")) {
            valDes=valBru*0;
            valRec=valBru*0.40;
        }
        else if (est.equals("6")) {
            valDes=valBru*0;
            valRec=valBru*0.40;
        }
        else {
            valDes=valBru*0;
            valRec=valBru*0;
        }

        valNet=valBru+valRec-valDes;

        System.out.println("\nNombre estudiante: "+nom);
        System.out.println("Valor bruto de matrícula: "+valBru);
        System.out.println("Valor descuento para la matrícula: "+valDes);
        System.out.println("valor recargo para la matrícula: "+valRec);
        System.out.println("Valor neto de matrícula: "+valNet+"\n");
    }
}
